package com.company;

public class DynamicProgramming {
    public SacADos sacADos;
    public int[][] table;

    public DynamicProgramming(SacADos sacADos) {
        this.sacADos = sacADos;
        this.table = new int[sacADos.getNumberOfObjects()+1][sacADos.capacity+1];
        for (int c = 0; c <= sacADos.capacity; c++){
            table[0][c] = 0;
        }
        for (int i = 1; i <= sacADos.getNumberOfObjects(); i++){
            for (int c = 0; c <= sacADos.capacity; c++){
                if (sacADos.listOfObjects.get(i-1).getWeight() > c){
                    table[i][c] = table[i-1][c];
                } else {
                    table[i][c] = Math.max(table[i-1][c], sacADos.listOfObjects.get(i-1).getValue() + table[i-1][c - sacADos.listOfObjects.get(i-1).getWeight()]);
                }
            }
        }
    }


    public int optimalSolution(){
        return table[sacADos.getNumberOfObjects()][sacADos.capacity];
    }
}
