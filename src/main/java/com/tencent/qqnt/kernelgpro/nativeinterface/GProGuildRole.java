package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildRole.class */
public final class GProGuildRole {
    static IPatchRedirector $redirector_;
    public ArrayList<Long> approveSpeakChannels;
    public ArrayList<Long> approveVisibleChannels;
    public boolean bHoist;
    public long backgroudColor1;
    public long backgroudColor2;
    public long color;
    public int count;
    public String displayTagName;
    public int displayType;
    public long guildId;
    public boolean isChannelRole;
    public boolean isNotSort;
    public String levelBigIcon;
    public String levelDsc;
    public String levelIcon;
    public String levelSimpleDsc;
    public long levelSimpleDscColor;
    public long levelSplitLineColor;
    public ArrayList<Long> manageCategoryIdList;
    public long manageTagPendingColor;
    public int memberLimit;
    public String name;
    public int nameplate;
    public long outlineColor;
    public long roleId;
    public GProRolePermission rolePermissions;
    public int speakableChannelsCount;
    public int type;
    public int visibleChannelsCount;

    public GProGuildRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.name = "";
        this.approveSpeakChannels = new ArrayList<>();
        this.approveVisibleChannels = new ArrayList<>();
        this.rolePermissions = new GProRolePermission();
        this.levelIcon = "";
        this.levelDsc = "";
        this.levelBigIcon = "";
        this.levelSimpleDsc = "";
        this.displayTagName = "";
        this.manageCategoryIdList = new ArrayList<>();
    }

    public ArrayList<Long> getApproveSpeakChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.approveSpeakChannels : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public ArrayList<Long> getApproveVisibleChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.approveVisibleChannels : (ArrayList) iPatchRedirector.redirect((short) 13, this);
    }

    public boolean getBHoist() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.bHoist : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public long getBackgroudColor1() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.backgroudColor1 : ((Long) iPatchRedirector.redirect((short) 22, this)).longValue();
    }

    public long getBackgroudColor2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.backgroudColor2 : ((Long) iPatchRedirector.redirect((short) 23, this)).longValue();
    }

    public long getColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.color : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getDisplayTagName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) ? this.displayTagName : (String) iPatchRedirector.redirect((short) 30, this);
    }

    public int getDisplayType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) ? this.displayType : ((Integer) iPatchRedirector.redirect((short) 28, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public boolean getIsChannelRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.isChannelRole : ((Boolean) iPatchRedirector.redirect((short) 17, this)).booleanValue();
    }

    public boolean getIsNotSort() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.isNotSort : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public String getLevelBigIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.levelBigIcon : (String) iPatchRedirector.redirect((short) 21, this);
    }

    public String getLevelDsc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.levelDsc : (String) iPatchRedirector.redirect((short) 19, this);
    }

    public String getLevelIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.levelIcon : (String) iPatchRedirector.redirect((short) 18, this);
    }

    public String getLevelSimpleDsc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.levelSimpleDsc : (String) iPatchRedirector.redirect((short) 25, this);
    }

    public long getLevelSimpleDscColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) ? this.levelSimpleDscColor : ((Long) iPatchRedirector.redirect((short) 26, this)).longValue();
    }

    public long getLevelSplitLineColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.levelSplitLineColor : ((Long) iPatchRedirector.redirect((short) 27, this)).longValue();
    }

    public ArrayList<Long> getManageCategoryIdList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) ? this.manageCategoryIdList : (ArrayList) iPatchRedirector.redirect((short) 31, this);
    }

    public long getManageTagPendingColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) ? this.manageTagPendingColor : ((Long) iPatchRedirector.redirect((short) 29, this)).longValue();
    }

    public int getMemberLimit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.memberLimit : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.name : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getNameplate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.nameplate : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public long getOutlineColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.outlineColor : ((Long) iPatchRedirector.redirect((short) 24, this)).longValue();
    }

    public long getRoleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.roleId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public GProRolePermission getRolePermissions() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.rolePermissions : (GProRolePermission) iPatchRedirector.redirect((short) 16, this);
    }

    public int getSpeakableChannelsCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.speakableChannelsCount : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 20, this)).intValue();
    }

    public int getVisibleChannelsCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.visibleChannelsCount : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 32)) {
            return (String) iPatchRedirector.redirect((short) 32, this);
        }
        return "GProGuildRole{guildId=" + this.guildId + ",roleId=" + this.roleId + ",name=" + this.name + ",color=" + this.color + ",bHoist=" + this.bHoist + ",count=" + this.count + ",isNotSort=" + this.isNotSort + ",memberLimit=" + this.memberLimit + ",nameplate=" + this.nameplate + ",approveSpeakChannels=" + this.approveSpeakChannels + ",approveVisibleChannels=" + this.approveVisibleChannels + ",speakableChannelsCount=" + this.speakableChannelsCount + ",visibleChannelsCount=" + this.visibleChannelsCount + ",rolePermissions=" + this.rolePermissions + ",isChannelRole=" + this.isChannelRole + ",levelIcon=" + this.levelIcon + ",levelDsc=" + this.levelDsc + ",type=" + this.type + ",levelBigIcon=" + this.levelBigIcon + ",backgroudColor1=" + this.backgroudColor1 + ",backgroudColor2=" + this.backgroudColor2 + ",outlineColor=" + this.outlineColor + ",levelSimpleDsc=" + this.levelSimpleDsc + ",levelSimpleDscColor=" + this.levelSimpleDscColor + ",levelSplitLineColor=" + this.levelSplitLineColor + ",displayType=" + this.displayType + ",manageTagPendingColor=" + this.manageTagPendingColor + ",displayTagName=" + this.displayTagName + ",manageCategoryIdList=" + this.manageCategoryIdList + ",}";
    }

    public GProGuildRole(long j, long j2, String str, long j3, boolean z, int i, boolean z2, int i2, int i3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, int i4, int i5, GProRolePermission gProRolePermission, boolean z3, String str2, String str3, int i6, String str4, long j4, long j5, long j6, String str5, long j7, long j8, int i7, long j9, String str6, ArrayList<Long> arrayList3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), str, Long.valueOf(j3), Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), arrayList, arrayList2, Integer.valueOf(i4), Integer.valueOf(i5), gProRolePermission, Boolean.valueOf(z3), str2, str3, Integer.valueOf(i6), str4, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), str5, Long.valueOf(j7), Long.valueOf(j8), Integer.valueOf(i7), Long.valueOf(j9), str6, arrayList3);
            return;
        }
        this.name = "";
        this.approveSpeakChannels = new ArrayList<>();
        this.approveVisibleChannels = new ArrayList<>();
        this.rolePermissions = new GProRolePermission();
        this.levelIcon = "";
        this.levelDsc = "";
        this.levelBigIcon = "";
        this.levelSimpleDsc = "";
        this.displayTagName = "";
        this.manageCategoryIdList = new ArrayList<>();
        this.guildId = j;
        this.roleId = j2;
        this.name = str;
        this.color = j3;
        this.bHoist = z;
        this.count = i;
        this.isNotSort = z2;
        this.memberLimit = i2;
        this.nameplate = i3;
        this.approveSpeakChannels = arrayList;
        this.approveVisibleChannels = arrayList2;
        this.speakableChannelsCount = i4;
        this.visibleChannelsCount = i5;
        this.rolePermissions = gProRolePermission;
        this.isChannelRole = z3;
        this.levelIcon = str2;
        this.levelDsc = str3;
        this.type = i6;
        this.levelBigIcon = str4;
        this.backgroudColor1 = j4;
        this.backgroudColor2 = j5;
        this.outlineColor = j6;
        this.levelSimpleDsc = str5;
        this.levelSimpleDscColor = j7;
        this.levelSplitLineColor = j8;
        this.displayType = i7;
        this.manageTagPendingColor = j9;
        this.displayTagName = str6;
        this.manageCategoryIdList = arrayList3;
    }
}
