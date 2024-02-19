package ru.lopatin.homeworks.homework22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SimpleTests {
    MainApp mainApp;
    @Test
    public void posCheckArrayTest() {
        mainApp = new MainApp();
        Assertions.assertArrayEquals(new int[]{4, 8, 5, 4, 8}, mainApp.checkArray(new int[]{1, 5, 4, 1, 4, 8, 5, 4, 8}));
    }
    @Test
    public void negCheckArrayTest() {
        mainApp = new MainApp();
        Assertions.assertThrows(RuntimeException.class, ()->mainApp.checkArray(new int[]{ 5, 4,  4, 8, 5, 4, 8}));
    }

    @MethodSource("checkArrayOneAndTwoTestData")
    @ParameterizedTest
    public void checkArrayTest(int[] array, boolean result) {
        mainApp = new MainApp();
        Assertions.assertEquals(result, mainApp.checkArrayOneAndTwo(array));
    }

    public static Stream<Arguments>  checkArrayOneAndTwoTestData(){
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 1}, true));
        out.add(Arguments.arguments(new int[]{1, 2, 3}, false));
        out.add(Arguments.arguments(new int[]{1, 2, 2, 1}, true));
        return out.stream();
    }


}
