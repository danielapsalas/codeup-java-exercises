package util;

import com.sun.source.util.SourcePositions;

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

    int getInt(){
        return this.scanner.nextInt();
    }

    int getInt(int min, int max){
        int userNum;
        do{
            System.out.printf("Please enter a number between %d and %d", min, max);
            userNum = this.scanner.nextInt();
        }while(userNum > max || userNum < min);
        return userNum;
    }

    public double getDouble(){
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

}
