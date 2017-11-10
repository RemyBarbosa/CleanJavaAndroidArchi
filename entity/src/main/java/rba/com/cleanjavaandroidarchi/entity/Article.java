package rba.com.cleanjavaandroidarchi.entity;

import java.util.Calendar;
import java.util.Date;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 09/11/2017.
 */

public class Article {

    private static final int NB_DAY_TO_WAIT_BEFORE_PUBLICATION = 1;

    private final String title;
    private final String content;
    private final Date releaseDate;

    public Article(String title, String content, Date releaseDate) {
        this.title = title;
        this.content = content;
        this.releaseDate = releaseDate;
    }

    public boolean isPublishable() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -NB_DAY_TO_WAIT_BEFORE_PUBLICATION);
        return releaseDate.before(calendar.getTime());
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }
}
