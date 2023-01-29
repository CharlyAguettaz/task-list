package com.codurance.training.tasks.customClass;

public class InlineCommand {
    private Command command;
    private CommandWrap commandWrap;

    public InlineCommand(String commandLineString) {
        String[] commandLineStringSplited = commandLineString.split("\\s+", 2);
        String commandString = commandLineStringSplited[0];
        this.command = new Command(new CommandType(commandString));

        if(commandLineStringSplited.length > 1) {
            this.commandWrap = this.command.createWrap(commandLineStringSplited[1]);
        }
    }

    public void execute(Data data, ReaderWriter readerWriter) {
        this.command.execute(commandWrap, data, readerWriter);
    }

    public Loop loopContinue() {
        return this.command.sentLoop();
    }
}
