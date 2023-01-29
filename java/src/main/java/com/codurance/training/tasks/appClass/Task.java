package com.codurance.training.tasks.appClass;

import com.codurance.training.tasks.customClass.*;

public final class Task {
    private final TaskUnit taskUnit;
    private TaskDone taskDone;

    public Task(TaskUnit taskUnit, TaskDone taskDone) {
        this.taskUnit = taskUnit;
        this.taskDone = taskDone;
    }

    public String toString() {
        return this.taskUnit.toString() + " " + this.taskDone.toString();
    }

    public TaskExist checkIfExist(TaskId taskId, TaskExist taskExist) {
        TaskDone taskDone = new TaskDone(true);
        return this.setDoneIfExist(taskId, taskDone, taskExist);
    }

    public TaskExist uncheckIfExist(TaskId taskId, TaskExist taskExist) {
        TaskDone taskDone = new TaskDone(false);
        return this.setDoneIfExist(taskId, taskDone, taskExist);
    }

    private TaskExist setDoneIfExist(TaskId taskId, TaskDone taskDoneNew, TaskExist taskExist) {

        if (taskExist.equals(new TaskExist(true))) {
            return taskExist;
        }

        taskExist = this.taskUnit.taskExist(taskId);
        if(taskExist.equals(new TaskExist(true))) {
            this.taskDone = taskDoneNew;
        }
        return taskExist;
    }

}
