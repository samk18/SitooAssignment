package com.sitoo.warehouse.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class MockController {

    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    @GetMapping(value = "/getAllCalenders",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllCalenders() throws Exception {
        String file = "C:\\Users\\rreyqh\\Desktop\\gitlab\\INAH\\sparta\\.idea\\httpRequests\\getAllCalenders.json";
        String json = readFileAsString(file);
        return json;
    }
    @GetMapping(value = "/getWorkingTimes",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWorkingTimes() throws Exception {
        String file = "C:\\Users\\rreyqh\\Desktop\\gitlab\\INAH\\sparta\\.idea\\httpRequests\\getWorkingTimes.json";
        String json = readFileAsString(file);
        return json;
    }
    @GetMapping(value = "/getWorkDayOffset",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWorkDayOffset() throws Exception {
        String file = "C:\\Users\\rreyqh\\Desktop\\gitlab\\INAH\\sparta\\.idea\\httpRequests\\getWorkDayOffset.json";
        String json = readFileAsString(file);
        return json;
    }
    @GetMapping(value = "/getIsProductionDay",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getIsProductionDay() throws Exception {
        String file = "C:\\Users\\rreyqh\\Desktop\\gitlab\\INAH\\sparta\\.idea\\httpRequests\\getIsProductionDay.json";
        String json = readFileAsString(file);
        return json;
    }
    @GetMapping(value = "/getClosedDays",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getClosedDays() throws Exception {
        String file = "C:\\Users\\rreyqh\\Desktop\\gitlab\\INAH\\sparta\\.idea\\httpRequests\\getClosedDays.json";
        String json = readFileAsString(file);
        return json;
    }
    @GetMapping(value = "/getDateRangeInformation",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDateRangeInformation() throws Exception {
        String file = "C:\\Users\\rreyqh\\Desktop\\gitlab\\INAH\\sparta\\.idea\\httpRequests\\getDateRangeInformation.json";
        String json = readFileAsString(file);
        return json;
    }
    @GetMapping(value = "/getEventOccurrencesByPeriod",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getEventOccurrencesByPeriod() throws Exception {
        String file = "C:\\Users\\rreyqh\\Desktop\\gitlab\\INAH\\sparta\\.idea\\httpRequests\\getEventOccurrencesByPeriod.json";
        String json = readFileAsString(file);
        return json;
    }
    @GetMapping(value = "/getEventOccurrencesByDate",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getEventOccurrencesByDate() throws Exception {
        String file = "C:\\Users\\rreyqh\\Desktop\\gitlab\\INAH\\sparta\\.idea\\httpRequests\\getEventOccurrencesByDate.json";
        String json = readFileAsString(file);
        return json;
    }

}
