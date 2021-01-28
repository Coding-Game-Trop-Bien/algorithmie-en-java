package com.hydroponie;

public enum CltrType {

    C( "."),
    E( "X");

    public String identifier;

    private CltrType(String identifier) {
        this.identifier=identifier;
    }

    public static CltrType toCltrType(String identifier){
        CltrType cltrType=null;

        if (CltrType.C.identifier.equals(identifier)){
            cltrType=CltrType.C;
        }

        if (CltrType.E.identifier.equals(identifier)){
            cltrType=CltrType.E;
        }

        return cltrType;
    }
}
