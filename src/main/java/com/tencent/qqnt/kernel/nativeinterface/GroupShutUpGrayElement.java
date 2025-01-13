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
public final class GroupShutUpGrayElement implements Serializable {
    GrayTipGroupMember admin;
    long curTime;
    long duration;
    GrayTipGroupMember member;
    long serialVersionUID;

    public GroupShutUpGrayElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88551, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.admin = new GrayTipGroupMember();
        this.member = new GrayTipGroupMember();
    }

    public GrayTipGroupMember getAdmin() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88551, (short) 5);
        return redirector != null ? (GrayTipGroupMember) redirector.redirect((short) 5, this) : this.admin;
    }

    public long getCurTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88551, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, this)).longValue() : this.curTime;
    }

    public long getDuration() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88551, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, this)).longValue() : this.duration;
    }

    public GrayTipGroupMember getMember() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88551, (short) 6);
        return redirector != null ? (GrayTipGroupMember) redirector.redirect((short) 6, this) : this.member;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88551, (short) 7);
        if (redirector != null) {
            return (String) redirector.redirect((short) 7, this);
        }
        return "GroupShutUpGrayElement{curTime=" + this.curTime + ",duration=" + this.duration + ",admin=" + this.admin + ",member=" + this.member + ",}";
    }

    public GroupShutUpGrayElement(long j2, long j3, GrayTipGroupMember grayTipGroupMember, GrayTipGroupMember grayTipGroupMember2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88551, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), Long.valueOf(j3), grayTipGroupMember, grayTipGroupMember2);
            return;
        }
        this.serialVersionUID = 1L;
        this.admin = new GrayTipGroupMember();
        this.member = new GrayTipGroupMember();
        this.curTime = j2;
        this.duration = j3;
        this.admin = grayTipGroupMember;
        this.member = grayTipGroupMember2;
    }
}
