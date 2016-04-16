package com.aa.team11.dtos;

/**
 * Created by jordanculver on 4/15/16.
 */
public class Location {
    private final boolean inAirport;
    private final String terminal;
    private final String gate;

    public Location() {
        this(false, "terminal", "gate");
    }

    public Location(boolean inAirport, String terminal, String gate) {
        this.inAirport = inAirport;
        this.terminal = terminal;
        this.gate = gate;
    }

    public boolean isInAirport() {
        return inAirport;
    }

    public String getTerminal() {
        return terminal;
    }

    public String getGate() {
        return gate;
    }
}
