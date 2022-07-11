package ru.timonova.main.converter;

public interface PriceConverter {
    String getInWord(long price, Currency currency);
}
