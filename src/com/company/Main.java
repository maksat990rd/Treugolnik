package com.company;

public class Main {
    public static void main(String[] args) {
        UchBurchtuk storona = new UchBurchtuk();
        storona.a = 10;
        storona.b = 10;
        storona.c = 12;
        System.out.print("Uchburchtuk aianti: ");
        storona.treugolnik(storona.a, storona.b, storona.c);

    }
}
