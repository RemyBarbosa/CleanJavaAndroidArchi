package rba.com.cleanjavaandroidarchi.interfaceadapters.article;


import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.model.ArticleRemoteModel;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.model.ArticleViewModel;
import rba.com.cleanjavaandroidarchi.interfaceadapters.base.BasePresenter;
import rba.com.cleanjavaandroidarchi.interfaceadapters.base.BaseView;

public interface ArticleContract {

    interface View extends BaseView<Presenter> {
        void showArticle(ArticleViewModel articleViewModel);
    }

    interface Presenter extends BasePresenter<View> {

        void showArticle(int articleNumber);

        void takeView(View articleView);

        void destroy();

    }
    
    interface Mapper {
        ArticleViewModel entityToViewModel(Article article);
        Article remoteToEntity(ArticleRemoteModel articleRemoteModel);
    }
}
