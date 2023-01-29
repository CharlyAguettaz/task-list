package com.codurance.training.tasks.customClass;

import java.util.Arrays;
import java.util.List;

public class CommandType {
    private List<String> expectedTypes = Arrays.asList("show", "add", "check", "uncheck", "quit");
    private String commandValue;

    public CommandType(String commandString) {
        this.commandValue = commandString;
    }

    public boolean isNotExpectedCommand() {
        return this.expectedTypes.contains(this.commandValue);
    }

    public boolean isShowCommand() {
        return this.commandValue.equals("show");
    }

    public boolean isAddCommand() {
        return this.commandValue.equals("add");
    }

    public boolean isCheckCommand() {
        return this.commandValue.equals("check");
    }

    public boolean isUncheckCommand() {
        return this.commandValue.equals("uncheck");
    }

    public boolean isQuitCommand() {
        return this.commandValue.equals("quit");
    }
}
