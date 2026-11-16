Q1. Student Registration Form — AWT

Question:
Create a Java AWT application to design a Student Registration Form containing Label and TextField for Student Name, Roll Number and Course; Checkbox for Gender; Choice for Semester; Submit and Reset buttons. Submit should display entered information; Reset should clear all fields.

Code:

import java.awt.*;
import java.awt.event.*;

public class Q1 extends Frame implements ActionListener {
    TextField name, roll, course;
    Checkbox male, female;
    CheckboxGroup gender;
    Choice semester;
    Button submit, reset;

    Q1() {
        setTitle("Student Registration Form");
        setSize(400, 400);
        setLayout(new GridLayout(8, 2, 10, 10));

        add(new Label("Student Name:"));
        name = new TextField();
        add(name);

        add(new Label("Roll Number:"));
        roll = new TextField();
        add(roll);

        add(new Label("Course:"));
        course = new TextField();
        add(course);

        add(new Label("Gender:"));
        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);

        Panel p = new Panel();
        p.add(male);
        p.add(female);
        add(p);

        add(new Label("Semester:"));
        semester = new Choice();
        for (int i = 1; i <= 8; i++)
            semester.add("Semester " + i);
        add(semester);

        submit = new Button("Submit");
        reset = new Button("Reset");

        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String g = gender.getSelectedCheckbox() == null ?
                    "Not selected" :
                    gender.getSelectedCheckbox().getLabel();

            System.out.println("Student Name: " + name.getText());
            System.out.println("Roll Number: " + roll.getText());
            System.out.println("Course: " + course.getText());
            System.out.println("Gender: " + g);
            System.out.println("Semester: " + semester.getSelectedItem());
        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            gender.setSelectedCheckbox(null);
            semester.select(0);
        }
    }

    public static void main(String[] args) {
        new Q1();
    }
}

Output:

Student Registration Form window opens.

Student Name: Akshit
Roll Number: 101
Course: BCA
Gender: Male
Semester: Semester 1

After clicking Submit, details are displayed in console.
After clicking Reset, all fields become empty.

Q2. Simple Calculator — AWT

Question:
Create a Java AWT-based calculator with two TextFields, four Buttons for Addition, Subtraction, Multiplication and Division, and a result display. Perform the selected operation and handle division by zero.

Code:

import java.awt.*;
import java.awt.event.*;

public class Q2 extends Frame implements ActionListener {
    TextField t1, t2;
    Label result;
    Button add, sub, mul, div;

    Q2() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new Label("First Number:"));
        t1 = new TextField();
        add(t1);

        add(new Label("Second Number:"));
        t2 = new TextField();
        add(t2);

        add = new Button("Addition");
        sub = new Button("Subtraction");
        mul = new Button("Multiplication");
        div = new Button("Division");

        add(add);
        add(sub);
        add(mul);
        add(div);

        result = new Label("Result: ");
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double r = 0;

            if (e.getSource() == add)
                r = a + b;
            else if (e.getSource() == sub)
                r = a - b;
            else if (e.getSource() == mul)
                r = a * b;
            else if (e.getSource() == div) {
                if (b == 0) {
                    result.setText("Cannot divide by zero!");
                    return;
                }
                r = a / b;
            }

            result.setText("Result: " + r);

        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new Q2();
    }
}

Output:

Simple Calculator window opens.

First Number: 20
Second Number: 10

Click Addition:
Result: 30.0

Click Subtraction:
Result: 10.0

Click Multiplication:
Result: 200.0

Click Division:
Result: 2.0

Q3. Student Login Form — Swing

Question:
Create a Swing login form with JLabel/JTextField for username, JLabel/JPasswordField for password, Login and Reset buttons. On Login, compare with predefined credentials and display the result using JOptionPane.

Code:

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 extends JFrame implements ActionListener {
    JTextField username;
    JPasswordField password;
    JButton login, reset;

    Q3() {
        setTitle("Student Login Form");
        setSize(350, 250);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Username:"));
        username = new JTextField();
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField();
        add(password);

        login = new JButton("Login");
        reset = new JButton("Reset");

        add(login);
        add(reset);

        login.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String u = username.getText();
            String p = new String(password.getPassword());

            if (u.equals("admin") && p.equals("1234"))
                JOptionPane.showMessageDialog(this, "Login Successful!");
            else
                JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
        } else {
            username.setText("");
            password.setText("");
        }
    }

    public static void main(String[] args) {
        new Q3();
    }
}

