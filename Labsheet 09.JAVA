Collections
Q1. Student List
Create an ArrayList<String> containing ten student names. Display all names and the total size.

Code:
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Akshit");
        students.add("Rahul");
        students.add("Aman");
        students.add("Rohit");
        students.add("Karan");
        students.add("Mohit");
        students.add("Vikas");
        students.add("Sumit");
        students.add("Ankit");
        students.add("Ravi");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Total Students: " + students.size());
    }
}

Output:
Student Names:
Akshit
Rahul
Aman
Rohit
Karan
Mohit
Vikas
Sumit
Ankit
Ravi
Total Students: 10

Q2. Marks List
Create an ArrayList<Integer> containing five marks. Display the first, last and middle elements using get().

Code:
import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(90);
        marks.add(75);
        marks.add(95);
        marks.add(80);

        System.out.println("First Marks: " + marks.get(0));
        System.out.println("Middle Marks: " + marks.get(2));
        System.out.println("Last Marks: " + marks.get(4));
    }
}

Output:
First Marks: 85
Middle Marks: 75
Last Marks: 80

Q3. Update Student Name
Create an ArrayList<String>. Replace the second student name using set() and remove the fourth student.

Code:
import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Akshit");
        students.add("Rahul");
        students.add("Aman");
        students.add("Rohit");
        students.add("Karan");

        students.set(1, "Mohit");
        students.remove(3);

        System.out.println("Updated List: " + students);
    }
}

Output:
Updated List: [Akshit, Mohit, Aman, Karan]

Q4. Unique Departments
Create a HashSet<String> containing department names with duplicates. Display the resulting unique departments.

Code:
import java.util.HashSet;

public class Q4 {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();

        departments.add("Computer Science");
        departments.add("Mechanical");
        departments.add("Civil");
        departments.add("Electrical");
        departments.add("Computer Science");
        departments.add("Mechanical");

        System.out.println("Unique Departments:");

        for (String d : departments) {
            System.out.println(d);
        }
    }
}

Output (order may vary):
Unique Departments:
Computer Science
Mechanical
Civil
Electrical

Q5. Sorted Roll Numbers
Create a TreeSet<Integer> containing ten roll numbers in random order. Display them in sorted order.

Code:
import java.util.TreeSet;

public class Q5 {
    public static void main(String[] args) {
        TreeSet<Integer> rolls = new TreeSet<>();

        rolls.add(105);
        rolls.add(102);
        rolls.add(110);
        rolls.add(101);
        rolls.add(108);
        rolls.add(104);
        rolls.add(103);
        rolls.add(109);
        rolls.add(107);
        rolls.add(106);

        System.out.println("Sorted Roll Numbers: " + rolls);
    }
}

Output:
Sorted Roll Numbers: [101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

Q6. ArrayList Searching
Create an ArrayList<String> of course names. Ask the user for a course and use contains() to check whether it exists.

Code:
import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("HTML");
        courses.add("JavaScript");

        System.out.println("Enter Course Name:");
        String course = sc.nextLine();

        if (courses.contains(course)) {
            System.out.println("Course Found");
        } else {
            System.out.println("Course Not Found");
        }

        sc.close();
    }
}

Output:
Enter Course Name:
Java
Course Found

Q7. Collections Utility Methods
Create an ArrayList<Integer> and demonstrate Collections.sort(), reverse(), max(), min() and frequency().

Code:
import java.util.ArrayList;
import java.util.Collections;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reverse List: " + numbers);

        System.out.println("Maximum: " + Collections.max(numbers));

        System.out.println("Minimum: " + Collections.min(numbers));

        System.out.println("Frequency of 10: " +
                Collections.frequency(numbers, 10));
    }
}

Output:
Original List: [30, 10, 20, 10, 40]
Sorted List: [10, 10, 20, 30, 40]
Reverse List: [40, 30, 20, 10, 10]
Maximum: 40
Minimum: 10
Frequency of 10: 2

Q8. LinkedList Student Queue
Create a LinkedList<String> representing students waiting for a lab. Use addFirst(), addLast(), removeFirst() and removeLast().

Code:
import java.util.LinkedList;

public class Q8 {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addFirst("Akshit");
        students.addLast("Rahul");
        students.addLast("Aman");
        students.addFirst("Rohit");

        System.out.println("Student Queue: " + students);

        students.removeFirst();
        System.out.println("After removeFirst: " + students);

        students.removeLast();
        System.out.println("After removeLast: " + students);
    }
}

