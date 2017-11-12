package rba.com.cleanjavaandroidarchi.article.di;

import dagger.Module;
import dagger.Provides;
import rba.com.cleanjavaandroidarchi.article.data.database.ArticleLocalDataSource;
import rba.com.cleanjavaandroidarchi.usecase.di.annotation.Local;
import rba.com.cleanjavaandroidarchi.usecase.di.annotation.Remote;
import rba.com.cleanjavaandroidarchi.usecase.article.data.ArticleRepository;
import rba.com.cleanjavaandroidarchi.article.data.remote.ArticleRemoteDataSource;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticleContract;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticleMapper;
import rba.com.cleanjavaandroidarchi.usecase.article.data.source.ArticleDataSource;

@Module
public class ArticleModulePresenter {

    @Provides
    ArticleDataSource provideArticleRepository(ArticleRepository articleRepository) {
        return articleRepository;
    }

    @Provides
    @Remote
    ArticleDataSource provideArticleRemoteDataSource(ArticleRemoteDataSource articleRemoteDataSource) {
        return articleRemoteDataSource;
    }

    @Provides
    @Local
    ArticleDataSource provideArticleLocalDataSource(ArticleLocalDataSource articleLocalDataSource) {
        return articleLocalDataSource;
    }

    @Provides
    ArticleContract.Mapper provideArticleMapper(ArticleMapper articleMapper) {
        return articleMapper;
    }
}
