package com.guokai.model.combination.menu;

import com.guokai.model.combination.combinationinterface.MenuCombination;
import com.guokai.model.combination.myIterator.MenuCombinaTionIterator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements MenuCombination {

    private String name;

    private String description;

    private List<MenuCombination> child=new ArrayList();

    public Menu() {
    }


    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }

    @Override
    public MenuCombination getChild(Integer index) {
        return child.get(index);
    }

    @Override
    public Boolean add(MenuCombination menuCombination) {
        return child.add(menuCombination);
    }

    @Override
    public Iterator createIterator() {
        return new MenuCombinaTionIterator(child.iterator());
    }

    @Override
    public void print() {
        System.out.println("l am menu");
        System.out.println("my name is \t"+getName());
        System.out.println("my description: \t"+getDescription());
        System.out.println("my leaf is:\t");
    }
}
