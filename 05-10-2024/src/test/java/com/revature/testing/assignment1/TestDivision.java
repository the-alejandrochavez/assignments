package com.revature.testing.assignment1;

import com.revature.testing.Calculator;
import org.junit.jupiter.api.*;

public class TestDivision {

    Calculator calculator;
    int result = 0;

    @Test
    @DisplayName("Division Test Case")
    public void testDivision() {
        // Arrange
        calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 1;
        int actualResult = 0;

        // Act
        actualResult = calculator.divide(firstNumber,secondNumber);
        result = actualResult;

        //Assert
        if(secondNumber == 0) {
            Assertions.assertThrows(ArithmeticException.class, () -> {
                calculator.divide(firstNumber,secondNumber);
            });
        }


        Assertions.assertEquals(expectedResult, actualResult);
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Dividing...");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Result: " + result);
    }
}
