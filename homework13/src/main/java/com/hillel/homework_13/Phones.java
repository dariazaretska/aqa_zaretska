package com.hillel.homework_13;

public abstract class Phones {

    private double displaySize;
    private int memory;
    private double cameraMpx;

    public Phones(double displaySize, int memory, double cameraMpx) {
        this.displaySize = displaySize;
        this.memory = memory;
        this.cameraMpx = cameraMpx;
    }

    public Phones() {};

    public double getDisplaySize() {
        return displaySize;
    }

    public int getMemory() {
        return memory;
    }

    public double getCameraMpx() {
        return cameraMpx;
    }

    public void setDisplaySize(double displaySize) {
        if (displaySize > 0) {
            this.displaySize = displaySize;
        }
    }

    public void setMemory(int memory) {
        if (memory > 0) {
            this.memory = memory;
        }
    }

    public void setCameraMpx(double cameraMpx) {
        if (cameraMpx > 0) {
            this.cameraMpx = cameraMpx;
        }
    }
}
