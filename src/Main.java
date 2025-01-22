
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("What is ur fav num?");
        //String name = scanner.nextLine();
       int number = 0;

        try{
             number = scanner.nextInt();


        }catch(Exception e){
            System.out.print(number + " is not a num");
            System.exit(0);
        }

        System.out.print("Cool! I like that fav num is  " + number);



     } // end constructor

} // end Main


