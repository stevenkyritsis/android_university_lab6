package com.codepath.nytimes.models

import com.google.gson.annotations.SerializedName
import com.codepath.nytimes.models.Article

class ArticlesResponse {
    @JvmField
    @SerializedName("docs")
    var docs: List<Article>? = null
}