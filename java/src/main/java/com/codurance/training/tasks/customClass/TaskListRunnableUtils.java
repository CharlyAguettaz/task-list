package com.codurance.training.tasks.customClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TaskListRunnableUtils implements Runnable{

    private final BufferedReader bufferedReader;
    private final PrintWriter printWriter;

    public TaskListRunnableUtils() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        this.printWriter = new PrintWriter(System.out);;
    }

    @Override
    public void run() {
        while (true) {
            this.printWriter.print("> ");
            this.printWriter.flush();
            String command;
            try {
                command = this.bufferedReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (command.equals(QUIT)) {
                break;
            }
            execute(command);
        }
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
