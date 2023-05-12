package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Elmo = new Teacher(1,"Elmo",500);
        Teacher Barney = new Teacher(2,"Barney",700);
        Teacher Coco = new Teacher(3,"Coco",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Elmo);
        teacherList.add(Barney);
        teacherList.add(Coco);


        Student Zoe = new Student(1,"Zoe",4);
        Student Naruto = new Student(2,"Naruto",12);
        Student Sasuke = new Student(3,"Sasuke",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Zoe);
        studentList.add(Sasuke);
        studentList.add(Naruto);

        Schools ghs = new Schools(teacherList,studentList);

        Teacher Kakashi = new Teacher(6,"Kakashi", 900);

        ghs.addTeacher(Kakashi);


        Zoe.payFees(5000);
        Naruto.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("#### Making SCHOOL PAY SALARY ####");
        Elmo.receiveSalary(Elmo.getSalary());
        System.out.println("GHS has spent for salary to " + Elmo.getName() +" and now has $" + ghs.getTotalMoneyEarned());

        Coco.receiveSalary(Coco.getSalary());
        System.out.println("GHS has spent for salary to " + Coco.getName() + " and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(Sasuke);
        Barney.receiveSalary(Barney.getSalary());
        System.out.println(Barney);


    }
}