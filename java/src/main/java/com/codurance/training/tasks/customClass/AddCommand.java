package com.codurance.training.tasks.customClass;

public class AddCommand {
    private AddCommandType addCommandType;

    public AddCommand(AddCommandType addCommandType) {
        this.addCommandType = addCommandType;
    }

    public AddCommandLine addCommandArgumentCreate(String argumentString) {
        if (this.addCommandType.isProjectCommand()) {
            ProjectName projectName = new ProjectName(argumentString);
            return new AddCommandLine(null, projectName, null);
        }

        if (this.addCommandType.isTaskCommand()) {
            String[] addArgumentSplited = argumentString.split("\\s+");
            ProjectName projectName = new ProjectName(addArgumentSplited[0]);
            TaskDescription taskDescription = new TaskDescription(addArgumentSplited[1]);
            return new AddCommandLine(null, projectName, taskDescription);
        }
        return null;
    }

    public void executeAddCommand(AddCommandLine addCommandArguments, Data data, ReaderWriter readerWriter) {
        if (this.addCommandType.isProjectCommand()) {
            addCommandArguments.addProject(data);
        }
        if (this.addCommandType.isTaskCommand()) {
            addCommandArguments.addTask(data);
        }
    }

}
