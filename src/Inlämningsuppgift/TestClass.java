package Inlämningsuppgift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertNotSame;

public class TestClass {

    @Test
    public void TestaddRowUpdatesCharacterCount() {
        TextCounterLogik counter = new TextCounterLogik();
        counter.addRow("Solen");
        counter.addRow("Skiner!");
        assertEquals( 11, counter.getCharacterCount());

    }
    @Test
    public void TestaddUpdatesTheLongestWord () {
        TextCounterLogik counter = new TextCounterLogik();


    }
    @Test
    public void TestaddUpdatesRowCount () {
        TextCounterLogik counter = new TextCounterLogik();


    }
    @Test
    public void TestaddUpdatesWordCount () {
        TextCounterLogik counter = new TextCounterLogik();


    }
}