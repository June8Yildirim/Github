package Animals;

import Vehicle2.Vehicle2;

public class AnimalDescription {
    public static void main(String[]args){
//        Dog dog = new Dog("Murphy");
//        Animals cow = new Cow("Elsie");
        WorkingDog workingDog = new WorkingDog("Murphy","The German shepherd ",50);
        System.out.println(workingDog.getName()+" says ");
        workingDog.work();

//        System.out.print(dog.getName() + " says ");
//        dog.speak();
//        System.out.print(cow.getName() + " says ");
//        cow.speak();


    }
}
