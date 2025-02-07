package br.com.myproject.tdd.classes.services;

import br.com.myproject.tdd.classes.models.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

    public BigDecimal calculateBonus(Employee employee) {
        BigDecimal value = employee.getSalary().multiply(new BigDecimal("0.1"));
        if (value.compareTo(new BigDecimal("1000")) > 0) {
            throw new IllegalArgumentException("Employee with very high salary does not receive bonus.");
        }
        return value.setScale(2, RoundingMode.HALF_DOWN);
    }
}