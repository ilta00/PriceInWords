package ru.timonova.main.converter;

import ru.timonova.main.converter.impl.PriceConverterImpl;

public class PriceInWords {
    private final IOService ioService;
    private final PriceConverterImpl priceConverterImpl;
    private final Currency currency;

    public PriceInWords(IOService ioService, PriceConverterImpl priceConverterImpl, Currency currency) {
        this.ioService = ioService;
        this.priceConverterImpl = priceConverterImpl;
        this.currency = currency;
    }

    public void run() {
        while (true) {
            ioService.outputString("Введите число или команду \"exit\"");
            String command = ioService.inputString();
            if (command.equals("exit")) {
                break;
            } else {
                long priceInDigit;
                try {
                    priceInDigit = Long.valueOf(command).longValue();
                    String priceInWords = priceConverterImpl.getInWord(priceInDigit, currency);
                    ioService.outputString(priceInWords);
                } catch (Exception exception) {
                    ioService.outputString("Необходимо ввести целое число!");
                }
            }
        }
    }
}


