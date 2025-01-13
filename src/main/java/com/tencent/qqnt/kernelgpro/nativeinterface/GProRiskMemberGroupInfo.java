package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRiskMemberGroupInfo.class */
public final class GProRiskMemberGroupInfo {
    static IPatchRedirector $redirector_;
    public long groupId;
    public String groupName;
    public ArrayList<GProBlackUserInfo> rptMemberList;
    public int totalNum;

    public GProRiskMemberGroupInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.groupName = "";
            this.rptMemberList = new ArrayList<>();
        }
    }

    public long getGroupId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.groupId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGroupName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.groupName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProBlackUserInfo> getRptMemberList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.rptMemberList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public int getTotalNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.totalNum : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProRiskMemberGroupInfo{groupId=" + this.groupId + ",groupName=" + this.groupName + ",rptMemberList=" + this.rptMemberList + ",totalNum=" + this.totalNum + ",}";
    }

    public GProRiskMemberGroupInfo(long j, String str, ArrayList<GProBlackUserInfo> arrayList, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, arrayList, Integer.valueOf(i));
            return;
        }
        this.groupName = "";
        this.rptMemberList = new ArrayList<>();
        this.groupId = j;
        this.groupName = str;
        this.rptMemberList = arrayList;
        this.totalNum = i;
    }
}
