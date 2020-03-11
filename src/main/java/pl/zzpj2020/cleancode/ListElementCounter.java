package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListElementCounter {

    Map<Integer, Integer> occurrences = new HashMap<>();
    private int maxElementValue = Integer.MIN_VALUE;
    private int minElementValue = Integer.MAX_VALUE;

    public ListElementCounter(List<Integer> list) {
        countElementOccurrenciesAndMinMaxValues(list);
    }

    public void countElementOccurrenciesAndMinMaxValues(List<Integer> list) {
        for(Integer elem : list)
            addElementOccurrence(elem);
    }

    public void addElementOccurrence(Integer i) {
        if (occurrences.containsKey(i)) {
            Integer k = occurrences.get(i);
            occurrences.put(i, k + 1);
        } else {
            occurrences.put(i, 1);
        }

        if (i > maxElementValue) {
            maxElementValue = i;
        }

        if (i < minElementValue) {
            minElementValue = i;
        }
    }

    public int getNumberOfOccurrences(Integer i) {
        if (occurrences.containsKey(i)) {
            return occurrences.get(i);
        }
        return 0;
    }

    public double getArithmeticAverage() {
        double sum = 0;
        double count = 0;
        for (Entry<Integer, Integer> u : occurrences.entrySet()) {
            count += u.getValue();
            sum += u.getKey() * u.getValue();
        }
        return sum / count;
    }

    public Integer getMaxElementValue() {
        return maxElementValue;
    }

    public Integer getMinElementValue() {
        return minElementValue;
    }
}
