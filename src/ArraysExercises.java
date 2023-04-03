//import java.util.Arrays;
//public class ArraysExercises {
//
//    String personName;
//    static int personCount = 0;
//    public void Person(String personName){
//        this.personName = personName; //Assign a unique String to this property
//        personCount++; //Count up this 'universal' / static property
//    }
//    public static void main(String[] args) {
//        Person ayden = new Person("Ayden");
//        Person nohemi = new Person("Nohemi");
//        Person daniela = new Person("Daniela");
//        Person fernando = new Person("Fernando");
//        Person[] family = {ayden, nohemi, daniela, fernando}; //[0 = gene,1 = jenna, 2 = daniela,3 = gianna]
//        System.out.println(Arrays.toString(family));
//        Person[] newMember = addPerson(family, new Person("Luis"));
//        for (Person person : newMember) {
//            System.out.printf("%s is my name %n", person.personName);
//        }
//    }
//
//
//    public static Person[] addPerson(Person[] incomingPersonArray, Person newPersonToAdd){
//        Person[] newPersonArray = Arrays.copyOf(incomingPersonArray, incomingPersonArray.length+1);
//        newPersonArray[incomingPersonArray.length] = newPersonToAdd;
//        return newPersonArray;
//    }
//
//}
