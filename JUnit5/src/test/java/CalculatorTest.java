import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void additionShouldEqual4() {
        var calc = new Calculator();
        assertEquals(4, calc.addition(2,2));
    }

    @Test
    void multiplicationShouldEqual12() {
        var calc = new Calculator();
        assertEquals(10, calc.multiplication(5,2));
    }

    @Test
    void subtractionShouldEqual3() {
        var calc = new Calculator();
        assertEquals(3, calc.subtraction(6,3));
    }

    @Test
    void divisionShouldEqual10() {
        var calc = new Calculator();
        assertEquals(5, calc.division(10,2));
    }
}