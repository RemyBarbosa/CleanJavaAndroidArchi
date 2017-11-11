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
    private final DateTime releaseDate;

    public Article(String title, String content, DateTime releaseDate) {
        this.title = title;
        this.content = content;
        this.releaseDate = releaseDate;
    }

    public boolean isPublishable() {
        return releaseDate.isBefore(DateTime.now().minusDays(NB_DAY_TO_WAIT_BEFORE_PUBLICATION));
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public DateTime getReleaseDate() {
        return releaseDate;
    }
}
