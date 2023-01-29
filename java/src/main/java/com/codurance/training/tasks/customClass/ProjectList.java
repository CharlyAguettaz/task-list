package com.codurance.training.tasks.customClass;

import java.util.ArrayList;
import java.util.List;

import com.codurance.training.tasks.appClass.Project;
import com.codurance.training.tasks.appClass.ReaderWriter;

public class ProjectList {
    private List<Project> projectList;

    public ProjectList() {
        this.projectList = new ArrayList<>();
    }

    public String toString() {
        String toString = "";
        for (Project project : projectList) {
            toString += project.toString() + "\n";
        }
        return toString;
    }

    public void checkTask(TaskId taskId, ReaderWriter readerWriter) {
        TaskExist taskExist = new TaskExist(true);
        for (Project project : this.projectList) {
            taskExist = project.checkIfTaskExist(taskId, taskExist);
        }

        this.handleTaskNonExistant(taskExist, readerWriter);
    }

    public void uncheckTask(TaskId taskId, ReaderWriter readerWriter) {
        TaskExist taskExist = new TaskExist(true);
        for (Project project : this.projectList) {
            taskExist = project.uncheckIfTaskExist(taskId, taskExist);
        }

        this.handleTaskNonExistant(taskExist, readerWriter);
    }

    public ProjectExist addTaskIfProjectExist(ProjectName projectName, TaskUnit taskUnit) {
        ProjectExist projectExist = new ProjectExist(false);
        for (Project project : this.projectList) {
            projectExist = project.addTaskIfProjectExist(projectName, taskUnit, projectExist);
        }

        return projectExist;
    }

    public void addProject(Project project) {
        this.projectList.add(project);
    }

    private void handleTaskNonExistant(TaskExist taskExist, ReaderWriter readerWriter) {
        if (taskExist.equals(new TaskExist(false))) {
            readerWriter.print(new ReaderWriterOutput("Specified task does not exist"));
        }
    }
}
