package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/GroupGrayElement.class */
public final class GroupGrayElement implements Serializable {
    static IPatchRedirector $redirector_;
    public String adminNick;
    public String adminRemark;
    public String adminUid;
    public CreateGroupGrayElement createGroup;
    public String groupName;
    public MemberAddGrayElement memberAdd;
    public String memberNick;
    public String memberRemark;
    public String memberUid;
    public GroupGrayElementRole role;
    long serialVersionUID;
    public GroupShutUpGrayElement shutUp;
    public GroupGrayElementType type;

    public GroupGrayElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.type = GroupGrayElementType.values()[0];
        this.role = GroupGrayElementRole.values()[0];
        this.groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberRemark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.adminUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.adminNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.adminRemark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAdminNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.adminNick : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getAdminRemark() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.adminRemark : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getAdminUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.adminUid : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public CreateGroupGrayElement getCreateGroup() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.createGroup : (CreateGroupGrayElement) iPatchRedirector.redirect((short) 12, this);
    }

    public String getGroupName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.groupName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public MemberAddGrayElement getMemberAdd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.memberAdd : (MemberAddGrayElement) iPatchRedirector.redirect((short) 13, this);
    }

    public String getMemberNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.memberNick : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getMemberRemark() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.memberRemark : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getMemberUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.memberUid : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GroupGrayElementRole getRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.role : (GroupGrayElementRole) iPatchRedirector.redirect((short) 4, this);
    }

    public GroupShutUpGrayElement getShutUp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.shutUp : (GroupShutUpGrayElement) iPatchRedirector.redirect((short) 14, this);
    }

    public GroupGrayElementType getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : (GroupGrayElementType) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GroupGrayElement{type=" + this.type + ",role=" + this.role + ",groupName=" + this.groupName + ",memberUid=" + this.memberUid + ",memberNick=" + this.memberNick + ",memberRemark=" + this.memberRemark + ",adminUid=" + this.adminUid + ",adminNick=" + this.adminNick + ",adminRemark=" + this.adminRemark + ",createGroup=" + this.createGroup + ",memberAdd=" + this.memberAdd + ",shutUp=" + this.shutUp + ",}";
    }

    public GroupGrayElement(GroupGrayElementType groupGrayElementType, GroupGrayElementRole groupGrayElementRole, String str, String str2, String str3, String str4, String str5, String str6, String str7, CreateGroupGrayElement createGroupGrayElement, MemberAddGrayElement memberAddGrayElement, GroupShutUpGrayElement groupShutUpGrayElement) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, groupGrayElementType, groupGrayElementRole, str, str2, str3, str4, str5, str6, str7, createGroupGrayElement, memberAddGrayElement, groupShutUpGrayElement});
            return;
        }
        this.serialVersionUID = 1L;
        this.type = GroupGrayElementType.values()[0];
        this.role = GroupGrayElementRole.values()[0];
        this.groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberRemark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.adminUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.adminNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.adminRemark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.type = groupGrayElementType;
        this.role = groupGrayElementRole;
        this.groupName = str;
        this.memberUid = str2;
        this.memberNick = str3;
        this.memberRemark = str4;
        this.adminUid = str5;
        this.adminNick = str6;
        this.adminRemark = str7;
        this.createGroup = createGroupGrayElement;
        this.memberAdd = memberAddGrayElement;
        this.shutUp = groupShutUpGrayElement;
    }
}
