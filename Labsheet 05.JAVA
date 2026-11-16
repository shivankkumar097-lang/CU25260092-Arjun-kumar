1. Handling ArithmeticException

Code:

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();

            System.out.print("Enter second integer: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        sc.close();
    }
}

Output:

Enter first integer: 10
Enter second integer: 0
Error: Cannot divide by zero.
Q2. Handling ArrayIndexOutOfBoundsException

Code:

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter array index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Element: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }

        sc.close();
    }
}

Output:

Enter array index (0-4): 7
Error: Invalid array index.
Q3. Handling NumberFormatException

Code:

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Integer value: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid integer format.");
        }

        sc.close();
    }
}

Output:

Enter a number as a string: abc
Error: Invalid integer format.
Q4. Multiple Catch Blocks

Code:

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.nextLine());

            System.out.println("Division: " + (a / b));

            System.out.print("Enter array index (0-4): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Array element: " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid integers.");
        }

        sc.close();
    }
}

Output:

Enter first number: 10
Enter second number: 0
Error: Cannot divide by zero.
Q5. Using finally

Code:

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.nextLine());

            System.out.println("Result: " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number.");

        } finally {
            System.out.println("Program execution completed.");
        }

        sc.close();
    }
}

Output:

Enter first number: 10
Enter second number: 0
Error: Cannot divide by zero.
Program execution completed.
Q6. Using throw

Code:

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException(
                    "Marks must be between 0 and 100."
                );
            }

            System.out.println("Valid marks: " + marks);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

Output:

Enter student marks: 120
Error: Marks must be between 0 and 100.
Q7. Using throws

Code:

import java.util.Scanner;

public class Q7 {

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }

        System.out.println("Eligible.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());

            checkAge(age);

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter a valid age.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

Output:

Enter age: 16
Error: Age must be 18 or above.
Q8. Nested try-catch

Code:

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            try {
                System.out.print("Enter array index (0-4): ");
                int index = sc.nextInt();

                System.out.println("Array element: " + arr[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid array index.");
            }

            System.out.println("Division: " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        sc.close();
    }
}

Output:

Enter first number: 10
Enter second number: 0
Enter array index (0-4): 2
Array element: 30
Error: Cannot divide by zero.
Q9. Exception Propagation

Code:

public class Q9 {

    static void method3() {
        int result = 10 / 0;
        System.out.println(result);
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {
        try {
            method1();

        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main().");
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}

Output:

Exception handled in main().
Error: Cannot divide by zero.
Q10. User-Defined Exception

Code:

import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException(
                    "Marks must be between 0 and 100."
                );
            }

            System.out.println("Valid marks: " + marks);

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter a valid integer.");
        }

        sc.close();
    }
}

Output:

Enter marks: 150
Error: Marks must be between 0 and 100.
PART B — Real-World / Application-Based Questions

Tumhari PDF ke Part B mein bank withdrawal, hospital registration, drug dosage, online examination aur pharmacy inventory ke programs diye gaye hain.

Q11. Bank Withdrawal System

Code:

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            if (balance < 0) {
                throw new IllegalArgumentException(
                    "Balance cannot be negative."
                );
            }

            if (amount < 0) {
                throw new IllegalArgumentException(
                    "Withdrawal cannot be negative."
                );
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient account balance."
                );
            }

            balance -= amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid numeric values.");

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Bank transaction completed.");
        }

        sc.close();
    }
}

Output:

Enter account balance: 5000
Enter withdrawal amount: 6000
Error: Insufficient account balance.
Bank transaction completed.
Q12. Hospital Patient Age Validation

Code:

import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String message) {
        super(message);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException(
                    "Age must be between 0 and 120."
                );
            }

            System.out.println("Patient registered successfully.");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be numeric.");
        }

        sc.close();
    }
}

Output:

Enter patient name: Aman
Enter patient age: 150
Error: Age must be between 0 and 120.
Q13. Pharmaceutical Drug Dosage Validation

Code:

import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String message) {
        super(message);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String patient = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drug = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            double dosage = Double.parseDouble(sc.nextLine());

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException(
                    "Dosage must be greater than 0 and at most 1000 mg."
                );
            }

            System.out.println("Patient: " + patient);
            System.out.println("Drug: " + drug);
            System.out.println("Dosage: " + dosage + " mg");
            System.out.println("Dosage is valid.");

        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter a valid dosage.");

        } finally {
            System.out.println("Dosage validation completed.");
        }

        sc.close();
    }
}

Output:

Enter patient name: Aman
Enter drug name: Medicine A
Enter dosage in mg: 1500
Error: Dosage must be greater than 0 and at most 1000 mg.
Dosage validation completed.
Q14. Online Examination System

Code:

import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String message) {
        super(message);
    }
}

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException(
                    "Marks must be between 0 and 100."
                );
            }

            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }

        } catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid numeric marks.");

        } finally {
            System.out.println("Exam evaluation completed.");
        }

        sc.close();
    }
}

Output:

Enter student marks: 75
PASS
Exam evaluation completed.
Q15. Pharmacy Inventory System

Code:

import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicine = sc.nextLine();

            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException(
                    "Quantity cannot be negative."
                );
            }

            if (required > available) {
                throw new InsufficientMedicineStockException(
                    "Required quantity exceeds available stock."
                );
            }

            available -= required;

            System.out.println("Medicine: " + medicine);
            System.out.println("Medicine issued successfully.");
            System.out.println("Remaining quantity: " + available);

        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter valid numeric quantities.");

        } finally {
            System.out.println("Inventory transaction completed.");
        }

        sc.close();
    }
}

Output:

Enter medicine name: Paracetamol
Enter available quantity: 100
Enter required quantity: 120
Error: Required quantity exceeds available stock.
Inventory transaction completed.