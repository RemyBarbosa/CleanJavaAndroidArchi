package rba.com.cleanjavaandroidarchi.article.data.remote;

import org.joda.time.DateTime;

import javax.inject.Inject;

import io.reactivex.Flowable;
import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.usecase.article.data.source.ArticleDataSource;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 11/11/2017.
 */
public class ArticleLocalDataSource implements ArticleDataSource {

    @Inject
    public ArticleLocalDataSource() {}

    @Override
    public Flowable<Article> getArticle(int number) {
        return Flowable.just(new Article("title", "http://www.foo.com", DateTime.now()));
    }
}
