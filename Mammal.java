/**
 * InnerAnimal
 */
interface Animal 
{
    public void eat();
    public void travel();
    
}
public class Mammal implements Animal {
        public void eat()
        {
            System.out.println("Mammal eat");
        }   
        public void travel()
        {
            System.out.println("Mammal is traveling");
        }
    public static void main(String[] args) 
    {
    Mammal m = new Mammal();
    m.eat();
    m.travel();
}
}
