package rba.com.cleanjavaandroidarchi.app;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import rba.com.cleanjavaandroidarchi.app.di.AppComponent;
import rba.com.cleanjavaandroidarchi.app.di.DaggerAppComponent;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 09/11/2017.
 */

public class CleanJavaAndroidArchiApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }

}
