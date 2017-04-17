package com.synisys.trainings.informationHolder;

import com.synisys.trainings.InformationHolderType;
import com.synisys.trainings.simpleDataHolder.Action;

import java.util.ArrayList;

/**
 * Created by Astghik since 4/16/2017.
 */
public class HistoryInformationHolder extends AbstractInformationHolder<Action> {

    private HistoryInformationHolder() {
        this.informationHolderType = InformationHolderType.HISTORY_INFORMATION;
        this.infoList = new ArrayList<>();
    }

    public static void register() {
        AbstractInformationHolder.addInformationHolder(InformationHolderType.HISTORY_INFORMATION, new HistoryInformationHolder());
    }
}
