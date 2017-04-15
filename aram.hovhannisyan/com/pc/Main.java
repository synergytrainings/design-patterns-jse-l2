package com.pc;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        WirelessAdapter adapter = WirelessAdapter.getInstance();

        List<WirelessNetwork> networks = adapter.scanNetworks();

        if (networks.size() > 0) {
            WirelessNetwork network = networks.get(1);

            boolean result = adapter.connect(network, "bananchik123");

            if (result) {
                System.out.printf("Successfully connected to network %s!", network.getName());
            } else {
                System.out.printf("Can't connect to network %s :(", network.getName());
            }
        } else {
            System.out.println("Oops, there are no networks available :/");
        }
    }
}
