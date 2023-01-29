package com.codurance.training.tasks;

import com.codurance.training.tasks.customClass.ReaderWriter;
import com.codurance.training.tasks.customClass.Program;

public class main {

    public static void main(String[] args)
    {
        String test = "'show\n" +
        "add project football\n" +
        "add task football hat-trick\n" +
        "add task football middlefield\n" +
        "check 1\n" +
        "check 2\n" +
        "show\n" +
        "quit" ;
        
        System.out.println(test);
        Program program = new Program(new ReaderWriter());
        program.run();
        
    }

    
}
