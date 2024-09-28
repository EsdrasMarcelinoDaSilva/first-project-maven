package project.maven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();

    }
    //refactor tests using tripe A
    @Test
    public void testAddition(){

        double a = 2;
        double b = 2;
        double expectedResult = 4;

        double ResultObtained = calculator.add(a, b);

        assertEquals(expectedResult, ResultObtained, 0.0001);
    }

    @Test
    public void testSubtraction(){
        double a = 2;
        double b = 2;
        double expectedResult = 0;

        double ResultObtained = calculator.subtract(a, b);

        assertEquals(expectedResult, ResultObtained, 0.0001);
    }

    @Test
    public void testMultiply(){
        assertEquals(4, calculator.multiply(2, 2), 0.0001);
    }

    @Test
    public void testMultiplicationByZeroFirst(){
        double a = 5;
        double b = 0;
        double expectedResult = 0;

        double ResultObtained = calculator.multiply(a, b);

        assertEquals(expectedResult, ResultObtained, 0.0001);
    }

    @Test
    public void testMultiplicationByZeroSecond() {
        double a = 0;
        double b = 5;
        double expectedResult = 0;

        double ResultObtained = calculator.multiply(a, b);

        assertEquals(expectedResult, ResultObtained, 0.0001);
    }

    @Test
    public void testMultiplicationByZeroNegativeFirst(){
        double a = -3;
        double b = 0;
        double expectedResult = 0;

        double ResultObtained = calculator.multiply(a, b);

        assertEquals(expectedResult, ResultObtained, 0.0001);
    }

    @Test
    public void testMultiplicationByZeroNegativeSecond(){
        double a = 0;
        double b = -3;
        double expectedResult = 0;

        double ResultObtained = calculator.multiply(a, b);

        assertEquals(expectedResult, ResultObtained, 0.0001);
    }

    @Test
    public void testDivision(){
        assertEquals(1, calculator.division(2, 2), 0.0001);
    }

}