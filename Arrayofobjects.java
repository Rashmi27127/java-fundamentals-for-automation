class Students{

    int rollno;
    String name;
    int marks;

}

public class Arrayofobjects {
   public static void main(String[]args){

    Students s1= new Students();
    s1.rollno= 1;
    s1.name= "Rashu";
    s1.marks= 100;

    Students s2= new Students(); //manually created objects
    s2.rollno= 2;
    s2.name= "teju";
    s2.marks= 99;

    Students s3= new Students();
    s3.rollno= 3;
    s3.name= "adi";
    s3.marks= 98;

    Students s4= new Students();
    s4.rollno= 4;
    s4.name= "nimmi";
    s4.marks= 97;

Students classmates[]= new Students[4];// array which holds student references 
classmates[0]=s1;
classmates[1]=s2;
classmates[2]=s3;
classmates[3]=s4;

for(int i=0;i<classmates.length;i++){

    System.out.println(classmates[i].name +" "+ classmates[i].marks);

}

  // int nums[]= new int[4];

  // nums[0]= 3;
   //nums[1]= 4;
   //nums[2]= 5;
   //nums[3]= 6;


   //for(int i=0;i<nums.length;i++)
   // {
    //System.out.println(nums[i]);
    //}
   }
}
