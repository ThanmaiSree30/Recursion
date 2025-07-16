 1.Print "Hello my dear" N times using Recursion

public class HelloRecursion {
    static void printHello(int n) {
        if (n == 0) return;
        System.out.println("Hello my dear");
        printHello(n - 1);
    }

    public static void main(String[] args) {
        printHello(5);
    }
}


2.Print Numbers from N to 1

public class PrintNto1 {
    static void print(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        print(n - 1);
    }

    public static void main(String[] args) {
        print(5); // 5 4 3 2 1
    }
}

 
3.Print Numbers from 1 to N

public class Print1toN {
    static void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print(5); // 1 2 3 4 5
    }
}

4.Find Factorial of a Number

public class Factorial {
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}

5.Find Nth Fibonacci Number

public class Fibonacci {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(6)); // 8
    }
}

6. Sum of First N Natural Numbers

public class SumNatural {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // 15
    }
}

7.Find Sum of Digits of a Number

public class SumDigits {
    static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123)); // 6
    }
}

8. Count the Number of Digits of a Number

public class CountDigits {
    static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345)); // 5
    }
}

9. Print Even Numbers from 2 to N

public class EvenNumbers {
    static void printEven(int n) {
        if (n < 2) return;
        printEven(n - 1);
        if (n % 2 == 0) System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printEven(10); // 2 4 6 8 10
    }
}

10. Print a Number in Reverse

public class ReverseNumber {
    static void reverse(int n) {
        if (n == 0) return;
        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static void main(String[] args) {
        reverse(1234); // 4321
    }
}

11. Calculate Product of First N Natural Numbers

public class ProductNatural {
    static int product(int n) {
        if (n == 1) return 1;
        return n * product(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(product(5)); // 120
    }
}

12. Print Sum of an Array using Recursion

public class SumArray {
    static int sum(int[] arr, int n) {
        if (n <= 0) return 0;
        return sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr, arr.length)); // 15
    }
}

13. Print All Elements of an Array using Recursion

public class PrintArray {
    static void print(int[] arr, int index) {
        if (index == arr.length) return;
        System.out.print(arr[index] + " ");
        print(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        print(arr, 0); // 10 20 30 40
    }
}

14. Calculate Sum of Squares of First N Numbers

public class SumSquares {
    static int sumSquares(int n) {
        if (n == 0) return 0;
        return n * n + sumSquares(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumSquares(3)); // 14
    }
}

15. Check if Number is Palindrome
 
public class PalindromeCheck {
    static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num)); // true
    }
}
