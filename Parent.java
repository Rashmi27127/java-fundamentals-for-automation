

public class Parent {

  public static void main(String[]arge)  {

VeryAdvCalc obj= new VeryAdvCalc();
int r1 = obj.add(1,3);

int r2 = obj.sub(2,6);
int r3 =obj.multi(2,2);
int r4 = obj.div(4,2);
double r5= obj.power(3,2);


System.out.println(r1 + " " +r2 +" "+ r3 +" " +r4 + " "+r5);
  }
}
