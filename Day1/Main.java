public class Main
{
    int y=10,x=10;
    void myMethod ()
    {
        System.out.println("Hello World from class Main");
    }
    void add(){
        System.out.println("the sum of x and y is: " + (x + y));
    }
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println("value of x is =" +myObj.x);
        System.out.println("value of y is = "+ myObj.y);
        myObj.add();
    }
}