package rba.com.cleanjavaandroidarchi.article.di;


import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import rba.com.cleanjavaandroidarchi.app.di.FragmentScoped;
import rba.com.cleanjavaandroidarchi.article.ArticleFragment;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticleContract;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticlePresenter;


@Module
public abstract class ArticlePresenterModule {


    @FragmentScoped
    @ContributesAndroidInjector
    abstract ArticleFragment articleFragment();

    @FragmentScoped
    @Binds
    abstract ArticleContract.Presenter articlePresenter(ArticlePresenter presenter);
}
