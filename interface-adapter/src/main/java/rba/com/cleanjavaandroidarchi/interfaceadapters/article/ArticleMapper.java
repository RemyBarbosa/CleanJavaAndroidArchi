package rba.com.cleanjavaandroidarchi.interfaceadapters.article;

import javax.inject.Inject;

import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.model.ArticleViewModel;

public class ArticleMapper implements ArticleContract.Mapper {

    @Inject
    public ArticleMapper() {
    }

    @Override
    public ArticleViewModel entityToViewModel(Article article) {
        return new ArticleViewModel(article.getTitle(), article.getUrl(), article.getCreationDate().toString());
    }
}
