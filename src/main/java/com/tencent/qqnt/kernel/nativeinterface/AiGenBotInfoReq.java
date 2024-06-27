package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AiGenBotInfoReq.class */
public final class AiGenBotInfoReq {
    public MyBotInfo myBotInfo = new MyBotInfo();
    public AiGenBotInfoOperationType genType = AiGenBotInfoOperationType.values()[0];
    public String botTemplate = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getBotTemplate() {
        return this.botTemplate;
    }

    public AiGenBotInfoOperationType getGenType() {
        return this.genType;
    }

    public MyBotInfo getMyBotInfo() {
        return this.myBotInfo;
    }

    public String toString() {
        return "AiGenBotInfoReq{myBotInfo=" + this.myBotInfo + ",genType=" + this.genType + ",botTemplate=" + this.botTemplate + ",}";
    }
}
