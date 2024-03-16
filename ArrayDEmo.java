// Create a Array with the help of user input and then print the value
import java.util.Scanner;

public class ArrayDEmo {
    public static void main(String[] args) {
        int[] arr = new  int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        for(int i=0; i<=9; i++)
        {
            //Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        System.out.println("after given the number: ");
        for(int i=0; i<=9; i++)
        {
            System.out.println(arr[i]+ " ");
        }
    }
}
