package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MyBotInfo.class */
public final class MyBotInfo {
    public long uin;
    public String uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String botAvatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String botName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String botPrompt = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String botWelcomeMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String botDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getBotAvatar() {
        return this.botAvatar;
    }

    public String getBotDesc() {
        return this.botDesc;
    }

    public String getBotName() {
        return this.botName;
    }

    public String getBotPrompt() {
        return this.botPrompt;
    }

    public String getBotWelcomeMsg() {
        return this.botWelcomeMsg;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "MyBotInfo{uid=" + this.uid + ",uin=" + this.uin + ",botAvatar=" + this.botAvatar + ",botName=" + this.botName + ",botPrompt=" + this.botPrompt + ",botWelcomeMsg=" + this.botWelcomeMsg + ",botDesc=" + this.botDesc + ",}";
    }
}
