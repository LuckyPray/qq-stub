/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2023 QAuxiliary developers
 * https://github.com/cinit/QAuxiliary
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */

package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes2.dex */
public final class GroupNotifyMsg implements IKernelModel, Serializable {
    long actionTime;
    GroupNotifyUser actionUser;
    GroupNotifyGroup group;
    GroupInviteExt invitationExt;
    String postscript;
    ArrayList<Long> repeatSeqs;
    long seq;
    long serialVersionUID;
    GroupNotifyMsgStatus status;
    GroupNotifyMsgType type;
    GroupNotifyUser user1;
    GroupNotifyUser user2;
    String warningTips;

    public GroupNotifyMsg() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.type = GroupNotifyMsgType.values()[0];
        this.status = GroupNotifyMsgStatus.values()[0];
        this.group = new GroupNotifyGroup();
        this.user1 = new GroupNotifyUser();
        this.user2 = new GroupNotifyUser();
        this.actionUser = new GroupNotifyUser();
        this.invitationExt = new GroupInviteExt();
        this.postscript = "";
        this.repeatSeqs = new ArrayList<>();
        this.warningTips = "";
    }

    public long getActionTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 10);
        return redirector != null ? ((Long) redirector.redirect((short) 10, this)).longValue() : this.actionTime;
    }

    public GroupNotifyUser getActionUser() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 9);
        return redirector != null ? (GroupNotifyUser) redirector.redirect((short) 9, this) : this.actionUser;
    }

    public GroupNotifyGroup getGroup() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 6);
        return redirector != null ? (GroupNotifyGroup) redirector.redirect((short) 6, this) : this.group;
    }

    public GroupInviteExt getInvitationExt() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 11);
        return redirector != null ? (GroupInviteExt) redirector.redirect((short) 11, this) : this.invitationExt;
    }

    public String getPostscript() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 12);
        return redirector != null ? (String) redirector.redirect((short) 12, this) : this.postscript;
    }

    public ArrayList<Long> getRepeatSeqs() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 13);
        return redirector != null ? (ArrayList) redirector.redirect((short) 13, this) : this.repeatSeqs;
    }

    public long getSeq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, this)).longValue() : this.seq;
    }

    public GroupNotifyMsgStatus getStatus() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 5);
        return redirector != null ? (GroupNotifyMsgStatus) redirector.redirect((short) 5, this) : this.status;
    }

    public GroupNotifyMsgType getType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 4);
        return redirector != null ? (GroupNotifyMsgType) redirector.redirect((short) 4, this) : this.type;
    }

    public GroupNotifyUser getUser1() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 7);
        return redirector != null ? (GroupNotifyUser) redirector.redirect((short) 7, this) : this.user1;
    }

    public GroupNotifyUser getUser2() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 8);
        return redirector != null ? (GroupNotifyUser) redirector.redirect((short) 8, this) : this.user2;
    }

    public String getWarningTips() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 14);
        return redirector != null ? (String) redirector.redirect((short) 14, this) : this.warningTips;
    }

    public void setActionTime(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 22);
        if (redirector != null) {
            redirector.redirect((short) 22, this, j2);
        } else {
            this.actionTime = j2;
        }
    }

    public void setActionUser(GroupNotifyUser groupNotifyUser) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 21);
        if (redirector != null) {
            redirector.redirect((short) 21, this, groupNotifyUser);
        } else {
            this.actionUser = groupNotifyUser;
        }
    }

    public void setGroup(GroupNotifyGroup groupNotifyGroup) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 18);
        if (redirector != null) {
            redirector.redirect((short) 18, this, groupNotifyGroup);
        } else {
            this.group = groupNotifyGroup;
        }
    }

    public void setInvitationExt(GroupInviteExt groupInviteExt) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 23);
        if (redirector != null) {
            redirector.redirect((short) 23, this, groupInviteExt);
        } else {
            this.invitationExt = groupInviteExt;
        }
    }

    public void setPostscript(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 24);
        if (redirector != null) {
            redirector.redirect((short) 24, this, str);
        } else {
            this.postscript = str;
        }
    }

    public void setRepeatSeqs(ArrayList<Long> arrayList) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 25);
        if (redirector != null) {
            redirector.redirect((short) 25, this, arrayList);
        } else {
            this.repeatSeqs = arrayList;
        }
    }

    public void setSeq(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 15);
        if (redirector != null) {
            redirector.redirect((short) 15, this, j2);
        } else {
            this.seq = j2;
        }
    }

    public void setStatus(GroupNotifyMsgStatus groupNotifyMsgStatus) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 17);
        if (redirector != null) {
            redirector.redirect((short) 17, this, groupNotifyMsgStatus);
        } else {
            this.status = groupNotifyMsgStatus;
        }
    }

    public void setType(GroupNotifyMsgType groupNotifyMsgType) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 16);
        if (redirector != null) {
            redirector.redirect((short) 16, this, groupNotifyMsgType);
        } else {
            this.type = groupNotifyMsgType;
        }
    }

    public void setUser1(GroupNotifyUser groupNotifyUser) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 19);
        if (redirector != null) {
            redirector.redirect((short) 19, this, groupNotifyUser);
        } else {
            this.user1 = groupNotifyUser;
        }
    }

    public void setUser2(GroupNotifyUser groupNotifyUser) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 20);
        if (redirector != null) {
            redirector.redirect((short) 20, this, groupNotifyUser);
        } else {
            this.user2 = groupNotifyUser;
        }
    }

    public void setWarningTips(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 26);
        if (redirector != null) {
            redirector.redirect((short) 26, this, str);
        } else {
            this.warningTips = str;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 27);
        if (redirector != null) {
            return (String) redirector.redirect((short) 27, this);
        }
        return "GroupNotifyMsg{seq=" + this.seq + ",type=" + this.type + ",status=" + this.status + ",group=" + this.group + ",user1=" + this.user1 + ",user2=" + this.user2 + ",actionUser=" + this.actionUser + ",actionTime=" + this.actionTime + ",invitationExt=" + this.invitationExt + ",postscript=" + this.postscript + ",repeatSeqs=" + this.repeatSeqs + ",warningTips=" + this.warningTips + ",}";
    }

    public GroupNotifyMsg(long j2, GroupNotifyMsgType groupNotifyMsgType, GroupNotifyMsgStatus groupNotifyMsgStatus, GroupNotifyGroup groupNotifyGroup, GroupNotifyUser groupNotifyUser, GroupNotifyUser groupNotifyUser2, GroupNotifyUser groupNotifyUser3, long j3, GroupInviteExt groupInviteExt, String str, ArrayList<Long> arrayList, String str2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88469, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), groupNotifyMsgType, groupNotifyMsgStatus, groupNotifyGroup, groupNotifyUser, groupNotifyUser2, groupNotifyUser3, Long.valueOf(j3), groupInviteExt, str, arrayList, str2);
            return;
        }
        this.serialVersionUID = 1L;
        this.type = GroupNotifyMsgType.values()[0];
        this.status = GroupNotifyMsgStatus.values()[0];
        this.group = new GroupNotifyGroup();
        this.user1 = new GroupNotifyUser();
        this.user2 = new GroupNotifyUser();
        this.actionUser = new GroupNotifyUser();
        this.invitationExt = new GroupInviteExt();
        this.postscript = "";
        this.repeatSeqs = new ArrayList<>();
        this.warningTips = "";
        this.seq = j2;
        this.type = groupNotifyMsgType;
        this.status = groupNotifyMsgStatus;
        this.group = groupNotifyGroup;
        this.user1 = groupNotifyUser;
        this.user2 = groupNotifyUser2;
        this.actionUser = groupNotifyUser3;
        this.actionTime = j3;
        this.invitationExt = groupInviteExt;
        this.postscript = str;
        this.repeatSeqs = arrayList;
        this.warningTips = str2;
    }
}
