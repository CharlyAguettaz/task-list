package com.codurance.training.tasks.appClass;

import com.codurance.training.tasks.customClass.ProjectName;
import com.codurance.training.tasks.customClass.TaskDescription;
import com.codurance.training.tasks.customClass.TaskId;

public class AddCommandLine {
    private TaskId taskId;
    private ProjectName projectName;
    private TaskDescription taskDescription;

    public AddCommandLine(TaskId taskId, ProjectName projectName, TaskDescription taskDescription) {
        this.taskId = taskId;
        this.projectName = projectName;
        this.taskDescription = taskDescription;
    }

    public void check(Data data, ReaderWriter readerWriter) {
        data.checkTask(taskId, readerWriter);
    }

    public void uncheck(Data data, ReaderWriter readerWriter) {
        data.uncheckTask(taskId, readerWriter);
    }

    public void addProject(Data data) {
        data.addProject(new Project(projectName));
    }

    public void addTask(Data data) {
        data.addTask(this.projectName, this.taskDescription, new ReaderWriter());
    }

}
