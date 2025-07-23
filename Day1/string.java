public class string {
    String str;
    String str1;
    String str2;
    string()
    {
    this.str = "Hello World";
    this.str1 = "Hello";
    this.str2 = "Hello W";

    }
    public static void main(String[] args) {
        string myObj = new string();
        System.out.println("String 1: " + myObj.str);
        System.out.println("String 2: " + myObj.str1);
        System.out.println("String 3: " + myObj.str2);
    }
}
