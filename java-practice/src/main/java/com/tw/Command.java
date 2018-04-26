package com.tw;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Command {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StudentList studentList= new StudentList();
        int menuNumber;

        CommandDesktop cd = new CommandDesktop();
        Regular regular = new Regular();
        cd.getDesktopMenu();
        while ((menuNumber = scanner.nextInt()) != 3) {
            switch (menuNumber) {
                case 1:
                    cd.getAddStudent();
                    String input = br.readLine();

                    while (regular.formatStudentInfo(input) == null) {
                        cd.getAddStudentError();
                        input = br.readLine();
                    }

                    Student student = regular.formatStudentInfo(input);
                    studentList.addStudent(student);
                    System.out.println("学生" + student.getName() + "的成绩被添加");

                    cd.getDesktopMenu();
                    break;
                case 2:
                    cd.getPrintReport();
                    String inputNum = br.readLine();

                    while (regular.formatStudentNos(inputNum) == null) {
                        cd.getPrintReportError();
                        inputNum = br.readLine();
                    }
                    List studentNum = regular.formatStudentNos(inputNum);
                    System.out.println(regular.formatReportText(studentNum));

                    cd.getDesktopMenu();
                    break;
            }
        }
    }
}