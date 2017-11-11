package rba.com.cleanjavaandroidarchi.interfaceadapters.article;


import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.model.ArticleView;
import rba.com.cleanjavaandroidarchi.interfaceadapters.base.BasePresenter;
import rba.com.cleanjavaandroidarchi.interfaceadapters.base.BaseView;

public interface ArticleContract {

    interface View extends BaseView<Presenter> {
        void showArticle(ArticleView articleView);
    }

    interface Presenter extends BasePresenter<View> {

        void showArticle(int articleNumber);

        void takeView(ArticleContract.View articleView);

        void destroy();

    }
    
    interface Mapper {
        ArticleView entityToViewModel(Article article);
    }
}
