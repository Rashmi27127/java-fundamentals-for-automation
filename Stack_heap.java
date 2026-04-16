public class Stack_heap {

    int num = 5;

    public int add(int n1, int n2){
        return (n1 + n2);
    }

    public static void main(String[] args){

        Stack_heap obj = new Stack_heap();
        Stack_heap obj1 = new Stack_heap();

        int r1 = obj.add(4,5);

        obj1.num = 8;

        System.out.println(r1);
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}