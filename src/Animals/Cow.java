package Animals;

public class Cow extends Animals {
    public Cow(String name, String species){
        super(name, species);
    }

    @Override
    public void speak(){
        System.out.println("Moo!");
    }
}
