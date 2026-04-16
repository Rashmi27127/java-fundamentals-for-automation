class Human{
    private int age;
    private String name;

    public Human(){

        this. age = 12;
        this. name= "Rashu";

        System.out.println("constructor");
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

public class constructor{
    public static void main(String[] args){

        Human obj = new Human();
        //obj.setage(12);
        //obj.setname("Rashu");

        System.out.println(obj.getname() + " = " + obj.getage());
    }
}