Output:

Student Login Form window opens.

Username: admin
Password: 1234

Click Login:
Login Successful!

Q4. Student Marksheet GUI — Swing

Question:
Create a Swing application accepting marks for English, Mathematics, Java, DBMS and Computer Networks. Add a Calculate Result button to display total, percentage, grade and pass/fail status.

Code:

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 extends JFrame implements ActionListener {
    JTextField[] marks = new JTextField[5];
    String[] subjects = {
        "English", "Mathematics", "Java", "DBMS",
        "Computer Networks"
    };
    JButton calculate;
    JLabel result;

    Q4() {
        setTitle("Student Marksheet");
        setSize(400, 400);
        setLayout(new GridLayout(7, 2, 10, 10));

        for (int i = 0; i < 5; i++) {
            add(new JLabel(subjects[i] + ":"));
            marks[i] = new JTextField();
            add(marks[i]);
        }

        calculate = new JButton("Calculate Result");
        add(calculate);

        result = new JLabel("Result will appear here.");
        add(result);

        calculate.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int total = 0;
            boolean pass = true;

            for (int i = 0; i < 5; i++) {
                int m = Integer.parseInt(marks[i].getText());

                if (m < 0 || m > 100)
                    throw new NumberFormatException();

                total += m;

                if (m < 33)
                    pass = false;
            }

            double percentage = total / 5.0;
            String grade;

            if (!pass)
                grade = "F";
            else if (percentage >= 90)
                grade = "A+";
            else if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else
                grade = "E";

            String status = pass ? "Pass" : "Fail";

            JOptionPane.showMessageDialog(this,
                "Total: " + total +
                "\nPercentage: " + percentage + "%" +
                "\nGrade: " + grade +
                "\nStatus: " + status);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Enter valid marks between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        new Q4();
    }
}

Output:

Student Marksheet window opens.

English: 85
Mathematics: 90
Java: 95
DBMS: 80
Computer Networks: 90

Click Calculate Result:

Total: 440
Percentage: 88.0%
Grade: A
Status: Pass

Q5. Course Selection Form — Swing

Question:
Create a Swing GUI with Student Name (JTextField), Course (JComboBox), Gender (JRadioButton), Subjects (multiple JCheckBox), Submit and Reset buttons. Submit should display all selected information using JOptionPane.

Code:

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q5 extends JFrame implements ActionListener {
    JTextField name;
    JComboBox<String> course;
    JRadioButton male, female;
    JCheckBox java, dbms, python, maths;
    JButton submit, reset;

    Q5() {
        setTitle("Course Selection Form");
        setSize(400, 400);
        setLayout(new GridLayout(7, 2, 10, 10));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Course:"));
        course = new JComboBox<>(
            new String[]{"BCA", "BBA", "B.Tech", "MCA"});
        add(course);

        add(new JLabel("Gender:"));

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new JLabel("Subjects:"));

        java = new JCheckBox("Java");
        dbms = new JCheckBox("DBMS");
        python = new JCheckBox("Python");
        maths = new JCheckBox("Mathematics");

        JPanel subjectPanel = new JPanel();
        subjectPanel.add(java);
        subjectPanel.add(dbms);
        subjectPanel.add(python);
        subjectPanel.add(maths);
        add(subjectPanel);

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String gender = male.isSelected() ? "Male" :
                    female.isSelected() ? "Female" : "Not selected";

            String subjects = "";

            if (java.isSelected()) subjects += "Java ";
            if (dbms.isSelected()) subjects += "DBMS ";
            if (python.isSelected()) subjects += "Python ";
            if (maths.isSelected()) subjects += "Mathematics ";

            JOptionPane.showMessageDialog(this,
                "Name: " + name.getText() +
                "\nCourse: " + course.getSelectedItem() +
                "\nGender: " + gender +
                "\nSubjects: " + subjects);

        } else {
            name.setText("");
            course.setSelectedIndex(0);
            male.setSelected(false);
            female.setSelected(false);
            java.setSelected(false);
            dbms.setSelected(false);
            python.setSelected(false);
            maths.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Q5();
    }
}

Output:

Course Selection Form window opens.

Student Name: Akshit
Course: BCA
Gender: Male
Subjects: Java, DBMS

