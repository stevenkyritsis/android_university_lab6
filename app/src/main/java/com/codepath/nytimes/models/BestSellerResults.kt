package com.codepath.nytimes.models

import com.google.gson.annotations.SerializedName
import com.codepath.nytimes.models.BestSellerBook

class BestSellerResults {
    @SerializedName("list_name")
    var listName: String? = null

    @JvmField
    @SerializedName("books")
    var books: List<BestSellerBook>? = null
}