public class Bufferstring {
    public static void main (String [] args){

        //String name = "navin";
        StringBuffer sb =new StringBuffer("rashu");
        sb.append("jain");
        sb.deleteCharAt(2);
        sb.insert(4,"teju");
        sb.substring(2,3);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
    }
}
