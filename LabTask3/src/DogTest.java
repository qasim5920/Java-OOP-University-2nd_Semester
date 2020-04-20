public class DogTest {
public static void main(String [] args){
    Dog obj1= new Dog();
    System.out.println("name="+obj1.name);
    System.out.println("breed="+obj1.breed);
    obj1.speak();
    obj1.eat();
    obj1.sleep();
}
}
