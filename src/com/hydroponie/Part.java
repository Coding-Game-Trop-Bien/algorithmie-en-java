package com.hydroponie;

public class Part {
    boolean isCultive;
    private CltrType cltrType;

    public Part() {}

    public Part(boolean isCultive, CltrType cltrType) {
        this.isCultive = isCultive;
        this.cltrType = cltrType;
    }

    public Part(String identifier){
        CltrType cltrType=CltrType.toCltrType(identifier);
        switch (cltrType){
            case C:
                this.setCltrType(CltrType.C);
                this.setCultive(false);
                break;
            case E:
                this.setCltrType(CltrType.E);
                this.setCultive(false);
                break;
            default:
                break;
        }
    }

    public boolean isCultive() {
        return isCultive;
    }

    public void setCultive(boolean cultive) {
        isCultive = cultive;
    }

    public CltrType getCltrType() {
        return cltrType;
    }

    public void setCltrType(CltrType cltrType) {
        this.cltrType = cltrType;
    }

    @Override
    public String toString() {
        return "Part{" +
                "isCultive=" + isCultive +
                ", cltrType=" + cltrType +
                '}';
    }
}
