package rba.com.cleanjavaandroidarchi.article.data.remote;

import javax.inject.Inject;

import io.reactivex.Flowable;
import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticleContract;
import rba.com.cleanjavaandroidarchi.usecase.article.data.source.ArticleDataSource;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 11/11/2017.
 */
public class ArticleRemoteDataSource implements ArticleDataSource {

    private final ArticleRetrofitDataSource mArticleRetrofitDataSource;
    private final ArticleContract.Mapper mMapper;

    @Inject
    public ArticleRemoteDataSource(ArticleContract.Mapper mapper) {
        mArticleRetrofitDataSource = ArticleRetrofitDataSource.Creator.newArticleRetrofitDataSource();
        mMapper = mapper;
    }

    @Override
    public Flowable<Article> getArticle(int number) {
        return mArticleRetrofitDataSource.getArticle(number).map(mMapper::remoteToEntity);
    }
}
