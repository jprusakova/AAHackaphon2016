package com.aa.team11.dtos;

/**
 * Created by jordanculver on 4/15/16.
 */
public class LocationInfo {
    private final Status status;
    private final Location location;

    public LocationInfo() {
        this(new Status(), new Location());
    }

    public LocationInfo(Status status, Location userLocation) {
        this.status = status;
        this.location = userLocation;
    }

    public Status getStatus() {
        return status;
    }

    public Location getLocation() {
        return location;
    }
}
