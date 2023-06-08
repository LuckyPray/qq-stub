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

/* compiled from: P */
/* loaded from: classes.dex */
public final class TextElement implements IKernelModel {
    Long atChannelId;
    String atNtUid;
    Integer atRoleColor;
    Long atRoleId;
    String atRoleName;
    long atTinyId;
    int atType;
    long atUid;
    String content;
    LinkInfo linkInfo;
    Integer needNotify;
    Integer subElementType;

    public TextElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
        } else {
            this.content = "";
        }
    }

    public Long getAtChannelId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 9);
        return redirector != null ? (Long) redirector.redirect((short) 9, (Object) this) : this.atChannelId;
    }

    public String getAtNtUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, (Object) this) : this.atNtUid;
    }

    public Integer getAtRoleColor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 12);
        return redirector != null ? (Integer) redirector.redirect((short) 12, (Object) this) : this.atRoleColor;
    }

    public Long getAtRoleId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 11);
        return redirector != null ? (Long) redirector.redirect((short) 11, (Object) this) : this.atRoleId;
    }

    public String getAtRoleName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 13);
        return redirector != null ? (String) redirector.redirect((short) 13, (Object) this) : this.atRoleName;
    }

    public long getAtTinyId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 6);
        return redirector != null ? ((Long) redirector.redirect((short) 6, (Object) this)).longValue() : this.atTinyId;
    }

    public int getAtType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 4);
        return redirector != null ? ((Integer) redirector.redirect((short) 4, (Object) this)).intValue() : this.atType;
    }

    public long getAtUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 5);
        return redirector != null ? ((Long) redirector.redirect((short) 5, (Object) this)).longValue() : this.atUid;
    }

    public String getContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, (Object) this) : this.content;
    }

    public LinkInfo getLinkInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 10);
        return redirector != null ? (LinkInfo) redirector.redirect((short) 10, (Object) this) : this.linkInfo;
    }

    public Integer getNeedNotify() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 14);
        return redirector != null ? (Integer) redirector.redirect((short) 14, (Object) this) : this.needNotify;
    }

    public Integer getSubElementType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 8);
        return redirector != null ? (Integer) redirector.redirect((short) 8, (Object) this) : this.subElementType;
    }

    public void setAtChannelId(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 21);
        if (redirector != null) {
            redirector.redirect((short) 21, (Object) this, (Object) l2);
        } else {
            this.atChannelId = l2;
        }
    }

    public void setAtNtUid(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 19);
        if (redirector != null) {
            redirector.redirect((short) 19, (Object) this, (Object) str);
        } else {
            this.atNtUid = str;
        }
    }

    public void setAtRoleColor(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 24);
        if (redirector != null) {
            redirector.redirect((short) 24, (Object) this, (Object) num);
        } else {
            this.atRoleColor = num;
        }
    }

    public void setAtRoleId(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 23);
        if (redirector != null) {
            redirector.redirect((short) 23, (Object) this, (Object) l2);
        } else {
            this.atRoleId = l2;
        }
    }

    public void setAtRoleName(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 25);
        if (redirector != null) {
            redirector.redirect((short) 25, (Object) this, (Object) str);
        } else {
            this.atRoleName = str;
        }
    }

    public void setAtTinyId(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 18);
        if (redirector != null) {
            redirector.redirect((short) 18, (Object) this, j2);
        } else {
            this.atTinyId = j2;
        }
    }

    public void setAtType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 16);
        if (redirector != null) {
            redirector.redirect((short) 16, (Object) this, i2);
        } else {
            this.atType = i2;
        }
    }

    public void setAtUid(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 17);
        if (redirector != null) {
            redirector.redirect((short) 17, (Object) this, j2);
        } else {
            this.atUid = j2;
        }
    }

    public void setContent(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 15);
        if (redirector != null) {
            redirector.redirect((short) 15, (Object) this, (Object) str);
        } else {
            this.content = str;
        }
    }

    public void setLinkInfo(LinkInfo linkInfo) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 22);
        if (redirector != null) {
            redirector.redirect((short) 22, (Object) this, (Object) linkInfo);
        } else {
            this.linkInfo = linkInfo;
        }
    }

    public void setNeedNotify(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 26);
        if (redirector != null) {
            redirector.redirect((short) 26, (Object) this, (Object) num);
        } else {
            this.needNotify = num;
        }
    }

    public void setSubElementType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 20);
        if (redirector != null) {
            redirector.redirect((short) 20, (Object) this, (Object) num);
        } else {
            this.subElementType = num;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 27);
        if (redirector != null) {
            return (String) redirector.redirect((short) 27, (Object) this);
        }
        return "TextElement{content=" + this.content + ",atType=" + this.atType + ",atUid=" + this.atUid + ",atTinyId=" + this.atTinyId + ",atNtUid=" + this.atNtUid + ",subElementType=" + this.subElementType + ",atChannelId=" + this.atChannelId + ",linkInfo=" + this.linkInfo + ",atRoleId=" + this.atRoleId + ",atRoleColor=" + this.atRoleColor + ",atRoleName=" + this.atRoleName + ",needNotify=" + this.needNotify + ",}";
    }

    public TextElement(String str, int i2, long j2, long j3, String str2, Integer num, Long l2, LinkInfo linkInfo, Long l3, Integer num2, String str3, Integer num3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94741, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j3), str2, num, l2, linkInfo, l3, num2, str3, num3);
            return;
        }
        this.content = "";
        this.content = str;
        this.atType = i2;
        this.atUid = j2;
        this.atTinyId = j3;
        this.atNtUid = str2;
        this.subElementType = num;
        this.atChannelId = l2;
        this.linkInfo = linkInfo;
        this.atRoleId = l3;
        this.atRoleColor = num2;
        this.atRoleName = str3;
        this.needNotify = num3;
    }
}
