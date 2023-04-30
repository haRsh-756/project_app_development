package com.example.project4fx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * order class
 * @author harshpatel, giancarlo andretta
 */
public class Order implements Serializable {
    /**
     * order num
     */
    private int orderNum;
    /**
     * list
     */
    private final List<MenuItem> menuItemList;
    /**
     * total
     */
    private double totalForThisOrder;

    /**
     * order
     */

    public Order(){
        this.orderNum = 0;
        this.menuItemList = null;
    }

    /**
     * order
     * @param orderNum num
     * @param menuItemList list
     */
    public Order(int orderNum, List<MenuItem> menuItemList){
        this.orderNum = orderNum;
        this.menuItemList = new ArrayList<>(menuItemList);
    }

    /**
     * item list
     * @return getMenu item list
     */
    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    /**
     * total
     * @return get total
     */
    public double getTotalForThisOrder() {
        return totalForThisOrder;
    }

    /**
     * total
     * @param totalForThisOrder total for this order
     */
    public void setTotalForThisOrder(double totalForThisOrder) {
        this.totalForThisOrder = totalForThisOrder;
    }

    /**
     * order num
     * @return order num
     */
    public int getOrderNum() {
        return orderNum;
    }

    /**
     * order num
     * @param orderNum num
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * to string
     * @return to string
     */
    @Override
    public String toString() {
        return "Items: " + menuItemList;
    }
}
