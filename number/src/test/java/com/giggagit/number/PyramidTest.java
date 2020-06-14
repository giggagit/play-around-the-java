package com.giggagit.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Pyramid.
 */
public class PyramidTest {

    Pyramid pyramid;
    ByteArrayOutputStream outContent;

    @BeforeEach
    public void SetUp() {
        pyramid = new Pyramid();
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void pattenOne() {
        pyramid.pattenOne(5);
        assertEquals("     * \n    * * \n   * * * \n  * * * * \n * * * * * \n", outContent.toString());
    }

    @Test
    public void pattenTwo() {
        pyramid.pattenTwo(5);
        assertEquals("* * * * * \n * * * * \n  * * * \n   * * \n    * \n", outContent.toString());
    }

}