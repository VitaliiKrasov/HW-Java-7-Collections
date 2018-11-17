package ua.com.soft.test;

import org.testng.annotations.Test;
import java.util.Map;
import static org.testng.Assert.assertEquals;
import static ua.com.soft.main.Task2.*;

public class Task2Test {

    Map testMap = getMyEmploeyyMap();
    public void setUp() {
    }

    @Test
    public void testGetById() {
//    Arrange

//    Act
        String actual = getById(testMap, 30);
//    Assert
        assertEquals("Eva Pupkina", actual);
    }

    @Test
    public void testGetByName() {
//    Arrange
        Map testMap = getMyEmploeyyMap();
//    Act
        Integer actual = getByName(testMap, "Vasia Pupkin");
        Integer expected = 20;
//    Assert
        assertEquals(expected, actual);
    }
}