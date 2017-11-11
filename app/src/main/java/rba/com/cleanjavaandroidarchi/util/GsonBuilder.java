package rba.com.cleanjavaandroidarchi.util;

import com.google.gson.Gson;

import org.joda.time.DateTime;

public class GsonBuilder {

    public static Gson getGson() {
        return new com.google.gson.GsonBuilder()
                .registerTypeAdapter(DateTime.class, new DateTimeSerializer())
                .registerTypeAdapter(DateTime.class, new DateTimeDeserializer())
                .create();
    }

}