PART A – 1-D ARRAYS
Q1. Input and Display 5 Integers
Plain text
import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
Output:

Plain text
Enter 5 integers:
10
20
30
40
50
Array elements:
10 20 30 40 50
Q2. Display 10 Integers in Reverse Order
Plain text
import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Reverse order:");

        for (int i = 9; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
Output:

Plain text
Enter 10 integers:
1
2
3
4
5
6
7
8
9
10
Reverse order:
10 9 8 7 6 5 4 3 2 1
Q3. Sum of All Elements
Plain text
import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        System.out.println("Sum = " + sum);
    }
}
Output:

Plain text
Enter array size: 5
Enter elements:
10
20
30
40
50
Sum = 150
Q4. Find Maximum Element
Plain text
import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Maximum element = " + max);
    }
}
Output:

Plain text
Enter array size: 5
Enter elements:
10
45
20
67
30
Maximum element = 67
Q5. Count Even and Odd Numbers
Plain text
import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int even = 0;
        int odd = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}
Output:

Plain text
Enter array size: 6
Enter elements:
10
15
20
25
30
35
Even numbers = 3
Odd numbers = 3
Q6. Copy One Array to Another
Plain text
import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        System.out.println("Copied array:");

        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
Output:

Plain text
Enter array size: 5
Enter elements:
10
20
30
40
50
Copied array:
10 20 30 40 50
PART B – 2-D ARRAYS
Q7–Q13 matrix-based programs hain.

Q7. Input and Display 3 × 3 Matrix
Plain text
import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Output:

Plain text
Enter 9 elements:
1
2
3
4
5
6
7
8
9
Matrix:
1 2 3
4 5 6
7 8 9
Q8. Sum of All Matrix Elements
Plain text
import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int sum = 0;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
Output:

Plain text
Enter 9 elements:
1
2
3
4
5
6
7
8
9
Sum = 45
Q9. Sum of Each Row
Plain text
import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += a[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }
}
Output:

Plain text
Enter 9 elements:
1
2
3
4
5
6
7
8
9
Sum of row 1 = 6
Sum of row 2 = 15
Sum of row 3 = 24
Q10. Sum of Each Column
Plain text
import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 3; j++) {
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum += a[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
    }
}
Output:

Plain text
Enter 9 elements:
1
2
3
4
5
6
7
8
9
Sum of column 1 = 12
Sum of column 2 = 15
Sum of column 3 = 18
Q11. Transpose of Matrix
Plain text
import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
Output:

Plain text
Enter 9 elements:
1
2
3
4
5
6
7
8
9
Transpose:
1 4 7
2 5 8
3 6 9
Q12. Addition of Two Matrices
Plain text
import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] sum = new int[3][3];

        System.out.println("Enter first matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of matrices:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Output:

Plain text
Enter first matrix:
1
2
3
4
5
6
7
8
9

Enter second matrix:
9
8
7
6
5
4
3
2
1

Sum of matrices:
10 10 10
10 10 10
10 10 10
Q13. Multiplication of Two 3 × 3 Matrices
Plain text
import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] result = new int[3][3];

        System.out.println("Enter first matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication result:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Output:

Plain text
Enter first matrix:
1
2
3
4
5
6
7
8
9

Enter second matrix:
1
0
0
0
1
0
0
0
1

Multiplication result:
1 2 3
4 5 6
7 8 9
PART C – 3-D ARRAYS
Q14–Q18 3-D array programs hain.

Q14. Input and Display 2 × 2 × 2 Array
Plain text
import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("3-D Array:");

        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1));

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
Output:

Plain text
Enter 8 elements:
1
2
3
4
5
6
7
8
3-D Array:
Layer 1
1 2
3 4
Layer 2
5 6
7 8
Q15. Sum of All Elements in 3-D Array
Plain text
import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][2][2];
        int sum = 0;

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    a[i][j][k] = sc.nextInt();
                    sum += a[i][j][k];
                }
            }
        }

        System.out.println("Sum = " + sum);
    }
}
Output:

Plain text
Enter 8 elements:
1
2
3
4
5
6
7
8
Sum = 36
Q16. Count Positive and Negative Numbers
Plain text
import java.util.Scanner;

class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][2][2];

        int positive = 0;
        int negative = 0;

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    a[i][j][k] = sc.nextInt();

                    if (a[i][j][k] > 0)
                        positive++;
                    else if (a[i][j][k] < 0)
                        negative++;
                }
            }
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
    }
}
Output:

Plain text
Enter 8 elements:
1
-2
3
-4
5
-6
7
-8
Positive numbers = 4
Negative numbers = 4
Q17. Maximum Element in 3-D Array
Plain text
import java.util.Scanner;

class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        int max = a[0][0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (a[i][j][k] > max)
                        max = a[i][j][k];
                }
            }
        }

        System.out.println("Maximum = " + max);
    }
}
Output:

Plain text
Enter 8 elements:
10
25
5
40
15
8
30
20
Maximum = 40
Q18. Search Element in 3-D Array
Plain text
import java.util.Scanner;

class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (a[i][j][k] == search) {
                        System.out.println("Element found at ["
                                + i + "][" + j + "][" + k + "]");
                        found = true;
                    }
                }
            }
        }

        if (!found)
            System.out.println("Element not found");
    }
}
Output:

Plain text
Enter 8 elements:
10
20
30
40
50
60
70
80
Enter element to search: 60
Element found at [1][0][1]
PART D – JAGGED ARRAYS
Q19–Q20 jagged arrays ke hain.

Q19. Create and Display Jagged Array
Plain text
import java.util.Scanner;

