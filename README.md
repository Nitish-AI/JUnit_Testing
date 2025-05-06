Please navigate to Testing/src -> main/java/org/example for classes(Calculator.java, IsPrime.java, NumberUtils.java, StringLength.java) and
Testing/src -> test/java/org/example for TestCases(CalculatorTest.java)

1.Write a JUnit test to check if the add method of a Calculator class is working correctly. The add method should return the sum of two integers.
Method to Test:
public int add(int a, int b) {
    return a + b;
}
Test Case:Test the add method with positive numbers, negative numbers, and zero.
Class TestCalculator{
Public void testAdd(){
}
}

2.Write a JUnit test for a method getStringLength that returns the length of a given string.
Method to Test:
public int getStringLength(String str) {
    return str.length();
}
Test Case:
         Test the method with:
A normal string (e.g., "Hello").
An empty string.

3. Write a JUnit test to ensure that themethod isEven(int number) in a NumberUtils class that returns true if the number is even.
Method to Test:
public class NumberUtils {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
Test Case:
     Test the isEven method with:
An even number (e.g., 4)
An odd number (e.g., 5)
Zero (e.g., 0 — should return true)

4. Write a JUnit test for a method isPrime that checks if a given number is prime. Return true if the number is prime, otherwise false.
Method to Test:
public boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
Test Case:
Test the method with:
A prime number (e.g., 5).
A non-prime number (e.g., 4).
