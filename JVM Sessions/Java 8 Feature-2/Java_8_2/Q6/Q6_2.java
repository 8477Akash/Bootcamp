package Java_8_2.Q6;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q6_2 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("\nIndia Time: " + indiaTime.format(formatter));
        System.out.println("\nNew York Time: " + nyTime.format(formatter));
        System.out.println("\nTokyo Time: " + tokyoTime.format(formatter));
    }
}
