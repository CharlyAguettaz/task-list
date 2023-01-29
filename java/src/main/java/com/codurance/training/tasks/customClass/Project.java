package com.codurance.training.tasks.customClass;

import com.codurance.training.tasks.Task;
import com.codurance.training.tasks.TaskList;

public class Project {

    private ProjectName projectName;
    private TaskList taskList;

    public Project(ProjectName projectName) {
        this.projectName = projectName;
        this.taskList = new TaskList();
    }

    public String toString() {
        return this.projectName.toString() + "\n" + this.taskList.toString();
    }

    public void addTask(Task task) {
        this.taskList.addTask(task);
    }

    public TaskExist checkIfTaskExist(TaskId taskId, TaskExist taskExist) {
        if( taskExist == new TaskExist(true)) {
            return taskExist;
        }
        return new TaskExist(false);
    }

    public TaskExist uncheckIfTaskExist(TaskId taskId, TaskExist taskExist) {
        if( taskExist == new TaskExist(true)) {
            return taskExist;
        }
        return this.taskList.uncheckIfExist(taskId, taskExist);
    }

    public ProjectExist addTaskIfProjectExist(ProjectName projectName, TaskUnit taskUnit, ProjectExist projectExist) {
        if (projectExist == new ProjectExist(true)) {
            return projectExist;
        }

        if(this.projectName == projectName) {
            Task task = new Task(taskUnit, new TaskDone(false));
            this.taskList.addTask(task);
            return new ProjectExist(true);
        }

        return new ProjectExist(false);
    }

}
