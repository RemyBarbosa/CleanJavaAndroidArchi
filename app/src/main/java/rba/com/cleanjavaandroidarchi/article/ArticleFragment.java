package rba.com.cleanjavaandroidarchi.article;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;
import rba.com.cleanjavaandroidarchi.R;
import rba.com.cleanjavaandroidarchi.app.di.annotation.ActivityScoped;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.ArticleContract;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.model.ArticleView;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 09/11/2017.
 */

@ActivityScoped
public class ArticleFragment extends DaggerFragment implements ArticleContract.View {


    @Inject
    ArticleContract.Presenter mPresenter;

    private TextView mArticleDetailView;

    @Inject
    public ArticleFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        final View fragmentView = inflater.inflate(R.layout.fragment_article, container, false);
        bindViews(fragmentView);
        return fragmentView;
    }

    private void bindViews(View fragmentView) {
        mArticleDetailView = fragmentView.findViewById(R.id.article_detail);
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

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mPresenter.fetchArticle(631);
    }

    @Override
    public void showArticle(ArticleView articleView) {
        mArticleDetailView.setText(
                String.format("%s%n"
                                + "%n"
                                + "%s%n"
                                + "%n"
                                + "%s",
                        articleView.getTitle(),
                        articleView.getContent(),
                        articleView.getReleaseDate())
        );
    }
}
