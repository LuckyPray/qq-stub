package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RMCodecInfo.class */
public final class RMCodecInfo {
    public RMBizTypeEnum bizType;
    public RMCodecAbility decodeAbility;
    public RMCodecAbility encodeAbility;

    public RMCodecInfo() {
        this.bizType = RMBizTypeEnum.values()[0];
        this.encodeAbility = new RMCodecAbility();
        this.decodeAbility = new RMCodecAbility();
    }

    public RMBizTypeEnum getBizType() {
        return this.bizType;
    }

    public RMCodecAbility getDecodeAbility() {
        return this.decodeAbility;
    }

    public RMCodecAbility getEncodeAbility() {
        return this.encodeAbility;
    }

    public String toString() {
        return "RMCodecInfo{bizType=" + this.bizType + ",encodeAbility=" + this.encodeAbility + ",decodeAbility=" + this.decodeAbility + ",}";
    }

    public RMCodecInfo(RMBizTypeEnum rMBizTypeEnum, RMCodecAbility rMCodecAbility, RMCodecAbility rMCodecAbility2) {
        this.bizType = RMBizTypeEnum.values()[0];
        this.encodeAbility = new RMCodecAbility();
        this.decodeAbility = new RMCodecAbility();
        this.bizType = rMBizTypeEnum;
        this.encodeAbility = rMCodecAbility;
        this.decodeAbility = rMCodecAbility2;
    }
}
