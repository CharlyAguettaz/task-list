package com.codurance.training.tasks.customClass;

public class TaskExist {
    private Boolean taskExistValue;

    public TaskExist(boolean taskExistValue) {
        this.taskExistValue = taskExistValue;
    }

    public boolean equals(TaskExist otherTaskExist) {
        if (this.taskExistValue.compareTo(otherTaskExist.taskExistValue) == 0) {
            return true;
        }
        return false;
    }
}
