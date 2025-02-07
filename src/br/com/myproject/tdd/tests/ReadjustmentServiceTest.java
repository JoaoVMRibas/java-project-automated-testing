package br.com.myproject.tdd.tests;

import br.com.myproject.tdd.classes.models.Employee;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadjustmentServiceTest {

    @Test
    void threePercentReadjustmentWhenPerformanceIsUnsatisfactory(){
        ReadjustmentService readjustmentService = new ReadjustmentService();
        Employee employee = new Employee("Rodrigo", LocalDate.now(),new BigDecimal("3000"));

        readjustmentService.calculateReadjustment(employee, Performance.UNSATISFACTORY);

        assertEquals(new BigDecimal("3090.00"),employee.getSalary());
    }
}
