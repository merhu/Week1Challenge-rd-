import java.util.Scanner;
import java.util.Random;
public class Week1Challng2 {
    public static void main(String[] args) {

        int num, num1, num2;
        //Generate a random number between 1 and 250 (you can make this range larger if you'd like)
            Random rand = new Random();
            Scanner sc = new Scanner(System.in);
            int a;
            for (int o = 0; o < 10; o++) {
                a = rand.nextInt(250) + 1;
            System.out.print("Generating a random Number..... " );

                    System.out.println(a);
                    num = sc.nextInt();                 //for user to input
                    num1 = 1;
                    num2 = 0;
                    while (num1 <= num) {
                        if ((num % num1) == 0)
                            num2 = num2 + 1;
                        num2++;
                    }
                    if (num2 == 2)

                        System.out.println(a + " is a prime number");
                    else
                        System.out.println(a + " is not a prime number");
                    //ask the user to input more now// after this

                }
                }
            }


