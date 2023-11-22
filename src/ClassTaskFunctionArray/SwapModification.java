package ClassTaskFunctionArray;

public class SwapModification {

    public static int [] swapModification(int [] array ){

        int evenIndex = 0 ;
        for (int oddIndex = 1 ; oddIndex < array.length; oddIndex += 2){
                int temp = array[evenIndex];
                array[evenIndex] = array[oddIndex];
                array[oddIndex] = temp;
        }
        return array;
    }
}
