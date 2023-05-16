package com.company;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/company/sac0.txt");
        SacADos sac = new SacADos(file);
        sac.display(); // Veuillez commenter cette ligne de code si vous ne voulez pas afficher le contenu du sac.
        System.out.println();
        DynamicProgramming dynamicProgramming = new DynamicProgramming(sac);
        System.out.println("La solution optimale est: " + dynamicProgramming.optimalSolution());
    }
}
