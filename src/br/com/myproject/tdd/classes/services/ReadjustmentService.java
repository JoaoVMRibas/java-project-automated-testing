package br.com.myproject.tdd.classes.services;

import br.com.myproject.tdd.classes.models.Employee;
import br.com.myproject.tdd.classes.models.Performance;

import java.math.BigDecimal;

public class ReadjustmentService {
    public void calculateReadjustment(Employee employee, Performance performance) {
        if(performance == Performance.UNSATISFACTORY){
            BigDecimal readjustment = employee.getSalary().multiply(new BigDecimal("0.03"));
            employee.readjustSalary(readjustment);
        }
    }
}
