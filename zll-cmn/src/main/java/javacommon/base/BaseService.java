package javacommon.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javacommon.page.Page;
import javacommon.page.PageRequest;

import javax.annotation.Resource;

public abstract class BaseService<T> {
	
	protected abstract BaseDao<T> getEntityDao();
	
	public Integer insert(T t) {
		return getEntityDao().insert(t);
	}

	public void delete(Serializable id) {
		getEntityDao().delete(id);
	}

	public Integer update(T t) {
		return getEntityDao().update(t);
	}

	public T getById(Serializable id) {
		return getEntityDao().getById(id);
	}

	public List<T> findList(Object o) {
		return getEntityDao().findList(o);
	}

	public Integer count(Object o) {
		return getEntityDao().count(o);
	}

	public Page findPage(PageRequest<Map<String,Object>> pageRequest) {
		int totalCount = getEntityDao().count(pageRequest.getFilters());
		Page page = new Page(pageRequest,totalCount);
		List<T> list = getEntityDao().findList(pageRequest.getAllFilters());
		page.setResult(list);
		return page;
	}
}
