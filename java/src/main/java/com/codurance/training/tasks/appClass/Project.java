package com.codurance.training.tasks.appClass;

import com.codurance.training.tasks.customClass.ProjectExist;
import com.codurance.training.tasks.customClass.ProjectName;
import com.codurance.training.tasks.customClass.TaskDone;
import com.codurance.training.tasks.customClass.TaskExist;
import com.codurance.training.tasks.customClass.TaskId;
import com.codurance.training.tasks.customClass.TaskUnit;

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
        if( taskExist.equals(new TaskExist(true))) {
            return taskExist;
        }
        return this.taskList.checkIfExist(taskId, taskExist);
    }

    public TaskExist uncheckIfTaskExist(TaskId taskId, TaskExist taskExist) {
        if( taskExist.equals(new TaskExist(true))) {
            return taskExist;
        }
        return this.taskList.uncheckIfExist(taskId, taskExist);
    }

    public ProjectExist addTaskIfProjectExist(ProjectName projectName, TaskUnit taskUnit, ProjectExist projectExist) {
        if (projectExist.equals(new ProjectExist(true))) {
            return projectExist;
        }

        if(this.projectName.equals(projectName)) {
            Task task = new Task(taskUnit, new TaskDone(false));
            this.taskList.addTask(task);
            return new ProjectExist(true);
        }

        return new ProjectExist(false);
    }

}
