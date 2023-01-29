package com.codurance.training.tasks.customClass;

public class TaskExist {
    private boolean taskExistValue;

    public TaskExist(boolean taskExistValue) {
        this.taskExistValue = taskExistValue;
    }

    public boolean equals(TaskExist otherTaskExist) {
        return this.taskExistValue == otherTaskExist.taskExistValue;
    }
}
