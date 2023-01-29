package com.codurance.training.tasks.appClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import com.codurance.training.tasks.customClass.ReaderWriterOutput;

public class ReaderWriter {

    private final BufferedReader bufferedReader;
    private final PrintWriter printWriter;

    public ReaderWriter() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        this.printWriter = new PrintWriter(System.out);
    }

    private void write(ReaderWriterOutput readerWriterOutput) {
        this.printWriter.write(readerWriterOutput.toString());
        this.printWriter.flush();
    }

    private void printCommandPrompt() {
        ReaderWriterOutput commandPromptOut = new ReaderWriterOutput("> ");
        this.write(commandPromptOut);
    }

    public void print(ReaderWriterOutput readerWriterOutput) {
        readerWriterOutput.newLine();
        this.write(readerWriterOutput);
    }

    public String inputCommandPrompt() throws IOException {
        this.printCommandPrompt();
        return this.bufferedReader.readLine();
    }

    // private void execute(String commandLine) {
    //     String[] commandRest = commandLine.split(" ", 2);
    //     String command = commandRest[0];
    //     switch (command) {
    //         case "show":
    //             show();
    //             break;
    //         case "add":
    //             add(commandRest[1]);
    //             break;
    //         case "check":
    //             check(commandRest[1]);
    //             break;
    //         case "uncheck":
    //             uncheck(commandRest[1]);
    //             break;
    //         case "help":
    //             help();
    //             break;
    //         default:
    //             error(command);
    //             break;
    //     }
    // }

}
