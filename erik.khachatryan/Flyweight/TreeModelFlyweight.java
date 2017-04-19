package com.synisys.erik.factories;

import com.synisys.erik.models.Bark;
import com.synisys.erik.models.Leaf;
import com.synisys.erik.models.TreeModel;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Erik on 4/19/2017.
 */
public class TreeModelFlyweight {
    private static Map<Leaf, Leaf> leafPool = new HashMap<>();
    private static Map<Bark, Bark> barkPool = new HashMap<>();

    public static Map<Leaf,Leaf> getLeafPool() {
        return leafPool;
    }

    public static Map<Bark,Bark> getBarkPool() {
        return barkPool;
    }

    public static Leaf getLeaf(Leaf leaf) {
        leafPool.putIfAbsent(leaf, leaf);
        return leafPool.get(leaf);
    }

    public static Bark getBark(Bark bark) {
        barkPool.putIfAbsent(bark, bark);
        return barkPool.get(bark);
    }

    public static synchronized TreeModel getTreeModel(Leaf leaf, Bark bark) {
        return new TreeModel(getLeaf(leaf), getBark(bark));
    }
}
