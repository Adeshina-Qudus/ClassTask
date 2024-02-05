package ClassTaskFunctionArray;

import java.util.ArrayList;

public class HCFDivisor {

    public static void main(String[] args) {
        System.out.println(hcfDivisor(30,60));
    }


    public static ArrayList<Integer> hcfDivisor(int ...numbers){

        ArrayList<Integer> divisorNumber = new ArrayList<>();
        int counter = 0;
        int divide = 1;

        while (counter < numbers.length){
           while (numbers[counter] % divide == 0){
               divisorNumber.add(i);

           }
        }
    }
}