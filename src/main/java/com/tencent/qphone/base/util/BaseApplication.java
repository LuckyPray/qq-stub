package com.tencent.qphone.base.util;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import java.util.ArrayList;

@SuppressLint("MissingSuperCall")
public abstract class BaseApplication extends Application {

    public static int appnewavmsgicon = 0;
    public static int appnewmsgicon = 0;
    @SuppressLint("StaticFieldLeak")
    static Context context;
    public static int defaultNotifSoundResourceId = 0;
    public static int devlockQuickloginIcon = 0;
    public static ArrayList exclusiveStreamList = new ArrayList();
    public static int qqlaunchicon = 0;
    public static int qqwifiicon = 0;

    public void onCreate() {
        throw new RuntimeException("Stub!");
    }

    public static Context getContext() {
        return context;
    }

    public static int getQQNewMsgIcon() {
        return appnewmsgicon;
    }

    public static int getQQNewAVMsgIcon() {
        return appnewavmsgicon;
    }

    public static int getQQLaunchIcon() {
        return qqlaunchicon;
    }

    public static int getQQWiFiIcon() {
        return qqwifiicon;
    }

    public static int getDefaultNotifSoundResourceId() {
        return defaultNotifSoundResourceId;
    }

    public static int getDevlockQuickloginIcon() {
        return devlockQuickloginIcon;
    }

}
