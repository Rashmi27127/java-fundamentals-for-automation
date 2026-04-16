interface A{

    int age =10; // final and static variables by default 
    String name ="rashu";

public void Rashu();
public void Teju();

 //void Rashu();public abstract
//void Teju();

}

class B implements A{

    public void Rashu(){
        System.out.println("iam rashu");
    }

    public void Teju() {
        System.out.println("iam teju"); 
        
    }
    }



public class Interface {
    public static void main(String[] args) {
        
        A obj= new B();
        obj.Rashu();
        obj.Teju();

        System.out.println("A.name");// in static variable we need not use object we can directly use interface 

        //A. age= 13;
    }
}
