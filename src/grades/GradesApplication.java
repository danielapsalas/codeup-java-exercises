package grades;

import java.util.HashMap;

public class GradesApplication { //Create a class named GradesApplication
    public static void main(String[] args) {//inside the main method, create a HashMap named students
        HashMap <Student, String> students = new HashMap<>(); //it should have keys that are strings that represent github usernames, and values that are Student objects.

        Student daniela = new Student("daniela");//Create at least 4 Student
        daniela.addGrade(96); //objects with at least 3 grades each, and add them to the map.
        daniela.addGrade(30);
        daniela.addGrade(70);

        Student ayden = new Student("ayden");
        ayden.addGrade(90);
        ayden.addGrade(88);
        ayden.addGrade(60);

        Student milo = new Student("milo");
        milo.addGrade(50);

        Student poky = new Student("poky");
        poky.addGrade(1);

        students.put(daniela, "danielpsalas");
        students.put(ayden, "aydentoro");
        students.put(milo, "milothePug");
        students.put(poky, "pokyIsAlsoAPug");



    }
}
