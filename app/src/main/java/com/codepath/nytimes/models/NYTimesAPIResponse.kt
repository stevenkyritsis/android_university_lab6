package com.codepath.nytimes.models

import com.google.gson.annotations.SerializedName
import com.codepath.nytimes.models.BestSellerResults

class NYTimesAPIResponse {
    @SerializedName("status")
    var status: String? = null

    @JvmField
    @SerializedName("results")
    var results: BestSellerResults? = null
}