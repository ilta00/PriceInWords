package ru.timonova.main.converter.impl;

import ru.timonova.main.converter.Currency;
import ru.timonova.main.converter.PlaceGender;
import ru.timonova.main.converter.PriceConverter;

import java.util.HashMap;

public class PriceConverterImpl implements PriceConverter {

    public String getInWord(long price, Currency currency) {
        String result = "";

        if (price < 0) {
            return "Число должно быть больше нуля!";
        }

        if (price == 0) {
            return returnO(currency);
        }

        long currentPrice = price;
        int firstPlace = 0;
        int secondPlace = 0;
        int thirdPlace = 0;

        int part = 0;
        while (currentPrice > 0) {
            part = part + 1;
            firstPlace = (int) currentPrice % 10;
            currentPrice = currentPrice / 10;
            secondPlace = (int) currentPrice % 10;
            currentPrice = currentPrice / 10;
            thirdPlace = (int) currentPrice % 10;
            currentPrice = currentPrice / 10;

            result = convertPart(firstPlace, secondPlace, thirdPlace, part, currency) + result;
        }

        result = result.trim();
        return result;
    }

    private String convertPart(int firstPlace, int secondPlace, int thirdPlace, int part, Currency currency) {
        String result = "";

        HashMap<Integer, String> stringValues = currency.getStringValues();
        HashMap<Integer, HashMap> placeValues = currency.getPlaceValues();
        HashMap<Integer, String> stringValuesMale = currency.getStringValuesMale();
        HashMap<Integer, String> stringValuesFemale = currency.getStringValuesFemale();
        HashMap<Integer, PlaceGender> placeGenders = currency.getPlaceGenders();

        HashMap<Integer, String> endPriceValues = placeValues.get(part);
        PlaceGender placeGender = placeGenders.get(part);

        if (secondPlace == 1) {
            result = stringValues.get(secondPlace * 10 + firstPlace) + " " + endPriceValues.get(-1) + " " + result;
        } else {
            if (firstPlace > 0) {
                if (placeGender.equals(PlaceGender.FEMALE))
                    result = stringValuesFemale.get(firstPlace) + " " + result;
                if (placeGender.equals(PlaceGender.MALE))
                    result = stringValuesMale.get(firstPlace) + " " + result;
            }

            if (secondPlace > 0)
                result = stringValues.get(secondPlace * 10) + " " + result;
        }
        if (thirdPlace > 0)
            result = stringValues.get(thirdPlace * 100) + " " + result;

        if ((firstPlace > 0 || secondPlace > 0 || thirdPlace > 0 || part == 1) && secondPlace != 1) {
            if (firstPlace > 0)
                result = result + endPriceValues.get(firstPlace) + " ";
            else
                result = result + endPriceValues.get(-1);
        }

        return result;
    }

    private String returnO(Currency currency) {
        String result = "";

        HashMap<Integer, HashMap> placeValues = currency.getPlaceValues();
        HashMap<Integer, String> stringValuesMale = currency.getStringValuesMale();
        HashMap<Integer, String> stringValuesFemale = currency.getStringValuesFemale();
        HashMap<Integer, PlaceGender> placeGenders = currency.getPlaceGenders();

        HashMap<Integer, String> endPriceValues = placeValues.get(1);
        PlaceGender placeGender = placeGenders.get(1);

        if (placeGender.equals(PlaceGender.FEMALE))
            result = stringValuesFemale.get(0);
        if (placeGender.equals(PlaceGender.MALE))
            result = stringValuesMale.get(0);

        result = result + " " + endPriceValues.get(0);

        return result;
    }
}
