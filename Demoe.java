public class Demoe{
public static void main(String[]args){
    int i=2;
    int j=0;
    
    int arr[]=new int[5];//{0,1,2,3,4}
    String str = null;
    try
    {
        j=18/i;
        System.out.println(arr[3]);
        System.out.println(str.length());
    }
    catch(ArithmeticException e)
    {
        System.out.println("cannot divide by zero");
    }
    catch(ArrayIndexOutOfBoundsException a)
    {
        System.out.println("Array size is wrong");
    }

    catch(Exception c){
        System.out.println("Something went wrong");
    }
    System.out.println(j);

    System.out.println("hi");
    
}
}