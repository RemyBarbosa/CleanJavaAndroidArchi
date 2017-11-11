package rba.com.cleanjavaandroidarchi.interfaceadapters.article;

import javax.inject.Inject;

import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.model.ArticleView;

public class ArticleMapper implements ArticleContract.Mapper {

    @Inject
    public ArticleMapper() {
    }

    @Override
    public ArticleView entityToViewModel(Article article) {
        return new ArticleView(article.getTitle(), article.getContent().substring(0, 50), article.getReleaseDate().toString());
    }
}
