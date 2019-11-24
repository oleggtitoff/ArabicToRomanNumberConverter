package ua.training;

import java.lang.StringBuilder;

class ArabicToRomanNumberConverter {
    private StringBuilder romanNumber;

    ArabicToRomanNumberConverter() {
        romanNumber = new StringBuilder();
    }

    String convert(int arabicNumber) {
        while (arabicNumber > 0) {
            romanNumber.append("I");
            arabicNumber--;
        }
        return romanNumber.toString();
    }

}
