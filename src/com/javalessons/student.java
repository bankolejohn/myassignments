package com.javalessons;

public class student {
    int test1;
    int test2;
    int exam;

    double avg;

    double avg() {
        return (test1 + test2 + exam) / 3;

    }
}

class studentGrade {
    public static void main(String args []) {

        // instances of the class - five students
        student Tope = new student();
        student Femi = new student();
        student Mayor = new student();
        student Bayo = new student();
        student Kemi = new student();

        double Average;

// assigned scores to each student
        Tope.test1 = 50;
        Tope.test2 = 40;
        Tope.exam = 60;

        Femi.test1 = 40;
        Femi.test2 = 60;
        Femi.exam = 60;

        Mayor.test1 = 70;
        Mayor.test2 = 90;
        Mayor.exam = 90;

        Bayo.test1 = 60;
        Bayo.test2 = 70;
        Bayo.exam = 50;

        Kemi.test1 = 40;
        Kemi.test2 = 45;
        Kemi.exam = 52;


        Average = Tope.avg();
        System.out.println("Tope's average score is " + Average);

        Average = Femi.avg();
        System.out.println("Femi's cumulative score is " + Average);

        Average = Mayor.avg();
        System.out.println("Mayor's cumulative score is " + Average);

        Average = Bayo.avg();
        System.out.println("Bayo's cumulative score is " + Average);

        Average = Kemi.avg();
        System.out.println("Kemi's cumulative score is " + Average);

        System.out.println("they all tried");

        // attempt to get the positions
        if(Mayor.avg() > Femi.avg()){
            if(Mayor.avg() > Tope.avg())
                System.out.println("First Position is Mayor");



        }




    }
}
