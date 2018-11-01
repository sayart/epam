package com.gmail.slartua;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {
    private int collectionSize;
    private int minValue;
    private int maxValue;
    private List<Integer> list;
    private Set<Integer> set;

    public Collections() {
        super();
    }

    public Collections(int collectionSize, int minValue, int maxValue) {
        this.collectionSize = collectionSize;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public int getCollectionSize() {
        return collectionSize;
    }

    public void setCollectionSize(int collectionSize) {
        this.collectionSize = collectionSize;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void generateUniqueListandSet(){
        list = new ArrayList<Integer>();
        for (int i = 0; i < collectionSize; i++) {
            Integer integer = 0;
            integer = (int) (Math.random()*((this.maxValue - this.minValue + 1) + this.minValue));
            if(!list.contains(integer)){
                list.add(integer);
            }else {
                i--;
            }
        }
        set = new HashSet<Integer>(list);
    }


}
