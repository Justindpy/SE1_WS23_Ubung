package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void firstPositiveTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(5);
        assertEquals(value, "fuenf");
    }

    @Test
    void firstNegativeTest(){
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(40);
        assertEquals(value, "Übersetzung der Zahl 40 nicht möglich (" + translator.version + ")");
    }

    @Test
    void secondNegativeTest(){
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(-40);
        assertEquals(value, "Übersetzung der Zahl -40 nicht möglich (" + translator.version + ")");
    }

}