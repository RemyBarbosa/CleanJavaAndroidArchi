package rba.com.cleanjavaandroidarchi.article.data.remote;

import javax.inject.Inject;

import io.reactivex.Flowable;
import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.usecase.article.data.source.ArticleDataSource;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 11/11/2017.
 */
public class ArticleRemoteDataSource implements ArticleDataSource {

    private final ArticleRetrofitDataSource mArticleRetrofitDataSource;

    @Inject
    public ArticleRemoteDataSource() {
        mArticleRetrofitDataSource = ArticleRetrofitDataSource.Creator.newArticleRetrofitDataSource();
    }

    @Override
    public Flowable<Article> getArticle(int number) {
        return mArticleRetrofitDataSource.getArticle(number);
    }
}
