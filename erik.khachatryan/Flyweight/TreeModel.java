package com.synisys.erik.models;

/**
 * Created by Erik on 4/19/2017.
 */
public class TreeModel {
    private Leaf leaf;
    private Bark bark;

    public TreeModel(Leaf leaf, Bark bark) {
        this.leaf = leaf;
        this.bark = bark;
    }

    public Leaf getLeaf() {
        return leaf;
    }

    public void setLeaf(Leaf leaf) {
        this.leaf = leaf;
    }

    public Bark getBark() {
        return bark;
    }

    public void setBark(Bark bark) {
        this.bark = bark;
    }
}
