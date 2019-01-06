package com.guokai.model.combination.combinationinterface;

import java.math.BigDecimal;
import java.util.Iterator;

/**
 * 组件 和叶子的通用接口 default方法 不需要全部实现
 * 不需要实现的方法可以 抛出异常
 */
public interface MenuCombination {
    /**
     * 获取名字
     * @return
     */
    String getName();

    /**
     * 获取描述
     * @return
     */
    String getDescription();

    /**
     * 获取价格
     * @return
     */
    BigDecimal getPrice();

    /**
     * 获取叶子节点
     * 菜单需要实现
     * @param index
     * @return
     */
    default MenuCombination getChild(Integer index){
        throw  new UnsupportedOperationException();
    }

    default Boolean add(MenuCombination menuCombination){
        throw  new UnsupportedOperationException();
    }

    /**
     * 创建迭代器
     * @return
     */
    Iterator createIterator();

    void print();
}
