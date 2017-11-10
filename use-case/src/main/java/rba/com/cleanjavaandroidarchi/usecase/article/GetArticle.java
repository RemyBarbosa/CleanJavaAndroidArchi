package rba.com.cleanjavaandroidarchi.usecase.article;

import io.reactivex.Single;
import rba.com.cleanjavaandroidarchi.entity.Article;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 10/11/2017.
 */

interface GetArticle {
    Single<Article> getArticle(int number);
}
