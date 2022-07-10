package ru.timonova.main;

import ru.timonova.main.converter.Currency;
import ru.timonova.main.converter.IOService;
import ru.timonova.main.converter.PriceInWords;
import ru.timonova.main.converter.impl.CurrencyRUR;
import ru.timonova.main.converter.impl.IOStreamsService;
import ru.timonova.main.converter.impl.PriceConverterImpl;
import ru.timonova.test.AllTests;

public class PriceConverterApplication {

    public static void main(String[] args) {

        AllTests allTests = new AllTests();
        allTests.run();

        PriceConverterImpl priceConverterImpl = new PriceConverterImpl();
        IOService ioService = new IOStreamsService(System.out, System.in);
        Currency currency = new CurrencyRUR();
        currency.init();
        PriceInWords priceInWords = new PriceInWords(ioService,
                priceConverterImpl, currency);
        priceInWords.run();
    }
}
