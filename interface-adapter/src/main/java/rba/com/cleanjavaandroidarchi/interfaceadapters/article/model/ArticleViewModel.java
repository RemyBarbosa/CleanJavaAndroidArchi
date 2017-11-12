package rba.com.cleanjavaandroidarchi.interfaceadapters.article.model;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 09/11/2017.
 */

public class ArticleViewModel {
    private final String title;
    private final String content;
    private final String creationDate;

    public ArticleViewModel(String title, String content, String creationDate) {
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCreationDate() {
        return creationDate;
    }
}
