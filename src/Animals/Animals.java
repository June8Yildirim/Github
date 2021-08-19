package Animals;

public abstract class Animals {
    private String name;
    private String species;

    public Animals(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();

    public String getName() {
        return name;
    }
}
