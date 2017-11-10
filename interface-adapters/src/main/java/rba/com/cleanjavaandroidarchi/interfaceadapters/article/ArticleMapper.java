package rba.com.cleanjavaandroidarchi.interfaceadapters.article;

import rba.com.cleanjavaandroidarchi.entity.Article;
import rba.com.cleanjavaandroidarchi.interfaceadapters.article.model.ArticleView;


public class ArticleMapper implements ArticleContract.Mapper{

    @Override
    public ArticleView entityToViewModel(Article article) {
        return new ArticleView(article.getTitle(), article.getContent(), article.getReleaseDate().toString());
    }

    // https://api.github.com/repos/vmg/redcarpet/issues/631

}
