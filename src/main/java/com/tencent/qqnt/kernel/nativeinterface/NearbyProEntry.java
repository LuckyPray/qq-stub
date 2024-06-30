package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NearbyProEntry.class */
public final class NearbyProEntry {
    public String key;
    public String value;

    public NearbyProEntry() {
        this.key = "";
        this.value = "";
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "NearbyProEntry{key=" + this.key + ",value=" + this.value + ",}";
    }

    public NearbyProEntry(String str, String str2) {
        this.key = "";
        this.value = "";
        this.key = str;
        this.value = str2;
    }
}
