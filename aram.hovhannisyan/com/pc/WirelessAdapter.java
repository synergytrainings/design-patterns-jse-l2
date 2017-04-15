package com.pc;

import java.lang.*;
import java.util.*;

public class WirelessAdapter {
    private static WirelessAdapter instance = null;

    public static WirelessAdapter getInstance() {
        if (instance != null) {
            return instance;
        }

        return instance = new WirelessAdapter();
    }

    private WirelessAdapter() {

    }

    public List<WirelessNetwork> scanNetworks() {
        // *MAGIC*
        return new ArrayList<WirelessNetwork>() {{
            add(new WirelessNetwork("banan1", WirelessSecurity.WEP));
            add(new WirelessNetwork("banan2", WirelessSecurity.WPA_PSK));
            add(new WirelessNetwork("banan3", WirelessSecurity.WPA2_PSK));
        }};
    }

    public boolean connect(WirelessNetwork network, String password) {
        // again *MAGIC*!
        return true;
    }
}
