package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InitCommAbilitySessionConfig.class */
public final class InitCommAbilitySessionConfig {
    public String selfUid;
    public long selfUin;
    public String sysPath;

    public InitCommAbilitySessionConfig() {
        this.selfUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sysPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getSelfUid() {
        return this.selfUid;
    }

    public long getSelfUin() {
        return this.selfUin;
    }

    public String getSysPath() {
        return this.sysPath;
    }

    public String toString() {
        return "InitCommAbilitySessionConfig{selfUin=" + this.selfUin + ",selfUid=" + this.selfUid + ",sysPath=" + this.sysPath + ",}";
    }

    public InitCommAbilitySessionConfig(long j, String str, String str2) {
        this.selfUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sysPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.selfUin = j;
        this.selfUid = str;
        this.sysPath = str2;
    }
}
