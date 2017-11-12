package rba.com.cleanjavaandroidarchi.interfaceadapters.article.model;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 09/11/2017.
 */

public class ArticleViewModel {
    private final String title;
    private final String url;
    private final String creationDate;

    public ArticleViewModel(String title, String url, String creationDate) {
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

    public String getCreationDate() {
        return creationDate;
    }
}
