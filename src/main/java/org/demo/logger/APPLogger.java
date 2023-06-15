package org.demo.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class APPLogger {

    private APPLogger(){

    }

    private static final Logger LOGGER = LogManager.getLogger(APPLogger.class);

    public static final Logger getLogger(){
        return LOGGER;
    }
}
