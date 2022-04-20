package com.retoplatzi_springboot.retoplatzi.bean;

public class Implement1 implements Bean1{
    @Override
    public void print(Bean2 bean2) {
if(bean2.esMayor(3,5)){
    System.out.println("a es mayor que b");
}
else{
    System.out.println("b es mayor que a");
}
    }
}
