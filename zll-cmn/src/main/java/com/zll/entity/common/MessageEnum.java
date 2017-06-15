package com.zll.entity.common;

public enum MessageEnum {
	
	RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
	
    // 成员变量
    private String typeName;
    private int typeId;

    // 构造方法
    private MessageEnum(String typeName, int typeId) {
        this.typeName = typeName;
        this.typeId = typeId;
    }

    // 普通方法
    public static String getTypeName(int typeId) {
        for (MessageEnum c : MessageEnum.values()) {
            if (c.getTypeId() == typeId) {
                return c.typeName;
            }
        }
        return null;
    }

    // get set 方法
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

}

