package level1;

import level1.RomanNumeral;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    @Test
    public void testIfValueIs1ReturnsI() {
        assertEquals("I", RomanNumeral.integerToRomanNumeral(1));
    }

    @Test
    public void testIfValueIs2ReturnsII() {
        assertEquals("II", RomanNumeral.integerToRomanNumeral(2));
    }

    @Test
    public void testIfValueIs3ReturnsIII() {
        assertEquals("III", RomanNumeral.integerToRomanNumeral(3));
    }

    @Test
    public void testIfValueIs4ReturnsIV() {
        assertEquals("IV", RomanNumeral.integerToRomanNumeral(4));
    }

    @Test
    public void testIfValueIs5ReturnsV() {
        assertEquals("V", RomanNumeral.integerToRomanNumeral(5));
    }

    @Test
    public void testIfValueIs6ReturnsVI() {
        assertEquals("VI", RomanNumeral.integerToRomanNumeral(6));
    }

    @Test
    public void testIfValueIs7ReturnsVII() {
        assertEquals("VII", RomanNumeral.integerToRomanNumeral(7));
    }

    @Test
    public void testIfValueIs8ReturnsVIII() {
        assertEquals("VIII", RomanNumeral.integerToRomanNumeral(8));
    }

    @Test
    public void testIfValueIs9ReturnsIX() {
        assertEquals("IX", RomanNumeral.integerToRomanNumeral(9));
    }

    @Test
    public void testIfValueIs10ReturnsX() {
        assertEquals("X", RomanNumeral.integerToRomanNumeral(10));
    }

    @Test
    public void testIfValueIs11ReturnsXI() {
        assertEquals("XI", RomanNumeral.integerToRomanNumeral(11));
    }

    @Test
    public void testIfValueIs20ReturnsXX() {
        assertEquals("XX", RomanNumeral.integerToRomanNumeral(20));
    }

    @Test
    public void testIfValueIs40ReturnsXL() {
        assertEquals("XL", RomanNumeral.integerToRomanNumeral(40));
    }

    @Test
    public void testIfValueIs50ReturnsL() {
        assertEquals("L", RomanNumeral.integerToRomanNumeral(50));
    }

    @Test
    public void testIfValueIs60ReturnsLX() {
        assertEquals("LX", RomanNumeral.integerToRomanNumeral(60));
    }

    @Test
    public void testIfValueIs64ReturnsLXIV() {
        assertEquals("LXIV", RomanNumeral.integerToRomanNumeral(64));
    }

    @Test
    public void testIfValueIs68ReturnsLXVIII() {
        assertEquals("LXVIII", RomanNumeral.integerToRomanNumeral(68));
    }

    @Test
    public void testIfValueIs90ReturnsXC() {
        assertEquals("XC", RomanNumeral.integerToRomanNumeral(90));
    }

    @Test
    public void testIfValueIs100ReturnsC() {
        assertEquals("C", RomanNumeral.integerToRomanNumeral(100));
    }
}