
// java.time.*; package deals with date and time.
// before java v8 it belongs to java.util.*;
// in java v 22 it also again belongs to java.util.*;

// Date 
// Data in java is stored as long number (long is datatype). It holds no. of miliseconds passes since 1 jan 1970
// Why stored in miliseconds ? Ans. storing in less gives high accuracy. Also we can convert to easy to read format like hours, days, year 

// Java assumes 1900 is start year[start of life] ( not 0000 is start year ). why ? This is rule of java there is no reason. 


import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.time.*;
import java.util.Set;
import java.time.format.DateTimeFormatter;
public class Java_59_date_time {

    public static void myDate(){
        System.out.println(System.currentTimeMillis());                  // miliseconds till 1 jan 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // covert to year


        // is it safe to store miliseconds in long.
        long miliseconds = System.currentTimeMillis();
        System.out.println(miliseconds);

        // Date
        Date d = new Date();        // current date and time 
        System.out.println(d);

        // For a specific date and time
        Date d2 = new Date(2005 - 1900 , 9, 4, 12, 23,900); 
        System.out.println(d2);
        System.out.println(d2.getTime());
        System.out.println(d2.getDate());
        System.out.println(d2.getSeconds());

        // most of the method in java.util.Date; class is deprecated but still works.

    }
    public static void myCalender (){
        // Calender class is bastract class. means we can not create it's instance.
        // There is static method which gives instance of Calender class
        // it is belongs to java.util.*;

        // it gives gregoin calender(jan,feb,march,...) i.e. out daily life calender
        // There are different types of calender in world. islamic calender, Roman calender, etc ...

        Calendar calender =  Calendar.getInstance();        // current date and time
        System.out.println(calender.getCalendarType());
        System.out.println(calender.getTimeZone());
        System.out.println(TimeZone.getTimeZone("Asia/singapore"));
        System.out.println(calender.getTimeZone().getID());

    }
    public static void myGregorianClass(){
        Calendar c = Calendar.getInstance();        // current date and time
        System.out.println(c);
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));


        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2025));

        // different countries have different time zone
        System.out.println(TimeZone.getAvailableIDs());        // retuns array
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);

        // GMT is statadaed time setted and we count our time with respect to GMT
        // india have GMT+0530 (India standard time)


    }

    public static void myJavaTime() {
        // Java.time API. It is java.time.* ; package
        // commonly used classes are,
        // Localdate : represent date
        // LocalTime : represent time
        // LocalDateTime : represent date+time
        // DateTimeFormatter : formatter for displaying and parsing date time object.

        // Here dates are immutable.

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        // In programming sepration of consern in very important
        // increase readability. and easy to learn.

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);                    // it is in nanosecond also.



        // Date time format 
        LocalDateTime dt = LocalDateTime.now(); // current date

        // create format
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        String mydate = dt.format(df);  // apply format
        System.out.println(mydate); 
        
        // iso format 
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(dt.format(df2)); 
        
        // Patterns for formatting and parsing
        // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html
        // also there are some symbols that are reserved for future use. not assigned till now.

        // DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd-M-yyyy");
        // DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(dt.format(df3)); 



    }

    public static void practice(){
        // Set<Integer> set = new Set<Integer>();       // Set is interface we can not create it's instance
        HashSet<Integer> set = new HashSet<Integer>();


        // Create date object
        Date d = new Date();
        System.out.println(d.getHours() + " "+ d.getMinutes() + " "+ d.getSeconds());

        // same thing using calender class
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(cal.HOUR_OF_DAY)+" "+ cal.get(cal.MINUTE)+" "+ cal.get(cal.SECOND) );
        
        
        // same thing using Date time formatter class
        LocalTime lt = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("h m s");
        String myDate = lt.format(df);
        System.out.println(myDate);


    }

    public static void main(String[] args) {
        // myDate();
        // myCalender();
        // myGregorianClass();
        // myJavaTime();
        practice();

    }
}
