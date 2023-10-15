package org.hbrs.se1.ws23.uebung1.control;

import org.hbrs.se1.ws23.uebung1.control.Translator;
import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;

public class TranslatorFactory {

    @org.jetbrains.annotations.Nullable
    public static Translator getTranslator(String translatorType){
        if(translatorType.equalsIgnoreCase("germanTranslator")) {
            return new GermanTranslator();
        } else
            return null;
    }
}
