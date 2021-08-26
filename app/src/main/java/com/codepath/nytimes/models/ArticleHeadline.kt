package com.codepath.nytimes.models

import com.google.gson.annotations.SerializedName

class ArticleHeadline {
    @JvmField
    @SerializedName("main")
    var main: String? = null

    @SerializedName("print_headline")
    var printHeadline: String? = null
}