package ClassTaskFunctionArray;

public class Swap {
    public static int [] swap(int [] array ){
        int [] newArray = new int[array.length];
        int change = 0;
        for (int outter = 0 ; outter < array.length; outter++){
            newArray[change] = array[outter];
            if (outter % 2 == 0) {
                if (outter == array.length -1){
                    newArray[change] = array[array.length -1];
                    break;
                }
                newArray[change] = array[outter + 1];
                change++;
            }
            if (outter % 2 != 0) {
                newArray[change] = array[outter - 1];
                change++;
            }
        }
        return newArray;
    }
}
