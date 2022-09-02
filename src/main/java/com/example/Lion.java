package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    public boolean doesHaveMane() {
        return hasMane;
    }

    private Pantherinae pantherinae;
    public Lion(Pantherinae pantherinae){
        this.pantherinae = pantherinae;
    }
    public int getKittens() {
        return pantherinae.getKittens();
    }

    public List<String> getFood() throws Exception {
        return pantherinae.getFood();
    }

}
