public class MethodsExercises {
    public static double adding(double num1, double num2){
        return num1 + num2;
    }

    public static double subtracting(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplying(double num1, double num2){
        return num1 * num2;
    }

    public static double dividing(double num1, double num2){
        return num1 / num2;
    }

    public static double modulus(double num1, double num2){
        return num1 % num2;
    }

    public static void main(String[] args){
        System.out.println("addition: " + adding(10, 1));
        System.out.println("subtraction: " + subtracting(10, 1));
        System.out.println("multiplying: " + multiplying(10, 1));
        System.out.println("dividing: " + dividing(10, 1));
        System.out.println("modulus: " + modulus(10, 1));
    }




}
