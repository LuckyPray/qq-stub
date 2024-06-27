package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameGameStaticInfo.class */
public final class GProVoiceSmobaGameGameStaticInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String coverUrl;
    public String gameMode;
    public String gameName;
    public ArrayList<String> gradeNames;
    public String iconUrl;
    public long maxNum;
    long serialVersionUID;

    public GProVoiceSmobaGameGameStaticInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.gameName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gameMode = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.coverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gradeNames = new ArrayList<>();
    }

    public String getCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.coverUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getGameMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.gameMode : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getGameName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.gameName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<String> getGradeNames() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.gradeNames : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getMaxNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.maxNum : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProVoiceSmobaGameGameStaticInfo{gameName=" + this.gameName + ",gameMode=" + this.gameMode + ",iconUrl=" + this.iconUrl + ",coverUrl=" + this.coverUrl + ",maxNum=" + this.maxNum + ",gradeNames=" + this.gradeNames + ",}";
    }

    public GProVoiceSmobaGameGameStaticInfo(String str, String str2, String str3, String str4, long j, ArrayList<String> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, str4, Long.valueOf(j), arrayList});
            return;
        }
        this.serialVersionUID = 1L;
        this.gameName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gameMode = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.coverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.gradeNames = new ArrayList<>();
        this.gameName = str;
        this.gameMode = str2;
        this.iconUrl = str3;
        this.coverUrl = str4;
        this.maxNum = j;
        this.gradeNames = arrayList;
    }
}
