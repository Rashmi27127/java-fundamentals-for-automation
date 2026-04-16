
class A 
{

    public A()
    { 
        super();
        System.out.println("prints A");

    }

    public A(int n)
    {
        super();
        System.out.println("prints parameterized A");
    }
   
}
class B extends A{
    public B()
    {
        super();
    System.out.println("Prints B");
    }
        
    public B(int n)
    {
        this();
    System.out.println("Print parameterized B");
    }
}
public class SuperThis {
    public static void main(String []args){
    B obj= new B(5);

    }
}
