package drunkedcat.monitor;

/**
 * Copyright (C) 2006-2017  AdMaster Co.Ltd.
 * All right reserved.
 *
 * @author: whitelilis@gmail.com on 18/8/10
 */


import drunkedcat.common.Aid;
import org.apache.hadoop.conf.Configuration;

/**
 * Here we get all interesting metrics together.
 */
public class MetricGetter implements Runnable {
    public Configuration conf = Aid.getConf();

    @Override
    public void run() {

    }

    
}
