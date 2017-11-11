package rba.com.cleanjavaandroidarchi.app.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import rba.com.cleanjavaandroidarchi.app.di.annotation.ActivityScoped;
import rba.com.cleanjavaandroidarchi.article.ArticleActivity;
import rba.com.cleanjavaandroidarchi.article.di.ArticleModule;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = ArticleModule.class)
    abstract ArticleActivity articleActivity();
}
