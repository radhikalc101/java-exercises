package org.launchcode.java.exercises;
// caling array list of 10 intergers.
public class Array {
    public static void main(String[] args){
        int[] anArray = {1,1,2,3,5,8};
        int size = anArray.length;
        for ( int i=0; i<size; i++){
            System.out.println(anArray[i]);
        }
    }
}
