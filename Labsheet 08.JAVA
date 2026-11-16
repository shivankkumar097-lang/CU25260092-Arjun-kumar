Generic

Q1. Generic Box

Create a generic class Box<T> that stores one value. Create objects for Integer, String and Double and display all three values.

Code:

class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println(value);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Akshit");
        Box<Double> b3 = new Box<>(95.5);

        b1.display();
        b2.display();
        b3.display();
    }
}

Output:

100
Akshit
95.5

Q2. Generic Result

Create a generic class Result<T> that stores marks. Create Result<Integer> and Result<Double> objects and display the marks.

Code:

class Result<T> {
    T marks;

    Result(T marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("Marks: " + marks);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Result<Integer> r1 = new Result<>(85);
        Result<Double> r2 = new Result<>(92.5);

        r1.display();
        r2.display();
    }
}

Output:

Marks: 85
Marks: 92.5

Q3. Generic Student

Create a generic class Student<T> where T represents the student ID. Create a Student<Integer> object and display the ID.

Code:

class Student<T> {
    T id;

    Student(T id) {
        this.id = id;
    }

    void display() {
        System.out.println("Student ID: " + id);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student<Integer> s = new Student<>(101);
        s.display();
    }
}

Output:

Student ID: 101

Q4. Generic Pair

Create Pair<T, U> to store Employee ID and Employee Name. Use Integer and String as the two types.

Code:

class Pair<T, U> {
    T id;
    U name;

    Pair(T id, U name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Pair<Integer, String> p =
                new Pair<>(101, "Akshit");

        p.display();
    }
}

Output:

Employee ID: 101
Employee Name: Akshit

Q5. Product Pair

Create a generic class with two type parameters to store Product ID and Product Price. Create at least three product objects.

Code:

class Product<T, U> {
    T id;
    U price;

    Product(T id, U price) {
        this.id = id;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Price: " + price);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Product<Integer, Double> p1 =
                new Product<>(101, 500.0);

        Product<Integer, Double> p2 =
                new Product<>(102, 750.5);

        Product<Integer, Double> p3 =
                new Product<>(103, 900.0);

        p1.display();
        p2.display();
        p3.display();
    }
}

Output:

Product ID: 101
Product Price: 500.0
Product ID: 102
Product Price: 750.5
Product ID: 103
Product Price: 900.0

Q6. Generic Employee

Create Employee<T, U> where T represents Employee ID and U represents Employee Name. Add a display() method.

Code:

class Employee<T, U> {
    T id;
    U name;

    Employee(T id, U name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Employee<Integer, String> e =
                new Employee<>(101, "Akshit");

        e.display();
    }
}

Output:

Employee ID: 101
Employee Name: Akshit

Q7. Generic Method

Create a generic method display() that can display Integer, Double, String and Character values.

Code:

public class Q7 {

    public static <T> void display(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        display(100);
        display(95.5);
        display("Akshit");
        display('A');
    }
}

Output:

100
95.5
Akshit
A

Q8. Generic Method for Three Values

Create a generic method that accepts three values of the same type and displays them. Test it using Integers, Strings and Doubles.

Code:

public class Q8 {

    public static <T> void display(T a, T b, T c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        display(10, 20, 30);

        display("Java", "Python", "C++");

        display(10.5, 20.5, 30.5);
    }
}

Output:

10
20
30
Java
Python
C++
10.5
20.5
30.5

Q9. Generic ArrayList

Create an ArrayList<Integer>. Add 10 numbers and display them using a loop.

Code:

import java.util.ArrayList;

public class Q9 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        for (int n : list) {
            System.out.println(n);
        }
    }
}

Output:

10
20
30
40
50
60
70
80
90
100

Q10. Generic String List

Create an ArrayList<String> containing five student names. Perform add(), get(), set(), remove() and size(), and display the results.

Code:

import java.util.ArrayList;

public class Q10 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Akshit");
        list.add("Rahul");
        list.add("Aman");
        list.add("Rohit");
        list.add("Karan");

        System.out.println("Students: " + list);

        System.out.println("Get: " + list.get(0));

        list.set(1, "Mohit");

        System.out.println("After Set: " + list);

        list.remove("Aman");

        System.out.println("After Remove: " + list);

        System.out.println("Size: " + list.size());
    }
}

Output:

Students: [Akshit, Rahul, Aman, Rohit, Karan]
Get: Akshit
After Set: [Akshit, Mohit, Aman, Rohit, Karan]
After Remove: [Akshit, Mohit, Rohit, Karan]
Size: 4

Q11. Search in Generic List

Create ArrayList<Integer> containing ten numbers. Ask the user for a number and use contains() to determine whether the number exists.

Code:

import java.util.ArrayList;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (list.contains(num)) {
            System.out.println("Number Found");
        } else {
            System.out.println("Number Not Found");
        }

        sc.close();
    }
}

Output:

Enter a number:
50
Number Found

Q12. Generic Container

Create Container<T> with add() and get() methods. Test it using Integer, String and Double.

Code:

class Container<T> {
    T value;

    void add(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class Q12 {
    public static void main(String[] args) {

        Container<Integer> c1 = new Container<>();
        Container<String> c2 = new Container<>();
        Container<Double> c3 = new Container<>();

        c1.add(100);
        c2.add("Akshit");
        c3.add(95.5);

        System.out.println(c1.get());
        System.out.println(c2.get());
        System.out.println(c3.get());
    }
}

Output:

100
Akshit
95.5

Q13. Generic Class with Three Parameters

Create Student<T, U, V> where T = ID, U = Name and V = Marks. Create at least three student objects with suitable types.

Code:

class Student<T, U, V> {
    T id;
    U name;
    V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Q13 {
    public static void main(String[] args) {

        Student<Integer, String, Double> s1 =
                new Student<>(101, "Akshit", 90.5);

        Student<Integer, String, Double> s2 =
                new Student<>(102, "Rahul", 85.5);

        Student<Integer, String, Double> s3 =
                new Student<>(103, "Aman", 95.0);

        s1.display();
        s2.display();
        s3.display();
    }
}

Output:

ID: 101
Name: Akshit
Marks: 90.5
ID: 102
Name: Rahul
Marks: 85.5
ID: 103
Name: Aman
Marks: 95.0

Q14. Generic Method and ArrayList

Create an ArrayList<T> and a generic method that displays all elements of the list. Test it with ArrayList<Integer> and ArrayList<String>.

Code:

import java.util.ArrayList;

public class Q14 {

    public static <T> void display(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ArrayList<String> names = new ArrayList<>();

        names.add("Akshit");
        names.add("Rahul");
        names.add("Aman");

        System.out.println("Integer List:");
        display(numbers);

        System.out.println("String List:");
        display(names);
    }
}

Output:

Integer List:
10
20
30
String List:
Akshit
Rahul
Aman

Q15. Mini Generic Student Management Program

Create a small student management program using Student<T, U, V>, where T = Student ID, U = Student Name and V = Marks. Create at least five students, store them using an appropriate collection, display all students, search for a student, display the total number of students, and demonstrate type safety. Use Generic Class, Multiple Type Parameters, ArrayList, add(), get(), size(), contains(), loops, methods, constructors and type safety.

Code:

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Student<T, U, V> {
    T id;
    U name;
    V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Marks: " + marks);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Student)) return false;

        Student<?, ?, ?> s = (Student<?, ?, ?>) obj;

        return Objects.equals(id, s.id);
    }

    public int hashCode() {
        return Objects.hashCode(id);
    }
}

public class Q15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student<Integer, String, Double>> list =
                new ArrayList<>();

        list.add(new Student<>(101, "Akshit", 90.5));
        list.add(new Student<>(102, "Rahul", 85.5));
        list.add(new Student<>(103, "Aman", 95.0));
        list.add(new Student<>(104, "Rohit", 88.5));
        list.add(new Student<>(105, "Karan", 92.0));

        System.out.println("Student Records:");

        for (Student<Integer, String, Double> s : list) {
            s.display();
        }

        System.out.println("Enter Student ID to Search:");
        int id = sc.nextInt();

        Student<Integer, String, Double> search =
                new Student<>(id, "", 0.0);

        if (list.contains(search)) {
            System.out.println("Student Found");

            for (Student<Integer, String, Double> s : list) {
                if (s.id.equals(id)) {
                    s.display();
                    break;
                }
            }
        } else {
            System.out.println("Student Not Found");
        }

        System.out.println("Total Students: " + list.size());

        System.out.println("Type Safety: Integer ID, String Name, Double Marks");

        sc.close();
    }
}

Output:

Student Records:
ID: 101, Name: Akshit, Marks: 90.5
ID: 102, Name: Rahul, Marks: 85.5
ID: 103, Name: Aman, Marks: 95.0
ID: 104, Name: Rohit, Marks: 88.5
ID: 105, Name: Karan, Marks: 92.0

Enter Student ID to Search:
103

Student Found
ID: 103, Name: Aman, Marks: 95.0

Total Students: 5
Type Safety: Integer ID, String Name, Double Marks