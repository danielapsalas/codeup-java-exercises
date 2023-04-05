package grades;

public class StudentTest {

    public static void main(String[] args) {
//        Test your Student class by creating a StudentTest class, adding a main method and creating Student objects.
//        Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the
//        average of the student's grades.  = working fine
        Student daniela = new Student("daniela");
        Student ayden = new Student("ayden");
        Student milo = new Student("milo");
        daniela.addGrade(96);
        ayden.addGrade(90);
        milo.addGrade(50);
        System.out.println("student constructor : " + daniela.getName());
    }
}
