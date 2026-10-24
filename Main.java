package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
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
public static int calculate(int a, int b, char operation) { 
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
void testFactorial() {
assertEquals(120, factorial(5)); 
assertEquals(1, factorial(0));
} 
@Test
void testTriangleArea() { 
assertEquals(10.0, triangleArea(4, 5)); 
} 
@Test
void testCalculate() { 
assertEquals(10, calculate(7, 3, '+'));
assertEquals(4, calculate(7, 3, '-')); 
assertEquals(21, calculate(7, 3, '*')); 
assertEquals(2, calculate(6, 3, '/'));
}
@Test 
void testCalculateDivisionByZero() {
assertThrows(ArithmeticException.class, () -> calculate(5, 0, '/')); 
} 
@Test
void testCompare() { 
assertEquals(1, compare(10, 5));
assertEquals(-1, compare(5, 10));
assertEquals(0, compare(5, 5)); 
}
}
