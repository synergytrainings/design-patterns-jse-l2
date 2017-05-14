package com.training.iterator.impl;

/**
 * @author vahag
 * @since 14.05.17
 */
public class Order {
    public enum OrderType {DRINK, OTHER}

    private Object item;
    private OrderType orderType;
    private int count;
    private int tableId;

    public Order(Object item, OrderType orderType, int tableId, int count) {
        this.item = item;
        this.orderType = orderType;
        this.tableId = tableId;
        this.count = count;
    }

    public Order(Object item, OrderType orderType, int tableId) {
        this(item, orderType, tableId, 1);
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public OrderType getOrderType() {
        return orderType;
    }
}
