package br.com.bossini.chatComFirebase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    public static String format (Date date){
        return new SimpleDateFormat("dd/MM/yyyy HH:mm").format(date);
    }


}
