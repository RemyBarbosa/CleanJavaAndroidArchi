package rba.com.cleanjavaandroidarchi.article;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import rba.com.cleanjavaandroidarchi.R;
import rba.com.cleanjavaandroidarchi.util.ActivityUtils;

public class ArticleActivity extends DaggerAppCompatActivity {

    @Inject
    ArticleFragment injectedFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArticleFragment taskDetailFragment = (ArticleFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);

        if (taskDetailFragment == null) {
            taskDetailFragment = injectedFragment;
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    taskDetailFragment, R.id.contentFrame);
        }
    }
}
