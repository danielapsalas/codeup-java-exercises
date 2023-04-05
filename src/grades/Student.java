package grades;

import java.util.ArrayList;

public class Student {//Create a class named Student
    private String studentName;//It should have private properties for the student's name, and grades
    private ArrayList<Integer> grades; //The grades property should be an ArrayList of integers.

    int numberOfStudents;

    public Student(String oneStudentName) { //The student class should have a constructor
        this.studentName = oneStudentName;// that sets name property
        this.grades = new ArrayList<>();//and initializes the grades property as an empty ArrayList
        numberOfStudents++;
   }

    //The Student class should have the following methods:
    public String getName() {
        return studentName; // returns the student's name
    }

    public void addGrade(int grade) {
        this.grades.add(grade); // adds the given grade to the grades property
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for(int grades : this.grades){
            total += grades;
        }
        return (total / this.grades.size()) ;
    }

}
