package com.codurance.training.tasks.customClass;

public class ReaderWriterOutput {
    private String outputString;

    public ReaderWriterOutput(String outputString) {
        this.outputString = outputString;
    }

    public String toString() {
        return this.outputString;
    }

    public void newLine() {
        this.outputString += "\n";
    }

}
