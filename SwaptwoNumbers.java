public class SwaptwoNumbers {
    public static void main (String[]args){
        int a=10;
        int b=20;
        System.out.println("Before swapping the numbers a and b are" +a+ " " +b);

        int c = a;//c=10,a=10,b=20
        a = b;//a=20
        b = c;//b=10
        System.out.println("After swapping the numbers a and b are " +a+ " " +b);
    }
}
