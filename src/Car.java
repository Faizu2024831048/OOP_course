public class Car {
    static int count = 0;
    String name;
    String model;

   public Car(String name, String model) {
        this.name =name;
        this.model =model;
        count++;
        System.out.println("You have created a car of model: " + model);
    }

    public static void main(String[] args)
    {
        Car c1=new Car("mycar","model1");
        Car c2=new Car("yourcar", "model2");
        System.out.print("Total number of cars in the showroom is:"+count);

    }
}