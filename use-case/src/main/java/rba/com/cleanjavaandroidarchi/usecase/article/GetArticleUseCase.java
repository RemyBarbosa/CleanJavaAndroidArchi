package rba.com.cleanjavaandroidarchi.usecase.article;


import javax.inject.Inject;

import io.reactivex.Single;
import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.usecase.article.data.source.ArticleDataSource;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 10/11/2017.
 */

public class GetArticleUseCase {

    private final ArticleDataSource mArticleDataSource;

    @Inject
    public GetArticleUseCase(ArticleDataSource articleDataSource) {
        mArticleDataSource = articleDataSource;
    }

    public Single<Article> execute(int number) {
        return mArticleDataSource.getArticle(number);
    }
}
