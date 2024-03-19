package com.tele2.timechecker.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tele2.timechecker.model.TimeDto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.TimeZone;
@org.springframework.stereotype.Service
public class TimeService {



    private final ObjectMapper mapper = new ObjectMapper();
    private final DateFormat DATA_FORMAT = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss aa");
    public TimeService() {
        //
    }

    public String getTime() {
        TimeDto timeDto = new TimeDto();
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        timeDto.setTimeZone(TimeZone.getDefault().toZoneId().getRules().getStandardOffset(Instant.now()).getId());
        timeDto.setTime(DATA_FORMAT.format(calendar.getTime()));
        try {
            return mapper.writeValueAsString(timeDto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

}
