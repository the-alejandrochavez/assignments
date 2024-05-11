package com.revature.testing.assignment1;

import com.revature.testing.Calculator;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSubAndMul {

    Calculator calculator;
    int result = 0;

    @Test
    @DisplayName("Subtraction Test Case")
    @Order(1)
    public void testSubtraction() {
        // AAA

        // Arrange -- arranging the data and objects for testing
        calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        int actualResult = 0;

        // Act -- calling the functionality
        actualResult = calculator.subtract(firstNumber, secondNumber);
        result = actualResult;

        // Assert -- checking expectedResult with actualResult
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Multiplication Test Case")
    @Order(2)
    public void testMultiplication() {
        // Arrange
        calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 100;
        int actualResult = 0;

        // Act
        actualResult = calculator.multiply(firstNumber,secondNumber);
        result = actualResult;

        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Calculating...");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Result: " + result);
    }
}
