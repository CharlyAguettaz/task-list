package com.codurance.training.tasks.customClass;

import java.util.ArrayList;
import java.util.List;

public class ProjectList {
    private List<Project> projectList;

    public ProjectList() {
        this.projectList = new ArrayList<>();
    }

    public void checkTask(TaskId taskId, ReaderWriter readerWriter) {
        TaskExist taskExist = new TaskExist(false);
        for (Project project : this.projectList) {
            taskExist = project.checkIfTaskExist(taskId, taskExist);
        }

        this.handleTaskNonExistant(taskExist, readerWriter);
    }

    public void uncheckTask(TaskId taskId, ReaderWriter readerWriter) {
        TaskExist taskExist = new TaskExist(false);
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
        if (taskExist == new TaskExist(false)) {
            readerWriter.print(new ReaderWriterOutput("Specified task does not exist"));
        }
    }
}
