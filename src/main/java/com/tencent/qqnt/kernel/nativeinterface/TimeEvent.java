package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TimeEvent.class */
public final class TimeEvent {
    public String content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String copywriter = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public long time;
    public int type;

    public String getContent() {
        return this.content;
    }

    public String getCopywriter() {
        return this.copywriter;
    }

    public long getTime() {
        return this.time;
    }

    public int getType() {
        return this.type;
    }
}
