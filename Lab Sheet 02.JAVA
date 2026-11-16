Q1. Area of Triangle using Heron's Formula
Plain text
import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of triangle = " + area);
    }
}
Output:

Plain text
Enter side a: 3
Enter side b: 4
Enter side c: 5
Area of triangle = 6.0
Q2. Compound Interest
Plain text
import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter time: ");
       double t = sc.nextDouble();

        double amount = p * Math.pow(1 + r / 100, t);
        double ci = amount - p;

        System.out.println("Compound Interest = " + ci);
    }
}
Output:

Plain text
Enter principal: 10000
Enter rate: 10
Enter time: 2
Compound Interest = 2100.0
Q3. Distance Between Two Points
Plain text
import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(
            Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.println("Distance = " + distance);
    }
}
Output:

Plain text
Enter x1: 1
Enter y1: 2
Enter x2: 4
Enter y2: 6
Distance = 5.0
Q4. Prefix and Postfix Increment
Plain text
import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current visitors: ");
        int visitors = sc.nextInt();

        System.out.println("Visitors entering: " + (++visitors));
        System.out.println("Visitors leaving: " + (visitors--));
        System.out.println("Visitors remaining: " + visitors);
    }
}
Output:

Plain text
Enter current visitors: 10
Visitors entering: 11
Visitors leaving: 11
Visitors remaining: 10
Q5. Negative Value Using Unary Operator
Plain text
import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int negative = -n;

        System.out.println("Negative value = " + negative);
    }
}
Output:

Plain text
Enter an integer: 25
Negative value = -25
Q6. Reduce Number by Half Using /=
Plain text
import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        int steps = 0;

        while (n >= 1) {
            n /= 2;
            steps++;
        }

        System.out.println("Number of steps = " + steps);
    }
}
Output:

Plain text
Enter a number: 16
Number of steps = 4
Q7. Rainfall of 7 Days Using +=
Plain text
import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter rainfall for day " + i + ": ");
            double rain = sc.nextDouble();

            total += rain;
        }

        System.out.println("Total rainfall = " + total);
    }
}
Output:

Plain text
Enter rainfall for day 1: 10
Enter rainfall for day 2: 20
Enter rainfall for day 3: 15
Enter rainfall for day 4: 5
Enter rainfall for day 5: 10
Enter rainfall for day 6: 25
Enter rainfall for day 7: 15
Total rainfall = 100.0
Q8. Check Valid Triangle Angles
Plain text
import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle 1: ");
        int a = sc.nextInt();

        System.out.print("Enter angle 2: ");
        int b = sc.nextInt();

        System.out.print("Enter angle 3: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180)
            System.out.println("Valid triangle");
        else
            System.out.println("Invalid triangle");
    }
}
Output:

Plain text
Enter angle 1: 60
Enter angle 2: 60
Enter angle 3: 60
Valid triangle
Q9. Lexicographic Comparison of Two Strings
Plain text
import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int min = Math.min(s1.length(), s2.length());
        int result = 0;

        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                result = -1;
                break;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                result = 1;
                break;
            }
        }

        if (result == 0) {
            if (s1.length() < s2.length())
                result = -1;
            else if (s1.length() > s2.length())
                result = 1;
        }

        if (result == 0)
            System.out.println("Both strings are equal");
        else if (result < 0)
            System.out.println("First string comes before second");
        else
            System.out.println("First string comes after second");
    }
}
Output:

Plain text
Enter first string: apple
Enter second string: banana
First string comes before second
Q10. Leap Year and Given Range
Plain text
import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter ending range: ");
        int end = sc.nextInt();

        boolean leap = (year % 400 == 0) ||
                       (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= start && year <= end)
            System.out.println("Year is a leap year and within the range");
        else
            System.out.println("Condition not satisfied");
    }
}
Output:

Plain text
Enter year: 2024
Enter starting range: 2000
Enter ending range: 2030
Year is a leap year and within the range
Q11. Student Pass Condition
Plain text
import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory percentage: ");
        double theory = sc.nextDouble();

        System.out.print("Enter practical percentage: ");
        double practical = sc.nextDouble();

        System.out.print("Enter overall percentage: ");
        double overall = sc.nextDouble();

        if ((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Student passes the course");
        else
            System.out.println("Student fails the course");
    }
}
Output:

Plain text
Enter theory percentage: 45
Enter practical percentage: 55
Enter overall percentage: 48
Student passes the course
Q12. Smallest of Four Numbers Using Ternary
Plain text
import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int smallest = (a < b)
                ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
                : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));

        System.out.println("Smallest = " + smallest);
    }
}
Output:

Plain text
Enter four numbers: 25 10 40 15
Smallest = 10
Q13. Vowel, Consonant, Digit or Special Symbol
Plain text
import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result = Character.isDigit(ch)
                ? "Digit"
                : ((ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U')
                    ? "Vowel"
                    : (Character.isLetter(ch) ? "Consonant" : "Special Symbol"));

        System.out.println(result);
    }
}
Output:

Plain text
Enter a character: A
Vowel
Q14. Swap Two Integers Using XOR
Plain text
import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
Output:

Plain text
Enter first number: 10
Enter second number: 20
After swapping:
First number = 20
Second number = 10
Q15. Count Set Bits
Plain text
import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }

        System.out.println("Number of set bits = " + count);
    }
}
Output:

Plain text
Enter a positive integer: 15
Number of set bits = 4
Q16. Multiplication and Division by Powers of 2
Plain text
import java.util.Scanner;

class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter power: ");
        int p = sc.nextInt();

        int multiplied = n << p;
        int divided = n >> p;

        System.out.println("After multiplication = " + multiplied);
        System.out.println("After division = " + divided);
    }
}
Output:

Plain text
Enter number: 8
Enter power: 2
After multiplication = 32
After division = 2
Q17. Cyclic Left Rotation by 2 Positions
Plain text
import java.util.Scanner;

class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = (n << 2) | (n >>> 30);

        System.out.println("After left rotation by 2 bits = " + result);
    }
}
Output:

Plain text
Enter an integer: 10
After left rotation by 2 bits = 40
Q18. First 20 Fibonacci Terms
Plain text
import java.util.Scanner;

class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
Output:

Plain text
Enter number of terms: 20
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
Q19. Armstrong Numbers Between 1 and 1000
Plain text
class Q19 {
    public static void main(String[] args) {

        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int n = 1; n <= 1000; n++) {
            int temp = n;
            int sum = 0;
            int digits = String.valueOf(n).length();

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }
    }
}
Output:

Plain text
Armstrong numbers between 1 and 1000:
1 2 3 4 5 6 7 8 9 153 370 371 407 1000
Q20. Password Using do-while
Plain text
import java.util.Scanner;

class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals(correctPassword))
                System.out.println("Incorrect password.");

        } while (!password.equals(correctPassword));

        System.out.println("Correct password. Access granted.");
    }
}
Output:

Plain text
Enter password: abc
Incorrect password.
Enter password: java123
Correct password. Access granted.
Q21. Factors Using do-while
Plain text
import java.util.Scanner;

class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;

        System.out.println("Factors are:");

        do {
            if (n % i == 0)
                System.out.print(i + " ");

            i++;
        } while (i <= n);
    }
}
Output:

Plain text
Enter a number: 12
Factors are:
1 2 3 4 6 12
Q22. Reverse Digits Using while
Plain text
import java.util.Scanner;

class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println("Reverse = " + reverse);
    }
}
Output:

Plain text
Enter an integer: 12345
Reverse = 54321
Q23. Palindrome Using while
Plain text
import java.util.Scanner;

class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if (original == reverse)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }
}
Output:

Plain text
Enter an integer: 121
Palindrome number
Q24. Maximum and Minimum in Array Using for-each
Plain text
import java.util.Scanner;

class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int max = arr[0];
        int min = arr[0];

        for (int x : arr) {
            if (x > max)
                max = x;

            if (x < min)
                min = x;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
Output:

Plain text
Enter array size: 5
Enter elements:
10 25 5 40 15
Maximum = 40
Minimum = 5
Q25. Average Marks Using for-each in 2D Array
Plain text
import java.util.Scanner;

class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int cols = sc.nextInt();

        int[][] marks = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ":");

            for (int j = 0; j < cols; j++)
                marks[i][j] = sc.nextInt();
        }

        int sum = 0;
        int count = 0;

        for (int[] student : marks) {
            for (int mark : student) {
                sum += mark;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Average marks = " + average);
    }
}
Output:

Plain text
Enter number of students: 2
Enter number of subjects: 3
Enter marks of student 1:
80 70 90
Enter marks of student 2:
60 75 85
Average marks = 76.66666666666667
Q26. Weekday or Weekend Using switch-case
Plain text
import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid day number");
        }
    }
}
Output:

Plain text
Enter day number (1-7): 6
Weekend
Q27. Grade Meaning Using switch-case
Plain text
import java.util.Scanner;

class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade (A-F): ");
        char grade = sc.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
Output:

Plain text
Enter grade (A-F): A
Excellent
Q28. Skip Perfect Squares Using continue
Plain text
class Q28 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);

            if (root * root == i)
                continue;

            System.out.print(i + " ");
        }
    }
}
Output:

Plain text
2 3 5 6 7 8 10 11 12 13 14 15 17 18 19 20 21 22 23 24 26 27 28 29 30 31 32 33 34 35 37 38 39 40 41 42 43 44 45 46 47 48 50
Q29. Random Number Until Divisible by 7 and 13
Plain text
import java.util.Random;

class Q29 {
    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int n = random.nextInt(100) + 1;

            System.out.println("Generated: " + n);

            if (n % 7 == 0 && n % 13 == 0) {
                System.out.println("Number divisible by both 7 and 13 found.");
                break;
            }
        }
    }
}
Sample Output:

Plain text
Generated: 25
Generated: 64
Generated: 12
Generated: 91
Number divisible by both 7 and 13 found.
Note: Random hone ki wajah se output har run mein different ho sakta hai.

Q30. Mixed Advanced Program
Plain text
import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        // Check power of 4 using shift operators
        int temp = n;

        while (temp > 1 && (temp & 3) == 0) {
            temp >>= 2;
        }

        boolean powerOf4 = (temp == 1);

        if (powerOf4)
            System.out.println(n + " is a power of 4");
        else
            System.out.println(n + " is not a power of 4");

        // Toggle 3rd bit
        int toggled = n ^ (1 << 2);

        System.out.println("After toggling 3rd bit = " + toggled);

        System.out.println("Multiplication table:");

        for (int i = 1; i <= 10; i++) {
            int result = toggled * i;

            if (result % 48 == 0)
                break;

            if (result % 6 == 0)
                continue;

            System.out.println(toggled + " x " + i + " = " + result);
        }
    }
}
Output:

Plain text
Enter a positive number: 4
4 is a power of 4
After toggling 3rd bit = 0
Multiplication table: