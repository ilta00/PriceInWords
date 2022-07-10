package ru.timonova.test;

public class AllTests {

    public void run(){
        System.out.println("\n\n----------------------\n\n");

        new PriceConverterTest().testPriceConverter1();
        System.out.println("\n\n----------------------\n\n");

        new PriceConverterTest().testPriceConverter2();
        System.out.println("\n\n----------------------\n\n");

        new PriceConverterTest().testPriceConverter3();
        System.out.println("\n\n----------------------\n\n");

        new PriceConverterTest().testPriceConverter4();
        System.out.println("\n\n----------------------\n\n");

        new PriceConverterTest().testPriceConverter5();
        System.out.println("\n\n----------------------\n\n");

        new PriceConverterTest().testPriceConverter6();
        System.out.println("\n\n----------------------\n\n");
    }
}
