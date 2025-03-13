package StringBuffer;

public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(8);
         sb= sb.append("abcdefghi");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.capacity());

    }
}
