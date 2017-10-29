package test;

import org.thymeleaf.spring4.expression.Fields;
import test.domain.InformationAll;

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class GlobleVariance {
    public static String[] args;
    //页面主体右侧模代号
    public final static String BodyRightContent = "bodyRightContent";
    //普通成员
    public static final int USER_MEMBER= 1;
    //管理员
    public static final int USER_ADMIN = 2;

    static{
        Class a = InformationAll.class;
        Field[] b = a.getDeclaredFields();
        args = new String[b.length];
        for (int i=0;i<b.length;i++){
            args[i] = b[i].getName();
        }
    }
}
