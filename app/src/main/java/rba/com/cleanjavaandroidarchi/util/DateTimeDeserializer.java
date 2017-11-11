package rba.com.cleanjavaandroidarchi.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.lang.reflect.Type;

public class DateTimeDeserializer implements JsonDeserializer<DateTime> {

    private final String DATE_TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ssZ";

    public DateTime deserialize(final JsonElement json,
                                final Type typeOfT,
                                final JsonDeserializationContext context)
            throws JsonParseException {

        final DateTimeFormatter formatter = DateTimeFormat.forPattern(DATE_TIME_PATTERN)
                .withZoneUTC();
        return formatter.parseDateTime(json.getAsString());
    }
} 