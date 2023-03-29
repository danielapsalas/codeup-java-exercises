public class Person {
    private String name;

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
//
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        //error: constructor Person in class Person cannot be applied
//        // to given types;

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        //error: constructor Person in class Person cannot be applied
//        // to given types;

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        //error: constructor Person in class Person cannot be applied
//        // to given types;

    }
}
