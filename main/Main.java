package main;

import beans.Student;
import util.InputUtil;
import util.StudentUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int menu = 0;

        while(true) {
            menu = InputUtil.requireNumber("""
                    What do you want to do?
                    1. Register student
                    2. Show all students
                    3. Find student
                    4. Update student details""");

            if (menu == 1) {
                StudentUtil.registerStudents();
            } else if (menu == 2) {
                StudentUtil.printAllRegisteredStudents();
            } else if (menu == 3) {
                StudentUtil.findStudentsAndPrint();
            }
        }
    }
}
