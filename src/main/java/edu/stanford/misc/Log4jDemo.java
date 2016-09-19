package edu.stanford.misc;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by mamtasibbal on 9/18/16.
 */
public class Log4jDemo {

    private static final Logger LOGGER = LogManager.getLogger(Log4jDemo.class.getName());

    public static void main(String[] args) {

        System.out.println("Demostrating Log4j");
        LOGGER.debug("This is debug message");
        LOGGER.info("This is info message");
        LOGGER.warn("This is a warning message");
        LOGGER.error("This is an error message");

    }
}
