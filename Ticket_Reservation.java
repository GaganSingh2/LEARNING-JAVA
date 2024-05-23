// //ticket reservation system

import java.net.Socket;
import java.util.Scanner;
public class Bill_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Boarding Station: ");
        String Beg_Station = sc.nextLine();
        System.out.println("ENter your Destinamtion Station: ");
        String Des_Station = sc.nextLine();
        if (Beg_Station.equals("Siwan") && Des_Station.equals("New Delhi")) {
            
            System.out.println("----Availabels Train Lists and Train number----");
            System.out.println("Bihar Sampark kranti Express -> 12565");
            System.out.println("Vaishali Express -> 12553");
            System.out.println("Amrapali Express -> 15707");
            System.out.println("Avadh Assam Express -> 15909");
            System.out.println("Lichchhavi Express -> 14005");
        }
        else{
            System.out.println("Trains are not availbale in this routes");
        }

        System.out.println("ENter train number to check seat ");
    }
}