package com.codurance.training.tasks.customClass;

public class AddCommandArguments {
    _projectName    :ProjectName
    _taskDescription:TaskDescription = None

    def __init__(self, projectName:ProjectName, taskDescription:TaskDescription=None) -> None:
        self._projectName       = projectName
        self._taskDescription   = taskDescription

    def addProject(self, programDatas:ProgramDatas) -> None:
        programDatas.addProject(Project(name=self._projectName))

    def addTask(self, programDatas:ProgramDatas, console:Console) -> None:
        programDatas.addTask(projectName=self._projectName, taskDescription=self._taskDescription, console=console)
}
