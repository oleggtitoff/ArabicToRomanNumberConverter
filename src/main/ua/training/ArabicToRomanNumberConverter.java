package ua.training;

class ArabicToRomanNumberConverter {

    String convert(int arabicNumber) {
        if (isNotZero(arabicNumber)) {
            return "I";
        }
        return "";
    }

    private boolean isNotZero(int number) {
        return (number != 0);
    }

}
