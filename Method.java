public class Method{

public void playmusic(){

    System.out.println("Music Playing");
}

public String getmeapen( int cost){
    if(cost>=10)
    
    return "Pen";
     else
        return "Noting";
}
 public static void main(String[]args){

 Method obj = new Method();
 obj.playmusic();
 String str = obj.getmeapen(2);
 System.out.println(str);

 }
}