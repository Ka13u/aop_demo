package com.org.aop.domain;

/**
 * Created by KaBu on 2018/11/6.
 */
public enum ActionType {

    INSERT("添加",1),

    UPDATE("更新",2),

    DELETE("删除",3);

    private String name;

    private int index;


    ActionType(String name, int index) {
        this.name = name;
        this.index = index;
    }


    public static String getName(int index) {
        for(ActionType actionType : ActionType.values()){
            if(actionType.getIndex() == index){
                return actionType.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ActionType setName(String name) {
        this.name = name;
        return this;
    }

    public int getIndex() {
        return index;
    }

    public ActionType setIndex(int index) {
        this.index = index;
        return this;
    }
}
