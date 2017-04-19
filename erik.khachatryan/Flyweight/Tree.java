package com.synisys.erik.models;

import com.synisys.erik.factories.TreeModelFlyweight;

/**
 * Created by Erik on 4/19/2017.
 */
public class Tree {
    private TreeModel treeModel;
    private String treeType;
    private int height;
    private int age;
    private int rootDepth;

    public Tree(String treeType, int height, int age, int rootDepth, Leaf leaf, Bark bark) {
        this.treeType = treeType;
        this.height = height;
        this.age = age;
        this.rootDepth = rootDepth;
        this.treeModel = TreeModelFlyweight.getTreeModel(leaf, bark);
    }

    public Leaf getLeaf() {
        return treeModel.getLeaf();
    }

    public void setLeaf(Leaf leaf) {
        this.treeModel.setLeaf(leaf);
    }

    public Bark getBark() {
        return treeModel.getBark();
    }

    public String getTreeType() {
        return treeType;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRootDepth() {
        return rootDepth;
    }

    public void setRootDepth(int rootDepth) {
        this.rootDepth = rootDepth;
    }
}
