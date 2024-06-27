package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RevealAuthorityReq.class */
public final class RevealAuthorityReq {
    public ArrayList<LastTofu> lastTofus;
    public long uin;

    public RevealAuthorityReq() {
        this.lastTofus = new ArrayList<>();
    }

    public ArrayList<LastTofu> getLastTofus() {
        return this.lastTofus;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "RevealAuthorityReq{uin=" + this.uin + ",lastTofus=" + this.lastTofus + ",}";
    }

    public RevealAuthorityReq(long j, ArrayList<LastTofu> arrayList) {
        this.lastTofus = new ArrayList<>();
        this.uin = j;
        this.lastTofus = arrayList;
    }
}
