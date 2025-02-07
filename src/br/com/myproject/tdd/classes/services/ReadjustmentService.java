package br.com.myproject.tdd.classes.services;

import br.com.myproject.tdd.classes.models.Employee;
import br.com.myproject.tdd.classes.models.Performance;

import java.math.BigDecimal;

public class ReadjustmentService {
    public void calculateReadjustment(Employee employee, Performance performance) {
        BigDecimal readjustment = employee.getSalary().multiply(performance.adjustmentPercentage());
        employee.readjustSalary(readjustment);
    }
}
