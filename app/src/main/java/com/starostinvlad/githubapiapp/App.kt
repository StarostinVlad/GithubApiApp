package com.starostinvlad.githubapiapp

import android.app.Application
import android.content.Context
import com.starostinvlad.githubapiapp.di.AppComponent
import com.starostinvlad.githubapiapp.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .context(this)
            .build()
    }
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is App -> appComponent
        else -> applicationContext.appComponent
    }