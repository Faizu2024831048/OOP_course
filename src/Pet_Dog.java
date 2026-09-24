class Dog{
    String name;
    int age;
    String breed;
    Dog(String name,int age,String breed)
    {
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
    void bark()
    {
       System.out.println("Woof! Woof!!");
    }
    void spin()
    {
        System.out.println("Round Round");
    }
    void run()
    {
        System.out.println("Run Run");
    }
    void display(){
        System.out.println("Name:"+this.name+" Age:"+this.age);
    }

}
public class Pet_Dog {
    public static void main(String[] args)
    {
        Dog p1= new Dog("Ruku",2,"Golden Retriever");
        p1.display();
        p1.bark();
        p1.spin();
        p1.run();
    }
}
