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
/* loaded from: classes2.dex */
public final class DirectMsgMember {
    String memberName;
    int memberType;
    int msgNotifyType;
    String nickName;
    long srcGuildId;
    String srcGuildName;
    long tinyId;

    public DirectMsgMember() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(82628, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.srcGuildName = "";
        this.nickName = "";
        this.memberName = "";
    }

    public String getMemberName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(82628, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, this) : this.memberName;
    }

    public int getMemberType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(82628, (short) 9);
        return redirector != null ? ((Integer) redirector.redirect((short) 9, this)).intValue() : this.memberType;
    }

    public int getMsgNotifyType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(82628, (short) 8);
        return redirector != null ? ((Integer) redirector.redirect((short) 8, this)).intValue() : this.msgNotifyType;
    }

    public String getNickName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(82628, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, this) : this.nickName;
    }

    public long getSrcGuildId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(82628, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, this)).longValue() : this.srcGuildId;
    }

    public String getSrcGuildName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(82628, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, this) : this.srcGuildName;
    }

    public long getTinyId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(82628, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, this)).longValue() : this.tinyId;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(82628, (short) 10);
        if (redirector != null) {
            return (String) redirector.redirect((short) 10, this);
        }
        return "DirectMsgMember{tinyId=" + this.tinyId + ",srcGuildId=" + this.srcGuildId + ",srcGuildName=" + this.srcGuildName + ",nickName=" + this.nickName + ",memberName=" + this.memberName + ",msgNotifyType=" + this.msgNotifyType + ",memberType=" + this.memberType + ",}";
    }

    public DirectMsgMember(long j2, long j3, String str, String str2, String str3, int i2, int i3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(82628, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), Long.valueOf(j3), str, str2, str3, Integer.valueOf(i2), Integer.valueOf(i3));
            return;
        }
        this.srcGuildName = "";
        this.nickName = "";
        this.memberName = "";
        this.tinyId = j2;
        this.srcGuildId = j3;
        this.srcGuildName = str;
        this.nickName = str2;
        this.memberName = str3;
        this.msgNotifyType = i2;
        this.memberType = i3;
    }
}
