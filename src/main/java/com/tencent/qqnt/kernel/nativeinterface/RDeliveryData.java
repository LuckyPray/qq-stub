package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RDeliveryData.class */
public final class RDeliveryData {
    public String key;
    public int switchState;
    public String value;
    public int valueType;

    public RDeliveryData() {
        this.key = "";
        this.value = "";
    }

    public String getKey() {
        return this.key;
    }

    public int getSwitchState() {
        return this.switchState;
    }

    public String getValue() {
        return this.value;
    }

    public int getValueType() {
        return this.valueType;
    }

    public String toString() {
        return "RDeliveryData{key=" + this.key + ",valueType=" + this.valueType + ",value=" + this.value + ",switchState=" + this.switchState + ",}";
    }

    public RDeliveryData(String str, int i, String str2, int i2) {
        this.key = "";
        this.value = "";
        this.key = str;
        this.valueType = i;
        this.value = str2;
        this.switchState = i2;
    }
}
