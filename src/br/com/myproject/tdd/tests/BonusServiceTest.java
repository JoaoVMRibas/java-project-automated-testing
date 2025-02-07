package br.com.myproject.tdd.tests;

import br.com.myproject.tdd.classes.models.Employee;
import br.com.myproject.tdd.classes.services.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusServiceTest {

    @Test
    void calculateEmployeeBonus() {
        Employee employee = new Employee("Pedro", LocalDate.now(),new BigDecimal("1000"));
        BonusService bonusService = new BonusService();

        BigDecimal bonus = bonusService.calculateBonus(employee);

        assertEquals(new BigDecimal("100.00"),bonus);
    }

    @Test
    void calculateEmployeeBonusWhenSalaryIsHigh() {
        Employee employee = new Employee("Pedro", LocalDate.now(),new BigDecimal("12000"));
        BonusService bonusService = new BonusService();

        assertThrows(IllegalArgumentException.class, () -> bonusService.calculateBonus(employee));
    }
}