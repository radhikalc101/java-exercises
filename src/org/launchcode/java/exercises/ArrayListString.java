package org.launchcode.java.exercises;
// finding 5 letter words in a list of words and printing them

public class ArrayListString {
    public static void main(String[] args){
        String[] words = {"radhi","ram","rishi","teju","ramesh","rames","words","troll"};
        int size = words.length;
        for(int i = 0; i<size;i++){
            if(words[i].length() == 5){
                System.out.println(words[i]);
            }
        }
    }
}
