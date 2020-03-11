package pl.zzpj2020.cleancode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CounterTests {

    @Test
    public void testElementCounting() {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 5, 6, 6));
        ListElementCounter counter = new ListElementCounter(list);
        Assert.assertEquals(new Integer(6), counter.getMaxElementValue());
        Assert.assertEquals(new Integer(1), counter.getMinElementValue());
        double avg = 24.0d / 7;
        Assert.assertEquals(avg, counter.getArithmeticAverage(), 0.000001);
        Assert.assertEquals(2, counter.getNumberOfOccurrences(1));
        Assert.assertEquals(2, counter.getNumberOfOccurrences(6));
        Assert.assertEquals(1, counter.getNumberOfOccurrences(2));
        Assert.assertEquals(1, counter.getNumberOfOccurrences(3));
        Assert.assertEquals(1, counter.getNumberOfOccurrences(5));
    }
}
