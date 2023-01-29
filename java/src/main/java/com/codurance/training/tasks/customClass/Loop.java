package com.codurance.training.tasks.customClass;

public class Loop {

    private boolean value;

    public Loop(boolean value) {
        this.value = value;
    }

    public boolean equals(Loop otherLoop) {
        return this.value == otherLoop.value;
    }
}
