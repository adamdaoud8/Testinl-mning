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
        counter.addRow("En rödfärgad Ferrari");
        assertEquals("rödfärgad", counter.getTheLongestWord());


    }
    @Test
    public void TestaddUpdatesRowCount () {
        TextCounterLogik counter = new TextCounterLogik();
        counter.addRow("Jag har köpt en ny cykel!");
        counter.addRow("vad trevligt!, vilken färg är den");
        counter.addRow("Den är Blå");
        assertEquals(3, counter.getRowCount());

    }
    @Test
    public void TestaddUpdatesWordCount () {
        TextCounterLogik counter = new TextCounterLogik();
        counter.addRow("Hej Världen!");
        assertEquals("Världen!", counter.getWordcount());

    }
}