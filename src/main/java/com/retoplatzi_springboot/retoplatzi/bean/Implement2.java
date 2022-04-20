package com.retoplatzi_springboot.retoplatzi.bean;

public class Implement2 implements Bean2{

    @Override
    public boolean esMayor(int a, int b) {
        if (a > b) {
            return true;
        }
        return false;
    }
}
