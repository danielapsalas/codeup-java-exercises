package util;

import com.sun.source.util.SourcePositions;

import javax.swing.*;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        String stringInput = scanner.nextLine();
        return stringInput;
    }

    public boolean yesNo(){
        String booleanInput = scanner.nextLine();
        if(booleanInput.toLowerCase().contains("yes")){
            return true;
        } else{
            return false;
        }

    }

    public int getInt2(){
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max){
        int userNum;
        do{
            System.out.printf("Please enter a number between %d and %d", min, max);
            userNum = this.scanner.nextInt();
        }while(userNum > max || userNum < min);
        return userNum;
    }

    public int getInt(){
        try {
            System.out.printf("Enter a number: \n");
            String userText = this.scanner.nextLine();
            System.out.printf("You entered %s\n", userText);

            return Integer.valueOf(userText);
            } catch (NumberFormatException e) {
                System.out.println("2This went wrong: \n");
                e.printStackTrace();
                return getInt();
            }
    }

    public double getDouble2(){
        return this.scanner.nextDouble();
    }

    double getDouble(double min, double max){
        double userDouble;
        do{
            System.out.printf("Enter a decimal number from %f and %f", min, max);
            userDouble = this.scanner.nextDouble();
        }while(userDouble > max || userDouble < min);
        return userDouble;
    }

    public double getDouble(){
        try {
            System.out.printf("Enter a number: \n");
            String userText = scanner.nextLine();
            System.out.printf("You entered %s\n", userText);
            return Double.valueOf(userText);
        } catch (NumberFormatException e) {
                System.out.println("This went wrong: \n");
                e.printStackTrace();
            return getDouble();
        }
    }

}
