package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/Verify.class */
public final class Verify implements IKernelModel {
    public String randStr;
    public String ticket;
    public String token;
    public int type;

    public Verify() {
        this.ticket = "";
        this.randStr = "";
        this.token = "";
    }

    public String getRandStr() {
        return this.randStr;
    }

    public String getTicket() {
        return this.ticket;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public void setRandStr(String str) {
        this.randStr = str;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "Verify{type=" + this.type + ",ticket=" + this.ticket + ",randStr=" + this.randStr + ",token=" + this.token + ",}";
    }

    public Verify(int i, String str, String str2, String str3) {
        this.ticket = "";
        this.randStr = "";
        this.token = "";
        this.type = i;
        this.ticket = str;
        this.randStr = str2;
        this.token = str3;
    }
}
