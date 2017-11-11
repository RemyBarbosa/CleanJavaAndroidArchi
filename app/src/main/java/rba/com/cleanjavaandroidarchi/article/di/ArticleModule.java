package rba.com.cleanjavaandroidarchi.article.di;


import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import rba.com.cleanjavaandroidarchi.app.di.annotation.ActivityScoped;
import rba.com.cleanjavaandroidarchi.app.di.annotation.FragmentScoped;
import rba.com.cleanjavaandroidarchi.article.ArticleActivity;
import rba.com.cleanjavaandroidarchi.article.ArticleFragment;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticleContract;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticlePresenter;


@Module
public abstract class ArticleModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract ArticleFragment articleFragment();

    @ActivityScoped
    @Binds
    abstract ArticleContract.Presenter articlePresenter(ArticlePresenter presenter);

    @Provides
    @ActivityScoped
    static int provideArticleNumber(ArticleActivity activity) {
        return activity.getIntent().getIntExtra(ArticleActivity.EXTRA_ARTICLE_NUMBER, 0);
    }
}
