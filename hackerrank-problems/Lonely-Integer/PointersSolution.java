import java.util.*;

class PointersSolution {
    
    public static int lonelyinteger(List<Integer> a) {
        // In the exercise we get as input the List<Integer> a.
        int finalValue = -1;
        for (int i = 0; i < a.size() && finalValue == -1; i++) {
            int currentNumber = a.get(i);
            int currentCount = 1;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) == currentNumber && i != j) {
                    currentCount += 1;
                }
            }

            if (currentCount == 1) {
                finalValue = currentNumber;
            }
        }
        return finalValue;
    }
}
