package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MethodTestTest {
    MethodTest calculations = new MethodTest();
    @Test
    void testAdder() {
        assertEquals(4, calculations.add(2, 2));
    }
    @Test
    void testMultiplyer(){
        assertEquals(4.4, calculations.multiply(2,2.2));
    }

    @Test
    void testSorter(){
        int[] input = {5, 2, 4, 1, 3};
        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, calculations.sorter(input));  // gotta use array assertions for this or it will compare references as well
    }

    @Test
    void testCountSort() {
        String input = "abracadabra";
        String expected = "aaaaabbcdrr";
        String actual = calculations.countSort(input);
        assertEquals(expected, actual);
    }
    @Test
    void testCalculateAverage() {
        int[] numbers = {5, 2, 4, 1, 3};
        double expectedAverage = 3.0;

        double actualAvg = calculations.avg(numbers);

        assertEquals(expectedAverage, actualAvg, 0.0001); // gotta include this delta because for some reason it calculates all the way to the nth position
    }




}
