package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SacADos {
    public int capacity;
    public ArrayList<Object> listOfObjects = new ArrayList<Object>();

    public SacADos(File file) throws FileNotFoundException {

        Scanner input = new Scanner(file);
        int count = 0;
        while (input.hasNext()) {
            if(count == 0){
                int number  = input.nextInt();
                this.capacity = number;
            }else {
                Object object = new Object(input.nextInt(), input.nextInt());
                listOfObjects.add(object);
            }
            count = count + 1;
        }
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList<Object> getListOfObjects(){
        return this.listOfObjects;
    }

    public int getNumberOfObjects(){
        return listOfObjects.size();
    }

    public void display(){
        System.out.println("Capacité du sac: "+capacity);
        for(int i = 0; i < listOfObjects.size(); i++) {
            System.out.println("poids: "+listOfObjects.get(i).weight+ "     valeur: "+listOfObjects.get(i).value);
        }
    }

}
