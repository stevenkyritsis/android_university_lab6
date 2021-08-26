package com.codepath.nytimes.models

import com.google.gson.annotations.SerializedName

class BestSellerBook {
    @JvmField
    @SerializedName("rank")
    var rank = 0

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("author")
    var author: String? = null

    @JvmField
    @SerializedName("book_image")
    var bookImageUrl: String? = null

    @SerializedName("publisher")
    var publisher: String? = null

    @JvmField
    @SerializedName("description")
    var description: String? = null

    @SerializedName("amazon_product_url")
    var amazonUrl: String? = null
}