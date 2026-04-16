public class Methodoverloading {
    
    public int add(int n1, int n2){
        return (n1+n2);
    }
    public double add(double n1, int n2){
        return (n1+n2);
    }
    public double add(double n1, int n2, int n3){
        return (n1+n2+n3); }
    public static void main(String[]args){
     Methodoverloading obj= new Methodoverloading();
     int r1= obj.add(3,4);
     double r2= obj.add(3,4);
     System.out.println(r1);
     System.out.println(r2);
    }
}
