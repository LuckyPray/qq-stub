package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendRobotGameCard.class */
public final class GProRecommendRobotGameCard implements Serializable {
    static IPatchRedirector $redirector_;
    public GProRecommendRobotInfo robotInfo;
    public ArrayList<GProRecommendRobotTextChannel> robotTextChannel;
    long serialVersionUID;

    public GProRecommendRobotGameCard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.robotInfo = new GProRecommendRobotInfo();
        this.robotTextChannel = new ArrayList<>();
    }

    public GProRecommendRobotInfo getRobotInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.robotInfo : (GProRecommendRobotInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProRecommendRobotTextChannel> getRobotTextChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.robotTextChannel : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRecommendRobotGameCard{robotInfo=" + this.robotInfo + ",robotTextChannel=" + this.robotTextChannel + ",}";
    }

    public GProRecommendRobotGameCard(GProRecommendRobotInfo gProRecommendRobotInfo, ArrayList<GProRecommendRobotTextChannel> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProRecommendRobotInfo, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.robotInfo = new GProRecommendRobotInfo();
        this.robotTextChannel = new ArrayList<>();
        this.robotInfo = gProRecommendRobotInfo;
        this.robotTextChannel = arrayList;
    }
}
