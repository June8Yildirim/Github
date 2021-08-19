package Animals;

public class WorkingDog extends Dog implements Worker{
    private int hoursOfTraining;
    public WorkingDog(String name, String species, int hours){
        super(name,species);
        hoursOfTraining =hours;
    }
    public void setHoursOfTraining(int hours){
        this.hoursOfTraining= hours;
    }

    public int getHoursOfTraining() {
        return hoursOfTraining;
    }
    public void work(){
        speak();
        System.out.println("I'm "+getSpecies()+" who works");
        System.out.println("I have "+ hoursOfTraining+" hours of professional training");
    }

}
