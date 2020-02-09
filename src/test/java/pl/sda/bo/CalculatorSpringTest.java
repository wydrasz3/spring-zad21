package pl.sda.bo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pl.sda.config.AppConfig;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
class CalculatorSpringTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        BigDecimal result = calculator.add(BigDecimal.TEN, BigDecimal.valueOf(100));
        BigDecimal expectedResult = BigDecimal.valueOf(110);
        Assertions.assertEquals(result, expectedResult);
    }
}