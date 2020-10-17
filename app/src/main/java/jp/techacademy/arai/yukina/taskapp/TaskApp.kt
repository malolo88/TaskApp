package jp.techacademy.arai.yukina.taskapp

import android.app.Application
import io.realm.Realm

class TaskApp : Application(){
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}