package section14.Q1401;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date now = new Date();// 現在の日時の取得
        Calendar calendar = Calendar.getInstance();// Calendarインスタンスを生成
        calendar.setTime(now);// 取得した日時情報をCalendarにセット
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);// Calendarから「日」の数値を取得
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth + 100);// 取得した値に100を足した値をCalendarの「日」にセット
        Date date = calendar.getTime();// Calendarの日付情報をDate型に変換
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("西暦yyyy年MM月dd日");// 日付の形式の指定
        System.out.println(simpleDateFormat.format(date));// Dateインスタンスの内容を表示
    }

}
