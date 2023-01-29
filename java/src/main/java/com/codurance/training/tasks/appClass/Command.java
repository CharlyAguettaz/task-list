package com.codurance.training.tasks.appClass;

import com.codurance.training.tasks.customClass.AddCommandType;
import com.codurance.training.tasks.customClass.CommandType;
import com.codurance.training.tasks.customClass.Loop;
import com.codurance.training.tasks.customClass.ReaderWriterOutput;
import com.codurance.training.tasks.customClass.TaskId;

public class Command {
    private CommandType commandType;

    public Command(CommandType commandType) {
        this.commandType = commandType;
    }

    public CommandWrap createWrap(String commandWrapString) {
        if (this.commandType.isAddCommand()) {
            String[] commandWrapStringSplited = commandWrapString.split("\\s+", 2);
            String addCommandString = commandWrapStringSplited[0];
            String addCommandArgumentString = commandWrapStringSplited[1];

            AddCommand addCommand = new AddCommand(new AddCommandType(addCommandString));
            return new CommandWrap(addCommand, addCommandArgumentString, null);
        }

        if (this.commandType.isCheckCommand() || this.commandType.isUncheckCommand()) {
            TaskId taskId = new TaskId(Integer.valueOf(commandWrapString));
            return new CommandWrap(null, null, taskId);
        }
        return null;
    }

    public Loop sentLoop() {
        if (this.commandType.isQuitCommand()) {
            return new Loop(false);
        }
        return new Loop(true);
    }

    public void execute(CommandWrap commandWrap, Data data, ReaderWriter readerWriter) {
        if(this.commandType.isShowCommand()) {
            readerWriter.print(new ReaderWriterOutput(data.toString()));
        }
        if(this.commandType.isAddCommand()) {
            commandWrap.executeAdd(data, readerWriter);
        }
        if(this.commandType.isCheckCommand()) {
            commandWrap.executeCheck(data, readerWriter);
        }
        if(this.commandType.isUncheckCommand()) {
            commandWrap.executeUncheck(data, readerWriter);
        }
        if(this.commandType.isNotExpectedCommand()) {
            readerWriter.print(new ReaderWriterOutput("Command unknow"));
        }
    }
}
