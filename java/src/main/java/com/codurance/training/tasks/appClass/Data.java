package com.codurance.training.tasks.appClass;

import com.codurance.training.tasks.customClass.ProjectExist;
import com.codurance.training.tasks.customClass.ProjectList;
import com.codurance.training.tasks.customClass.ProjectName;
import com.codurance.training.tasks.customClass.ReaderWriterOutput;
import com.codurance.training.tasks.customClass.TaskDescription;
import com.codurance.training.tasks.customClass.TaskId;
import com.codurance.training.tasks.customClass.TaskUnit;

public class Data {

    private ProjectList projectList;
    private TaskId lastTaskId ;

    public Data() {
        this.projectList = new ProjectList();
        this.lastTaskId = new TaskId(0);
    }

    public String toString() {
        return this.projectList.toString();
    }

    public void addTask(ProjectName projectName, TaskDescription taskDescription, ReaderWriter readerWriter) {

        TaskId taskId = this.lastTaskId.nextTaskId();
        TaskUnit taskUnit = new TaskUnit(taskId, taskDescription);
        ProjectExist projectExist = this.projectList.addTaskIfProjectExist(projectName, taskUnit);

        if (projectExist.equals(new ProjectExist(false))) {
            readerWriter.print(new ReaderWriterOutput("Specified project does not exist"));
            return;
        }

        this.lastTaskId = taskId;
    }

    public void addProject(Project project) {
        this.projectList.addProject(project);
    }

    public void checkTask(TaskId taskId, ReaderWriter readerWriter) {
        this.projectList.checkTask(taskId, readerWriter);
    }

    public void uncheckTask(TaskId taskId, ReaderWriter readerWriter) {
        this.projectList.uncheckTask(taskId, readerWriter);
    }
}
