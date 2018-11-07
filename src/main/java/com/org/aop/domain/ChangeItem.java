package com.org.aop.domain;

/**
 * Created by KaBu on 2018/11/6.
 */
public class ChangeItem {

    private String field;

    private String fieldName;

    private String oldValue;

    private String newValue;

    public String getField() {
        return field;
    }

    public ChangeItem setField(String field) {
        this.field = field;
        return this;
    }

    public String getFieldName() {
        return fieldName;
    }

    public ChangeItem setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public String getOldValue() {
        return oldValue;
    }

    public ChangeItem setOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    public String getNewValue() {
        return newValue;
    }

    public ChangeItem setNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }
}
