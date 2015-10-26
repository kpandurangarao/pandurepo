package com.prokarma;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import com.hti.system.EnvPropertyResourceConfigurer;
 
public class ApacheCommonsLoggerDemo {
 
    private final static Logger logger = LoggerFactory.getLogger(ApacheCommonsLoggerDemo.class);
 
    public void demo() {
        Date date = new Date();
 
        logger.info("The date is: " + date);
        
        /*EnvPropertyResourceConfigurer configurer = new EnvPropertyResourceConfigurer();
        configurer.logEnvironmentSetting();*/
        logger.info("************** info pandu test now****************");
        logger.debug("************** Debug ****************");
        logger.trace("************** trace ****************");
        logger.error("************** error ****************");
        logger.warn("************** warn ****************");
        logger.info("************************************");
        
        /*while(true){
        	double dou = Math.random();
        	if(dou == 5){
        		break;
        	}
        	logger.info("Hello:  "+dou);
        }*/
    }
 
    public static void main(String[] args) {
        new ApacheCommonsLoggerDemo().demo();
    }
}