package com.company;

public class Student {
    String id;
    int credit;
    int pointsEarned;
    double gpa;

    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }
    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }


    public void calculateGPA(){
        gpa = pointsEarned/(double)credit;
    }

    void displayValues(){
        System.out.println("Student 1 ID: " + getId());
        System.out.println("Student 1 Credits : " + getCredit());
        System.out.println("Student 1 Points: "+getPointsEarned());
        System.out.println("THE GPA IS: " + gpa);
    }

}
