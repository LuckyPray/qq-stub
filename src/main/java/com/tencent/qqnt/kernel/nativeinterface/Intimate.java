package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/Intimate.class */
public final class Intimate {
    public int iconFlag;
    public boolean isListenTogetherOpen;
    public ArrayList<MutualMark> mutual;

    public Intimate() {
        this.mutual = new ArrayList<>();
    }

    public int getIconFlag() {
        return this.iconFlag;
    }

    public boolean getIsListenTogetherOpen() {
        return this.isListenTogetherOpen;
    }

    public ArrayList<MutualMark> getMutual() {
        return this.mutual;
    }

    public String toString() {
        return "Intimate{iconFlag=" + this.iconFlag + ",isListenTogetherOpen=" + this.isListenTogetherOpen + ",mutual=" + this.mutual + ",}";
    }

    public Intimate(int i, boolean z, ArrayList<MutualMark> arrayList) {
        this.mutual = new ArrayList<>();
        this.iconFlag = i;
        this.isListenTogetherOpen = z;
        this.mutual = arrayList;
    }
}
