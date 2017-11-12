package rba.com.cleanjavaandroidarchi.article.data;

import javax.inject.Inject;

import io.reactivex.Single;
import rba.com.cleanjavaandroidarchi.app.di.annotation.Remote;
import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.usecase.article.data.source.ArticleDataSource;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 10/11/2017.
 */
public class ArticleRepository implements ArticleDataSource {

    private final ArticleDataSource mArticleRemoteDataSource;

    @Inject
    public ArticleRepository(@Remote ArticleDataSource articleDataSource) {
        mArticleRemoteDataSource = articleDataSource;
    }

    @Override
    public Single<Article> getArticle(int number) {
        return mArticleRemoteDataSource.getArticle(number);
    }
}
