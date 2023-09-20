package com.example.data.local

import android.content.Context

object SharedObject {
    lateinit var appContext: Context
        private set

    fun initContext(context: Context) {
        appContext = context
    }
}