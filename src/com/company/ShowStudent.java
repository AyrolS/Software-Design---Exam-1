package com.company;

public class ShowStudent {


    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("Student 1 ID is: " + s1.getId());
        System.out.println("Student 1 Credits is: " + s1.getCredit());
        System.out.println("Student 1 Points is: "+s1.getPointsEarned());
        System.out.println("THE GPA is: " + s1.gpa);
    }
}
