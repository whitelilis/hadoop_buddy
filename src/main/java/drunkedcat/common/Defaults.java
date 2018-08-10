package drunkedcat.common;

import org.apache.hadoop.conf.Configuration;

/**
 * Copyright (C) 2006-2017  AdMaster Co.Ltd.
 * All right reserved.
 *
 * @author: whitelilis@gmail.com on 18/8/10
 */
public class Defaults extends Configuration{
    public static final String confDirName = "hadoop.conf.dir";
    public static final String confDirDefault = "/etc/hadoop/conf";
}
