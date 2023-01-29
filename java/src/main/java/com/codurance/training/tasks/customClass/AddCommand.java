package com.codurance.training.tasks.customClass;

import java.util.Arrays;
import java.util.List;

public class AddCommand {

    private List<String> expectedTypes = Arrays.asList("project", "task");
    private String addCommandValue;

    public AddCommand(String addCommandValue) {
        this.addCommandValue = addCommandValue;
    }

    public boolean isNotExpectedCommand() {
        return this.expectedTypes.contains(this.addCommandValue);
    }

    public boolean isProjectCommand() {
        return this.addCommandValue.equals("project");
    }

    public boolean isTaskCommand() {
        return this.addCommandValue.equals("task");
    }

    
}
