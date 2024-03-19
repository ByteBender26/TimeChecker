package com.tele2.timechecker;

import com.tele2.timechecker.service.TimeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TimecheckerApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    public void testTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss aa");
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        String now = dateFormat.format(calendar.getTime());
        assertEquals(new TimeService().getTime(),"{\"time\":\"" + now +"\",\"timeZone\":\"+03:00\"}");
    }

}
