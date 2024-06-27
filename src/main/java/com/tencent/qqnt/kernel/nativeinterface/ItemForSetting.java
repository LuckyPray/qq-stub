package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ItemForSetting.class */
public final class ItemForSetting implements IKernelModel {
    public ArrayList<Integer> keyCodec;
    public PlatformTypeForSetting platformType;

    public ItemForSetting() {
        this.platformType = PlatformTypeForSetting.values()[0];
        this.keyCodec = new ArrayList<>();
    }

    public ArrayList<Integer> getKeyCodec() {
        return this.keyCodec;
    }

    public PlatformTypeForSetting getPlatformType() {
        return this.platformType;
    }

    public void setKeyCodec(ArrayList<Integer> arrayList) {
        this.keyCodec = arrayList;
    }

    public void setPlatformType(PlatformTypeForSetting platformTypeForSetting) {
        this.platformType = platformTypeForSetting;
    }

    public String toString() {
        return "ItemForSetting{platformType=" + this.platformType + ",keyCodec=" + this.keyCodec + ",}";
    }

    public ItemForSetting(PlatformTypeForSetting platformTypeForSetting, ArrayList<Integer> arrayList) {
        this.platformType = PlatformTypeForSetting.values()[0];
        this.keyCodec = new ArrayList<>();
        this.platformType = platformTypeForSetting;
        this.keyCodec = arrayList;
    }
}
