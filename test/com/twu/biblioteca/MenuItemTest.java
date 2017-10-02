package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class MenuItemTest {
    @Test
    public void testGetMenuId(){
        MenuItem menu = new MenuItem(1, "List of Books",null);
        int menuId = menu.getMenuId();
        Assert.assertEquals(1, menuId);
    }

    @Test
    public void testGetMenuItem(){
        MenuItem menu = new MenuItem(1, "List of Books",null);
        String menuItem = menu.getMenuItem();
        Assert.assertEquals("List of Books", menuItem);
    }

}
