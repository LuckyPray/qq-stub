package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotTemplateInfo.class */
public final class RobotTemplateInfo {

    /* renamed from: id */
    public long f33id;
    public int type;
    public String title = "";
    public String desc = "";
    public String image = "";
    public String extInfo = "";

    public String getDesc() {
        return this.desc;
    }

    public String getExtInfo() {
        return this.extInfo;
    }

    public long getId() {
        return this.f33id;
    }

    public String getImage() {
        return this.image;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "RobotTemplateInfo{id=" + this.f33id + ",type=" + this.type + ",title=" + this.title + ",desc=" + this.desc + ",image=" + this.image + ",extInfo=" + this.extInfo + ",}";
    }
}
