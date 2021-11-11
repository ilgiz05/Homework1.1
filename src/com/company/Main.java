package com.company;

public class Main {

    public static void main(String[] args) {
        String myIlgiz;
        final int NUM = 20;
        String word = " game";
        myIlgiz = NUM + word;
        System.out.println(myIlgiz);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
    }
}
