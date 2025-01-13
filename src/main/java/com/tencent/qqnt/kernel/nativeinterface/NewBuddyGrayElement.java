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
public final class NewBuddyGrayElement implements Serializable {
    String friendNick;
    boolean isInitiator;
    long serialVersionUID;
    int sourceId;
    int subSourceId;
    long time;

    public NewBuddyGrayElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93707, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.friendNick = "";
    }

    public String getFriendNick() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93707, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, this) : this.friendNick;
    }

    public boolean getIsInitiator() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93707, (short) 6);
        return redirector != null ? ((Boolean) redirector.redirect((short) 6, this)).booleanValue() : this.isInitiator;
    }

    public int getSourceId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93707, (short) 4);
        return redirector != null ? ((Integer) redirector.redirect((short) 4, this)).intValue() : this.sourceId;
    }

    public int getSubSourceId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93707, (short) 5);
        return redirector != null ? ((Integer) redirector.redirect((short) 5, this)).intValue() : this.subSourceId;
    }

    public long getTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93707, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, this)).longValue() : this.time;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93707, (short) 8);
        if (redirector != null) {
            return (String) redirector.redirect((short) 8, this);
        }
        return "NewBuddyGrayElement{time=" + this.time + ",sourceId=" + this.sourceId + ",subSourceId=" + this.subSourceId + ",isInitiator=" + this.isInitiator + ",friendNick=" + this.friendNick + ",}";
    }

    public NewBuddyGrayElement(long j2, int i2, int i3, boolean z, String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93707, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), str);
            return;
        }
        this.serialVersionUID = 1L;
        this.friendNick = "";
        this.time = j2;
        this.sourceId = i2;
        this.subSourceId = i3;
        this.isInitiator = z;
        this.friendNick = str;
    }
}
