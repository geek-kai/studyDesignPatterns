package com.guokai.model.combination;

import com.guokai.model.combination.combinationinterface.MenuCombination;
import com.guokai.model.combination.menu.Menu;
import com.guokai.model.combination.menu.MenuLeft;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Iterator;

public class TestCombination {

    public MenuCombination getAllMenu (){
        MenuCombination allMenu=new Menu("总菜单","所有菜单");

        MenuCombination dessertMenu=new Menu("甜点","甜点菜单");


        MenuCombination restaurantMenu=new Menu("餐厅","餐厅菜单");

        MenuCombination coffe=new MenuLeft("咖啡","7分苦",new BigDecimal("100.23"));
        MenuCombination pie=new MenuLeft("派","派",new BigDecimal("100.23"));
        dessertMenu.add(coffe);
        dessertMenu.add(pie);

        MenuCombination potato=new MenuLeft("土豆","土豆",new BigDecimal(10));
        MenuCombination tomato=new MenuLeft("西红柿","西红柿",new BigDecimal(18));
        restaurantMenu.add(potato);
        restaurantMenu.add(tomato);

        allMenu.add(restaurantMenu);
        allMenu.add(dessertMenu);

        return allMenu;
    }
    @Test
    public void printMenu(){
        Iterator iterator = getAllMenu().createIterator();
        while (iterator.hasNext()){
            MenuCombination menuCombination = (MenuCombination)iterator.next();
            menuCombination.print();
        }

    }
}
