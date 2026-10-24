package org.example;
import org.testng.Assert; 
import org.testng.annotations.Test;
public class Main { 
public static long factorial(int n) {
if (n < 0) throw new IllegalArgumentException();
long result = 1; 
for (int i = 1; i <= n; i++) result *= i;
return result;
} 
public static double triangleArea(double base, double height) {
if (base <= 0 || height <= 0) throw new IllegalArgumentException(); 
return 0.5 * base * height;
} 
public static double calculate(double a, double b, char operation) { 
if (operation == '+') return a + b;
if (operation == '-') return a - b; 
if (operation == '*') return a * b; 
if (operation == '/') { 
if (b == 0) throw new ArithmeticException(); 
return a / b; 
} 
throw new IllegalArgumentException(); 
}
public static int compare(int a, int b) {
return Integer.compare(a, b); 
}
@Test
public void testFactorial() { 
Assert.assertEquals(factorial(5), 120);
Assert.assertEquals(factorial(0), 1);
}
@Test
public void testTriangleArea() {
Assert.assertEquals(triangleArea(4, 5), 10.0, 0.0001);
} 
@Test
public void testCalculate() {
Assert.assertEquals(calculate(7, 3, '+'), 10.0);
Assert.assertEquals(calculate(6, 3, '/'), 2.0);
}
@Test(expectedExceptions = ArithmeticException.class) 
public void testCalculateDivisionByZero() { 
calculate(5, 0, '/');
} 
@Test 
public void testCompare() { 
Assert.assertEquals(compare(10, 5), 1);
Assert.assertEquals(compare(5, 5), 0); 
} 
}
