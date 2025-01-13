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
public final class GiphyElement {
    int height;
    String id;
    boolean isClip;
    int width;

    public GiphyElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88003, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        } else {
            this.id = "";
        }
    }

    public int getHeight() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88003, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, this)).intValue() : this.height;
    }

    public String getId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88003, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, this) : this.id;
    }

    public boolean getIsClip() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88003, (short) 4);
        return redirector != null ? ((Boolean) redirector.redirect((short) 4, this)).booleanValue() : this.isClip;
    }

    public int getWidth() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88003, (short) 5);
        return redirector != null ? ((Integer) redirector.redirect((short) 5, this)).intValue() : this.width;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88003, (short) 7);
        if (redirector != null) {
            return (String) redirector.redirect((short) 7, this);
        }
        return "GiphyElement{id=" + this.id + ",isClip=" + this.isClip + ",width=" + this.width + ",height=" + this.height + ",}";
    }

    public GiphyElement(String str, boolean z, int i2, int i3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88003, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3));
            return;
        }
        this.id = "";
        this.id = str;
        this.isClip = z;
        this.width = i2;
        this.height = i3;
    }
}
