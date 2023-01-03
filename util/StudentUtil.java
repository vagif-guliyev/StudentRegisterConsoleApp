package util;

import beans.Student;
import main.Config;

public class StudentUtil {
    public static Student fillStudentDetails() {

        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        String className = InputUtil.requireText("Enter classname");
        int age = InputUtil.requireNumber("Enter age");

        return new Student(name, surname, age, className);
    }

    public static void printAllRegisteredStudents(){
        if(Config.students == null) {
            return;
        }
        for(int i = 0; i< Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println(st.getName() + " " + st.getSurname() + " " + st.getAge() + " " + st.getClassName());
        }
    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("How many students will be registered");
        Config.students = new Student[count];

        for(int i=0; i<count; i++) {
            System.out.println((i+1)+".student register: ");
            Config.students[i] = StudentUtil.fillStudentDetails();
        }
        System.out.println("Registration completed successfully!");
        StudentUtil.printAllRegisteredStudents();
    }
}
