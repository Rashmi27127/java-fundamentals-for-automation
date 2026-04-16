// class a{
//     public void show()
//     {
// System.out.println("Hi show");
//     }

//     public void show1()
//     {
//         System.out.println("Hi show1");
//     }
// }

//  class b extends a{
// public void show()
// {
//     System.out.println("Hi show2");
// }
//     }



// public class MethosOveriding {
//     public static void main(String[]args){
//         b obj =new b();
        
//         obj.show();
//         obj.show1();
       

//     }
// }

class operation{

    public int  Sub(int a, int b){
       return(a-b);
    }
    
}
class b extends operation{
    public int Sub(int a, int b){
        return(a-b-1);
    }
    
}

public class MethosOveriding{
    public static void main(String[]args){

        b obj= new b();
        int r1= obj.Sub(4, 2);
        System.out.println(r1);

    }
}