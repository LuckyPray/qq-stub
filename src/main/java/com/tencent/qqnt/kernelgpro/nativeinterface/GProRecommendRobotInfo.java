package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendRobotInfo.class */
public final class GProRecommendRobotInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String avatar;
    public String desc;
    public ArrayList<String> introduceList;
    public String name;
    public long robotUin;
    long serialVersionUID;

    public GProRecommendRobotInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.introduceList = new ArrayList<>();
    }

    public String getAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.avatar : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.desc : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<String> getIntroduceList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.introduceList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public long getRobotUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.robotUin : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProRecommendRobotInfo{name=" + this.name + ",desc=" + this.desc + ",avatar=" + this.avatar + ",introduceList=" + this.introduceList + ",robotUin=" + this.robotUin + ",}";
    }

    public GProRecommendRobotInfo(String str, String str2, String str3, ArrayList<String> arrayList, long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, arrayList, Long.valueOf(j)});
            return;
        }
        this.serialVersionUID = 1L;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.introduceList = new ArrayList<>();
        this.name = str;
        this.desc = str2;
        this.avatar = str3;
        this.introduceList = arrayList;
        this.robotUin = j;
    }
}
