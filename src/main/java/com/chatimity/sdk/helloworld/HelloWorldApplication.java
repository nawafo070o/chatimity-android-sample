package com.chatimity.sdk.helloworld;

import android.app.Application;

import com.chatimity.android.chatimity.Chatimity;
import com.chatimity.android.chatimity.models.ChatimityConfig;

public class HelloWorldApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Chatimity.initialize(this,
                new ChatimityConfig.Builder()
                        .setTitle("Hello World Chat")
                        .showPics(true)
                        .showNicePoints(true)
                        .themeColor(R.color.theme_color)
                        .admobBannerAdUnitId("928f2f0df4014457")
                        .build());
    }
}
