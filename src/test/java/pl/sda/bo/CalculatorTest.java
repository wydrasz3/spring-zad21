package pl.sda.bo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        BigDecimal result = calculator.add(BigDecimal.TEN, BigDecimal.valueOf(100));
        BigDecimal expectedResult = BigDecimal.valueOf(110);
        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        BigDecimal result = calculator.subtract(BigDecimal.TEN, BigDecimal.valueOf(100));
        BigDecimal expectedResult = BigDecimal.valueOf(-90);
        Assertions.assertEquals(result, expectedResult);
    }
}