Click Submit:

Name: Akshit
Course: BCA
Gender: Male
Subjects: Java DBMS

Q6. Employee Registration Form — AWT

Question:
Create an AWT Employee Registration Form with Employee ID, Name, Department, Designation, Salary, Gender, Department selection, Submit and Clear buttons. Display submitted information in a TextArea and clear fields using Clear.

Code:

import java.awt.*;
import java.awt.event.*;

public class Q6 extends Frame implements ActionListener {
    TextField id, name, department, designation, salary;
    Checkbox male, female;
    CheckboxGroup gender;
    Choice deptChoice;
    TextArea output;
    Button submit, clear;

    Q6() {
        setTitle("Employee Registration Form");
        setSize(500, 500);
        setLayout(new GridLayout(10, 2, 10, 10));

        add(new Label("Employee ID:"));
        id = new TextField();
        add(id);

        add(new Label("Name:"));
        name = new TextField();
        add(name);

        add(new Label("Department:"));
        department = new TextField();
        add(department);

        add(new Label("Designation:"));
        designation = new TextField();
        add(designation);

        add(new Label("Salary:"));
        salary = new TextField();
        add(salary);

        add(new Label("Gender:"));
        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);

        Panel p = new Panel();
        p.add(male);
        p.add(female);
        add(p);

        add(new Label("Department Selection:"));
        deptChoice = new Choice();
        deptChoice.add("IT");
        deptChoice.add("HR");
        deptChoice.add("Finance");
        deptChoice.add("Marketing");
        add(deptChoice);

        submit = new Button("Submit");
        clear = new Button("Clear");

        add(submit);
        add(clear);

        output = new TextArea();
        add(output);
        add(new Label("Employee Details"));

        submit.addActionListener(this);
        clear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String g = gender.getSelectedCheckbox() == null ?
                    "Not selected" :
                    gender.getSelectedCheckbox().getLabel();

            output.setText(
                "Employee ID: " + id.getText() +
                "\nName: " + name.getText() +
                "\nDepartment: " + department.getText() +
                "\nDesignation: " + designation.getText() +
                "\nSalary: " + salary.getText() +
                "\nGender: " + g +
                "\nDepartment Selection: " +
                deptChoice.getSelectedItem());
        } else {
            id.setText("");
            name.setText("");
            department.setText("");
            designation.setText("");
            salary.setText("");
            gender.setSelectedCheckbox(null);
            deptChoice.select(0);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new Q6();
    }
}

Output:

Employee Registration Form window opens.

Employee ID: 101
Name: Akshit
Department: IT
Designation: Manager
Salary: 50000
Gender: Male
Department Selection: IT

Click Submit:

Employee ID: 101
Name: Akshit
Department: IT
Designation: Manager
Salary: 50000
Gender: Male
Department Selection: IT

Click Clear: All fields become empty.

Q7. Temperature Converter — Swing

Question:
Create a Swing temperature converter with a temperature TextField, Celsius-to-Fahrenheit and Fahrenheit-to-Celsius radio buttons, Convert and Clear buttons, and result display. Use F=(C×9/5)+32 and C=(F−32)×5/9. Handle invalid input.

Code:

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q7 extends JFrame implements ActionListener {
    JTextField temperature;
    JRadioButton cToF, fToC;
    JButton convert, clear;
    JLabel result;

    Q7() {
        setTitle("Temperature Converter");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Temperature:"));
        temperature = new JTextField();
        add(temperature);

        cToF = new JRadioButton("Celsius to Fahrenheit");
        fToC = new JRadioButton("Fahrenheit to Celsius");

        ButtonGroup bg = new ButtonGroup();
        bg.add(cToF);
        bg.add(fToC);

        add(cToF);
        add(fToC);

        convert = new JButton("Convert");
        clear = new JButton("Clear");

        add(convert);
        add(clear);

        result = new JLabel("Result: ");
        add(result);

        convert.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            try {
                double t = Double.parseDouble(temperature.getText());
                double r;

                if (cToF.isSelected()) {
                    r = (t * 9 / 5) + 32;
                    result.setText("Result: " + r + " Fahrenheit");
                } else if (fToC.isSelected()) {
                    r = (t - 32) * 5 / 9;
                    result.setText("Result: " + r + " Celsius");
                } else {
                    result.setText("Select conversion type.");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                    "Please enter a valid temperature.");
            }
        } else {
            temperature.setText("");
            result.setText("Result: ");
            cToF.setSelected(false);
            fToC.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Q7();
    }
}

