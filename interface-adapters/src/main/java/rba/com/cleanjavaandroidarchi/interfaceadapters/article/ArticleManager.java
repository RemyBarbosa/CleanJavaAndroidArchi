package rba.com.cleanjavaandroidarchi.interfaceadapters.article;

import javax.inject.Inject;

import io.reactivex.Single;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.model.ArticleView;
import rba.com.cleanjavaandroidarchi.usecase.article.GetArticleUseCase;


public class ArticleManager {

    private final GetArticleUseCase mGetArticleUseCase;

    private final ArticleContract.Mapper mMapper;

    @Inject
    ArticleManager(GetArticleUseCase getArticleUseCase, ArticleContract.Mapper mapper) {
        mGetArticleUseCase = getArticleUseCase;
        mMapper = mapper;
    }

    public Single<ArticleView> getArticle(int number) {
        return mGetArticleUseCase.execute(number).map(mMapper::entityToViewModel);
    }

    // https://api.github.com/repos/vmg/redcarpet/issues/631

}
