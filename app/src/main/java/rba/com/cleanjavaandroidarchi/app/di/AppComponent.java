package rba.com.cleanjavaandroidarchi.app.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import rba.com.cleanjavaandroidarchi.app.CleanJavaAndroidArchiApplication;
import rba.com.cleanjavaandroidarchi.article.di.ArticlePresenterModule;

@Singleton
@Component(
        modules = {
                ApplicationModule.class,
                ArticlePresenterModule.class
        }
)

public interface AppComponent extends AndroidInjector<DaggerApplication> {

    void inject(CleanJavaAndroidArchiApplication application);

    @Override
    void inject(DaggerApplication instance);

    // Gives us syntactic sugar. we can then do DaggerAppComponent.builder().application(this).build().inject(this);
    // never having to instantiate any modules or say which module we are passing the application to.
    // Application will just be provided into our app graph now.
    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}