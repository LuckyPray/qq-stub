package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStCircleRankItem.class */
public final class GProStCircleRankItem {
    static IPatchRedirector $redirector_;
    public String circleID;
    public String circleName;
    public long feedNum;
    public long fuelValue;
    public int rankNo;

    public GProStCircleRankItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.circleName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.circleID = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getCircleID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.circleID : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getCircleName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.circleName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public long getFeedNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.feedNum : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getFuelValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.fuelValue : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getRankNo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.rankNo : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProStCircleRankItem{rankNo=" + this.rankNo + ",circleName=" + this.circleName + ",fuelValue=" + this.fuelValue + ",feedNum=" + this.feedNum + ",circleID=" + this.circleID + ",}";
    }
}
