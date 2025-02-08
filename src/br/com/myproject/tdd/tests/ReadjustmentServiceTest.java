package br.com.myproject.tdd.tests;

import br.com.myproject.tdd.classes.models.Employee;
import br.com.myproject.tdd.classes.models.Performance;
import br.com.myproject.tdd.classes.services.ReadjustmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadjustmentServiceTest {

    ReadjustmentService readjustmentService;
    Employee employee;

    @BeforeEach
    void initialize(){
        this.readjustmentService = new ReadjustmentService();
        this.employee = new Employee("Rodrigo", LocalDate.now(),new BigDecimal("1000"));
    }

    @Test
    void threePercentReadjustmentWhenPerformanceIsUnsatisfactory(){
        readjustmentService.calculateReadjustment(employee, Performance.UNSATISFACTORY);
        assertEquals(new BigDecimal("1030.00"),employee.getSalary());
    }

    @Test
    void threePercentReadjustmentWhenPerformanceIsGood(){
        readjustmentService.calculateReadjustment(employee, Performance.GOOD);
        assertEquals(new BigDecimal("1150.00"),employee.getSalary());
    }

    @Test
    void threePercentReadjustmentWhenPerformanceIsExcellent(){
        readjustmentService.calculateReadjustment(employee, Performance.EXCELLENT);
        assertEquals(new BigDecimal("1200.00"),employee.getSalary());
    }
}
