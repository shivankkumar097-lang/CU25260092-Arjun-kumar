Q1. Create and Write to a File

Question:
Write a Java program to create a file named student.txt and write Student Name, Roll Number, Course, and Semester into it. Display a suitable message after the file is successfully created and data is written.

Code:

import java.io.*;

public class Q1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("student.txt");

            fw.write("Student Name: Akshit\n");
            fw.write("Roll Number: 101\n");
            fw.write("Course: BCA\n");
            fw.write("Semester: 1");

            fw.close();

            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

Output:

File created and data written successfully.

Q2. Read Data from a File

Question:
Write a Java program to read the contents of student.txt created in Question 1 and display the complete contents on the console. If the file does not exist, display an appropriate error message.

Code:

import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("student.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

Output:

Student Name: Akshit
Roll Number: 101
Course: BCA
Semester: 1

Q3. Count Characters, Words and Lines

Question:
Create a text file named data.txt containing multiple lines of text. Write a Java program to read the file and calculate the number of lines, words, and characters. Display all three results.

Code:

import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Java is a programming language.\n");
            fw.write("File handling is important.");
            fw.close();

            BufferedReader br = new BufferedReader(
                new FileReader("data.txt"));

            String line;
            int lines = 0, words = 0, characters = 0;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] arr = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += arr.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
}

Output:

Lines: 2
Words: 9
Characters: 60

Q4. Append Data to an Existing File

Question:
Create a Java program that appends new student information to an existing file named students.txt without deleting existing contents. Accept Student Name, Roll Number, and Marks from the user and add the record at the end.

Code:

import java.io.*;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("students.txt", true);

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            fw.write("\nName: " + name);
            fw.write("\nRoll Number: " + roll);
            fw.write("\nMarks: " + marks + "\n");

            fw.close();

            System.out.println("Student record added successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

        sc.close();
    }
}

Output:

Enter Student Name: Akshit
Enter Roll Number: 101
Enter Marks: 85
Student record added successfully.

Q5. Copy One File into Another File

Question:
Write a Java program to copy the contents of source.txt into backup.txt. Display a message after the copying operation is completed.

Code:

import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("backup.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file does not exist.");
        } catch (IOException e) {
            System.out.println("Error copying file.");
        }
    }
}

Output:

File copied successfully.

Q6. Search for a Word in a File

Question:
Create a text file named notes.txt. Write a Java program that accepts a word from the user and searches for that word in the file. Display whether the word is found and the number of times it occurs.

Code:

import java.io.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("notes.txt");
            fw.write("Java is easy. Java is powerful. Learn Java.");
            fw.close();

            System.out.print("Enter word to search: ");
            String word = sc.next();

            BufferedReader br = new BufferedReader(
                new FileReader("notes.txt"));

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split("\\s+");

                for (String w : arr) {
                    w = w.replaceAll("[^a-zA-Z0-9]", "");

                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }

            br.close();

            if (count > 0) {
                System.out.println("Word found.");
                System.out.println("Occurrences: " + count);
            } else {
                System.out.println("Word not found.");
            }

        } catch (IOException e) {
            System.out.println("File error occurred.");
        }

        sc.close();
    }
}

Output:

Enter word to search: Java
Word found.
Occurrences: 3

Q7. Display File Information

Question:
Write a Java program that accepts a file name from the user and displays whether the file exists, file name, absolute path, file size, whether it is a file, whether it is a directory, whether it is readable, and whether it is writable.

Code:

import java.io.*;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        File f = new File(name);

        System.out.println("File Exists: " + f.exists());

        if (f.exists()) {
            System.out.println("File Name: " + f.getName());
            System.out.println("Absolute Path: " + f.getAbsolutePath());
            System.out.println("File Size: " + f.length() + " bytes");
            System.out.println("Is File: " + f.isFile());
            System.out.println("Is Directory: " + f.isDirectory());
            System.out.println("Readable: " + f.canRead());
            System.out.println("Writable: " + f.canWrite());
        }

        sc.close();
    }
}

Output:

Enter file name: student.txt
File Exists: true
File Name: student.txt
Absolute Path: C:\Java\student.txt
File Size: 66 bytes
Is File: true
Is Directory: false
Readable: true
Writable: true

