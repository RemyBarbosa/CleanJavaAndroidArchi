package rba.com.cleanjavaandroidarchi.article.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import rba.com.cleanjavaandroidarchi.app.di.annotation.Remote;
import rba.com.cleanjavaandroidarchi.article.data.ArticleRepository;
import rba.com.cleanjavaandroidarchi.article.data.remote.ArticleRemoteDataSource;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticleContract;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticleMapper;
import rba.com.cleanjavaandroidarchi.usecase.article.data.source.ArticleDataSource;

@Module
public class ArticleModulePresenter {

    @Singleton
    @Provides
    ArticleDataSource provideArticleRepository(ArticleRepository articleRepository) {
        return articleRepository;
    }

    @Singleton
    @Provides
    @Remote
    ArticleDataSource provideArticleRemoteDataSource() {
        return new ArticleRemoteDataSource();
    }

    @Singleton
    @Provides
    ArticleContract.Mapper provideArticleMapper() {
        return new ArticleMapper();
    }
}
