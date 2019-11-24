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

    @Test
    public void testConverting_4_to_IV() {
        Assert.assertEquals("IV", convert(4));
    }

    @Test
    public void testConverting_5_to_V() {
        Assert.assertEquals("V", convert(5));
    }

    @Test
    public void testConverting_9_to_IX() {
        Assert.assertEquals("IX", convert(9));
    }

    @Test
    public void testConverting_10_to_X() {
        Assert.assertEquals("X", convert(10));
    }

    @Test
    public void testConverting_40_to_XL() {
        Assert.assertEquals("XL", convert(40));
    }

    @Test
    public void testConverting_50_to_L() {
        Assert.assertEquals("L", convert(50));
    }

    @Test
    public void testConverting_100_to_C() {
        Assert.assertEquals("C", convert(100));
    }

}