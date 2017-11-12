package rba.com.cleanjavaandroidarchi.interfaceadapters.article;

import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class ArticlePresenter implements ArticleContract.Presenter {

    private static final String TAG = ArticlePresenter.class.getSimpleName();

    private CompositeDisposable disposables;

    @Nullable
    private ArticleContract.View mView;

    private final ArticleManager mArticleManager;

    @Inject
    public ArticlePresenter(ArticleManager articleManager) {
        mArticleManager = articleManager;
        disposables = new CompositeDisposable();
    }

    @Override
    public void showArticle(int articleNumber) {
        disposables.add(mArticleManager.getArticle(articleNumber)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        articleViewModel -> mView.showArticle(articleViewModel),
                        e -> Log.e(TAG, "showArticle: ", e)
                ));
    }

    @Override
    public void takeView(ArticleContract.View view) {
        mView = view;
    }

    @Override
    public void destroy() {
        disposables.clear();
        mView = null;
    }

}
