package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildClientIdentityBytes.class */
public final class GuildClientIdentityBytes {
    public int clientId;
    public ArrayList<GuildIdentity> identitys = new ArrayList<>();
    public ArrayList<GuildIdentityWithClientId> defaultIdentities = new ArrayList<>();

    public int getClientId() {
        return this.clientId;
    }

    public ArrayList<GuildIdentityWithClientId> getDefaultIdentities() {
        return this.defaultIdentities;
    }

    public ArrayList<GuildIdentity> getIdentitys() {
        return this.identitys;
    }

    public String toString() {
        return "GuildClientIdentityBytes{clientId=" + this.clientId + ",identitys=" + this.identitys + ",defaultIdentities=" + this.defaultIdentities + ",}";
    }
}
