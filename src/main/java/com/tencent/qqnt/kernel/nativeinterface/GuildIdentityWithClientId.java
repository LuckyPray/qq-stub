package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildIdentityWithClientId.class */
public final class GuildIdentityWithClientId {
    public int clientId;
    public GuildIdentity identities = new GuildIdentity();

    public int getClientId() {
        return this.clientId;
    }

    public GuildIdentity getIdentities() {
        return this.identities;
    }

    public String toString() {
        return "GuildIdentityWithClientId{clientId=" + this.clientId + ",identities=" + this.identities + ",}";
    }
}
