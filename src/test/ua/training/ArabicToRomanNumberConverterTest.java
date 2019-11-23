package ua.training;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArabicToRomanNumberConverterTest {
    private static ArabicToRomanNumberConverter converter;

    @BeforeClass
    public static void initTestObject() {
        converter = new ArabicToRomanNumberConverter();
    }

    @Test
    public void testConverting0ToEmptyString() {
        String romanNumber = converter.convert(0);
        Assert.assertEquals("", romanNumber);
    }

}