class Human{
    private int age;
    private String name;

    public Human(){

        this. age = 12;
        this. name= "Rashu";
        System.out.println("Default");
    }
    public Human(int age, String name){
         this.age =age;
         this.name=name;
        System.out.println("parameteriezed");
        }

    public int getage(){
        return age;
    }

    public void setage(int age){
        this.age = age;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }
}

public class Defparacon{
    public static void main(String[] args){

        Human obj = new Human();
        //obj.setage(12);
        //obj.setname("Rashu");

        System.out.println(obj.getname() + " = " + obj.getage());

        Human obj1= new Human(15, "Teju");
        System.out.println(obj1.getname() + " = " + obj1.getage());
    }
}