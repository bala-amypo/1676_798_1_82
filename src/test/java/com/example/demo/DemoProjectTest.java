package com.example.demo;

import com.example.demo.service.EmployeeService;
import com.example.demo.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// Spring Boot test context
@SpringBootTest
public class DemoProjectTest {

    // Mock dependencies
    @Mock
    private EmployeeService employeeService;

    // Inject mocks into the class under test
    @InjectMocks
    private DemoApplication demoApplication; // Replace with actual class if needed

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this); // Initialize Mockito annotations
    }

    @Test
    void testEmployeeFound() {
        // Arrange
        Employee emp = new Employee();
        emp.setId(1L);
        emp.setName("John Doe");

        when(employeeService.findById(1L)).thenReturn(Optional.of(emp));

        // Act
        Optional<Employee> result = employeeService.findById(1L);

        // Assert
        assertTrue(result.isPresent());
        assertEquals("John Doe", result.get().getName());

        verify(employeeService, times(1)).findById(1L);
    }

    @Test
    void testEmployeeNotFound() {
        // Arrange
        when(employeeService.findById(2L)).thenReturn(Optional.empty());

        // Act
        Optional<Employee> result = employeeService.findById(2L);

        // Assert
        assertFalse(result.isPresent());
        verify(employeeService, times(1)).findById(2L);
    }
}
