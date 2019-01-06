package com.guokai.model.combination.myIterator;

import com.guokai.model.combination.combinationinterface.MenuCombination;
import com.guokai.model.combination.menu.Menu;

import java.util.Iterator;
import java.util.Stack;

public class MenuCombinaTionIterator  implements Iterator<MenuCombination> {

    /**
     * 用栈的数据接口 模拟递归实现
     */
    private Stack<Iterator<MenuCombination>> stack=new Stack();

    public MenuCombinaTionIterator() {
    }

    public MenuCombinaTionIterator(Iterator<MenuCombination> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()){
            return false;
        }else {
            Iterator iterator = stack.peek();
            if(!iterator.hasNext()){
                //弹出
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public MenuCombination next() {
        if(hasNext()){
            Iterator<MenuCombination> iterator = stack.peek();
            MenuCombination menuCombination = iterator.next();
            if(menuCombination instanceof Menu) {
                Iterator iterator1 = menuCombination.createIterator();
                stack.push(iterator1);
            }
            return menuCombination;
        }else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
