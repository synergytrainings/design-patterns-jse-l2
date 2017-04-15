package com.pc;

import java.lang.*;

public class WirelessNetwork {
    private String name;
    private WirelessSecurity security;

    public WirelessNetwork(String name, WirelessSecurity security) {
        this.name = name;
        this.security = security;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WirelessSecurity getSecurity() {
        return security;
    }

    public void setSecurity(WirelessSecurity security) {
        this.security = security;
    }
}
