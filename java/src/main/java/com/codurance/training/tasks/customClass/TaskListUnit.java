package com.codurance.training.tasks.customClass;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.codurance.training.tasks.Task;

public class TaskListUnit {
    
    private final Map<String, List<Task>> tasks;
    private TaskId taskLastId;

    public TaskListUnit() {
        this.tasks = new LinkedHashMap<>();
        this.taskLastId = new TaskId(0);
    }
    
}
