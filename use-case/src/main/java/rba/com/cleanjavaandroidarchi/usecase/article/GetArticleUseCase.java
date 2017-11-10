package rba.com.cleanjavaandroidarchi.usecase.article;


import javax.inject.Inject;

import io.reactivex.Single;
import rba.com.cleanjavaandroidarchi.entity.Article;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 10/11/2017.
 */

public class GetArticleUseCase {

    private final GetArticle mGetArticle;

    @Inject
    public GetArticleUseCase(GetArticle getArticle) {
        mGetArticle = getArticle;
    }

    public Single<Article> execute(int number) {
        return mGetArticle.getArticle(number);
    }
}
