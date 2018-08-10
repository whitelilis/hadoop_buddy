package drunkedcat.common;


import org.apache.hadoop.conf.Configuration;
import java.io.File;

/**
 * Copyright (C) 2006-2017  AdMaster Co.Ltd.
 * All right reserved.
 *
 * @author: whitelilis@gmail.com on 18/8/10
 */
public class Aid {
    public static Defaults defaults = new Defaults();
    public static Configuration getConf(){
        Configuration conf = getConf();
        String hadoopConfDir = defaults.get(defaults.confDirName, defaults.confDirDefault);
        File confDir = new File(hadoopConfDir);
        if(confDir.isDirectory()){
            for(File file : confDir.listFiles()){
                if(file.getName().endsWith("xml")){
                    conf.addResource(file.getAbsolutePath());
                }else{
                    // not xml conf, ignored
                }
            }
        }else{
            System.err.println("Conf dir set but not a directory : " + defaults.get("hadoop.conf.dir"));
            System.exit(-1);
        }
        return conf;
    }
}
