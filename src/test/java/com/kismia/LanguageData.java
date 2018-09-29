package com.kismia;

import org.testng.annotations.DataProvider;

public class LanguageData {

    @DataProvider(name = "languageValue")
    public static Object[][] createLanguageData() {
        return new Object[][]{
                {"Ru", "Знакомства"},
                {"En", "Dating"},
                {"Pt", "Encontros"},
                {"Es", "Contactos"},
                {"Fr", "Sortir avec quelqu'un"}
        };


    }
}
