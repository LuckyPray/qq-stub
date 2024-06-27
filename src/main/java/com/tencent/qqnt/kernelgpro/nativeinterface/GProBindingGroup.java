package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBindingGroup.class */
public final class GProBindingGroup {
    static IPatchRedirector $redirector_;
    public long groupCode;
    public int groupFlag;
    public long groupMemberSize;
    public String groupName;
    public String groupUrl;
    public int isConfGroup;
    public boolean isGroupMember;
    public String onlineMemberSize;
    public int privilege;
    public String signature;

    public GProBindingGroup() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.signature = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.onlineMemberSize = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getGroupCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.groupCode : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public int getGroupFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.groupFlag : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getGroupMemberSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.groupMemberSize : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getGroupName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.groupName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getGroupUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.groupUrl : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getIsConfGroup() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.isConfGroup : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public boolean getIsGroupMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.isGroupMember : ((Boolean) iPatchRedirector.redirect((short) 11, this)).booleanValue();
    }

    public String getOnlineMemberSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.onlineMemberSize : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getPrivilege() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.privilege : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getSignature() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.signature : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProBindingGroup{groupCode=" + this.groupCode + ",groupName=" + this.groupName + ",privilege=" + this.privilege + ",groupMemberSize=" + this.groupMemberSize + ",signature=" + this.signature + ",groupFlag=" + this.groupFlag + ",isConfGroup=" + this.isConfGroup + ",onlineMemberSize=" + this.onlineMemberSize + ",groupUrl=" + this.groupUrl + ",isGroupMember=" + this.isGroupMember + ",}";
    }
}
