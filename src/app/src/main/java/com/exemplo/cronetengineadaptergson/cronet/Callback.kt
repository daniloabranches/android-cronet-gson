package com.exemplo.cronetengineadaptergson.cronet

interface Callback<T> {
    fun success(data: T)
    fun error(error: Throwable)
}