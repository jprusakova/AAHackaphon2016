package com.aa.team11.mockServices;

import com.aa.team11.dtos.LocationInfo;

/**
 * Created by jordanculver on 4/15/16.
 */
public class LocationMockService {

    public static LocationInfo createLocation(String wirelessNetworkId) {
        return new LocationInfo();
    }
}
