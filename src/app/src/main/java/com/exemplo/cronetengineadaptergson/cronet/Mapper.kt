package com.exemplo.cronetengineadaptergson.cronet

interface Mapper<R, T> {
    fun execute(data: R): T
}