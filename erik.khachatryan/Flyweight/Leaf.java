package com.synisys.erik.models;

/**
 * Created by Erik on 4/19/2017.
 */
//terev
public class Leaf {
    private int length;
    private int height;
    private String leafShape;

    public Leaf(int length, int height, String leafShape) {
        this.length = length;
        this.height = height;
        this.leafShape = leafShape;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || !o.getClass().equals(this.getClass())) {
            return false;
        }
        Leaf leaf = (Leaf) o;
        return this.leafShape.equals(leaf.leafShape) && this.length == leaf.length && this.height == leaf.height;
    }
    @Override
    public int hashCode() {
        return length*height*leafShape.hashCode();
    }
    @Override
    public String toString() {
        return "{length: " + this.length + ", height: " + this.height + ",leaf shape: " + this.leafShape + "}";
    }
}
