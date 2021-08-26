package com.codepath.nytimes.models

import com.google.gson.annotations.SerializedName
import com.codepath.nytimes.models.ArticlesResponse

class NYTimesArticlesAPIResponse {
    @SerializedName("status")
    var status: String? = null

    @JvmField
    @SerializedName("response")
    var response: ArticlesResponse? = null
}