package ua.epam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Viktoriia_Marynchak on 9/14/2016.
 */
public class MainTest {
    private static int array[] = {1, 1, 2, 7, 5, 1, 9, 2, 4, 7, 2, 7, 0, 0};
    private static int number;

    @Test // пустой массив
    public void testMethodEmptyArray() throws Exception {
        int temp[] = new int[0];
        int result[] = ua.epam.Main.method(array, number);
        Assert.assertArrayEquals(temp, result);
    }

    @Test // позитивный тест
    public void testMethodPositive() throws Exception {
        number = 7;
        int temp[] = {3, 9, 11};
        int result[] = ua.epam.Main.method(array, number);
        Assert.assertArrayEquals(temp, result);
    }

    @Test // элемент есть в массиве
    public void testMethodElementPresent() throws Exception {
        number = 7;
        int result[] = ua.epam.Main.method(array, number);
        Assert.assertTrue(result.length>0);
    }

    @Test // элемента нет в массиве
    public void testMethodElementNotPresent() throws Exception {
        number = 3;
        int result[] = ua.epam.Main.method(array, number);
        Assert.assertTrue(result.length==0);
    }

    @Test // количество вхождений
    public void testMethodQuantityElements() throws Exception {
        number = 7;
        int temp = 3;
        int result[] = ua.epam.Main.method(array, number);
        Assert.assertEquals(temp, result.length, 0);
    }

    @Test // граничные значения вначеале
    public void testMethodBoundaryValuesStart() throws Exception {
        number = 0;
        int temp[] = {0, 1};
        int result[] = ua.epam.Main.method(array, number);
        Assert.assertArrayEquals(temp, result);
    }

    @Test // граничные значения в конце
    public void testMethodBoundaryValuesEnd() throws Exception {
        number = 0;
        int temp[] = {12, 13};
        int result[] = ua.epam.Main.method(array, number);
        Assert.assertArrayEquals(temp, result);
    }
}