package javacommon.page;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 分页请求信息
 * 其中范型<T>为filters的类型
 * @author qy
 */
public class PageRequest<T> implements Serializable {

	/**
	 * 过滤参数
	 */
	@Deprecated
	private T filters;
	/**
	 * 页号码,页码从1开始
	 */
	private int pageNumber;
	/**
	 * 分页大小
	 */
	private int pageSize;
	/**
	 * 排序的多个列,如: username desc
	 */
	private String sortColumns;
	
	public PageRequest() {
		this(0,0);
	}
	
	@Deprecated
	public PageRequest(T filters) {
		this(0,0,filters);
	}
	
	public PageRequest(int pageNumber, int pageSize) {
		this(pageNumber,pageSize,(T)null);
	}
	
	@Deprecated
	public PageRequest(int pageNumber, int pageSize, T filters) {
		this(pageNumber,pageSize,filters,null);
	}
	
	public PageRequest(int pageNumber, int pageSize,String sortColumns) {
		this(pageNumber,pageSize,null,sortColumns);
	}
	
	@Deprecated
	public PageRequest(int pageNumber, int pageSize, T filters,String sortColumns) {
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		setFilters(filters);
		setSortColumns(sortColumns);
	}
	
	@Deprecated
	public T getFilters() {
		return filters;
	}

	@Deprecated
	public void setFilters(T filters) {
		this.filters = filters;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public String getSortColumns() {
		return sortColumns;
	}
	/**
	 * 排序的列,可以同时多列,使用逗号分隔,如 username desc,age asc
	 * @return
	 */
	public void setSortColumns(String sortColumns) {
		this.sortColumns = sortColumns;
	}
	
	public int getFirstResult(int pageNumber,int pageSize) {
		if(pageSize <= 0) throw new IllegalArgumentException("[pageSize] must great than zero");
		return (pageNumber - 1) * pageSize;
	}
	
	/**
	 * 获取查询参数
	 * @param p
	 * @return
	 */
	public Map<String,Object> getAllFilters() {
		Map<String,Object> filters = new HashMap<String,Object>();
		filters.put("offset", this.getFirstResult(this.getPageNumber(),this.getPageSize()));
		filters.put("pageSize", this.getPageSize());
		filters.put("sortColumns", this.getSortColumns());
		filters.putAll((Map<String,Object>)this.getFilters());
		return filters;
	}

}
