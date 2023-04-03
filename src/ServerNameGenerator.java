import java.util.Random;

public class ServerNameGenerator {

//    We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display
//    the generated name to the user.
//    Example Output
//
//
//    Here is your server name:
//    dedicated-photon

    public static String[] adjectives = {"jolly", "happy", "flabby", "lively", "nice", "silly", "lazy", "clumsy", "mysterious", "obnoxious" };
    public static String[] nouns = {"actor", "carpet", "card", "dad", "coat", "fish", "history", "film", "group", "hand"};

    public static void main(String[] args){
        System.out.println("This is the random server you generated: " + randomServerName(adjectives) + "-" + randomServerName(nouns));
    }

    public static String randomServerName(String[] names){
        Random random = new Random();
        int randomNams = random.nextInt(names.length);
        return names[randomNams];
    }
}
