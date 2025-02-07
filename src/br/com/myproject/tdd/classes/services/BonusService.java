package br.com.myproject.tdd.classes.services;

import br.com.myproject.tdd.classes.models.Employee;

import java.math.BigDecimal;

public class BonusService {

    public BigDecimal calculateBonus(Employee employee) {
        BigDecimal value = employee.getSalary().multiply(new BigDecimal("0.1"));
        if (value.compareTo(new BigDecimal("1000")) > 0) {
            value = BigDecimal.ZERO;
        }
        return value;
    }
}