package com.codepath.nytimes.models

import com.google.gson.annotations.SerializedName

class Multimedia {
    @SerializedName("subtype")
    var subtype: String? = null

    @SerializedName("url")
    var url: String? = null
}