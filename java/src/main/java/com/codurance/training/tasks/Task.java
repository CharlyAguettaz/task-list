package com.codurance.training.tasks;

import com.codurance.training.tasks.customClass.*;

public final class Task {
    private final TaskUnit taskUnit;
    private TaskDone taskDone;

    public Task(TaskUnit taskUnit, TaskDone taskDone) {
        this.taskUnit = taskUnit;
        this.taskDone = taskDone;
    }

    // public long getId() {
    //     return id;
    // }

    // public String getDescription() {
    //     return description;
    // }

    // public boolean isDone() {
    //     return this.taskDone;
    // }

    // public void setDone(boolean done) {
    //     this.done = done;
    // }
}
