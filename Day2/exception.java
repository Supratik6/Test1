public class exception {
    public static void main(String[]args)
    {
        int a[]= new int[5];
        System.out.println("Hello World");
        try{
        System.out.println(a[8]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("there is an array index exception" );

        }catch(Exception e){
            System.out.println("there is an exception");
        }
    }
}