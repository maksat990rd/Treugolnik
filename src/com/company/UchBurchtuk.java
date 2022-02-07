package com.company;

public class UchBurchtuk {
    int a;
    int b;
    int c;

    public void treugolnik(int a, int b, int c) {
        int storoni = (a + b + c) / 2;
        System.out.println(Math.sqrt(storoni * (storoni - a) * (storoni - b) * (storoni - c)));
    }
}
