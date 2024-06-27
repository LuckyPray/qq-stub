package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RevealAuthorityRsp.class */
public final class RevealAuthorityRsp {
    public ArrayList<LastTofu> lastTofus;

    public RevealAuthorityRsp() {
        this.lastTofus = new ArrayList<>();
    }

    public ArrayList<LastTofu> getLastTofus() {
        return this.lastTofus;
    }

    public String toString() {
        return "RevealAuthorityRsp{lastTofus=" + this.lastTofus + ",}";
    }

    public RevealAuthorityRsp(ArrayList<LastTofu> arrayList) {
        this.lastTofus = new ArrayList<>();
        this.lastTofus = arrayList;
    }
}
