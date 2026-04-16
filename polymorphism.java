class A{

public void show(){
    System.out.println(" print a");

}
}

class B extends A{

   public void show(){
    System.out.println("print b");
   }
}
   
class C extends A{

    public void show(){
     System.out.println("print c");
    }
     
 }
    

public class polymorphism {
    public static void main(String[]args){
A obj= new A();
 obj.show();

obj= new B();
 obj.show();

 obj= new C();
 obj.show();

    }
}
