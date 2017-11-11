package rba.com.cleanjavaandroidarchi.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.lang.reflect.Type;


public class DateTimeSerializer implements JsonSerializer<DateTime> {
    final String DATE_TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ssZ";

    @Override
    public JsonElement serialize(final DateTime datetime,
                                 final Type type,
                                 final JsonSerializationContext jsonSerializationContext) {
        {
            final DateTimeFormatter formatter = DateTimeFormat.forPattern(DATE_TIME_PATTERN)
                    .withZoneUTC();
            return new JsonPrimitive(formatter.print(datetime));
        }
    }
} 