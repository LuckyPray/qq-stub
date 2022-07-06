package com.tencent.common.app;

import android.os.Bundle;

import com.tencent.mobileqq.app.BusinessHandler;
import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.remote.ToServiceMsg;
import com.tencent.qphone.base.util.BaseApplication;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import mqq.app.AppRuntime;
import mqq.app.MobileQQ;
import mqq.observer.BusinessObserver;

public abstract class AppInterface extends AppRuntime {
    private final ConcurrentHashMap allHandler;
    public MobileQQ app;
    private final List bgObservers;
    private final List defaultObservers;
    protected final ConcurrentHashMap handlerMap;
    protected String processName;
    private final List uiObservers;

    public AppInterface(MobileQQ arg3, String arg4) {
        throw new RuntimeException("Stub !");
    }

    protected BusinessHandler createHandler(String arg12) {
        throw new RuntimeException("Stub !");
    }

    private void destroyBusinessObserverList() {
        throw new RuntimeException("Stub !");
    }

    public abstract BaseApplication getApp();

    public abstract int getAppid();

    public BusinessHandler getBusinessHandler(String arg4) {
        BusinessHandler v0 = (BusinessHandler)this.allHandler.get(arg4);
        if(v0 != null) {
            return v0;
        }

        ConcurrentHashMap v1 = this.allHandler;
        synchronized(v1) {
            v0 = (BusinessHandler)this.allHandler.get(arg4);
            if(v0 == null) {
                v0 = this.createHandler(arg4);
                if(v0 != null) {
                    this.allHandler.put(arg4, v0);
                }
            }

            return v0;
        }
    }

    public List getBusinessObserver(int arg2) {
        if(arg2 == 1) {
            return this.uiObservers;
        }

        return arg2 == 2 ? this.bgObservers : this.defaultObservers;
    }

    public abstract String getCurrentAccountUin();

    public String getCurrentNickname() {
        return "";
    }

    @Override  // mqq.app.AppRuntime
    public void onCreate(Bundle arg1) {
        super.onCreate(arg1);
    }

    @Override  // mqq.app.AppRuntime
    public void onDestroy() {
    }

    public void receiveToService(ToServiceMsg arg4, FromServiceMsg arg5) {
    }

    public void removeHandler(Class arg2) {
        this.handlerMap.remove(arg2);
    }

    public void removeObserver(BusinessObserver arg3) {
        throw new RuntimeException("Stub !");
    }

    public void sendToService(ToServiceMsg arg2) {
    }
}

