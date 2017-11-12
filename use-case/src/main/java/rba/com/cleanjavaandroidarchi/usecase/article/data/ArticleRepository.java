package rba.com.cleanjavaandroidarchi.usecase.article.data;

import javax.inject.Inject;

import io.reactivex.Flowable;
import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.usecase.article.data.source.ArticleDataSource;
import rba.com.cleanjavaandroidarchi.usecase.di.annotation.Local;
import rba.com.cleanjavaandroidarchi.usecase.di.annotation.Remote;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 10/11/2017.
 */
public class ArticleRepository implements ArticleDataSource {

    private final ArticleDataSource mArticleRemoteDataSource;
    private final ArticleDataSource mArticleLocalDataSource;

    @Inject
    public ArticleRepository(@Remote ArticleDataSource articleRemoteDataSource,
            @Local ArticleDataSource articleLocalDataSource) {
        mArticleRemoteDataSource = articleRemoteDataSource;
        mArticleLocalDataSource = articleLocalDataSource;
    }

    @Override
    public Flowable<Article> getArticle(int number) {
        return mArticleRemoteDataSource.getArticle(number).startWith(mArticleLocalDataSource.getArticle(number));
    }
}
