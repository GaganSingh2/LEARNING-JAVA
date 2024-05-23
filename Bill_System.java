// to demonstrater of rogram to demonstrate concet of inheritance for electricity department(unit,customer,domestic,comercial)

import java.util.Scanner;
public class Bill_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Consumer name: ");
        String name = sc.nextLine();
        System.out.println("Enter Consumer Reference no.: ");
        int ref = sc.nextInt();
        System.out.println("Enter the use of unit: ");
        double unit = sc.nextDouble();

        double rate1 = 1.0; // Rate for first 100 units
        double rate2 = 2.5; // Rate for next 100 units (101-200)
        double rate3 = 4.0; // Rate for next 300 units (201-500)
        double rate4 = 6.0; // Rate for units above 500
        
        double amount = 0;
        if (unit<=100) {
            amount = unit*rate1;
        }
        else if (unit<=200) {
            amount = 100*rate1+(unit-100)*rate2;
        }
        else if (unit<=500) {
            amount = 100 * rate1 + 100 * rate2 + (unit-200)*rate3;
        }
        else{
            amount = 100 * rate1 + 100 * rate2 + (unit-200) * rate3 + (unit-500) * rate4;
        }
        System.out.println("Consumer name: "+name);
        System.out.println("Reference id: "+ref);
        System.out.println("The total Bill of this month is "+amount);

        System.out.println();
        System.out.println("------BILL SYSTEM------");
        System.out.println();


    }
}


// //libaray managemnt 
