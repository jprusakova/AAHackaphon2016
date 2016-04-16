package com.aa.team11.dtos;

/**
 * Created by jordanculver on 4/15/16.
 */
public class Status {
    private final boolean rightTerminal;
    private final boolean rightGate;
    private final boolean rightPlace;

    public Status() {
        this(false, false);
    }

    public Status(boolean rightTerminal, boolean rightGate) {
        this.rightTerminal = rightTerminal;
        this.rightGate = rightGate;
        this.rightPlace = rightGate && rightTerminal;
    }

    public boolean isRightTerminal() {

        return rightTerminal;
    }

    public boolean isRightGate() {
        return rightGate;
    }

    public boolean isRightPlace() {
        return rightPlace;
    }
}
