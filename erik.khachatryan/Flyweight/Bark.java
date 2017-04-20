package com.synisys.erik.models;

/**
 * Created by Erik on 4/19/2017.
 */
//keghev
public class Bark {
    String barkType;

    public Bark(String barkType) {
        this.barkType = barkType;
    }

    public String getBarkType() {
        return barkType;
    }

    public void setBarkType(String barkType) {
        this.barkType = barkType;
    }

    @Override
    public boolean equals(Object o) {
        return this.barkType.equals(((Bark)o).getBarkType());
    }

    @Override
    public int hashCode() {
        return barkType.hashCode();
    }
    @Override
    public String toString() {
        return "{bark type: " + this.barkType + "}";
    }
}
