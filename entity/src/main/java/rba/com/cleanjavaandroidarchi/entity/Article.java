package rba.com.cleanjavaandroidarchi.entity;

import com.google.gson.annotations.SerializedName;

import org.joda.time.DateTime;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 09/11/2017.
 */

public class Article {

    private static final int NB_DAY_TO_WAIT_BEFORE_PUBLICATION = 1;

    private final String title;
    @SerializedName("body")
    private final String content;
    @SerializedName("created_at")
    private final DateTime creationDate;

    public Article(String title, String content, DateTime creationDate) {
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
    }

    public boolean isReleasable() {
        return creationDate.isBefore(DateTime.now().minusDays(NB_DAY_TO_WAIT_BEFORE_PUBLICATION));
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }
}
