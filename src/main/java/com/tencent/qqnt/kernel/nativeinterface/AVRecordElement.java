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
public final class AVRecordElement {
    Integer extraType;
    boolean hasRead;
    int mainType;
    String text;
    long time;
    int type;

    public AVRecordElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79196, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        } else {
            this.text = "";
        }
    }

    public Integer getExtraType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79196, (short) 8);
        return redirector != null ? (Integer) redirector.redirect((short) 8, this) : this.extraType;
    }

    public boolean getHasRead() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79196, (short) 7);
        return redirector != null ? ((Boolean) redirector.redirect((short) 7, this)).booleanValue() : this.hasRead;
    }

    public int getMainType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79196, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, this)).intValue() : this.mainType;
    }

    public String getText() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79196, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, this) : this.text;
    }

    public long getTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79196, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, this)).longValue() : this.time;
    }

    public int getType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79196, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, this)).intValue() : this.type;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79196, (short) 9);
        if (redirector != null) {
            return (String) redirector.redirect((short) 9, this);
        }
        return "AVRecordElement{type=" + this.type + ",time=" + this.time + ",text=" + this.text + ",mainType=" + this.mainType + ",hasRead=" + this.hasRead + ",extraType=" + this.extraType + ",}";
    }

    public AVRecordElement(int i2, long j2, String str, int i3, boolean z, Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79196, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), Long.valueOf(j2), str, Integer.valueOf(i3), Boolean.valueOf(z), num);
            return;
        }
        this.text = "";
        this.type = i2;
        this.time = j2;
        this.text = str;
        this.mainType = i3;
        this.hasRead = z;
        this.extraType = num;
    }
}
