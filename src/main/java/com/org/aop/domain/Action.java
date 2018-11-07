package com.org.aop.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by KaBu on 2018/11/6.
 */
public class Action {

    private String id;

    private Long objectId;

    private String objectClass;

    private String operator;

    private Date operateTime;

    private ActionType actionType;

    private List<ChangeItem> changeItems;

    public String getId() {
        return id;
    }

    public Action setId(String id) {
        this.id = id;
        return this;
    }

    public Long getObjectId() {
        return objectId;
    }

    public Action setObjectId(Long objectId) {
        this.objectId = objectId;
        return this;
    }

    public String getObjectClass() {
        return objectClass;
    }

    public Action setObjectClass(String objectClass) {
        this.objectClass = objectClass;
        return this;
    }

    public String getOperator() {
        return operator;
    }

    public Action setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public Action setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public Action setActionType(ActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    public List<ChangeItem> getChangeItems() {
        return changeItems;
    }

    public Action setChangeItems(List<ChangeItem> changeItems) {
        this.changeItems = changeItems;
        return this;
    }
}
