package com.synisys.trainings.informationHolder;

import com.synisys.trainings.InformationHolderType;
import com.synisys.trainings.simpleDataHolder.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Astghik since 4/16/2017.
 */
public class UserInformationHolder extends AbstractInformationHolder<User> {

    private UserInformationHolder() {
        this.informationHolderType = InformationHolderType.USER_INFORMATION;
        this.infoList = new ArrayList<>();
    }

    public static void register() {
        AbstractInformationHolder.addInformationHolder(InformationHolderType.USER_INFORMATION, new UserInformationHolder());
    }

    private List<User> getActiveUsers() {
        Map<Boolean, List<User>> partitionedData = this.infoList.stream().collect(Collectors.partitioningBy(User::getLoggedIn));
        return partitionedData.get(true);
    }

}


