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
public final class SmallYellowFaceInfo {
    String buf;
    String compatibleText;
    int index;
    String text;

    public SmallYellowFaceInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
        }
    }

    public String getBuf() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, (Object) this) : this.buf;
    }

    public String getCompatibleText() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, (Object) this) : this.compatibleText;
    }

    public int getIndex() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, (Object) this)).intValue() : this.index;
    }

    public String getText() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.text;
    }

    public void setBuf(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 10);
        if (redirector != null) {
            redirector.redirect((short) 10, (Object) this, (Object) str);
        } else {
            this.buf = str;
        }
    }

    public void setCompatibleText(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 9);
        if (redirector != null) {
            redirector.redirect((short) 9, (Object) this, (Object) str);
        } else {
            this.compatibleText = str;
        }
    }

    public void setIndex(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 7);
        if (redirector != null) {
            redirector.redirect((short) 7, (Object) this, i2);
        } else {
            this.index = i2;
        }
    }

    public void setText(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 8);
        if (redirector != null) {
            redirector.redirect((short) 8, (Object) this, (Object) str);
        } else {
            this.text = str;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 11);
        if (redirector != null) {
            return (String) redirector.redirect((short) 11, (Object) this);
        }
        return "SmallYellowFaceInfo{index=" + this.index + ",text=" + this.text + ",compatibleText=" + this.compatibleText + ",buf=" + this.buf + ",}";
    }

    public SmallYellowFaceInfo(int i2, String str, String str2, String str3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94612, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), str, str2, str3);
            return;
        }
        this.index = i2;
        this.text = str;
        this.compatibleText = str2;
        this.buf = str3;
    }
}
