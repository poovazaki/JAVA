import java.util.Scanner;

public class FizzBuzzWierd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("FizzBuzz");
        }
        else if(n%5==0){
            System.out.println("Fizz");
        }
        else if(n%3==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("Wierd");
        }
        sc.close();
        }
    }

