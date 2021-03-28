package com.company;

public class Student {
    String id= "9999";
    private int credit = 3;
    private int pointsEarned = 12;
    double gpa;

    public String getId(){
        return id;
    }

    public int getCredit() {
        return credit;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public double calculateGPA(double gpa){
        gpa = pointsEarned/(double)credit;
        return gpa;
    }



}
