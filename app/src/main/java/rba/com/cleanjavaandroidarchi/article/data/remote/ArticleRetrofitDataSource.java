package rba.com.cleanjavaandroidarchi.article.data.remote;

import com.google.gson.Gson;

import io.reactivex.Flowable;
import rba.com.cleanjavaandroidarchi.entity.Article;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

import static rba.com.cleanjavaandroidarchi.util.GsonBuilder.getGson;

/**
 * CleanJavaAndroidArchi
 *
 * Created by remybarbosa on 11/11/2017.
 */

public interface ArticleRetrofitDataSource {

    @GET("/repos/vmg/redcarpet/issues/{number}")
    Flowable<Article> getArticle(@Path("number") int number);

    class Creator {

        public static ArticleRetrofitDataSource newArticleRetrofitDataSource() {
            final Gson gson = getGson();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.github.com")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
            return retrofit.create(ArticleRetrofitDataSource.class);
        }
    }
}
