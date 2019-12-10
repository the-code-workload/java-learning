package com.learning.selenium;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{public static Logger log = LogManager.getLogger(HomePageTests.class.getName());

    /**
     * Rigorous Test :-)
     */
    //@Test
    public void shouldAnswerWithTrue()
    {
        log.info("Very Complicated test!");
        assertTrue( true );
    }
}
