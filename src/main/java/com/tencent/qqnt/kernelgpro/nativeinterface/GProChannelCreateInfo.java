package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelCreateInfo.class */
public final class GProChannelCreateInfo {
    static IPatchRedirector $redirector_;
    public long appId;
    public ArrayList<GProAuthControlSwitchInfo> authControlSwitchInfoList;
    public ArrayList<GProBindMembers> bindMembersList;
    public ArrayList<GProBindRoleGroups> bindRoleGroupsList;
    public int categoryIndex;
    public int channelType;
    public int cloneMsgNotifyType;
    public String iconUrl;
    public int indexInCategory;
    public String linkChannelUrl;
    public int livePermission;
    public ArrayList<Long> liveableMembers;
    public ArrayList<Long> liveableRoleGroupIds;
    public int msgNotifyType;
    public String name;
    public String operationTitle;
    public int operationType;
    public ArrayList<Long> privateMembers;
    public int privateType;
    public ArrayList<Long> roleGroupIds;
    public int speakPermission;
    public ArrayList<Integer> specialTypeList;
    public int subTypeId;
    public int useMsgNotifyType;
    public int visibleType;

    public GProChannelCreateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.specialTypeList = new ArrayList<>();
        this.privateMembers = new ArrayList<>();
        this.roleGroupIds = new ArrayList<>();
        this.liveableMembers = new ArrayList<>();
        this.liveableRoleGroupIds = new ArrayList<>();
        this.authControlSwitchInfoList = new ArrayList<>();
        this.bindRoleGroupsList = new ArrayList<>();
        this.bindMembersList = new ArrayList<>();
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.operationTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.linkChannelUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.appId : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public ArrayList<GProAuthControlSwitchInfo> getAuthControlSwitchInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.authControlSwitchInfoList : (ArrayList) iPatchRedirector.redirect((short) 20, this);
    }

    public ArrayList<GProBindMembers> getBindMembersList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.bindMembersList : (ArrayList) iPatchRedirector.redirect((short) 22, this);
    }

    public ArrayList<GProBindRoleGroups> getBindRoleGroupsList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.bindRoleGroupsList : (ArrayList) iPatchRedirector.redirect((short) 21, this);
    }

    public int getCategoryIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.categoryIndex : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getCloneMsgNotifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.cloneMsgNotifyType : ((Integer) iPatchRedirector.redirect((short) 23, this)).intValue();
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 25, this);
    }

    public int getIndexInCategory() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.indexInCategory : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getLinkChannelUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.linkChannelUrl : (String) iPatchRedirector.redirect((short) 27, this);
    }

    public int getLivePermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.livePermission : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public ArrayList<Long> getLiveableMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.liveableMembers : (ArrayList) iPatchRedirector.redirect((short) 18, this);
    }

    public ArrayList<Long> getLiveableRoleGroupIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.liveableRoleGroupIds : (ArrayList) iPatchRedirector.redirect((short) 19, this);
    }

    public int getMsgNotifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msgNotifyType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getOperationTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) ? this.operationTitle : (String) iPatchRedirector.redirect((short) 26, this);
    }

    public int getOperationType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.operationType : ((Integer) iPatchRedirector.redirect((short) 24, this)).intValue();
    }

    public ArrayList<Long> getPrivateMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.privateMembers : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public int getPrivateType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.privateType : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public ArrayList<Long> getRoleGroupIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.roleGroupIds : (ArrayList) iPatchRedirector.redirect((short) 13, this);
    }

    public int getSpeakPermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.speakPermission : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public ArrayList<Integer> getSpecialTypeList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.specialTypeList : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public int getSubTypeId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.subTypeId : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public int getUseMsgNotifyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.useMsgNotifyType : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public int getVisibleType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.visibleType : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 28)) {
            return (String) iPatchRedirector.redirect((short) 28, this);
        }
        return "GProChannelCreateInfo{name=" + this.name + ",msgNotifyType=" + this.msgNotifyType + ",channelType=" + this.channelType + ",speakPermission=" + this.speakPermission + ",categoryIndex=" + this.categoryIndex + ",indexInCategory=" + this.indexInCategory + ",appId=" + this.appId + ",privateType=" + this.privateType + ",specialTypeList=" + this.specialTypeList + ",privateMembers=" + this.privateMembers + ",roleGroupIds=" + this.roleGroupIds + ",subTypeId=" + this.subTypeId + ",useMsgNotifyType=" + this.useMsgNotifyType + ",visibleType=" + this.visibleType + ",livePermission=" + this.livePermission + ",liveableMembers=" + this.liveableMembers + ",liveableRoleGroupIds=" + this.liveableRoleGroupIds + ",authControlSwitchInfoList=" + this.authControlSwitchInfoList + ",bindRoleGroupsList=" + this.bindRoleGroupsList + ",bindMembersList=" + this.bindMembersList + ",cloneMsgNotifyType=" + this.cloneMsgNotifyType + ",operationType=" + this.operationType + ",iconUrl=" + this.iconUrl + ",operationTitle=" + this.operationTitle + ",linkChannelUrl=" + this.linkChannelUrl + ",}";
    }

    public GProChannelCreateInfo(String str, int i, int i2, int i3, int i4, int i5, long j, int i6, ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, ArrayList<Long> arrayList3, int i7, int i8, int i9, int i10, ArrayList<Long> arrayList4, ArrayList<Long> arrayList5, ArrayList<GProAuthControlSwitchInfo> arrayList6, ArrayList<GProBindRoleGroups> arrayList7, ArrayList<GProBindMembers> arrayList8, int i11, int i12, String str2, String str3, String str4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j), Integer.valueOf(i6), arrayList, arrayList2, arrayList3, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, Integer.valueOf(i11), Integer.valueOf(i12), str2, str3, str4});
            return;
        }
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.specialTypeList = new ArrayList<>();
        this.privateMembers = new ArrayList<>();
        this.roleGroupIds = new ArrayList<>();
        this.liveableMembers = new ArrayList<>();
        this.liveableRoleGroupIds = new ArrayList<>();
        this.authControlSwitchInfoList = new ArrayList<>();
        this.bindRoleGroupsList = new ArrayList<>();
        this.bindMembersList = new ArrayList<>();
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.operationTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.linkChannelUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = str;
        this.msgNotifyType = i;
        this.channelType = i2;
        this.speakPermission = i3;
        this.categoryIndex = i4;
        this.indexInCategory = i5;
        this.appId = j;
        this.privateType = i6;
        this.specialTypeList = arrayList;
        this.privateMembers = arrayList2;
        this.roleGroupIds = arrayList3;
        this.subTypeId = i7;
        this.useMsgNotifyType = i8;
        this.visibleType = i9;
        this.livePermission = i10;
        this.liveableMembers = arrayList4;
        this.liveableRoleGroupIds = arrayList5;
        this.authControlSwitchInfoList = arrayList6;
        this.bindRoleGroupsList = arrayList7;
        this.bindMembersList = arrayList8;
        this.cloneMsgNotifyType = i11;
        this.operationType = i12;
        this.iconUrl = str2;
        this.operationTitle = str3;
        this.linkChannelUrl = str4;
    }
}
