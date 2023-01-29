package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.codurance.training.tasks.customClass.ReaderWriter;
import com.codurance.training.tasks.customClass.TaskExist;
import com.codurance.training.tasks.customClass.TaskId;
import com.codurance.training.tasks.customClass.TaskListUnit;

public final class TaskList {

    private List<Task> taskList;

    public static void main(String[] args) throws Exception {

    }

    public TaskList() {
        this.taskList = new ArrayList<>();
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
