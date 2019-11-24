package ua.training;

import java.lang.StringBuilder;
import java.util.LinkedHashMap;
import java.util.Map;

class ArabicToRomanNumberConverter {
    private StringBuilder romanNumber;
    private LinkedHashMap<Integer, String> digits;

    ArabicToRomanNumberConverter() {
        romanNumber = new StringBuilder();

        digits = new LinkedHashMap<>();
        digits.put(100, "C");
        digits.put(50, "L");
        digits.put(10, "X");
        digits.put(5, "V");
        digits.put(1, "I");
    }

    String convert(int arabicNumber) {
        for (Map.Entry<Integer, String> digit : digits.entrySet()) {
            while (arabicNumber >= digit.getKey()) {
                romanNumber.append(digit.getValue());
                arabicNumber -= digit.getKey();
            }
        }
        return romanNumber.toString();
    }

}
