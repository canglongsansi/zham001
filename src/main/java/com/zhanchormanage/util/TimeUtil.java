package com.zhanchormanage.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaoyu
 */
public class TimeUtil {
    public static String getTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        return simpleDateFormat.format(new Date());
    }
}
