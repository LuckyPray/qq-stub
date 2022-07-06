package com.tencent.qphone.base.remote;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

import com.tencent.mobileqq.msf.sdk.MsfCommand;
import com.tencent.mobileqq.msf.sdk.MsfSdkUtils;

import java.util.HashMap;

public class FromServiceMsg implements Parcelable, Cloneable {
    public static final Creator CREATOR = new Creator() {
        public FromServiceMsg createFromParcel(Parcel parcel) {
            return new FromServiceMsg(parcel);
        }

        public FromServiceMsg[] newArray(int i) {
            return new FromServiceMsg[i];
        }
    };
    private static final String tag = "FromServiceMsg";
    private static final String version = "version";
    private int appId;
    private int appSeq;
    public HashMap attributes;
    private String errorMsg;
    public Bundle extraData;
    private int flag;
    private byte fromVersion;
    private MsfCommand msfCommand;
    private byte[] msgCookie;
    private int resultCode;
    private String serviceCmd;
    private int ssoSeq;
    private String uin;
    private byte[] wupBuffer;

    public byte[] getMsgCookie() {
        return this.msgCookie;
    }

    public void setMsgCookie(byte[] bArr) {
        this.msgCookie = bArr;
    }

    public FromServiceMsg() {
        throw new RuntimeException("Stub!");
    }

    public FromServiceMsg(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public FromServiceMsg(int i, int i2, String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public FromServiceMsg(int i, int i2, String str, String str2, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public FromServiceMsg(Parcel parcel) {
        this.errorMsg = "";
        this.ssoSeq = -1;
        this.appSeq = -1;
        this.wupBuffer = new byte[0];
        this.attributes = new HashMap(32);
        this.fromVersion = (byte) 1;
        this.msfCommand = MsfCommand.unknown;
        this.msgCookie = new byte[0];
        this.extraData = new Bundle();
        readFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        throw new RuntimeException("Stub!");
    }

    public void readFromParcel(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        try {
            int i;
            int length = ((((((((((tag.length() + 8) + this.msfCommand.toString().length()) + 8) + 10) + 10) + 10) + 10) + this.errorMsg.length()) + 5) + 10) + 12;
            if (this.serviceCmd == null) {
                i = 4;
            } else {
                i = this.serviceCmd.length();
            }
            StringBuilder stringBuilder = new StringBuilder((((((i + length) + 7) + 10) + 8) + 10) + 10);
            stringBuilder.append(tag);
            stringBuilder.append(" msName:");
            stringBuilder.append(this.msfCommand);
            stringBuilder.append(" ssoSeq:");
            stringBuilder.append(getRequestSsoSeq());
            stringBuilder.append(" failCode:");
            stringBuilder.append(this.resultCode);
            stringBuilder.append(" errorMsg:");
            stringBuilder.append(this.errorMsg);
            stringBuilder.append(" uin:");
            stringBuilder.append(this.uin);
            stringBuilder.append(" serviceCmd:");
            stringBuilder.append(this.serviceCmd);
            stringBuilder.append(" appId:");
            stringBuilder.append(this.appId);
            stringBuilder.append(" appSeq:");
            stringBuilder.append(this.appSeq);
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "fsm toString error";
        }
    }

    public String getStringForLog() {
        try {
            int i;
            int length = ((((((((((tag.length() + 8) + this.msfCommand.toString().length()) + 8) + 10) + 10) + 10) + 10) + this.errorMsg.length()) + 5) + 10) + 12;
            if (this.serviceCmd == null) {
                i = 4;
            } else {
                i = this.serviceCmd.length();
            }
            StringBuilder stringBuilder = new StringBuilder((((((i + length) + 7) + 10) + 8) + 10) + 10);
            stringBuilder.append(tag);
            stringBuilder.append(" msName:");
            stringBuilder.append(this.msfCommand);
            stringBuilder.append(" ssoSeq:");
            stringBuilder.append(getRequestSsoSeq());
            stringBuilder.append(" failCode:");
            stringBuilder.append(this.resultCode);
            stringBuilder.append(" errorMsg:");
            stringBuilder.append(this.errorMsg);
            stringBuilder.append(" uin:");
            stringBuilder.append(MsfSdkUtils.getShortUin(this.uin));
            stringBuilder.append(" serviceCmd:");
            stringBuilder.append(this.serviceCmd);
            stringBuilder.append(" appId:");
            stringBuilder.append(this.appId);
            stringBuilder.append(" appSeq:");
            stringBuilder.append(this.appSeq);
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "fsm getString error";
        }
    }

    public String getShortStringForLog() {
        try {
            int i;
            int length = (((((((tag.length() + 8) + 8) + 10) + 10) + 10) + 5) + 10) + 12;
            if (this.serviceCmd == null) {
                i = 4;
            } else {
                i = this.serviceCmd.length();
            }
            StringBuilder stringBuilder = new StringBuilder((((((i + length) + 7) + 10) + 8) + 10) + 10);
            stringBuilder.append(tag);
            stringBuilder.append(" msName:");
            stringBuilder.append(this.msfCommand);
            stringBuilder.append(" ssoSeq:");
            stringBuilder.append(getRequestSsoSeq());
            stringBuilder.append(" serviceCmd:");
            stringBuilder.append(this.serviceCmd);
            stringBuilder.append(" appSeq:");
            stringBuilder.append(this.appSeq);
            stringBuilder.append(" failCode:");
            stringBuilder.append(this.resultCode);
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "fsm getString error";
        }
    }

    public byte[] getWupBuffer() {
        return this.wupBuffer;
    }

    public void putWupBuffer(byte[] bArr) {
        this.wupBuffer = bArr;
    }

    public boolean isSuccess() {
        return this.resultCode == 1000;
    }

    public void setBusinessFail(int i) {
        this.resultCode = i;
    }

    public void setBusinessFail(int i, String str) {
        this.resultCode = i;
        this.errorMsg = str;
    }

    public void setBusinessFail(int i, int i2, String str) {
        this.resultCode = i2;
        this.errorMsg = str;
    }

    public int getBusinessFailCode(int i) {
        return this.resultCode == -1 ? i : this.resultCode;
    }

    public int getBusinessFailCode() {
        return this.resultCode;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getBusinessFailMsg() {
        return this.errorMsg;
    }

    public void setMsgSuccess() {
        this.resultCode = 1000;
    }

    public void setMsgFail() {
        this.resultCode = 1001;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getUin() {
        return this.uin;
    }

    public String getServiceCmd() {
        return this.serviceCmd;
    }

    public void setServiceCmd(String str) {
        this.serviceCmd = str;
    }

    public void setUin(String str) {
        this.uin = str;
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

    public int getAppSeq() {
        return this.appSeq;
    }

    public void setAppSeq(int i) {
        this.appSeq = i;
    }

    public int getAppId() {
        return this.appId;
    }

    public void setAppId(int i) {
        this.appId = i;
    }

    public int getRequestSsoSeq() {
        return this.ssoSeq;
    }

    public void setRequestSsoSeq(int i) {
        this.ssoSeq = i;
    }

    public byte getFromVersion() {
        return this.fromVersion;
    }

    public void setFromVersion(byte b) {
        this.fromVersion = b;
    }

    public MsfCommand getMsfCommand() {
        return this.msfCommand;
    }

    public void setMsfCommand(MsfCommand msfCommand) {
        this.msfCommand = msfCommand;
    }
}
