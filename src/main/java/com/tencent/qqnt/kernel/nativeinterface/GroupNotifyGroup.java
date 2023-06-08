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
public final class GroupNotifyGroup implements Serializable {
    long groupCode;
    String groupName;
    long serialVersionUID;

    public GroupNotifyGroup() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88458, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.serialVersionUID = 1L;
        this.groupName = "";
    }

    public long getGroupCode() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88458, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, (Object) this)).longValue() : this.groupCode;
    }

    public String getGroupName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88458, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.groupName;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88458, (short) 5);
        if (redirector != null) {
            return (String) redirector.redirect((short) 5, (Object) this);
        }
        return "GroupNotifyGroup{groupCode=" + this.groupCode + ",groupName=" + this.groupName + ",}";
    }

    public GroupNotifyGroup(long j2, String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88458, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), str);
            return;
        }
        this.serialVersionUID = 1L;
        this.groupName = "";
        this.groupCode = j2;
        this.groupName = str;
    }
}
