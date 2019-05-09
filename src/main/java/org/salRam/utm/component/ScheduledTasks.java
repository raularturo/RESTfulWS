package org.salRam.utm.component;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


@Component
public class ScheduledTasks {
	private static final Logger logger = LogManager.getLogger();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //@Scheduled(fixedRate = 8000)
    public void reportCurrentTimeRate() {
        logger.info("fixedRate: The time is now {}", dateFormat.format(new Date()));
    }
     
    //@Scheduled(fixedDelay = 5000)
    public void reportCurrentTimeDelay() {
        logger.info("fixedDelay: The time is now {}", dateFormat.format(new Date()));
    }
    
    //@Scheduled(cron = "*/10 * * * * ?")
    public void reportCurrentTimeCron() {
        logger.info("Cron Scheduled: The time is now {}", dateFormat.format(new Date()));
    }
}