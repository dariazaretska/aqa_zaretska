package com.hillel.homework11.flowershop;

public class Rose extends Flower {
    private String sort;
    private Boolean withNeedles;
    int length;

    public Rose(int price, String name, String type, String colour, String sort, Boolean withNeedles) {
        super(price, name, type, colour);
        this.sort = sort;
        this.withNeedles = withNeedles;
    }

    public Rose(int price, String name, String type, String colour, String sort) {
        super(price, name, type, colour);
        this.sort = sort;
    }

    public Rose(){}

    public String getSort() {
        return sort;
    }

    public Boolean getWithNeedles() {
        return withNeedles;
    }

    public int getLength() {
        return length;
    }

    public void setSort(String sort) {
        if (sort != null) {
            this.sort = sort;
        }
    }

    public void setWithNeedles(Boolean withNeedles) {
        this.withNeedles = withNeedles;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }
}
