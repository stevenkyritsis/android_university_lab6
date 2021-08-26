package com.codepath.nytimes.networking

interface CallbackResponse<T> {
    fun onSuccess(model: T)
    fun onFailure(error: Throwable?)
}