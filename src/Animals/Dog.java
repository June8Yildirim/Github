package Animals;

public class Dog extends Animals{
    public Dog(String name, String species){
        super(name, species);
    }

    @Override
    public void speak(){
        System.out.println("Woof!");
    }
}
