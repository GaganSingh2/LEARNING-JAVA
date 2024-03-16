class Sum{
    public int Sum(int x, int y)
    {
        return (x+y);
    }
    public int Sum(int x,int y, int z)
    {
        return (x+y+z);
    }
    public double Sum(double x, double y)
    {
        return(x+y);
    }
}
public class Method_overloading {
    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println(s.Sum(10, 20));
        System.out.println(s.Sum(20, 10,30));
        System.out.println(s.Sum(10.5, 20.5));
    }
}