Output:
Student Queue: [Rohit, Akshit, Rahul, Aman]
After removeFirst: [Akshit, Rahul, Aman]
After removeLast: [Akshit, Rahul]

Q9. ListIterator Modification
Create a List<String> and use ListIterator to traverse it. Use set() to replace one element and add() to insert an element during iteration.

Code:
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Q9 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Akshit");
        names.add("Rahul");
        names.add("Aman");

        ListIterator<String> itr = names.listIterator();

        while (itr.hasNext()) {
            String name = itr.next();

            if (name.equals("Rahul")) {
                itr.set("Mohit");
                itr.add("Rohit");
            }
        }

        System.out.println("Updated List: " + names);
    }
}

Output:
Updated List: [Akshit, Mohit, Rohit, Aman]

Q10. List vs Set Experiment
Create an ArrayList<Integer> and HashSet<Integer> using the same input values. Display both and explain the difference in duplicates and ordering.

Code:
import java.util.ArrayList;
import java.util.HashSet;

public class Q10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int[] numbers = {10, 20, 30, 10, 20, 40};

        for (int n : numbers) {
            list.add(n);
            set.add(n);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
    }
}

Output:
ArrayList: [10, 20, 30, 10, 20, 40]
HashSet: [20, 40, 10, 30]

Q11. Sorted Student IDs
Create a TreeSet<Integer> for student IDs. Add duplicate IDs and display the unique sorted IDs. Also demonstrate first(), last(), higher() and lower().

Code:
import java.util.TreeSet;

public class Q11 {
    public static void main(String[] args) {
        TreeSet<Integer> ids = new TreeSet<>();

        ids.add(105);
        ids.add(102);
        ids.add(108);
        ids.add(101);
        ids.add(105);
        ids.add(103);
        ids.add(110);

        System.out.println("Student IDs: " + ids);

        System.out.println("First ID: " + ids.first());

        System.out.println("Last ID: " + ids.last());

        System.out.println("Higher than 103: " + ids.higher(103));

        System.out.println("Lower than 103: " + ids.lower(103));
    }
}

Output:
Student IDs: [101, 102, 103, 105, 108, 110]
First ID: 101
Last ID: 110
Higher than 103: 105
Lower than 103: 102

Q12. Hospital Patient List
Create an ArrayList<String> of patient names and a HashSet<String> of unique patient IDs. Add, remove, search and display the records.

Code:
import java.util.ArrayList;
import java.util.HashSet;

public class Q12 {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<>();
        HashSet<String> ids = new HashSet<>();

        patients.add("Akshit");
        patients.add("Rahul");
        patients.add("Aman");

        ids.add("P101");
        ids.add("P102");
        ids.add("P103");

        System.out.println("Patient Names: " + patients);
        System.out.println("Patient IDs: " + ids);

        patients.add("Rohit");
        ids.add("P104");

        System.out.println("After Adding: " + patients);

        patients.remove("Rahul");
        ids.remove("P102");

        System.out.println("After Removing: " + patients);

        System.out.println("Search Akshit: " +
                patients.contains("Akshit"));

        System.out.println("Final Patient Names: " + patients);
        System.out.println("Final Patient IDs: " + ids);
    }
}

Output:
Patient Names: [Akshit, Rahul, Aman]
Patient IDs: [P101, P102, P103]
After Adding: [Akshit, Rahul, Aman, Rohit]
After Removing: [Akshit, Aman, Rohit]
Search Akshit: true
Final Patient Names: [Akshit, Aman, Rohit]
Final Patient IDs: [P101, P103, P104]

Q13. ListIterator Report
Create an ArrayList<String> of five course names. Use ListIterator to display the list forward and backward, and demonstrate nextIndex() and previousIndex().

Code:
import java.util.ArrayList;
import java.util.ListIterator;

public class Q13 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("HTML");
        courses.add("JavaScript");

        ListIterator<String> itr = courses.listIterator();

        System.out.println("Forward Traversal:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Backward Traversal:");

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        System.out.println("Next Index: " + itr.nextIndex());

        System.out.println("Previous Index: " + itr.previousIndex());
    }
}

Output:
Forward Traversal:
Java
Python
C++
HTML
JavaScript

Backward Traversal:
JavaScript
HTML
C++
Python
Java

Next Index: 0
Previous Index: -1

Q14. ArrayList vs LinkedList Lab
Create equivalent ArrayList and LinkedList programs. Perform insertion, deletion, get(), size() and iteration operations. Record your observations in a comparison table.

Code:
import java.util.ArrayList;
import java.util.LinkedList;

