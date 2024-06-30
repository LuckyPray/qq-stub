package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildIdentity.class */
public final class GuildIdentity {
    public int identityType;
    public int type;
    public String value = "";
    public byte[] thirdPartyData = new byte[0];
    public byte[] thirdPartyDataJson = new byte[0];

    public int getIdentityType() {
        return this.identityType;
    }

    public byte[] getThirdPartyData() {
        return this.thirdPartyData;
    }

    public byte[] getThirdPartyDataJson() {
        return this.thirdPartyDataJson;
    }

    public int getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "GuildIdentity{type=" + this.type + ",value=" + this.value + ",identityType=" + this.identityType + ",thirdPartyData=" + this.thirdPartyData + ",thirdPartyDataJson=" + this.thirdPartyDataJson + ",}";
    }
}
