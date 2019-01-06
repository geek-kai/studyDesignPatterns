package com.guokai.model.combination.menu;

import com.guokai.model.combination.combinationinterface.MenuCombination;
import com.guokai.model.combination.myIterator.NullIterator;

import java.math.BigDecimal;
import java.util.Iterator;

public class MenuLeft implements MenuCombination {

    private String name;

    private String description;

    private BigDecimal price;


    public MenuLeft() {
    }

    public MenuLeft(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
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
        return price;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public void print() {
        System.out.println("\t l am left");
        System.out.println("\t name"+getName());
        System.out.println("\t price"+getPrice());
        System.out.println("\t description"+getDescription());

        System.out.println("\t ----end------");


    }
}
