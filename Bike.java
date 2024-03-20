//this program can be used to final keyword final keyword can be use to assign the value permanentely does not change the value of assign the final keyword variable
public class Bike {
    final int speedlimit  = 90;
    void run(){
        int speedlimit = 400;
    }
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
