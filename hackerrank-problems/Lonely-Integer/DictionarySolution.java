import java.util.*;


class DictionarySolution {
    
    public static int lonelyinteger(List<Integer> a) {
        // In the exercise we get as input the List<Integer> a.
        Map<Integer, Integer> numberOccurrencesMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.size(); i++) {
            int currentNumber = a.get(i);
            if (numberOccurrencesMap.containsKey(currentNumber)) {
                numberOccurrencesMap.put(currentNumber, numberOccurrencesMap.get(currentNumber) + 1);
            } else {
                numberOccurrencesMap.put(currentNumber, 1);
            }
        }

        Optional<Integer> key = numberOccurrencesMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();
        return key.get();
    }
}