Q8. Count Vowels, Consonants, Digits and Spaces

Question:
Create a text file named input.txt. Write a Java program to read the file and count the number of vowels, consonants, digits, and spaces. Analyze every character present in the file.

Code:

import java.io.*;

public class Q8 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("input.txt");
            fw.write("Java 123 is Easy");
            fw.close();

            FileReader fr = new FileReader("input.txt");

            int ch;
            int vowels = 0, consonants = 0;
            int digits = 0, spaces = 0;

            while ((ch = fr.read()) != -1) {
                char c = (char) ch;

                if (Character.isLetter(c)) {
                    if ("AEIOUaeiou".indexOf(c) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (Character.isDigit(c)) {
                    digits++;
                } else if (c == ' ') {
                    spaces++;
                }
            }

            fr.close();

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);

        } catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
}

Output:

Vowels: 5
Consonants: 5
Digits: 3
Spaces: 3

Q9. Student Record File

Question:
Write a Java program to accept details of 5 students and store them in student_records.txt. For each student store Roll Number, Name, Course, and Marks. After storing the records, read the file and display all student records.

Code:

import java.io.*;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("student_records.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details of Student " + i);

                System.out.print("Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Course: ");
                String course = sc.nextLine();

                System.out.print("Marks: ");
                double marks = sc.nextDouble();

                fw.write("Roll Number: " + roll + "\n");
                fw.write("Name: " + name + "\n");
                fw.write("Course: " + course + "\n");
                fw.write("Marks: " + marks + "\n\n");
            }

            fw.close();

            BufferedReader br = new BufferedReader(
                new FileReader("student_records.txt"));

            String line;

            System.out.println("\nStudent Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error occurred.");
        }

        sc.close();
    }
}

Output:

Enter details of Student 1
Roll Number: 101
Name: Akshit
Course: BCA
Marks: 85

Enter details of Student 2
Roll Number: 102
Name: Rahul
Course: BCA
Marks: 80

Enter details of Student 3
Roll Number: 103
Name: Aman
Course: BCA
Marks: 78

Enter details of Student 4
Roll Number: 104
Name: Mohit
Course: BCA
Marks: 90

Enter details of Student 5
Roll Number: 105
Name: Rohit
Course: BCA
Marks: 88

Student Records:
Roll Number: 101
Name: Akshit
Course: BCA
Marks: 85.0

Roll Number: 102
Name: Rahul
Course: BCA
Marks: 80.0

Roll Number: 103
Name: Aman
Course: BCA
Marks: 78.0

Roll Number: 104
Name: Mohit
Course: BCA
Marks: 90.0

Roll Number: 105
Name: Rohit
Course: BCA
Marks: 88.0

Q10. File-Based Employee Management

Question:
Create a file-based employee management program. Accept Employee ID, Employee Name, Department, and Salary and store them in employees.txt. Then read the file and search for an employee using Employee ID. If found, display the complete record; otherwise display 'Employee record not found.' Handle the situation where the file does not exist.

Code:

import java.io.*;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("employees.txt");

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            fw.write(id + "\n");
            fw.write(name + "\n");
            fw.write(dept + "\n");
            fw.write(salary + "\n");

            fw.close();

            System.out.print("Enter Employee ID to search: ");
            int searchId = sc.nextInt();

            BufferedReader br = new BufferedReader(
                new FileReader("employees.txt"));

            String empId = br.readLine();
            String empName = br.readLine();
            String empDept = br.readLine();
            String empSalary = br.readLine();

            if (empId != null && Integer.parseInt(empId) == searchId) {
                System.out.println("\nEmployee Record Found");
                System.out.println("Employee ID: " + empId);
                System.out.println("Employee Name: " + empName);
                System.out.println("Department: " + empDept);
                System.out.println("Salary: " + empSalary);
            } else {
                System.out.println("Employee record not found.");
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Employee file does not exist.");
        } catch (IOException e) {
            System.out.println("File error occurred.");
        }

        sc.close();
    }
}

Output:

Enter Employee ID: 101
Enter Employee Name: Akshit
Enter Department: IT
Enter Salary: 30000
Enter Employee ID to search: 101

Employee Record Found
Employee ID: 101
Employee Name: Akshit
Department: IT
Salary: 30000.0