public class Q14 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Java");
        list1.add("Python");
        list1.add("C++");
        list1.add(1, "HTML");

        System.out.println("ArrayList: " + list1);

        list1.remove("Python");

        System.out.println("After Deletion: " + list1);

        System.out.println("Get Element: " + list1.get(1));

        System.out.println("Size: " + list1.size());

        System.out.println("ArrayList Iteration:");

        for (String s : list1) {
            System.out.println(s);
        }

        LinkedList<String> list2 = new LinkedList<>();

        list2.add("Java");
        list2.add("Python");
        list2.add("C++");
        list2.add(1, "HTML");

        System.out.println("LinkedList: " + list2);

        list2.remove("Python");

        System.out.println("After Deletion: " + list2);

        System.out.println("Get Element: " + list2.get(1));

        System.out.println("Size: " + list2.size());

        System.out.println("LinkedList Iteration:");

        for (String s : list2) {
            System.out.println(s);
        }
    }
}

Output:
ArrayList: [Java, HTML, Python, C++]
After Deletion: [Java, HTML, C++]
Get Element: HTML
Size: 3
ArrayList Iteration:
Java
HTML
C++
LinkedList: [Java, HTML, Python, C++]
After Deletion: [Java, HTML, C++]
Get Element: HTML
Size: 3
LinkedList Iteration:
Java
HTML
C++

Comparison Table:
ArrayList	LinkedList
Uses dynamic array.	Uses linked nodes.
Faster random access.	Slower random access.
Insertion in the middle may require shifting.	Insertion and deletion can be efficient once the position is reached.
Uses less memory.	Uses more memory.


Q15. Mini Student Collection Management System
Create a student collection management program. Use ArrayList for maintaining student records in insertion order, HashSet for unique student IDs, and TreeSet for sorted student IDs. Provide options to add, remove, search, display, count, and iterate students. Use ListIterator for forward/backward traversal where appropriate. Demonstrate the difference between List, Set and SortedSet.

Code:
import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Marks: " + marks);
    }

    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}

public class Q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> uniqueIDs = new HashSet<>();
        TreeSet<Integer> sortedIDs = new TreeSet<>();

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Count Students");
            System.out.println("6. Forward Traversal");
            System.out.println("7. Backward Traversal");
            System.out.println("8. Display Collections");
            System.out.println("9. Exit");

            System.out.println("Enter Choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();

                    if (uniqueIDs.contains(id)) {
                        System.out.println("ID Already Exists");
                        break;
                    }

                    sc.nextLine();

                    System.out.println("Enter Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter Marks:");
                    double marks = sc.nextDouble();

                    students.add(new Student(id, name, marks));
                    uniqueIDs.add(id);
                    sortedIDs.add(id);

                    System.out.println("Student Added Successfully");
                    break;

                case 2:
                    System.out.println("Enter ID to Remove:");
                    int removeID = sc.nextInt();

                    boolean removed = students.removeIf(
                            s -> s.id == removeID
                    );

                    if (removed) {
                        uniqueIDs.remove(removeID);
                        sortedIDs.remove(removeID);
                        System.out.println("Student Removed");
                    } else {
                        System.out.println("Student Not Found");
                    }
                    break;

                case 3:
                    System.out.println("Enter ID to Search:");
                    int searchID = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.id == searchID) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Student Records:");

                    for (Student s : students) {
                        s.display();
                    }
                    break;

                case 5:
                    System.out.println("Total Students: " +
                            students.size());
                    break;

                case 6:
                    System.out.println("Forward Traversal:");

                    ListIterator<Student> itr =
                            students.listIterator();

                    while (itr.hasNext()) {
                        itr.next().display();
                    }
                    break;

                case 7:
                    System.out.println("Backward Traversal:");

                    ListIterator<Student> itr2 =
                            students.listIterator(students.size());

                    while (itr2.hasPrevious()) {
                        itr2.previous().display();
                    }
                    break;

                case 8:
                    System.out.println("ArrayList: " + students);
                    System.out.println("HashSet IDs: " + uniqueIDs);
                    System.out.println("TreeSet IDs: " + sortedIDs);
                    break;

                case 9:
                    System.out.println("Exiting Program");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 9);

        sc.close();
    }
}

Output:
1. Add Student
2. Remove Student
3. Search Student
4. Display Students
5. Count Students
6. Forward Traversal
7. Backward Traversal
8. Display Collections
9. Exit

Enter Choice:
1
Enter ID:
101
Enter Name:
Akshit
Enter Marks: