package com.aa.team11.dtos;

/**
 * Created by jordanculver on 4/15/16.
 */
public class Target {
    private final String terminal;
    private final String gate;
    private final String securityCheckPoint;

    public Target() {
        this("terminal", "gate", "securityCheckPoint");
    }

    public Target(String terminal, String gate, String securityCheckPoint) {
        this.terminal = terminal;
        this.gate = gate;
        this.securityCheckPoint = securityCheckPoint;
    }

    public String getTerminal() {

        return terminal;
    }

    public String getGate() {
        return gate;
    }

    public String getSecurityCheckPoint() {
        return securityCheckPoint;
    }
}
