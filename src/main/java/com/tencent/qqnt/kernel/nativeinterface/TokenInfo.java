package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TokenInfo.class */
public final class TokenInfo implements IKernelModel {
    public byte[] apnsToken;
    public String profileId;
    public int tokenType;
    public byte[] voipToken;

    public TokenInfo() {
    }

    public byte[] getApnsToken() {
        return this.apnsToken;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public int getTokenType() {
        return this.tokenType;
    }

    public byte[] getVoipToken() {
        return this.voipToken;
    }

    public void setApnsToken(byte[] bArr) {
        this.apnsToken = bArr;
    }

    public void setProfileId(String str) {
        this.profileId = str;
    }

    public void setTokenType(int i) {
        this.tokenType = i;
    }

    public void setVoipToken(byte[] bArr) {
        this.voipToken = bArr;
    }

    public String toString() {
        return "TokenInfo{tokenType=" + this.tokenType + ",apnsToken=" + this.apnsToken + ",voipToken=" + this.voipToken + ",profileId=" + this.profileId + ",}";
    }

    public TokenInfo(int i, byte[] bArr, byte[] bArr2, String str) {
        this.tokenType = i;
        this.apnsToken = bArr;
        this.voipToken = bArr2;
        this.profileId = str;
    }
}
