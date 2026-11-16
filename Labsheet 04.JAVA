Q1. Student Class

Code:

import java.util.Scanner;

public class Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Student s = new Student(name, age);
        s.display();

        System.out.println("Total students: " + count);
        sc.close();
    }
}

Output:

Enter name: Akshit
Enter age: 18
Name: Akshit
Age: 18
Total students: 1
Q2. Rectangle Area

Code:

import java.util.Scanner;

public class Rectangle {
    double length, breadth;
    static String shapeName = "Rectangle";

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Rectangle r = new Rectangle(l, b);

        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + r.area());

        sc.close();
    }
}

Output:

Enter length: 10
Enter breadth: 5
Shape: Rectangle
Area: 50.0
Q3. Circle Area and Circumference

Code:

import java.util.Scanner;

public class Circle {
    double radius;
    static final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return PI * radius * radius;
    }

    double circumference() {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);

        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());

        sc.close();
    }
}

Output:

Enter radius: 5
Area: 78.5
Circumference: 31.400000000000002
Q4. Employee Details

Code:

import java.util.Scanner;

public class Employee {
    int empId;
    double salary;
    static String companyName = "ABC Company";

    Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(id, salary);
        e.display();

        sc.close();
    }
}

Output:

Enter employee ID: 101
Enter salary: 25000
Employee ID: 101
Salary: 25000.0
Company: ABC Company
Q5. Book Details

Code:

import java.util.Scanner;

public class Book {
    String title, author;
    double price;
    static String publisher = "ABC Publications";

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Book b = new Book(title, author, price);
        b.display();

        sc.close();
    }
}

Output:

Enter book title: Java Basics
Enter author: James
Enter price: 350
Title: Java Basics
Author: James
Price: 350.0
Publisher: ABC Publications
Q6. Car Details

Code:

import java.util.Scanner;

public class Car {
    String brand;
    double mileage;
    static int wheels = 4;

    Car(String brand, double mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Mileage: " + mileage);
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter mileage: ");
        double mileage = sc.nextDouble();

        Car c = new Car(brand, mileage);
        c.display();

        sc.close();
    }
}

Output:

Enter car brand: Tata
Enter mileage: 20
Brand: Tata
Mileage: 20.0
Wheels: 4
Q7. Bank Account and Deposit

Code:

import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    double balance;
    static String bankName = "State Bank";

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank: " + bankName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter opening balance: ");
        double balance = sc.nextDouble();

        BankAccount b = new BankAccount(number, balance);

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        b.deposit(amount);
        b.display();

        sc.close();
    }
}

Output:

Enter account number: 12345
Enter opening balance: 5000
Enter deposit amount: 1000
Deposit successful.
Account Number: 12345
Balance: 6000.0
Bank: State Bank
Q8. Pen Details

Code:

import java.util.Scanner;

public class Pen {
    String color, type;
    static String manufacturer = "ABC Company";

    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Manufacturer: " + manufacturer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pen color: ");
        String color = sc.nextLine();

        System.out.print("Enter pen type: ");
        String type = sc.nextLine();

        Pen p = new Pen(color, type);
        p.display();

        sc.close();
    }
}

Output:

Enter pen color: Blue
Enter pen type: Ballpoint
Color: Blue
Type: Ballpoint
Manufacturer: ABC Company
Q9. Laptop Details

Code:

import java.util.Scanner;

public class Laptop {
    String brand, ram;
    static String os = "Windows";

    Laptop(String brand, String ram) {
        this.brand = brand;
        this.ram = ram;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram);
        System.out.println("Operating System: " + os);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter laptop brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter RAM: ");
        String ram = sc.nextLine();

        Laptop l = new Laptop(brand, ram);
        l.display();

        sc.close();
    }
}

Output:

Enter laptop brand: HP
Enter RAM: 8GB
Brand: HP
RAM: 8GB
Operating System: Windows
Q10. Movie Details

Code:

import java.util.Scanner;

public class Movie {
    String name, genre;
    double rating;
    static String industry = "Bollywood";

    Movie(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    void display() {
        System.out.println("Movie Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Industry: " + industry);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String name = sc.nextLine();

        System.out.print("Enter genre: ");
        String genre = sc.nextLine();

        System.out.print("Enter rating: ");
        double rating = sc.nextDouble();

        Movie m = new Movie(name, genre, rating);
        m.display();

        sc.close();
    }
}

Output:

Enter movie name: Dangal
Enter genre: Drama
Enter rating: 8.5
Movie Name: Dangal
Genre: Drama
Rating: 8.5
Industry: Bollywood
Q11. Calculator

Code:

import java.util.Scanner;

public class Calculator {
    static int operationsCount = 0;

    static double add(double a, double b) {
        operationsCount++;
        return a + b;
    }

    static double subtract(double a, double b) {
        operationsCount++;
        return a - b;
    }

    static double multiply(double a, double b) {
        operationsCount++;
        return a * b;
    }

    static double divide(double a, double b) {
        operationsCount++;
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));

        if (b != 0) {
            System.out.println("Division: " + divide(a, b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Operations Count: " + operationsCount);
        sc.close();
    }
}

Output:

Enter first number: 10
Enter second number: 2
Addition: 12.0
Subtraction: 8.0
Multiplication: 20.0
Division: 5.0
Operations Count: 4
Q12. Student Marks and Average

Code:

import java.util.Scanner;

public class StudentMarks {
    double marks1, marks2, marks3;
    static String universityName = "ABC University";

    StudentMarks(double m1, double m2, double m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    double average() {
        return (marks1 + marks2 + marks3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks in subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks in subject 3: ");
        double m3 = sc.nextDouble();

        StudentMarks s = new StudentMarks(m1, m2, m3);

        System.out.println("University: " + universityName);
        System.out.println("Average Marks: " + s.average());

        sc.close();
    }
}

Output:

Enter marks in subject 1: 80
Enter marks in subject 2: 70
Enter marks in subject 3: 90
University: ABC University
Average Marks: 80.0
Q13. Temperature Conversion

Code:

import java.util.Scanner;

public class Temperature {
    double celsius;
    static String scale = "Celsius";

    Temperature(double celsius) {
        this.celsius = celsius;
    }

    double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    double toKelvin() {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        Temperature t = new Temperature(c);

        System.out.println("Scale: " + scale);
        System.out.println("Fahrenheit: " + t.toFahrenheit());
        System.out.println("Kelvin: " + t.toKelvin());

        sc.close();
    }
}

Output:

Enter temperature in Celsius: 25
Scale: Celsius
Fahrenheit: 77.0
Kelvin: 298.15
Q14. Voting Eligibility

Code:

import java.util.Scanner;

public class Person {
    String name;
    int age;
    static String country = "India";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkEligibility() {
        if (age >= 18) {
            System.out.println(name + " is eligible to vote.");
        } else {
            System.out.println(name + " is not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Person p = new Person(name, age);

        System.out.println("Country: " + country);
        p.checkEligibility();

        sc.close();
    }
}

Output:

Enter name: Akshit
Enter age: 18
Country: India
Akshit is eligible to vote.
Q15. Simple Interest

Code:

import java.util.Scanner;

public class SimpleInterest {
    double principal, rate, time;
    static String bank = "ABC Bank";

    SimpleInterest(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    double calculateInterest() {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter time in years: ");
        double t = sc.nextDouble();

        SimpleInterest si = new SimpleInterest(p, r, t);

        System.out.println("Bank: " + bank);
        System.out.println("Simple Interest: " + si.calculateInterest());

        sc.close();
    }
}

Output:

Enter principal: 10000
Enter rate: 5
Enter time in years: 2
Bank: ABC Bank
Simple Interest: 1000.0
Q16. Triangle Type and Validity

Code:

import java.util.Scanner;

public class Triangle {
    double a, b, c;
    static String type = "Triangle";

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isValid() {
        return a + b > c && a + c > b && b + c > a
                && a > 0 && b > 0 && c > 0;
    }

    void displayType() {
        if (!isValid()) {
            System.out.println("Invalid triangle.");
        } else if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        Triangle t = new Triangle(a, b, c);

        System.out.println("Shape: " + type);
        t.displayType();

        sc.close();
    }
}

Output:

Enter side a: 5
Enter side b: 5
Enter side c: 5
Shape: Triangle
Equilateral triangle
Q17. Student Grade

Code:

import java.util.Scanner;

public class StudentGrade {
    String name;
    double marks;
    static double passingMarks = 33;

    StudentGrade(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    void assignGrade() {
        System.out.println("Student: " + name);

        if (marks < passingMarks) {
            System.out.println("Grade: Fail");
        } else if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        StudentGrade s = new StudentGrade(name, marks);
        s.assignGrade();

        sc.close();
    }
}

Output:

Enter student name: Akshit
Enter marks: 85
Student: Akshit
Grade: B

Note: Passing marks 33 aur grade ranges example ke liye use ki gayi hain.

Q18. Electricity Bill

Code:

import java.util.Scanner;

public class ElectricBill {
    int units;
    static double fixedCharge = 50;

    ElectricBill(int units) {
        this.units = units;
    }

    double calculateBill() {
        double bill = fixedCharge;

        if (units <= 100) {
            bill += units * 2;
        } else if (units <= 200) {
            bill += 100 * 2 + (units - 100) * 3;
        } else {
            bill += 100 * 2 + 100 * 3 + (units - 200) * 5;
        }

        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid units.");
        } else {
            ElectricBill e = new ElectricBill(units);
            System.out.println("Fixed Charge: " + fixedCharge);
            System.out.println("Total Bill: " + e.calculateBill());
        }

        sc.close();
    }
}

Output:

Enter units consumed: 150
Fixed Charge: 50.0
Total Bill: 400.0

Note: Fixed charge aur per-unit rates example ke liye assume kiye gaye hain.

Q19. Product Discount

Code:

import java.util.Scanner;

public class Product {
    int id;
    String name;
    double price;
    static double discountRate = 10;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    double finalPrice() {
        return price - (price * discountRate / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Product p = new Product(id, name, price);

        System.out.println("Product ID: " + p.id);
        System.out.println("Product Name: " + p.name);
        System.out.println("Discount: " + discountRate + "%");
        System.out.println("Final Price: " + p.finalPrice());

        sc.close();
    }
}

Output:

Enter product ID: 101
Enter product name: Laptop
Enter price: 50000
Product ID: 101
Product Name: Laptop
Discount: 10.0%
Final Price: 45000.0
Q20. Bank Account Withdrawal

Code:

import java.util.Scanner;

public class BankAccountWithdrawal {
    double balance;
    static String bankCode = "SBI001";

    BankAccountWithdrawal(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        BankAccountWithdrawal b =
                new BankAccountWithdrawal(balance);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        b.withdraw(amount);

        System.out.println("Bank Code: " + bankCode);
        System.out.println("Remaining Balance: " + b.balance);

        sc.close();
    }
}

Output:

Enter balance: 5000
Enter withdrawal amount: 1500
Withdrawal successful.
Bank Code: SBI001
Remaining Balance: 3500.0
Q21. Palindrome Number

Code:

import java.util.Scanner;

public class PalindromeNumber {
    static int countChecks = 0;

    static boolean isPalindrome(int number) {
        countChecks++;

        if (number < 0) {
            return false;
        }

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }

        System.out.println("Total Checks: " + countChecks);
        sc.close();
    }
}

Output:

Enter a number: 121
Palindrome number
Total Checks: 1
Q22. Armstrong Number

Code:

import java.util.Scanner;

public class ArmstrongNumber {
    static int totalChecks = 0;

    static boolean isArmstrong(int number) {
        totalChecks++;

        if (number < 0) {
            return false;
        }

        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        System.out.println("Total Checks: " + totalChecks);
        sc.close();
    }
}

Output:

Enter a number: 153
Armstrong number
Total Checks: 1
Q23. Prime Number Checker

Code:

import java.util.Scanner;

public class PrimeChecker {
    static int totalPrimeChecks = 0;

    static boolean isPrime(int number) {
        totalPrimeChecks++;

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        System.out.println("Total Checks: " + totalPrimeChecks);
        sc.close();
    }
}

Output:

Enter a number: 7
Prime number
Total Checks: 1
Q24. Fibonacci Series

Code:

import java.util.Scanner;

public class Fibonacci {
    static int seriesCount = 0;

    static void printSeries(int n) {
        seriesCount++;

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number.");
        } else {
            printSeries(n);
            System.out.println("Series Count: " + seriesCount);
        }

        sc.close();
    }
}

Output:

Enter number of terms: 7
0 1 1 2 3 5 8
Series Count: 1
Q25. Factorial of a Number

Code:

import java.util.Scanner;

public class Factorial {
    static int totalCalls = 0;

    static long calculateFactorial(int n) {
        totalCalls++;

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0-20): ");
        int n = sc.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Enter a number from 0 to 20.");
        } else {
            System.out.println("Factorial: " + calculateFactorial(n));
            System.out.println("Total Calls: " + totalCalls);
        }

        sc.close();
    }
}

Output:

Enter a number (0-20): 5
Factorial: 120
Total Calls: 1
Q26. Addition and Subtraction of 2×2 Matrices

Code:

import java.util.Scanner;

public class Matrix {
    int[][] a = new int[2][2];
    int[][] b = new int[2][2];
    static String matrixType = "2x2 Matrix";

    void input(Scanner sc) {
        System.out.println("Enter first matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void add() {
        System.out.println("Addition:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    void subtract() {
        System.out.println("Subtraction:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((a[i][j] - b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matrix m = new Matrix();

        System.out.println("Matrix Type: " + matrixType);
        m.input(sc);
        m.add();
        m.subtract();

        sc.close();
    }
}

Output:

Matrix Type: 2x2 Matrix
Enter first matrix:
1 2
3 4
Enter second matrix:
5 6
7 8
Addition:
6 8
10 12
Subtraction:
-4 -4
-4 -4
Q27. Reverse a String

Code:

import java.util.Scanner;

public class StringReverse {
    static int totalReversals = 0;

    static String reverse(String text) {
        totalReversals++;

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Reversed String: " + reverse(text));
        System.out.println("Total Reversals: " + totalReversals);

        sc.close();
    }
}

Output:

Enter a string: Java
Reversed String: avaJ
Total Reversals: 1
Q28. Count Words in a Sentence

Code:

import java.util.Scanner;

public class WordCounter {
    static String language = "English";

    static int countWords(String sentence) {
        sentence = sentence.trim();

        if (sentence.isEmpty()) {
            return 0;
        }

        return sentence.split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Language: " + language);
        System.out.println("Word Count: " + countWords(sentence));

        sc.close();
    }
}

Output:

Enter a sentence: Java is easy to learn
Language: English
Word Count: 5
Q29. Compare Two Employees' Salaries

Code:

import java.util.Scanner;

public class EmployeeSalaryCompare {
    String name;
    double salary;
    static String organization = "ABC Organization";

    EmployeeSalaryCompare(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void compare(EmployeeSalaryCompare other) {
        if (salary > other.salary) {
            System.out.println(name + " has a higher salary.");
        } else if (salary < other.salary) {
            System.out.println(other.name + " has a higher salary.");
        } else {
            System.out.println("Both employees have equal salaries.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter first employee salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter second employee salary: ");
        double salary2 = sc.nextDouble();

        EmployeeSalaryCompare e1 =
                new EmployeeSalaryCompare(name1, salary1);

        EmployeeSalaryCompare e2 =
                new EmployeeSalaryCompare(name2, salary2);

        System.out.println("Organization: " + organization);
        e1.compare(e2);

        sc.close();
    }
}

Output:

Enter first employee name: Aman
Enter first employee salary: 30000
Enter second employee name: Rahul
Enter second employee salary: 25000
Organization: ABC Organization
Aman has a higher salary.

Q30. Library Book Issue and Return

Code:

import java.util.Scanner;

public class Library {
    int booksAvailable;
    static String libraryName = "Central Library";

    Library(int booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    void issueBook() {
        if (booksAvailable > 0) {
            booksAvailable--;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("No books available.");
        }
    }

    void returnBook() {
        booksAvailable++;
        System.out.println("Book returned successfully.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available books: ");
        int books = sc.nextInt();

        if (books < 0) {
            System.out.println("Invalid number of books.");
            sc.close();
            return;
        }

        Library l = new Library(books);

        System.out.println("Library: " + libraryName);
        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            l.issueBook();
        } else if (choice == 2) {
            l.returnBook();
        } else {
            System.out.println("Invalid choice.");
        }

        System.out.println("Books Available: " + l.booksAvailable);

        sc.close();
    }
}

Output:

Enter available books: 10
Library: Central Library
1. Issue Book
2. Return Book
Enter your choice: 1
Book issued successfully.
Books Available: 9

