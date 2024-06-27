package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/JoinGroupNotifyMsg.class */
public final class JoinGroupNotifyMsg {
    public int result;
    public JoinGroupVerifyInfo verifyInfo = new JoinGroupVerifyInfo();
    public String joinPrompt = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String securityTransUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getJoinPrompt() {
        return this.joinPrompt;
    }

    public int getResult() {
        return this.result;
    }

    public String getSecurityTransUrl() {
        return this.securityTransUrl;
    }

    public JoinGroupVerifyInfo getVerifyInfo() {
        return this.verifyInfo;
    }

    public String toString() {
        return "JoinGroupNotifyMsg{result=" + this.result + ",verifyInfo=" + this.verifyInfo + ",joinPrompt=" + this.joinPrompt + ",securityTransUrl=" + this.securityTransUrl + ",}";
    }
}
