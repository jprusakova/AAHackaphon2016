package com.aa.team11.dtos;

/**
 * Created by jordanculver on 4/15/16.
 */
public class FlightInfo {
    private final String flightNumber;
    private final String terminal;
    private final String gate;
    private final String  boardingTime;
    private final String departureTime;
    private final String securityCheckPoint;

    public FlightInfo() {
        this("flightNumber", "terminal", "gate", "boardingTime", "departureTime", "securityCheckPoint");
    }

    public FlightInfo(String flightNumber, String terminal, String gate, String boardingTime, String departureTime, String securityCheckPoint) {
        this.flightNumber = flightNumber;
        this.terminal = terminal;
        this.gate = gate;
        this.boardingTime = boardingTime;
        this.departureTime = departureTime;
        this.securityCheckPoint = securityCheckPoint;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getTerminal() {
        return terminal;
    }

    public String getGate() {
        return gate;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
