package com.company;

public class ShowStudent {


    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("Student 1 ID: " + s1.getId());
        System.out.println("Student 1 Credits : " + s1.getCredit());
        System.out.println("Student 1 Points: "+s1.getPointsEarned());
        System.out.println("THE GPA IS: " + s1.gpa);
    }
}
