package ru.timonova.main.converter.impl;

import ru.timonova.main.converter.Currency;
import ru.timonova.main.converter.PlaceGender;

import java.util.HashMap;

public class CurrencyRUR implements Currency {
    private HashMap<Integer, String> stringValues = new HashMap<>();
    private HashMap<Integer, String> stringValuesMale = new HashMap<>();
    private HashMap<Integer, String> stringValuesFemale = new HashMap<>();
    private HashMap<Integer, HashMap> placeValues = new HashMap<>();
    private HashMap<Integer, PlaceGender> placeGenders = new HashMap<>();

    public HashMap<Integer, String> getStringValues() {
        return this.stringValues;
    }

    public HashMap<Integer, String> getStringValuesMale() {
        return this.stringValuesMale;
    }

    public HashMap<Integer, String> getStringValuesFemale() {
        return this.stringValuesFemale;
    }

    public HashMap<Integer, HashMap> getPlaceValues() {
        return this.placeValues;
    }

    public HashMap<Integer, PlaceGender> getPlaceGenders() {
        return this.placeGenders;
    }


    public void init() {
        stringValuesMale.put(0, "ноль");
        stringValuesMale.put(1, "один");
        stringValuesMale.put(2, "два");
        stringValuesMale.put(3, "три");
        stringValuesMale.put(4, "четыре");
        stringValuesMale.put(5, "пять");
        stringValuesMale.put(6, "шесть");
        stringValuesMale.put(7, "семь");
        stringValuesMale.put(8, "восемь");
        stringValuesMale.put(9, "девять");
        stringValuesMale.put(10, "десять");

        stringValuesFemale.put(0, "ноль");
        stringValuesFemale.put(1, "одна");
        stringValuesFemale.put(2, "две");
        stringValuesFemale.put(3, "три");
        stringValuesFemale.put(4, "четыре");
        stringValuesFemale.put(5, "пять");
        stringValuesFemale.put(6, "шесть");
        stringValuesFemale.put(7, "семь");
        stringValuesFemale.put(8, "восемь");
        stringValuesFemale.put(9, "девять");
        stringValuesFemale.put(10, "десять");

        stringValues.put(11, "одиннадцать");
        stringValues.put(12, "двенадцать");
        stringValues.put(13, "тринадцать");
        stringValues.put(14, "четырнадцать");
        stringValues.put(15, "пятнадцать");
        stringValues.put(16, "шестнадцать");
        stringValues.put(17, "семнадцать");
        stringValues.put(18, "восемнадцать");
        stringValues.put(19, "девятнадцать");
        stringValues.put(20, "двадцать");
        stringValues.put(30, "тридцать");
        stringValues.put(40, "сорок");
        stringValues.put(50, "пятьдесят");
        stringValues.put(60, "шестьдесят");
        stringValues.put(70, "семьдесят");
        stringValues.put(80, "восемьдесят");
        stringValues.put(90, "девяносто");

        stringValues.put(100, "сто");
        stringValues.put(200, "двести");
        stringValues.put(300, "триста");
        stringValues.put(400, "четыреста");
        stringValues.put(500, "пятьсот");
        stringValues.put(600, "шестьсот");
        stringValues.put(700, "семьсот");
        stringValues.put(800, "восемьсот");
        stringValues.put(900, "девятьсот");

        HashMap<Integer, String> endPriceValues1 = new HashMap<>();
        endPriceValues1.put(-1, "рублей");
        endPriceValues1.put(0, "рублей");
        endPriceValues1.put(1, "рубль");
        endPriceValues1.put(2, "рубля");
        endPriceValues1.put(3, "рубля");
        endPriceValues1.put(4, "рубля");
        endPriceValues1.put(5, "рублей");
        endPriceValues1.put(6, "рублей");
        endPriceValues1.put(7, "рублей");
        endPriceValues1.put(8, "рублей");
        endPriceValues1.put(9, "рублей");
        endPriceValues1.put(10, "рублей");
        placeValues.put(1, endPriceValues1);

        placeGenders.put(1, PlaceGender.MALE);

        HashMap<Integer, String> endPriceValues2 = new HashMap<>();
        endPriceValues2.put(-1, "тысяч");
        endPriceValues2.put(0, "тысяч");
        endPriceValues2.put(1, "тысяча");
        endPriceValues2.put(2, "тысячи");
        endPriceValues2.put(3, "тысячи");
        endPriceValues2.put(4, "тысячи");
        endPriceValues2.put(5, "тысяч");
        endPriceValues2.put(6, "тысяч");
        endPriceValues2.put(7, "тысяч");
        endPriceValues2.put(8, "тысяч");
        endPriceValues2.put(9, "тысяч");
        endPriceValues2.put(10, "тысяч");
        placeValues.put(2, endPriceValues2);

        placeGenders.put(2, PlaceGender.FEMALE);

        HashMap<Integer, String> endPriceValues3 = new HashMap<>();
        endPriceValues3.put(-1, "миллионов");
        endPriceValues3.put(0, "миллионов");
        endPriceValues3.put(1, "миллион");
        endPriceValues3.put(2, "миллиона");
        endPriceValues3.put(3, "миллиона");
        endPriceValues3.put(4, "миллиона");
        endPriceValues3.put(5, "миллионов");
        endPriceValues3.put(6, "миллионов");
        endPriceValues3.put(7, "миллионов");
        endPriceValues3.put(8, "миллионов");
        endPriceValues3.put(9, "миллионов");
        endPriceValues3.put(10, "миллионов");
        placeValues.put(3, endPriceValues3);

        placeGenders.put(3, PlaceGender.MALE);

        HashMap<Integer, String> endPriceValues4 = new HashMap<>();
        endPriceValues4.put(-1, "миллиардов");
        endPriceValues4.put(0, "миллиардов");
        endPriceValues4.put(1, "миллиард");
        endPriceValues4.put(2, "миллиарда");
        endPriceValues4.put(3, "миллиарда");
        endPriceValues4.put(4, "миллиарда");
        endPriceValues4.put(5, "миллиардов");
        endPriceValues4.put(6, "миллиардов");
        endPriceValues4.put(7, "миллиардов");
        endPriceValues4.put(8, "миллиардов");
        endPriceValues4.put(9, "миллиардов");
        endPriceValues4.put(10, "миллиардов");
        placeValues.put(4, endPriceValues4);

        placeGenders.put(4, PlaceGender.MALE);

    }

}
