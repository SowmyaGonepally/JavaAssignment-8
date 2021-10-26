import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();
        try
        {
            throwExceptions(age);
            throw new NullPointerException(); //to verify finally clause is executed
        }
        catch (InvalidAgeException | TooYoungException | TooOldException exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            System.out.println("Finally exception is caught!");
        }

    }
    public static void throwExceptions(int age) throws InvalidAgeException, TooOldException, TooYoungException {
        if(age<0)
        {
            throw new InvalidAgeException("Invalid age entered!");
        }
        else if(age<18 && age>0)
        {
            throw new TooYoungException("You're too young!");
        }
        else
        {
            throw new TooOldException("You're too old!");
        }
    }
}