class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int n = sc.nextInt();

            a[i] = new int[n];

            System.out.println("Enter elements:");

            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged Array:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Output:

Plain text
Enter length of row 1: 2
Enter elements:
10
20
Enter length of row 2: 3
Enter elements:
30
40
50
Enter length of row 3: 4
Enter elements:
60
70
80
90
Jagged Array:
10 20
30 40 50
60 70 80 90
Q20. Student Marks with Different Subjects
Plain text
import java.util.Scanner;

class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = new int[students][];

        for (int i = 0; i < students; i++) {
            System.out.print("Enter number of subjects for student "
                    + (i + 1) + ": ");

            int subjects = sc.nextInt();

            marks[i] = new int[subjects];

            System.out.println("Enter marks:");

            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("Student Marks:");

        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
    }
}
Output:

Plain text
Enter number of students: 2
Enter number of subjects for student 1: 3
Enter marks:
80
75
90
Enter number of subjects for student 2: 2
Enter marks:
85
70
Student Marks:
Student 1: 80 75 90
Student 2: 85 70
PART E – ADDITIONAL QUESTIONS
Q21–Q30 sheet ke additional questions hain.

Q21. Rotate Array Left by One Position
Plain text
import java.util.Scanner;

class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int first = a[0];

        for (int i = 0; i < n - 1; i++)
            a[i] = a[i + 1];

        a[n - 1] = first;

        System.out.println("After left rotation:");

        for (int x : a)
            System.out.print(x + " ");
    }
}
Output:

Plain text
Enter array size: 5
Enter elements:
1
2
3
4
5
After left rotation:
2 3 4 5 1
Q22. Count Frequency of Each Element
Plain text
import java.util.Scanner;

class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(a[i] + " appears " + count + " time(s)");
        }
    }
}
Output:

Plain text
Enter array size: 6
Enter elements:
10
20
10
30
20
10
10 appears 3 time(s)
20 appears 2 time(s)
30 appears 1 time(s)
Q23. Second Largest Element
Plain text
import java.util.Scanner;

class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : a) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }

        System.out.println("Second largest = " + second);
    }
}
Output:

Plain text
Enter array size: 5
Enter elements:
10
50
30
80
40
Second largest = 50
Q24. Remove Duplicate Elements
Plain text
import java.util.Scanner;

class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] unique = new int[n];
        int count = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (a[i] == unique[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                unique[count] = a[i];
                count++;
            }
        }

        System.out.println("Array without duplicates:");

        for (int i = 0; i < count; i++)
            System.out.print(unique[i] + " ");
    }
}
Output:

Plain text
Enter array size: 6
Enter elements:
10
20
10
30
20
40
Array without duplicates:
10 20 30 40
Q25. Sum of Main and Secondary Diagonal
Plain text
import java.util.Scanner;

class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int mainSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            mainSum += a[i][i];
            secondarySum += a[i][n - 1 - i];
        }

        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
    }
}
Output:

Plain text
Enter size of square matrix: 3
Enter elements:
1
2
3
4
5
6
7
8
9
Main diagonal sum = 15
Secondary diagonal sum = 15
Q26. Upper and Lower Triangular Matrix
Plain text
import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Upper triangular matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("Lower triangular matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
Output:

Plain text
Enter size of matrix: 3
Enter elements:
1
2
3
4
5
6
7
8
9

Upper triangular matrix:
1 2 3
0 5 6
0 0 9

Lower triangular matrix:
1 0 0
4 5 0
7 8 9
Q27. Display Boundary Elements
Plain text
import java.util.Scanner;

class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        System.out.println("Enter elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (i == 0 || i == rows - 1 ||
                    j == 0 || j == cols - 1)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
Output:

Plain text
Enter rows: 3
Enter columns: 3
Enter elements:
1
2
3
4
5
6
7
8
9
Boundary elements:
1 2 3
4   6
7 8 9
Q28. Search Element in 2-D Array
Plain text
import java.util.Scanner;

class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        System.out.println("Enter elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (a[i][j] == search) {
                    System.out.println("Element found at row "
                            + i + ", column " + j);
                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("Element not found");
    }
}
Output:

Plain text
Enter rows: 3
Enter columns: 3
Enter elements:
10
20
30
40
50
60
70
80
90
Enter element to search: 50
Element found at row 1, column 1
Q29. Sort Each Row of Jagged Array
Plain text
import java.util.Scanner;

class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] a = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int n = sc.nextInt();

            a[i] = new int[n];

            System.out.println("Enter elements:");

            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                for (int k = j + 1; k < a[i].length; k++) {

                    if (a[i][j] > a[i][k]) {
                        int temp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted jagged array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");

            System.out.println();
        }
    }
}
Output:

Plain text
Enter number of rows: 3
Enter length of row 1: 3
Enter elements:
30
10
20
Enter length of row 2: 2
Enter elements:
50
40
Enter length of row 3: 4
Enter elements:
90
60
80
70

Sorted jagged array:
10 20 30
40 50
60 70 80 90
Q30. Check Sparse Matrix
Plain text
import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        int zero = 0;
        int nonZero = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] == 0)
                    zero++;
                else
                    nonZero++;
            }
        }

        if (zero > nonZero)
            System.out.println("Matrix is a sparse matrix");
        else
            System.out.println("Matrix is not a sparse matrix");

        System.out.println("Zero elements = " + zero);
        System.out.println("Non-zero elements = " + nonZero);
    }
}
Output:

Plain text
Enter rows: 3
Enter columns: 3
Enter matrix elements:
1
0
0
0
0
2
0
0
0
Matrix is a sparse matrix
Zero elements = 6
Non-zero elements = 3