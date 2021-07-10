package Robots;

public abstract class Robot {

    private String id;
    private int securityLevel;
    private int warningLevel;

    public Robot(String id, int securityLevel) {
        this.id = id;
        this.securityLevel = securityLevel;
    }

    public String getId() {
        return id;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public abstract void calculateWarningLevel();
}
