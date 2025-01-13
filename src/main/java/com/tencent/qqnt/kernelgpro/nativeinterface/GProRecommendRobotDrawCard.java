package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendRobotDrawCard.class */
public final class GProRecommendRobotDrawCard implements Serializable {
    static IPatchRedirector $redirector_;
    public String botMsgId;
    public String imgUrl;
    public GProRecommendRobotInfo robotInfo;
    long serialVersionUID;
    public String title;
    public String userMsgId;

    public GProRecommendRobotDrawCard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.robotInfo = new GProRecommendRobotInfo();
        this.title = "";
        this.imgUrl = "";
        this.userMsgId = "";
        this.botMsgId = "";
    }

    public String getBotMsgId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.botMsgId : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getImgUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.imgUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public GProRecommendRobotInfo getRobotInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.robotInfo : (GProRecommendRobotInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.title : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getUserMsgId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.userMsgId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProRecommendRobotDrawCard{robotInfo=" + this.robotInfo + ",title=" + this.title + ",imgUrl=" + this.imgUrl + ",userMsgId=" + this.userMsgId + ",botMsgId=" + this.botMsgId + ",}";
    }

    public GProRecommendRobotDrawCard(GProRecommendRobotInfo gProRecommendRobotInfo, String str, String str2, String str3, String str4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProRecommendRobotInfo, str, str2, str3, str4);
            return;
        }
        this.serialVersionUID = 1L;
        this.robotInfo = new GProRecommendRobotInfo();
        this.title = "";
        this.imgUrl = "";
        this.userMsgId = "";
        this.botMsgId = "";
        this.robotInfo = gProRecommendRobotInfo;
        this.title = str;
        this.imgUrl = str2;
        this.userMsgId = str3;
        this.botMsgId = str4;
    }
}
