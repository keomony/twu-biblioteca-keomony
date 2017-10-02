package com.twu.biblioteca;

public class MenuItem {
    private int id;
    private String menu;
    private OnAction action;

    public MenuItem(int id, String menu, OnAction action){
        this.id = id;
        this.menu = menu;
        this.action = action;
    }

    public int getMenuId(){return this.id;}
    public String getMenuItem(){return this.menu;}

}
