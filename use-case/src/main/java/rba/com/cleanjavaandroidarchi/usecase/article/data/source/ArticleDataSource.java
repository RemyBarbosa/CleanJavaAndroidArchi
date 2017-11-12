package rba.com.cleanjavaandroidarchi.usecase.article.data.source;

import io.reactivex.Flowable;
import rba.com.cleanjavaandroidarchi.entity.Article;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 10/11/2017.
 */

public interface ArticleDataSource {
    Flowable<Article> getArticle(int number);
}
