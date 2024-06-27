package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProContentRecommendGroup.class */
public final class GProContentRecommendGroup implements Serializable {
    static IPatchRedirector $redirector_;
    public long groupCode;
    public String groupMembers;
    public String groupName;
    public String groupSummary;
    public String headUrl;
    public String joinGroupAuth;
    public String joinText;
    public ArrayList<String> recommendReasons;
    long serialVersionUID;

    public GProContentRecommendGroup() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.headUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupSummary = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinGroupAuth = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupMembers = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recommendReasons = new ArrayList<>();
    }

    public long getGroupCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.groupCode : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getGroupMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.groupMembers : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getGroupName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.groupName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getGroupSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.groupSummary : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getHeadUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.headUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getJoinGroupAuth() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.joinGroupAuth : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getJoinText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.joinText : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<String> getRecommendReasons() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.recommendReasons : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProContentRecommendGroup{groupCode=" + this.groupCode + ",headUrl=" + this.headUrl + ",groupName=" + this.groupName + ",groupSummary=" + this.groupSummary + ",joinText=" + this.joinText + ",joinGroupAuth=" + this.joinGroupAuth + ",groupMembers=" + this.groupMembers + ",recommendReasons=" + this.recommendReasons + ",}";
    }
}
