package com.hillel.homework11.flowershop;

public class LemonTree extends Flower {

    private String[] flowerCare;
    private Boolean eatable;
    protected int flowerpot = 190;

    public LemonTree(int price, String name, String type, String[] flowerCare, Boolean eatable) {
        super(price, name, type);
        this.flowerCare = flowerCare;
        this.eatable = eatable;
    }

    public LemonTree(){}

    public String[] getFlowerCare() {
        return flowerCare;
    }

    public Boolean getEatable() {
        return eatable;
    }

    public void setFlowerCare(String[] flowerCare) {
        if (flowerCare != null) {
            this.flowerCare = flowerCare;
        }
    }

    public void setEatable(Boolean eatable) {
        this.eatable = eatable;
    }
//  метод считает стоимость лимонного дерева с декоративным горшком
    public void calculatePrice () {
        int a = getPrice() + flowerpot;
        System.out.println(a);
    }
}
