public class vehicle {
    protected String brand;
    public vehicle(String brand) {
        this.brand = brand;
    }
    public void showDetails()
    {
        System.out.println("Brand: " + brand);

    }
    class car extends vehicle {
        public car(String brand) {
            super(brand);
        }
        public void showDetails() {
            System.out.println("Car Brand: " + brand);
        }
    }
     public static void main(String[] args) {
            vehicle myVehicle = new vehicle("Generic Vehicle");
            myVehicle.showDetails();
            myVehicle.showDetails();
        }
}
