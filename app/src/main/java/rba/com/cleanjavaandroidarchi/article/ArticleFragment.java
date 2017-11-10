package rba.com.cleanjavaandroidarchi.article;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;
import rba.com.cleanjavaandroidarchi.app.di.ActivityScoped;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticleContract;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 09/11/2017.
 */

@ActivityScoped
public class ArticleFragment extends DaggerFragment implements ArticleContract.View {


    @Inject
    ArticleContract.Presenter mPresenter;

    @Inject
    public ArticleFragment() {
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.takeView(this);
    }

    @Override
    public void onDestroy() {
        mPresenter.destroy();
        super.onDestroy();
    }

}
