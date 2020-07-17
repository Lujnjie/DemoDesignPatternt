package com.lujunjie.mediator;

public enum Action {
    SING("sing a song"), DANCE("dance");

    private String desc;


    Action(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
