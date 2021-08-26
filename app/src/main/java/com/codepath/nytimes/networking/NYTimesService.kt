package com.codepath.nytimes.networking

import retrofit2.http.GET
import com.codepath.nytimes.models.NYTimesAPIResponse
import com.codepath.nytimes.models.NYTimesArticlesAPIResponse
import retrofit2.Call
import retrofit2.http.Path
import retrofit2.http.Query

interface NYTimesService {
    @GET("svc/books/v3/lists/{date}/{list}.json")
    fun getBestSellingBooks(@Path("date") date: String?, @Path("list") list: String?, @Query("api-key") apikey: String?): Call<NYTimesAPIResponse?>?

    @GET("svc/search/v2/articlesearch.json")
    fun getArticlesByQuery(
            @Query("q") query: String?,
            @Query("page") page: Int,
            @Query("sort") sortBy: String?,
            @Query("fl") filter: String?,
            @Query("begin_date") beginDate: String?,
            @Query("api-key") apikey: String?): Call<NYTimesArticlesAPIResponse?>?
}