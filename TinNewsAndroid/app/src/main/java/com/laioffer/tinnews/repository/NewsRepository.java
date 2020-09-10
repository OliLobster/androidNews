package com.laioffer.tinnews.repository;

public class NewsRepository {

    private final NewsApi newsApi;

    public NewsRepository(Context context) {
        newsApi = RetrofitClient.newInstance(context).create(NewsApi.class);
    }
}

