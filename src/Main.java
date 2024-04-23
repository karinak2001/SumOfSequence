import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 70;
        int i = 10;

        //כתוב תרשים זרימה שמדפיס את סכום הסדרה באה :
        //70+…………+10+13+16+19

        while(i < number){
            sum = sum + i;
            System.out.print(i + " + ");
            i+=3;

        }
        sum = sum + 70;
        System.out.print("70 = " + sum);



    }
}