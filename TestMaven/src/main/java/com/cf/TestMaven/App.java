package com.cf.TestMaven;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.cf.utils.Utils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));
        System.out.println("update git");
        String name=Utils.scanner.nextLine();
        System.out.println(Utils.islength(name));
        System.out.println("cuilu dashuai bi");
    }
}
