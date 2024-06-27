package com.tencent.qqnt.kernel.nativeinterface;

import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DeviceInfo.class */
public final class DeviceInfo implements IKernelModel, Serializable {
    public String buildVer;
    public String devName;
    public String devType;
    public String guid;
    public int localId;
    public String osVer;
    long serialVersionUID;
    public boolean setMute;
    public String vendorName;
    public String vendorOsName;
    public int vendorType;

    public DeviceInfo() {
        this.serialVersionUID = 1L;
        this.guid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.buildVer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.devName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.devType = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.vendorName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.osVer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.vendorOsName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getBuildVer() {
        return this.buildVer;
    }

    public String getDevName() {
        return this.devName;
    }

    public String getDevType() {
        return this.devType;
    }

    public String getGuid() {
        return this.guid;
    }

    public int getLocalId() {
        return this.localId;
    }

    public String getOsVer() {
        return this.osVer;
    }

    public boolean getSetMute() {
        return this.setMute;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public String getVendorOsName() {
        return this.vendorOsName;
    }

    public int getVendorType() {
        return this.vendorType;
    }

    public void setBuildVer(String str) {
        this.buildVer = str;
    }

    public void setDevName(String str) {
        this.devName = str;
    }

    public void setDevType(String str) {
        this.devType = str;
    }

    public void setGuid(String str) {
        this.guid = str;
    }

    public void setLocalId(int i) {
        this.localId = i;
    }

    public void setOsVer(String str) {
        this.osVer = str;
    }

    public void setSetMute(boolean z) {
        this.setMute = z;
    }

    public void setVendorName(String str) {
        this.vendorName = str;
    }

    public void setVendorOsName(String str) {
        this.vendorOsName = str;
    }

    public void setVendorType(int i) {
        this.vendorType = i;
    }

    public String toString() {
        return "DeviceInfo{guid=" + this.guid + ",buildVer=" + this.buildVer + ",localId=" + this.localId + ",devName=" + this.devName + ",devType=" + this.devType + ",vendorName=" + this.vendorName + ",osVer=" + this.osVer + ",vendorOsName=" + this.vendorOsName + ",setMute=" + this.setMute + ",vendorType=" + this.vendorType + ",}";
    }

    public DeviceInfo(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, boolean z, int i2) {
        this.serialVersionUID = 1L;
        this.guid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.buildVer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.devName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.devType = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.vendorName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.osVer = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.vendorOsName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guid = str;
        this.buildVer = str2;
        this.localId = i;
        this.devName = str3;
        this.devType = str4;
        this.vendorName = str5;
        this.osVer = str6;
        this.vendorOsName = str7;
        this.setMute = z;
        this.vendorType = i2;
    }
}
