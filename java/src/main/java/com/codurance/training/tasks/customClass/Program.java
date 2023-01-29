package com.codurance.training.tasks.customClass;

import java.io.IOException;

public class Program implements Runnable{

    private ReaderWriter readerWriter;
    private Data data;

    public Program(ReaderWriter readerWriter) {
        this.readerWriter = readerWriter;
        this.data = new Data();
    }

    @Override
    public void run() {
        Loop loop = new Loop(true);
        while (loop.equals(new Loop(true))) {
            String commandString = "";
            try {
                commandString = this.readerWriter.inputCommandPrompt();
            } catch (IOException e) {
                e.printStackTrace();
            }
            InlineCommand commandLine = new InlineCommand(commandString);
            loop = commandLine.loopContinue();
            commandLine.execute(data, readerWriter); 
        }
    }    
}
