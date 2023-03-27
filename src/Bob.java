import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
    Scanner userQuery = new Scanner(System.in);
    boolean user = true;
        while(user){
            System.out.println("\nSay Something to Bob, The teenager.");
            String query = userQuery.nextLine();
            if(query.endsWith("!")){
                System.out.println("WhOa, ChIlL oUt!");
            } else if(query.endsWith("?")) {
                System.out.println("Sure.");
            } else if (query == "") {
                System.out.println("Fine. Be that way.");
            } else {
                System.out.println("Whatever.");
            }
        }
    }
}
