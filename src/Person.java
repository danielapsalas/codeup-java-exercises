public class Person {

//    Object basics
//
//    Create Person class inside of src that has a private name field that is a string, and the following methods:
//
//
//    public String getName(){
//      //TODO: return the person's name
//    }
//
//    public void setName(String name){
//      //TODO: change the name field to the passed value
//    }
//    public void sayHello(){
//      //TODO: print a message to the console using the person's name
//    }
//
//    The class should have a constructor that accepts a `String` value and sets
//    the person's name to the passed string.
//
//    Create a `main` method on the class that creates a new `Person` object and
//    tests the above methods.
    private String name;

    public Person (){}

    public Person(String name){
        this.name = name;
    }
    public String getName() {
        //TODO: print a message to the console using the person's name
        return name;
    }

    public void setName(String name) {
    //TODO: change the name field to the passed value
        this.name = name;
    }
    public String sayHello() {
    //TODO: print a message to the console using the person's name
    return String.format("Your name is: %s", name);
    }

    public static void main(String[] args) {
        Person user1 = new Person();

        user1.setName("Dani");
        System.out.println(user1.getName());
        System.out.println(user1.sayHello());

        System.out.println("~~~~~~~~~~~");

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false
//
//        System.out.println("~~~~~~~~~~~");
//        Person person3 = new Person("John");
//        Person person4 = person1;
//        System.out.println(person3 == person4);//false
//
//        System.out.println("~~~~~~~~~~~");
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());//john
//        System.out.println(person2.getName());//john
//        person2.setName("Jane");
//        System.out.println(person1.getName());//jane
//        System.out.println(person2.getName());//jane


    }
}
