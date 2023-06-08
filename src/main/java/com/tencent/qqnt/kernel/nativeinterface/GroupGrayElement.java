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

/* compiled from: P */
/* loaded from: classes2.dex */
public final class GroupGrayElement implements Serializable {
    String adminNick;
    String adminRemark;
    String adminUid;
    CreateGroupGrayElement createGroup;
    String groupName;
    MemberAddGrayElement memberAdd;
    String memberNick;
    String memberRemark;
    String memberUid;
    GroupGrayElementRole role;
    long serialVersionUID;
    GroupShutUpGrayElement shutUp;
    GroupGrayElementType type;

    public GroupGrayElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.serialVersionUID = 1L;
        this.type = GroupGrayElementType.values()[0];
        this.role = GroupGrayElementRole.values()[0];
        this.groupName = "";
        this.memberUid = "";
        this.memberNick = "";
        this.memberRemark = "";
        this.adminUid = "";
        this.adminNick = "";
        this.adminRemark = "";
    }

    public String getAdminNick() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 10);
        return redirector != null ? (String) redirector.redirect((short) 10, (Object) this) : this.adminNick;
    }

    public String getAdminRemark() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 11);
        return redirector != null ? (String) redirector.redirect((short) 11, (Object) this) : this.adminRemark;
    }

    public String getAdminUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, (Object) this) : this.adminUid;
    }

    public CreateGroupGrayElement getCreateGroup() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 12);
        return redirector != null ? (CreateGroupGrayElement) redirector.redirect((short) 12, (Object) this) : this.createGroup;
    }

    public String getGroupName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, (Object) this) : this.groupName;
    }

    public MemberAddGrayElement getMemberAdd() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 13);
        return redirector != null ? (MemberAddGrayElement) redirector.redirect((short) 13, (Object) this) : this.memberAdd;
    }

    public String getMemberNick() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, (Object) this) : this.memberNick;
    }

    public String getMemberRemark() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 8);
        return redirector != null ? (String) redirector.redirect((short) 8, (Object) this) : this.memberRemark;
    }

    public String getMemberUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, (Object) this) : this.memberUid;
    }

    public GroupGrayElementRole getRole() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 4);
        return redirector != null ? (GroupGrayElementRole) redirector.redirect((short) 4, (Object) this) : this.role;
    }

    public GroupShutUpGrayElement getShutUp() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 14);
        return redirector != null ? (GroupShutUpGrayElement) redirector.redirect((short) 14, (Object) this) : this.shutUp;
    }

    public GroupGrayElementType getType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 3);
        return redirector != null ? (GroupGrayElementType) redirector.redirect((short) 3, (Object) this) : this.type;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 15);
        if (redirector != null) {
            return (String) redirector.redirect((short) 15, (Object) this);
        }
        return "GroupGrayElement{type=" + this.type + ",role=" + this.role + ",groupName=" + this.groupName + ",memberUid=" + this.memberUid + ",memberNick=" + this.memberNick + ",memberRemark=" + this.memberRemark + ",adminUid=" + this.adminUid + ",adminNick=" + this.adminNick + ",adminRemark=" + this.adminRemark + ",createGroup=" + this.createGroup + ",memberAdd=" + this.memberAdd + ",shutUp=" + this.shutUp + ",}";
    }

    public GroupGrayElement(GroupGrayElementType groupGrayElementType, GroupGrayElementRole groupGrayElementRole, String str, String str2, String str3, String str4, String str5, String str6, String str7, CreateGroupGrayElement createGroupGrayElement, MemberAddGrayElement memberAddGrayElement, GroupShutUpGrayElement groupShutUpGrayElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88333, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, groupGrayElementType, groupGrayElementRole, str, str2, str3, str4, str5, str6, str7, createGroupGrayElement, memberAddGrayElement, groupShutUpGrayElement);
            return;
        }
        this.serialVersionUID = 1L;
        this.type = GroupGrayElementType.values()[0];
        this.role = GroupGrayElementRole.values()[0];
        this.groupName = "";
        this.memberUid = "";
        this.memberNick = "";
        this.memberRemark = "";
        this.adminUid = "";
        this.adminNick = "";
        this.adminRemark = "";
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
