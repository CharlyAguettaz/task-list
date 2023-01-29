package com.codurance.training.tasks.customClass;

public class CommandWrap {

    private AddCommand addCommand;
    private AddCommandLine addCommandArguments;

    public CommandWrap(AddCommand addCommand, String addArgumentString, TaskId taskId) {
        if (addCommand != null) {
            this.addCommand = addCommand;
            this.addCommandArguments = this.addCommand.addCommandArgumentCreate(addArgumentString);
            return;
        }
        if (taskId != null) {
            this.addCommandArguments = new AddCommandLine(taskId, null, null);
            return;
        }
    }

    public void executeAdd(Data data, ReaderWriter readerWriter) {
        this.addCommand.executeAddCommand(addCommandArguments, data, readerWriter);
    }

    public void executeCheck(Data data, ReaderWriter readerWriter) {
        this.addCommandArguments.check(data, readerWriter);
    }

    public void executeUncheck(Data data, ReaderWriter readerWriter) {
        this.addCommandArguments.uncheck(data, readerWriter);
    }

}
