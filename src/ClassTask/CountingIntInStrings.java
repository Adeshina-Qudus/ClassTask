package ClassTask;

public class CountingIntInStrings {

    public static void main(String[] args) {
        System.out.println(numbersInAString(new String[]{"ABc71f", "13cpz", "A1l"}));
    }

    public static int numbersInAString(String [] characters ) {

        int counter = 0;
        int charAt = 0;
        for (int count = 0; count < characters.length; count++) {
            for (int count2 = 0; count2 < characters[count].length(); count2++) {
                charAt = characters[count].charAt(count2);
                if (charAt == '0' || charAt == '1' || charAt == '2' || charAt == '3' || charAt == '4'
                        || charAt == '5' || charAt == '6' || charAt == '7' || charAt == '8' || charAt == '9') {
                    counter++;
                }
            }
        }
        return counter;
    }
}