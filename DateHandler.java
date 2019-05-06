package com.sysoutachieve.testdatehandle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateHandler {

    Calendar cal = Calendar.getInstance();

    SimpleDateFormat mFormat;

    public DateHandler (String dateFormat){
        //          "yyyy-MM-dd HH:mm:ss", "yyyy-MMM-ddd" 등 자신이 원하는 형식(DateFormat)으로 class 생성
//        "HH:mm", "yyyy.MM.dd(E)_hh:mm a", "a hh:mm" 형식이 있음
//        HH는 24시간을 기준으로 오후 한시를 출력할 때 return 13시, hh는 12시를 기준 오후 1시 출력 시 return 1시
//        mm은 분, MM은 달, MMM은 달의 문자 출력 ex: Locale.ENGLISH이면 jan, feb, mar...    locale.KOREA면 1월, 2월, 3월...
//        E는 요일, a는 오전 오후 , Locale.ENGLISH는 am, pm으로 출력
        this.mFormat = new SimpleDateFormat(dateFormat);
    }

    public DateHandler (String dateFormat, Locale localeType){
        this.mFormat = new SimpleDateFormat(dateFormat, localeType);        // 원하는 형식(DateFormat) + 출력을 원하는 국가 언어를 지정
    }

    public void TimeZoneCon(String timeZoneStr){
        this.mFormat.setTimeZone(TimeZone.getTimeZone(timeZoneStr));     //Date 기준 시간대 설정 가능 ex) UTC, GMT...
    }

    public Date stringToDate(String dateStr){       //param에서 String변수로 받은 Date값을 생성자로 받은 형식에 맞추어 반환
        Date date = null;
        try {
            date = mFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public String dateToString(Date date){       //param에서 받은 Date값을 생성자로 받은 형식에 맞추어 String으로 반환
        return mFormat.format(date);
    }

    public int getYearforDate(Date date, int dateType){       //param에서 받은 Date값을 dateType에 맞추어 출력
                /*
                ex)
                dateType == Calendar.YEAR 이면 '년도' yyyy 반환
                dateType == Calendar.MONTH 이면 '월' MM 반환
                dateType == Calendar.DAY_OF_MONTH 이면 '일' dd 반환
                 */
        cal.setTime(date);
        return cal.get(dateType);
    }
    
     public static ArrayList sortDateList(ArrayList dateList){  //date Type의 Arraylist를 순서대로 정렬하여 return해줌
        Collections.sort(dateList, (Comparator<Date>) (o1, o2) -> o1.compareTo(o2));
        return dateList;
    }

}
