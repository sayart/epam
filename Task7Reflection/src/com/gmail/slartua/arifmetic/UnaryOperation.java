package com.gmail.slartua.arifmetic;

public class UnaryOperation {
    private double value;
    public UnaryOperation(){
        value = 100.0;
    }
    public UnaryOperation(double value){
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    public void increment(){
        value++;
    }
    public void decrement(){
        value--;
    }

    @Override
    public String toString() {
        return "" + this.getValue();
    }
}

