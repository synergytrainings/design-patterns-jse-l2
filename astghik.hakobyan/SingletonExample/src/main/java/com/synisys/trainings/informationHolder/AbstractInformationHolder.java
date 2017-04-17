package com.synisys.trainings.informationHolder;

import com.synisys.trainings.InformationHolderType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Astghik since 4/16/2017.
 */
public class AbstractInformationHolder<T> implements InformationHolder<T> {

    private static volatile AbstractInformationHolder instance;
    private static Map<InformationHolderType, AbstractInformationHolder> registry = new HashMap<>();
    private static final Object LOCK = new Object();

    protected InformationHolderType informationHolderType;
    protected List<T> infoList;

    private static AbstractInformationHolder performLookup(InformationHolderType type) {
        return registry.get(type);
    }

    public static void addInformationHolder(InformationHolderType informationHolderType, AbstractInformationHolder informationHolder) {
        registry.put(informationHolderType, informationHolder);
    }

    public static synchronized InformationHolder getInstance(InformationHolderType type) {
        if (instance == null || instance.informationHolderType != type) {
            instance = performLookup(type);
        }
        return instance;
    }

    //double check example with volatile instance
    public static InformationHolder getDefaultInstance() {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new AbstractInformationHolder();
                }
                return instance;
            }
        }
        return instance;
    }

    public void getInstanceTypeInfo() {
        System.out.println(instance.informationHolderType);
    }

}
