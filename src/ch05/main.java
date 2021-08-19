package ch05;

public class main {
    public static void main(String[]args){
        Apple a1  = new Apple();
        Apple a2  = new Apple();
        a1.x=2;
        a1.y=4;
        a1.diameter=2.0f;
        a1.mass=4.9f;
        a2.x=4;
        a2.y=6;
        a1.printDetails();
        System.out.println(a1.isTouching(a2));


    }
}
