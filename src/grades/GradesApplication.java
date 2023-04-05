package grades;

import util.Input;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication { //Create a class named GradesApplication
    public static void main(String[] args) {//inside the main method, create a HashMap named students
        HashMap < String, Student> students = new HashMap<>(); //it should have keys that are strings that represent github usernames, and values that are Student objects.

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
        milo.addGrade(85);

        Student poky = new Student("poky");
        poky.addGrade(17);
        poky.addGrade(30);

        students.put("danielapsalas", daniela);
        students.put("aydentoro", ayden);
        students.put("milothePug", milo);
        students.put("pokyIsAlsoAPug", poky);
//        System.out.println(students);

        commandLine(students);
    }

    public static void commandLine(HashMap < String, Student> students) {
        Input input = new Input();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hey User!" +
                "\nThese are the Github username!");

        for(String username: students.keySet()){//Print the list of GitHub usernames out to the console
            System.out.println(username);
        }

        boolean confirm;
        do {
            System.out.println("which students info do you want?");//ask the user which student they would like to see more information abou
            String userInput = input.getString();//enter a GitHub username (i.e. one of the keys in your map).

            if(students.containsKey(userInput)){//the given username does exist, display information about that student, including their name and their grades.
                System.out.println("student name: " + students.get(userInput).getName() +  "\nstudent grade average: "+ students.get(userInput).getGradeAverage());
            }else{
                System.out.println("Username Invalid...Try again!");//e given input does not match up with a key in your map, tell the user that no users with that username were found.
            }

            System.out.println("Would you like to continue? Enter yes or no.");
            confirm = sc.nextLine().equalsIgnoreCase("Yes");
        }while (confirm);//After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.
    }

}
