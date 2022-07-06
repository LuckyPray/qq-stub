package com.tencent.qphone.base.remote;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

import com.tencent.mobileqq.msf.sdk.MsfCommand;
import com.tencent.mobileqq.msf.sdk.MsfSdkUtils;
import com.tencent.qphone.base.BaseConstants;

import java.util.HashMap;

public class ToServiceMsg implements Parcelable {
    public static final Creator CREATOR = new Creator() {
        public ToServiceMsg createFromParcel(Parcel parcel) {
            return new ToServiceMsg(parcel);
        }

        public ToServiceMsg[] newArray(int i) {
            return new ToServiceMsg[i];
        }
    };
    private static final String tag = "ToServiceMsg";
    private static final String version = "version";
//    public IBaseActionListener actionListener;
    private int appId;
    private int appSeq;
    private HashMap attributes;
    public Bundle extraData;
    private MsfCommand msfCommand;
    private boolean needResp;
    private boolean quickSendEnable;
    private int quickSendStrategy;
    private long sendTimeout;
    private String serviceCmd;
    private String serviceName;
    private int ssoSeq;
    private long timeout;
    private byte toVersion;
    private String uin;
    private byte uinType;
    private byte[] wupBuffer;

    public ToServiceMsg(String serviceName, String uin, String serviceCmd) {
        throw new RuntimeException("Stub!");
    }

    public ToServiceMsg(Parcel parcel) {
        this.sendTimeout = -1;
        this.timeout = -1;
        this.appSeq = -1;
        this.wupBuffer = new byte[0];
        this.needResp = true;
        this.ssoSeq = -1;
        this.attributes = new HashMap(32);
        this.extraData = new Bundle();
        this.toVersion = (byte) 1;
        this.msfCommand = MsfCommand.unknown;
        this.uinType = (byte) 0;
        this.quickSendStrategy = -1;
        readFromParcel(parcel);
    }

    public String toString() {
        try {
            StringBuffer stringBuffer = new StringBuffer(256);
            stringBuffer.append(tag);
            stringBuffer.append(" msName:");
            stringBuffer.append(this.msfCommand);
            stringBuffer.append(" ssoSeq:");
            stringBuffer.append(getRequestSsoSeq());
            stringBuffer.append(" appId:");
            stringBuffer.append(this.appId);
            stringBuffer.append(" appSeq:");
            stringBuffer.append(this.appSeq);
            stringBuffer.append(" uin:");
            stringBuffer.append(this.uin);
            stringBuffer.append(" sCmd:");
            stringBuffer.append(this.serviceCmd);
            stringBuffer.append(" t:");
            stringBuffer.append(this.timeout);
            stringBuffer.append(" needResp:");
            stringBuffer.append(this.needResp);
            stringBuffer.append(" needQuickSend:");
            stringBuffer.append(this.quickSendEnable);
            stringBuffer.append(" strategy:");
            stringBuffer.append(this.quickSendStrategy);
            return stringBuffer.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "TSM toString error";
        }
    }

    public String getStringForLog() {
        try {
            StringBuffer stringBuffer = new StringBuffer(256);
            stringBuffer.append(tag);
            stringBuffer.append(" msName:");
            stringBuffer.append(this.msfCommand);
            stringBuffer.append(" ssoSeq:");
            stringBuffer.append(getRequestSsoSeq());
            stringBuffer.append(" appId:");
            stringBuffer.append(this.appId);
            stringBuffer.append(" appSeq:");
            stringBuffer.append(this.appSeq);
            stringBuffer.append(" sName:");
            stringBuffer.append(this.serviceName);
            stringBuffer.append(" uin:");
            stringBuffer.append(MsfSdkUtils.getShortUin(this.uin));
            stringBuffer.append(" sCmd:");
            stringBuffer.append(this.serviceCmd);
            stringBuffer.append(" t:");
            stringBuffer.append(this.timeout);
            stringBuffer.append(" needResp:");
            stringBuffer.append(this.needResp);
            stringBuffer.append(" needQuickSend:");
            stringBuffer.append(this.quickSendEnable);
            stringBuffer.append(" strategy:");
            stringBuffer.append(this.quickSendStrategy);
            return stringBuffer.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "TSM getString error";
        }
    }

