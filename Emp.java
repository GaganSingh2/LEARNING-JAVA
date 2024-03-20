



public class Emp {
    int wt=8;
}
class Clerk extends Emp
{
    int wt=10;
    void disp()
    {
        System.out.println(super.wt);
    }
    public static void main(String[] args) {
        Clerk c =new Clerk();
        c.disp();
    }
}
