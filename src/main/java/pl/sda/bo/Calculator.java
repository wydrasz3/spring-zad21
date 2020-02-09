package pl.sda.bo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {

    BigDecimal add(BigDecimal first, BigDecimal second) {
        return first.add(second);
    }

    BigDecimal subtract(BigDecimal first, BigDecimal second) {

        return first.subtract(second);
    }
}