    public String getShortStringForLog() {
        try {
            StringBuffer stringBuffer = new StringBuffer(256);
            stringBuffer.append(tag);
            stringBuffer.append(" ssoSeq:");
            stringBuffer.append(getRequestSsoSeq());
            stringBuffer.append(" sCmd:");
            stringBuffer.append(this.serviceCmd);
            stringBuffer.append(" appSeq:");
            stringBuffer.append(this.appSeq);
            stringBuffer.append(" t:");
            stringBuffer.append(this.timeout);
            stringBuffer.append(" needResp:");
            stringBuffer.append(this.needResp);
            stringBuffer.append(" needQuickSend:");
            stringBuffer.append(this.quickSendEnable);
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "fsm getString error";
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        throw new RuntimeException("Stub!");
    }

    private void readFromParcel(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    public byte[] getWupBuffer() {
        return this.wupBuffer;
    }

    public void putWupBuffer(byte[] bArr) {
        this.wupBuffer = bArr;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public void setTimeout(long j) {
        this.timeout = j;
    }

    public String getDestServiceId() {
        return this.serviceName;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getUin() {
        return this.uin;
    }

    public String getServiceCmd() {
        return this.serviceCmd;
    }

//    public IBaseActionListener getActionListener() {
//        return this.actionListener;
//    }

    public boolean isNeedCallback() {
        return this.needResp;
    }

    public void setNeedCallback(boolean z) {
        this.needResp = z;
    }

    public int getAppId() {
        return this.appId;
    }

    public void setAppId(int i) {
        this.appId = i;
    }

    public int getAppSeq() {
        return this.appSeq;
    }

    public void setAppSeq(int i) {
        this.appSeq = i;
    }

    public int getRequestSsoSeq() {
        return this.ssoSeq;
    }

    public void setRequestSsoSeq(int i) {
        this.ssoSeq = i;
    }

    public synchronized Object addAttribute(String str, Object obj) {
        return this.attributes.put(str, obj);
    }

    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    public Object getAttribute(String str, Object obj) {
        return !this.attributes.containsKey(str) ? obj : this.attributes.get(str);
    }

    public HashMap getAttributes() {
        return this.attributes;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public void setUin(String str) {
        this.uin = str;
    }

    public void setServiceCmd(String str) {
        this.serviceCmd = str;
    }

    public MsfCommand getMsfCommand() {
        return this.msfCommand;
    }

    public void setMsfCommand(MsfCommand msfCommand) {
        this.msfCommand = msfCommand;
    }

    public void setAttributes(HashMap hashMap) {
        this.attributes = hashMap;
    }

    public void setEnableFastResend(boolean z) {
        addAttribute("fastresend", Boolean.valueOf(z));
    }

    public boolean isFastResendEnabled() {
        return ((Boolean) getAttribute("fastresend", Boolean.valueOf(false))).booleanValue();
    }

    public void setNeedRemindSlowNetwork(boolean z) {
        addAttribute(BaseConstants.ATTRIBUTE_NEED_REMIND_SLOW_NETWORK, Boolean.valueOf(z));
    }

    public boolean isNeedRemindSlowNetwork() {
        return ((Boolean) getAttribute(BaseConstants.ATTRIBUTE_NEED_REMIND_SLOW_NETWORK, Boolean.valueOf(false))).booleanValue();
    }

    public void setQuickSend(boolean z, int i) {
        this.quickSendEnable = z;
        this.quickSendStrategy = i;
    }

    public boolean isQuickSendEnable() {
        return this.quickSendEnable;
    }

    public int getQuickSendStrategy() {
        return this.quickSendStrategy;
    }
}
