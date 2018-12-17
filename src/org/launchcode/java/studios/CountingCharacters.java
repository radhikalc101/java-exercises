package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Set;

public class CountingCharacters {

    public static HashMap<Character, Integer> countingChars(String Sentence){
        HashMap<Character,Integer> myDict = new HashMap<>();
        for (Character c : Sentence.toCharArray()){
            Integer count = myDict.get(c);
            if(count == null){
                myDict.put(c,1);
            }else{
                myDict.put(c,count.intValue()+1);
            }
        }
        return myDict;
    }
    public static Character[] sort(Character[] alist){
        for (int swapNum = alist.length - 1; swapNum > -1; swapNum--){
            for(int i = 0; i < swapNum; i++){
                if(alist[i] > alist[i+1]){
                    Character tempIndex = alist[i];
                    alist[i] = alist[i+1];
                    alist[i+1] = tempIndex;
                }
            }

        }
        return alist;
    }
    public static void main(String[] args){

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        HashMap<Character, Integer> myMap = countingChars(text);

        Set<Character> charKeys = myMap.keySet();

        int n = charKeys.size();
        Character alist[] = new Character[n];
        System.arraycopy(charKeys.toArray(), 0, alist, 0, n);

        Character[] sortedKeys = sort(alist);
        for(Character key : sortedKeys){
            System.out.println(key + ":" + myMap.get(key));
        }
    }



}
