package Inlämningsuppgift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertNotSame;

public class TestClass {

    @Test
    public void TestaddRowUpdatesCharacterCount() {
        TextCounterLogik counter = new TextCounterLogik();
        counter.addRow("Solen");
        counter.addRow("Skiner!");
        assertEquals( 12, counter.getCharacterCount());

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
        assertEquals(12, counter.getWordcount());
    }

    @Test
    public void TestStop() {
        TextCounterLogik counter = new TextCounterLogik();
        boolean result = counter.isStop("stop");
        Assertions.assertTrue(result,"isStop återsänder sant till 'stop'");
    }
}