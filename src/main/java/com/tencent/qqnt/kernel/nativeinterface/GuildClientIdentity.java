package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildClientIdentity.class */
public final class GuildClientIdentity {
    public int clientId;
    public String desc;
    public GuildClientIdentityBytes identityBytes;

    public GuildClientIdentity() {
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.identityBytes = new GuildClientIdentityBytes();
    }

    public int getClientId() {
        return this.clientId;
    }

    public String getDesc() {
        return this.desc;
    }

    public GuildClientIdentityBytes getIdentityBytes() {
        return this.identityBytes;
    }

    public String toString() {
        return "GuildClientIdentity{clientId=" + this.clientId + ",desc=" + this.desc + ",identityBytes=" + this.identityBytes + ",}";
    }

    public GuildClientIdentity(int i, String str, GuildClientIdentityBytes guildClientIdentityBytes) {
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.identityBytes = new GuildClientIdentityBytes();
        this.clientId = i;
        this.desc = str;
        this.identityBytes = guildClientIdentityBytes;
    }
}
