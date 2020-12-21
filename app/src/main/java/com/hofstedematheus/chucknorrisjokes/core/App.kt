package com.hofstedematheus.chucknorrisjokes.core

import android.app.Application
import com.hofstedematheus.chucknorrisjokes.core.di.components.ApplicationComponent
import com.hofstedematheus.chucknorrisjokes.core.di.components.DaggerApplicationComponent

class App : Application() {

    lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerApplicationComponent.factory().create(this)
    }
}
