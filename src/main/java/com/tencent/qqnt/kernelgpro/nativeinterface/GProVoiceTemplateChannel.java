package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceTemplateChannel.class */
public final class GProVoiceTemplateChannel implements Serializable {
    static IPatchRedirector $redirector_;
    public GProRecommendCoverInfo cover;
    public int currentNum;
    public String icon;
    public int maxNum;
    public ArrayList<GProMemberInfo> members;
    public String name;
    public String playDesc;
    long serialVersionUID;
    public int status;
    public String statusDesc;
    public String statusIcon;

    public GProVoiceTemplateChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.cover = new GProRecommendCoverInfo();
        this.statusDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.statusIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.members = new ArrayList<>();
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.playDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public GProRecommendCoverInfo getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.cover : (GProRecommendCoverInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public int getCurrentNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.currentNum : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public String getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.icon : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getMaxNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.maxNum : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public ArrayList<GProMemberInfo> getMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.members : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.name : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getPlayDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.playDesc : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.status : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getStatusDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.statusDesc : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getStatusIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.statusIcon : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProVoiceTemplateChannel{cover=" + this.cover + ",statusDesc=" + this.statusDesc + ",statusIcon=" + this.statusIcon + ",members=" + this.members + ",name=" + this.name + ",status=" + this.status + ",icon=" + this.icon + ",playDesc=" + this.playDesc + ",currentNum=" + this.currentNum + ",maxNum=" + this.maxNum + ",}";
    }

    public GProVoiceTemplateChannel(GProRecommendCoverInfo gProRecommendCoverInfo, String str, String str2, ArrayList<GProMemberInfo> arrayList, String str3, int i, String str4, String str5, int i2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProRecommendCoverInfo, str, str2, arrayList, str3, Integer.valueOf(i), str4, str5, Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        this.serialVersionUID = 1L;
        this.cover = new GProRecommendCoverInfo();
        this.statusDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.statusIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.members = new ArrayList<>();
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.playDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cover = gProRecommendCoverInfo;
        this.statusDesc = str;
        this.statusIcon = str2;
        this.members = arrayList;
        this.name = str3;
        this.status = i;
        this.icon = str4;
        this.playDesc = str5;
        this.currentNum = i2;
        this.maxNum = i3;
    }
}
