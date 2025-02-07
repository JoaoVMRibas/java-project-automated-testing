package br.com.myproject.tdd.tests;

import br.com.myproject.tdd.classes.models.Employee;
import br.com.myproject.tdd.classes.services.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void calculateEmployeeBonus() {
        Employee employee = new Employee("Pedro", LocalDate.now(),new BigDecimal("1000"));
        BonusService bonus = new BonusService();

        BigDecimal res = bonus.calculateBonus(employee);

        assertEquals(new BigDecimal("100.0"),res);
    }

    @Test
    void calculateEmployeeBonusWhenSalaryIsHigh() {
        Employee employee = new Employee("Pedro", LocalDate.now(),new BigDecimal("12000"));
        BonusService bonus = new BonusService();

        BigDecimal res = bonus.calculateBonus(employee);

        assertEquals(BigDecimal.ZERO,res);
    }
}