import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        //        int[] numbers = {1, 2, 3, 4, 5};
        //        System.out.println(numbers); //gives you the memory space
        Person daniela = new Person("dani");
        Person ayden = new Person("ayden");
         Person fernando = new Person ("nando");

        Person[] threePeople = {daniela, ayden, fernando};
        for (Person onePerson: threePeople) {
            System.out.println(onePerson.getName());
        }


    }
//    public static Person[] addPerson(Person[] human, Person newHuman){
//        human = Arrays.copyOf(human, human.length + 1);
//        human[human.length - 1] = newHuman;
//        return human;
//    }

}
