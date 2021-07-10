package Robots;

public class CleaningRobot extends Robot{

    public String typeOfCleaningFluid;

    public CleaningRobot(String idIn, int levelIn, String fluidIn){
        super(idIn,levelIn);
        typeOfCleaningFluid = fluidIn;
    }

    public String getTypeOfCleaningFluid() {
        return typeOfCleaningFluid;
    }

    @Override
    public void calculateWarningLevel() {
        System.out.println(typeOfCleaningFluid);
    }
}

