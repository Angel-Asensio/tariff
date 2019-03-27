package de.angelasensio.tariff.service;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.BigDecimalCloseTo.closeTo;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.util.HashSet;

import org.junit.Test;

import de.angelasensio.tariff.model.Module;
import de.angelasensio.tariff.model.ModuleType;
import de.angelasensio.tariff.model.Policy;

public class CalculatorServiceTest {

    private CalculatorService calculatorService = new CalculatorService();

    @Test
    public void emptyPolicyReturnsZero() {
        Policy emptyPolicy = new Policy();
        assertThat(calculatorService.calculatePrice(emptyPolicy), is(BigDecimal.ZERO));
    }

    @Test
    public void validPolicyReturnsRightPrice() {
        Policy policy = new Policy(new HashSet<>(asList(new Module(1000, ModuleType.BIKE),
                new Module(1000, ModuleType.JEWELRY))));

        assertThat(calculatorService.calculatePrice(policy), is(closeTo(new BigDecimal("350"), new BigDecimal(0))));
    }

}