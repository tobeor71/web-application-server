import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator cal;

    @Before
    public void setUp() {
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void Add() {
        //System.out.println(cal.add(6, 3));
        assertEquals(9, cal.add(6, 3));
        System.out.println("add");
    }

    @Test
    public void Subtract() {
        //System.out.println(cal.subtract(6, 3));
        assertEquals(3, cal.subtract(6, 3));
        System.out.println("substract");
    }

    @Test
    public void Multiply() {
        //System.out.println(cal.multiply(6, 3));
        assertEquals(18, cal.multiply(6, 3));
        System.out.println("multiply");
    }

    @Test
    public void Divide() {
        //System.out.println(cal.divide(6, 3));
        assertEquals(2, cal.divide(6, 3));
        System.out.println("divide");
    }

    @After
    public void tearDown() {
        cal = null;
        System.out.println("tearDown");
    }
}

/*
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        add(cal);
        subtract(cal);
        multiply(cal);
        divide(cal);
    }

    private static void divide(Calculator cal) {
        System.out.println(cal.divide(9, 3));
    }

    private static void multiply(Calculator cal) {
        System.out.println(cal.multiply(9, 3));
    }

    private static void subtract(Calculator cal) {
        System.out.println(cal.subtract(9, 3));
    }

    private static void add(Calculator cal) {
        System.out.println(cal.add(9, 3));
    }
}
*/