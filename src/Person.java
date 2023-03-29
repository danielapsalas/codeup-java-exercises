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

    }
}
