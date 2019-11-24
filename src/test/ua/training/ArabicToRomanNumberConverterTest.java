package ua.training;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArabicToRomanNumberConverterTest {
    private ArabicToRomanNumberConverter converter;

    @Before
    public void initTestObject() {
        converter = new ArabicToRomanNumberConverter();
    }

    @Test
    public void testConverting_0_to_EmptyString() {
        Assert.assertEquals("", convert(0));
    }

    private String convert(int arabicNumber) {
        return converter.convert(arabicNumber);
    }

    @Test
    public void testConvertingNegativeValueToEmptyString() {
        Assert.assertEquals("", convert(-1));
    }

    @Test
    public void testConverting_1_to_I() {
        Assert.assertEquals("I", convert(1));
    }

    @Test
    public void testConverting_2_to_II() {
        Assert.assertEquals("II", convert(2));
    }

}