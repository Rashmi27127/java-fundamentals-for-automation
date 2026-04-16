 class Human{
     private int age;
      private String name;

    public  int getage(){

       return age;
    }

    public void setage(int a){
age = a;
    }
 public void setname(String n){
    name=n;
 }

    public String getname(){
         return name;
    }
}

public class Encapsulation{
    public static void main(String[]args)
    {
      Human obj= new Human();
      obj.setage(12);
    obj.setname("Rashu");

    System.out.println(obj.getname()+ " = " +obj.getage());
    }
}