Output:

Temperature Converter window opens.

Temperature: 100
Select: Celsius to Fahrenheit

Click Convert:
Result: 212.0 Fahrenheit

Q8. Simple Notepad — Swing

Question:
Create a basic Swing Notepad with JTextArea and a menu bar containing File → New, Open, Save and Exit. New clears the text area; Open selects a text file; Save writes the contents to a file; Exit closes the application.

Code:

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Q8 extends JFrame implements ActionListener {
    JTextArea area;
    JMenuItem newItem, openItem, saveItem, exitItem;

    Q8() {
        setTitle("Simple Notepad");
        setSize(600, 500);

        area = new JTextArea();
        add(new JScrollPane(area));

        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        file.add(newItem);
        file.add(openItem);
        file.add(saveItem);
        file.add(exitItem);

        bar.add(file);
        setJMenuBar(bar);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            area.setText("");
        }

        else if (e.getSource() == openItem) {
            JFileChooser chooser = new JFileChooser();

            if (chooser.showOpenDialog(this) ==
                    JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedReader br = new BufferedReader(
                        new FileReader(chooser.getSelectedFile()));

                    area.setText("");
                    String line;

                    while ((line = br.readLine()) != null) {
                        area.append(line + "\n");
                    }

                    br.close();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                        "Error opening file.");
                }
            }
        }

        else if (e.getSource() == saveItem) {
            JFileChooser chooser = new JFileChooser();

            if (chooser.showSaveDialog(this) ==
                    JFileChooser.APPROVE_OPTION) {
                try {
                    FileWriter fw = new FileWriter(
                        chooser.getSelectedFile());

                    fw.write(area.getText());
                    fw.close();

                    JOptionPane.showMessageDialog(this,
                        "File saved successfully.");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                        "Error saving file.");
                }
            }
        }

        else if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Q8();
    }
}

Output:

Simple Notepad window opens.

File Menu:
1. New
2. Open
3. Save
4. Exit

New: Clears text area.
Open: Opens selected text file.
Save: Saves text into selected file.
Exit: Closes application.

Q9. Student Feedback Form — Swing

Question:
Create a Swing Student Feedback Form with Student Name, Roll Number, Course, rating radio buttons (Excellent, Very Good, Good, Average, Poor), feedback checkboxes (Teaching, Laboratory, Course Material, Assignments), Comments JTextArea, Submit and Reset. Submit should display all feedback using JOptionPane.

Code:

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q9 extends JFrame implements ActionListener {
    JTextField name, roll, course;
    JRadioButton excellent, veryGood, good, average, poor;
    JCheckBox teaching, laboratory, material, assignments;
    JTextArea comments;
    JButton submit, reset;

    Q9() {
        setTitle("Student Feedback Form");
        setSize(500, 550);
        setLayout(new GridLayout(9, 2, 10, 10));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Roll Number:"));
        roll = new JTextField();
        add(roll);

        add(new JLabel("Course:"));
        course = new JTextField();
        add(course);

        add(new JLabel("Rating:"));

        excellent = new JRadioButton("Excellent");
        veryGood = new JRadioButton("Very Good");
        good = new JRadioButton("Good");
        average = new JRadioButton("Average");
        poor = new JRadioButton("Poor");

        ButtonGroup bg = new ButtonGroup();
        bg.add(excellent);
        bg.add(veryGood);
        bg.add(good);
        bg.add(average);
        bg.add(poor);

        JPanel ratingPanel = new JPanel();
        ratingPanel.add(excellent);
        ratingPanel.add(veryGood);
        ratingPanel.add(good);
        ratingPanel.add(average);
        ratingPanel.add(poor);
        add(ratingPanel);

        add(new JLabel("Feedback:"));

        teaching = new JCheckBox("Teaching");
        laboratory = new JCheckBox("Laboratory");
        material = new JCheckBox("Course Material");
        assignments = new JCheckBox("Assignments");

        JPanel feedbackPanel = new JPanel();
        feedbackPanel.add(teaching);
        feedbackPanel.add(laboratory);
        feedbackPanel.add(material);
        feedbackPanel.add(assignments);
        add(feedbackPanel);

        add(new JLabel("Comments:"));
        comments = new JTextArea(3, 15);
        add(new JScrollPane(comments));

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String rating = "Not selected";

            if (excellent.isSelected()) rating = "Excellent";
            else if (veryGood.isSelected()) rating = "Very Good";
            else if (good.isSelected()) rating = "Good";
            else if (average.isSelected()) rating = "Average";
            else if (poor.isSelected()) rating = "Poor";

            String feedback = "";

            if (teaching.isSelected()) feedback += "Teaching ";
            if (laboratory.isSelected()) feedback += "Laboratory ";
            if (material.isSelected()) feedback += "Course Material ";
            if (assignments.isSelected()) feedback += "Assignments ";

            JOptionPane.showMessageDialog(this,
                "Student Name: " + name.getText() +
                "\nRoll Number: " + roll.getText() +
                "\nCourse: " + course.getText() +
                "\nRating: " + rating +
                "\nFeedback: " + feedback +
                "\nComments: " + comments.getText());

        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            comments.setText("");

            excellent.setSelected(false);
            veryGood.setSelected(false);
            good.setSelected(false);
            average.setSelected(false);
            poor.setSelected(false);

            teaching.setSelected(false);
            laboratory.setSelected(false);
            material.setSelected(false);
            assignments.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Q9();
    }
}

