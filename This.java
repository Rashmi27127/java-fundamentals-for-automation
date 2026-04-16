class Human{
    private int age;
    private String name;

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

public class This{
    public static void main(String[] args){

        Human obj = new Human();
        obj.setage(12);
        obj.setname("Rashu");

        System.out.println(obj.getname() + " = " + obj.getage());
    }
}