package com.revature.testing.assignment1;

import com.revature.testing.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestAddition {

    Calculator calculator;
    int result = 0;

    //    @Test
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "2, 3, 5",
            "10, 30, 40",
            "2, -2, 0",
            "-10, 19, 9"
    })
    @DisplayName("Addition Test Case")
    public void testAddition(int firstNumber, int secondNumber, int expectedResult) {
        // Arrange
        calculator = new Calculator();

//        int firstNumber = 10;
//        int secondNumber = 10;
//        int expectedResult = 20;
        int actualResult;

        // Act
        actualResult = calculator.add(firstNumber,secondNumber);
        result = actualResult;

        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Adding...");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Result: " + result);
    }
}