Output:

Student Feedback Form window opens.

Student Name: Akshit
Roll Number: 101
Course: BCA
Rating: Excellent
Feedback: Teaching, Laboratory
Comments: Good teaching method.

Click Submit:

Student Name: Akshit
Roll Number: 101
Course: BCA
Rating: Excellent
Feedback: Teaching Laboratory
Comments: Good teaching method.

Q10. Mini Banking GUI Application — Swing

Question:
Create a Swing Mini Banking Application with Account Number, Customer Name, Current Balance, Amount and buttons Deposit, Withdraw, Check Balance and Clear. Deposit adds amount; Withdraw subtracts it only when sufficient balance exists; Check Balance displays balance; Clear clears inputs. Use JOptionPane for messages.

Code:

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q10 extends JFrame implements ActionListener {
    JTextField account, name, balance, amount;
    JButton deposit, withdraw, check, clear;

    Q10() {
        setTitle("Mini Banking Application");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Account Number:"));
        account = new JTextField();
        add(account);

        add(new JLabel("Customer Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Current Balance:"));
        balance = new JTextField("10000");
        balance.setEditable(false);
        add(balance);

        add(new JLabel("Amount:"));
        amount = new JTextField();
        add(amount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        check = new JButton("Check Balance");
        clear = new JButton("Clear");

        add(deposit);
        add(withdraw);
        add(check);
        add(clear);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        check.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double current = Double.parseDouble(balance.getText());

            if (e.getSource() == deposit) {
                double a = Double.parseDouble(amount.getText());

                if (a <= 0) {
                    JOptionPane.showMessageDialog(this,
                        "Enter a positive amount.");
                    return;
                }

                current += a;
                balance.setText(String.valueOf(current));

                JOptionPane.showMessageDialog(this,
                    "Amount deposited successfully.");

            } else if (e.getSource() == withdraw) {
                double a = Double.parseDouble(amount.getText());

                if (a <= 0) {
                    JOptionPane.showMessageDialog(this,
                        "Enter a positive amount.");
                } else if (a <= current) {
                    current -= a;
                    balance.setText(String.valueOf(current));

                    JOptionPane.showMessageDialog(this,
                        "Amount withdrawn successfully.");
                } else {
                    JOptionPane.showMessageDialog(this,
                        "Insufficient balance.");
                }

            } else if (e.getSource() == check) {
                JOptionPane.showMessageDialog(this,
                    "Current Balance: " + current);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Please enter a valid amount.");
        }

        if (e.getSource() == clear) {
            account.setText("");
            name.setText("");
            amount.setText("");
        }
    }

    public static void main(String[] args) {
        new Q10();
    }
}

Output:

Mini Banking Application window opens.

Account Number: 101
Customer Name: Akshit
Current Balance: 10000
Amount: 2000

Click Deposit:
Amount deposited successfully.
New Balance: 12000

Amount: 3000
Click Withdraw:
Amount withdrawn successfully.
New Balance: 9000

Click Check Balance:
Current Balance: 9000

Click Clear:
Account Number, Customer Name and Amount fields become empty.