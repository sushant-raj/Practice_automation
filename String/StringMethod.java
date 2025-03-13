package String;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JAVA";
        String s3 = "ABCD";
        String s4 = "abcde";
        byte[] b = {65, 66, 68};
        String s = new String(b);
        char ch1 =  s1.charAt(1);

        System.out.println(s);
        System.out.println(s1.length());
        System.out.println(ch1);
        System.out.println(s1 == s2);
        System.out.println(s1.compareTo(s2)); //compare the first difference between the two strings with the Unicode value
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s3.compareTo(s4));
        System.out.println(s1.equals(s2));
        System.out.println(s1.toString());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.hashCode());

    }
}
