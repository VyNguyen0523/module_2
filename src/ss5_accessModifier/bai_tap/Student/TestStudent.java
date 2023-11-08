package ss5_accessModifier.bai_tap.Student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: " + student.getName());
        System.out.println("Classes: " + student.getClasses());
        System.out.println("Change name and classname");

        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        String newName = sc.nextLine();
        student.setName(newName);
        System.out.println("Input classes: ");
        String newClass = sc.nextLine();
        student.setClasses(newClass);
        System.out.println("Name: " + student.getName() + "; Classes: " + student.getClasses());

    }

}
