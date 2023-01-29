package com.codurance.training.tasks.customClass;

public class TaskId {
    private int value;

    public TaskId(int taskId) {
        this.value = taskId;
    }

    public boolean equals(TaskId otherTaskId) {
        return this.value == otherTaskId.value;
    }

    private void taskIdValuePlusOne() {
        this.value++;
    }

    public TaskId nextTaskId() {
        TaskId nextTaskId = new TaskId(this.value);
        nextTaskId.taskIdValuePlusOne();
        return nextTaskId;
    }
}
