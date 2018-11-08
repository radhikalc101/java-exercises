package org.launchcode.java.exercises;
// sum of even numbers
public class sumOfEvenNums{
    public static void main(String[] args){
        int [] evenNums = {1,2,4,3,6,8,12,10,3};
        int size = evenNums.length;
        int sum = 0;
        for (int i=0; i<size; i++){
            int num = evenNums[i];
            if (num%2 == 0){
                sum = sum + num;
            }
            //return  sum;
        }
        System.out.println(sum);
    }

}
