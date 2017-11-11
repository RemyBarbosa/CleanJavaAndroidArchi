package rba.com.cleanjavaandroidarchi.interfaceadapters.article;

import android.support.annotation.Nullable;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.model.ArticleView;

public class ArticlePresenter implements ArticleContract.Presenter {

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
                .subscribeWith(new DisposableSingleObserver<ArticleView>() {
                    @Override
                    public final void onError(final Throwable e) {
                    }

                    @Override
                    public final void onSuccess(final ArticleView articleView) {
                        mView.showArticle(articleView);
                    }
                }));
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

    // https://api.github.com/repos/vmg/redcarpet/issues/631

}
