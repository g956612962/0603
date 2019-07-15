package com.zbdx.day0527;

/**
 * 宠物类，狗、企鹅的父类
 */
public abstract class Pet {
    private String name = "无名氏";
    private int health = 100;
    private int love = 0;

    int avoirdupois = 2;
    protected String color;
    public int id = 1001;



    public Pet(){}

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    //抽象方法没有方法体 且不能调用
    public abstract void print();

    public abstract void eat();


}
