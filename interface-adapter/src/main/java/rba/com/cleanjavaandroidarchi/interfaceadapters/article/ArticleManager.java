package rba.com.cleanjavaandroidarchi.interfaceadapters.article;

import javax.inject.Inject;

import io.reactivex.Flowable;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.model.ArticleViewModel;
import rba.com.cleanjavaandroidarchi.usecase.article.GetArticleUseCase;


public class ArticleManager {

    private final GetArticleUseCase mGetArticleUseCase;

    private final ArticleContract.Mapper mMapper;

    @Inject
    ArticleManager(GetArticleUseCase getArticleUseCase, ArticleContract.Mapper mapper) {
        mGetArticleUseCase = getArticleUseCase;
        mMapper = mapper;
    }

    public Flowable<ArticleViewModel> getArticle(int number) {
        return mGetArticleUseCase.execute(number).map(mMapper::entityToViewModel);
    }
}
