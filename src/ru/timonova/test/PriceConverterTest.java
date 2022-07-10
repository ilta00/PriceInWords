package ru.timonova.test;

import ru.otus.assertions.Assertions;
import ru.timonova.main.converter.Currency;
import ru.timonova.main.converter.PriceConverter;
import ru.timonova.main.converter.impl.CurrencyRUR;
import ru.timonova.main.converter.impl.PriceConverterImpl;

public class PriceConverterTest {
    Currency currency = new CurrencyRUR();

    public PriceConverterTest() {
        currency.init();
    }

    public void testPriceConverter1() {
        String scenario = "T1. 0L RUR";
        try {
            PriceConverter priceConverter = new PriceConverterImpl();

            String expected = "ноль рублей";
            String actual = priceConverter.getInWord(0L, currency);

            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testPriceConverter2() {
        String scenario = "T2. -1L RUR";
        try {
            PriceConverter priceConverter = new PriceConverterImpl();

            String expected = "Число должно быть больше нуля!";
            String actual = priceConverter.getInWord(-1L, currency);

            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testPriceConverter3() {
        String scenario = "T3. 1L RUR";
        try {
            PriceConverter priceConverter = new PriceConverterImpl();

            String expected = "один рубль";
            String actual = priceConverter.getInWord(1L, currency);

            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testPriceConverter4() {
        String scenario = "T4. 1111111111L RUR";
        try {
            PriceConverter priceConverter = new PriceConverterImpl();

            String expected = "один миллиард сто одиннадцать миллионов сто одиннадцать тысяч сто одиннадцать рублей";
            String actual = priceConverter.getInWord(1111111111L, currency);

            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testPriceConverter5() {
        String scenario = "T5. 1234567890L RUR";
        try {
            PriceConverter priceConverter = new PriceConverterImpl();

            String expected = "один миллиард двести тридцать четыре миллиона пятьсот шестьдесят семь тысяч восемьсот девяносто рублей";
            String actual = priceConverter.getInWord(1234567890L, currency);

            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testPriceConverter6() {
        String scenario = "T6. 100L RUR";
        try {
            PriceConverter priceConverter = new PriceConverterImpl();

            String expected = "сто рублей";
            String actual = priceConverter.getInWord(100L, currency);

            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
