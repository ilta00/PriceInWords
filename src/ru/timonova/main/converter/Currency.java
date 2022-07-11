package ru.timonova.main.converter;

import java.util.HashMap;

public interface Currency {
    HashMap<Integer, String> stringValues = new HashMap<>();
    HashMap<Integer, String> stringValuesMale = new HashMap<>();
    HashMap<Integer, String> stringValuesFemale = new HashMap<>();
    HashMap<Integer, HashMap> placeValues = new HashMap<>();
    HashMap<Integer, PlaceGender> placeGenders = new HashMap<>();

    HashMap<Integer, String> getStringValues();
    HashMap<Integer, String> getStringValuesMale();
    HashMap<Integer, String> getStringValuesFemale();
    HashMap<Integer, HashMap> getPlaceValues();
    HashMap<Integer, PlaceGender> getPlaceGenders();

    void init();
}
