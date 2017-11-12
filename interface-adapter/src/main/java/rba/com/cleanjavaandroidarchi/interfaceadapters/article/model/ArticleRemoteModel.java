package rba.com.cleanjavaandroidarchi.interfaceadapters.article.model;

import com.google.gson.annotations.SerializedName;

import org.joda.time.DateTime;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 09/11/2017.
 */

public class ArticleRemoteModel {

    private final String title;
    private final String url;
    @SerializedName("created_at")
    private final DateTime creationDate;

    public ArticleRemoteModel(String title, String url, DateTime creationDate) {
        this.title = title;
        this.url = url;
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }
}
