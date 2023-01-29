package com.codurance.training.tasks;

import java.util.ArrayList;
import java.util.List;

import com.codurance.training.tasks.customClass.TaskExist;
import com.codurance.training.tasks.customClass.TaskId;

public final class TaskList {

    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public String toString() {
        String toString = "";
        for (Task task : taskList) {
            toString += task.toString() + "\n";
        }
        return toString;
    }

    public void addTask(Task task) {
        this.taskList.add(task);
    }

    public TaskExist checkIfExist(TaskId taskId, TaskExist taskExist) {
        for (Task task : taskList) {
            taskExist = task.checkIfExist(taskId, taskExist);
        }

        return taskExist;
    }

    public TaskExist uncheckIfExist(TaskId taskId, TaskExist taskExist) {
        for (Task task : taskList) {
            taskExist = task.uncheckIfExist(taskId, taskExist);
        }

        return taskExist;
    }

}
