public class Getstet {
    private int age;
    private String name;
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name =name;
    }
    public void setAge(int age)
    {
        this.age= age;
    }
    public static void main(String[] args) {
        Getstet obj = new Getstet();
        obj.name = "John";
        obj.setAge(25);
        obj.setName("John Doe"); 
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());     

    }
}
