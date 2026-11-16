1. Name, Age and College
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your college name: ");
        String college = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}
Output:

Enter your name: Akshit
Enter your age: 20
Enter your college name: ABC College
Name: Akshit
Age: 20
College: ABC College
2. Arithmetic Operations
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));
    }
}
Output:

Enter first integer: 20
Enter second integer: 5
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4
Modulus = 0
3. Even or Odd
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
Output:

Enter a number: 17
Odd
4. Relational Operators
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
    }
}
Output:

Enter first number: 10
Enter second number: 5
a > b = true
a < b = false
a == b = false
a != b = true
a >= b = true
a <= b = false
5. Explicit Type Casting
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double num = sc.nextDouble();

        int converted = (int) num;

        System.out.println("Original value = " + num);
        System.out.println("Integer value = " + converted);
    }
}
Output:

Enter a floating-point number: 25.78
Original value = 25.78
Integer value = 25
6. ASCII Value
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("ASCII value = " + (int) ch);
    }
}
Output:

Enter a character: A
ASCII value = 65
7. Divisible by 3 and 5
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println("Divisible by both 3 and 5");
        else
            System.out.println("Not divisible by both 3 and 5");
    }
}
Output:

Enter a number: 30
Divisible by both 3 and 5
8. Vowel or Consonant
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
Output:

Enter a character: e
Vowel
9. Total, Percentage and Pass/Fail
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = total / 3;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
Output:

Enter marks of subject 1: 70
Enter marks of subject 2: 80
Enter marks of subject 3: 60
Total = 210.0
Percentage = 70.0%
Pass
10. Greatest of Two Numbers
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Greatest = " + a);
        else if (b > a)
            System.out.println("Greatest = " + b);
        else
            System.out.println("Both numbers are equal");
    }
}
Output:

Enter first number: 25
Enter second number: 18
Greatest = 25
11. Largest of Three Numbers
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b) {
            if (a >= c)
                System.out.println("Largest = " + a);
            else
                System.out.println("Largest = " + c);
        } else {
            if (b >= c)
                System.out.println("Largest = " + b);
            else
                System.out.println("Largest = " + c);
        }
    }
}
Output:

Enter first number: 15
Enter second number: 28
Enter third number: 20
Largest = 28
12. Leap Year
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
Output:

Enter year: 2024
Leap Year
13. Positive, Negative or Zero
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
Output:

Enter a number: -8
Negative
14. Character Classification
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase Letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase Letter");
        else
            System.out.println("Special Character");
    }
}
Output:

Enter a character: G
Uppercase Letter
15. Armstrong Number
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
Output:

Enter a 3-digit number: 153
Armstrong Number
16. Income Tax
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        double tax;

        if (income <= 250000)
            tax = 0;
        else if (income <= 500000)
            tax = income * 0.05;
        else if (income <= 1000000)
            tax = income * 0.20;
        else
            tax = income * 0.30;

        System.out.println("Tax = " + tax);
    }
}
Output:

Enter income: 400000
Tax = 20000.0
17. Palindrome Number
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}
Output:

Enter an integer: 121
Palindrome Number
18. Prime Number
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean prime = true;

        if (n <= 1)
            prime = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
Output:

Enter a number: 17
Prime Number
19. Operator and Operation
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+')
            System.out.println("Result = " + (a + b));
        else if (op == '-')
            System.out.println("Result = " + (a - b));
        else if (op == '*')
            System.out.println("Result = " + (a * b));
        else if (op == '/') {
            if (b != 0)
                System.out.println("Result = " + (a / b));
            else
                System.out.println("Cannot divide by zero");
        } else
            System.out.println("Invalid Operator");
    }
}
Output:

Enter first number: 20
Enter second number: 4
Enter operator (+, -, *, /): *
Result = 80.0
20. Marriage Eligibility
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            if (age >= 21)
                System.out.println("Eligible");
            else
                System.out.println("Not Eligible");
        } else if (gender == 'F' || gender == 'f') {
            if (age >= 18)
                System.out.println("Eligible");
            else
                System.out.println("Not Eligible");
        } else {
            System.out.println("Invalid Gender");
        }
    }
}
Output:

Enter age: 22
Enter gender (M/F): M
Eligible
21. Valid Triangle
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();

        System.out.print("Enter second angle: ");
        int b = sc.nextInt();

        System.out.print("Enter third angle: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}
Output:

Enter first angle: 60
Enter second angle: 60
Enter third angle: 60
Valid Triangle
22. Square or Rectangle
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        if (length == breadth)
            System.out.println("It is a Square");
        else
            System.out.println("It is a Rectangle");
    }
}
Output:

Enter length: 10
Enter breadth: 10
It is a Square
23. Celsius to Fahrenheit
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
Output:

Enter temperature in Celsius: 25
Temperature in Fahrenheit = 77.0
24. Perfect Number
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }

        if (sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}
Output:

Enter a number: 28
Perfect Number
25. Logical Operator
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (&& or ||): ");
        String op = sc.next();

        boolean result;

        if (op.equals("&&"))
            result = (a > 0 && b > 0);
        else if (op.equals("||"))
            result = (a > 0 || b > 0);
        else {
            System.out.println("Invalid Operator");
            return;
        }

        System.out.println("Result = " + result);
    }
}
Output:

Enter first integer: 5
Enter second integer: -2
Enter logical operator (&& or ||): &&
Result = false
26. First and Last Digit
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int n = sc.nextInt();

        int first = n / 10000;
        int last = n % 10;

        if (first == last)
            System.out.println("First and last digits are same");
        else
            System.out.println("First and last digits are different");
    }
}
Output:

Enter a five-digit number: 12341
First and last digits are same
27. Profit or Loss
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();

        if (sp > cp)
            System.out.println("Profit = " + (sp - cp));
        else if (cp > sp)
            System.out.println("Loss = " + (cp - sp));
        else
            System.out.println("No Profit, No Loss");
    }
}
Output:

Enter cost price: 500
Enter selling price: 650
Profit = 150.0
28. Number of Digits
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        n = Math.abs(n);

        if (n < 10)
            System.out.println("Number of digits = 1");
        else if (n < 100)
            System.out.println("Number of digits = 2");
        else if (n < 1000)
            System.out.println("Number of digits = 3");
        else if (n < 10000)
            System.out.println("Number of digits = 4");
        else if (n < 100000)
            System.out.println("Number of digits = 5");
        else
            System.out.println("Number of digits = " + String.valueOf(n).length());
    }
}
Output:

Enter a number: 45678
Number of digits = 5
29. Height Classification
import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        int height = sc.nextInt();

        if (height < 150)
            System.out.println("Short");
        else if (height <= 170)
            System.out.println("Average");
        else
            System.out.println("Tall");
    }
}
Output:

Enter height in cm: 165
Average
30. Simple Calculator
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+')
            System.out.println("Result = " + (a + b));
        else if (op == '-')
            System.out.println("Result = " + (a - b));
        else if (op == '*')
            System.out.println("Result = " + (a * b));
        else if (op == '/') {
            if (b != 0)
                System.out.println("Result = " + (a / b));
            else
                System.out.println("Cannot divide by zero");
        } else
            System.out.println("Invalid Operator");
    }
}
Output:

Enter first number: 25
Enter second number: 5
Enter operator (+, -, *, /): /
Result = 5.0