package com.starostinvlad.githubapiapp

import android.app.Application
import android.content.Context
import com.starostinvlad.githubapiapp.di.AppComponent
import com.starostinvlad.githubapiapp.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .context(this)
            .build()
    }
}

val Context.appComponent: AppComponent
    get() =
        when (this) {
            is App -> this.appComponent
            else -> this.applicationContext.appComponent
        }