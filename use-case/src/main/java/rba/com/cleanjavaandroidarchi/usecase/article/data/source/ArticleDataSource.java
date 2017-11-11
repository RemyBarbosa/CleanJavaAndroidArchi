package rba.com.cleanjavaandroidarchi.usecase.article.data.source;

import io.reactivex.Single;
import rba.com.cleanjavaandroidarchi.entity.Article;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 10/11/2017.
 */

public interface ArticleDataSource {
    Single<Article> getArticle(int number);
}
