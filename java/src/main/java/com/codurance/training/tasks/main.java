package com.codurance.training.tasks;

import com.codurance.training.tasks.appClass.Program;
import com.codurance.training.tasks.appClass.ReaderWriter;

public class main {

    public static void main(String[] args)
    {

        String input = "show\n" +
        "add project secrets\n" +
        "add task secrets Eat more donuts.\n" +
        "add task secrets Destroy all humans.\n" +
        "show\n" +
        "add project training\n" +
        "add task training Four Elements of Simple Design\n" +
        "add task training SOLID\n" +
        "add task training Coupling and Cohesion\n" +
        "add task training Primitive Obsession\n" +
        "add task training Outside-In TDD\n" +
        "add task training Interaction-Driven Design\n" +
        "check 1\n" +
        "check 3\n" +
        "check 5\n" +
        "check 6\n" +
        "show\n" +
        "quit";

        Program program = new Program(new ReaderWriter());
        program.run();

        System.out.println(input);
        
        // je n'ai pas reussi à ecouter directement le sys out pour faire les command
        // aussi ma command check ne marche pas jusqu'au bout 
        // toutes les autres fonctionnent 
        
    }

    
}
