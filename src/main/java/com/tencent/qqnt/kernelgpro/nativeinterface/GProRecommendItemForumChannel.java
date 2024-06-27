package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendItemForumChannel.class */
public final class GProRecommendItemForumChannel {
    static IPatchRedirector $redirector_;
    public int endColor;
    public int hotFeedNum;
    public String hotIcon;
    public int hotValue;
    public String hotValueTitle;
    public int index;
    public String inviteCode;
    public int startColor;
    public int type;

    public GProRecommendItemForumChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.hotValueTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.hotIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.inviteCode = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getEndColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.endColor : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getHotFeedNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.hotFeedNum : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getHotIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.hotIcon : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getHotValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.hotValue : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getHotValueTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.hotValueTitle : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.index : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getInviteCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.inviteCode : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getStartColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.startColor : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProRecommendItemForumChannel{hotFeedNum=" + this.hotFeedNum + ",index=" + this.index + ",hotValue=" + this.hotValue + ",hotValueTitle=" + this.hotValueTitle + ",type=" + this.type + ",startColor=" + this.startColor + ",endColor=" + this.endColor + ",hotIcon=" + this.hotIcon + ",inviteCode=" + this.inviteCode + ",}";
    }

    public GProRecommendItemForumChannel(int i, int i2, int i3, String str, int i4, int i5, int i6, String str2, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3});
            return;
        }
        this.hotValueTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.hotIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.inviteCode = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.hotFeedNum = i;
        this.index = i2;
        this.hotValue = i3;
        this.hotValueTitle = str;
        this.type = i4;
        this.startColor = i5;
        this.endColor = i6;
        this.hotIcon = str2;
        this.inviteCode = str3;
    }
}
