package ru.timonova.main.converter;

public interface IOService {
    void outputString(String message);

    void outputString(String template, Object... args);

    String inputString();
}

