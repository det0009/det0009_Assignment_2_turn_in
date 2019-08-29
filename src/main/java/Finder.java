public class Finder {
    public Integer findMax(int[] intArray) {
        if (intArray == null) {
            return null;
        }
        if (intArray.length == 0) {
            return null;
        }
        int max = intArray[1];
        for(int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        return max;
    }

    public Integer findMin(int[] intArray) {
        if (intArray == null) {
            return null;
        }
        if (intArray.length == 0) {
            return null;
        }

        int min = intArray[1];

        for(int i = 0; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
            }
        }
        return min;
    }
}
