package com.synisys.trainings;

import com.synisys.trainings.informationHolder.AbstractInformationHolder;
import com.synisys.trainings.informationHolder.HistoryInformationHolder;
import com.synisys.trainings.informationHolder.InformationHolder;
import com.synisys.trainings.informationHolder.UserInformationHolder;

/**
 * Created by Astghik since 4/16/2017.
 */
public class demo {

    public static void main(String[] args) {

        UserInformationHolder.register();
        HistoryInformationHolder.register();

        InformationHolder holder;

        holder = AbstractInformationHolder.getInstance(InformationHolderType.HISTORY_INFORMATION);
        holder.getInstanceTypeInfo();

        holder = AbstractInformationHolder.getInstance(InformationHolderType.USER_INFORMATION);
        holder.getInstanceTypeInfo();

        holder = AbstractInformationHolder.getDefaultInstance();
        holder.getInstanceTypeInfo();

    }
}
