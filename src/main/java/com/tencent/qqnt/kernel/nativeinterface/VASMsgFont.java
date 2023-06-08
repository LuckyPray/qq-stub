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
public final class VASMsgFont {
    Integer diyFontCfgUpdateTime;
    Integer diyFontImageId;
    Integer fontId;
    Integer magicFontType;
    Long subFontId;

    public VASMsgFont() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95004, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
        }
    }

    public Integer getDiyFontCfgUpdateTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95004, (short) 5);
        return redirector != null ? (Integer) redirector.redirect((short) 5, (Object) this) : this.diyFontCfgUpdateTime;
    }

    public Integer getDiyFontImageId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95004, (short) 6);
        return redirector != null ? (Integer) redirector.redirect((short) 6, (Object) this) : this.diyFontImageId;
    }

    public Integer getFontId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95004, (short) 3);
        return redirector != null ? (Integer) redirector.redirect((short) 3, (Object) this) : this.fontId;
    }

    public Integer getMagicFontType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95004, (short) 7);
        return redirector != null ? (Integer) redirector.redirect((short) 7, (Object) this) : this.magicFontType;
    }

    public Long getSubFontId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95004, (short) 4);
        return redirector != null ? (Long) redirector.redirect((short) 4, (Object) this) : this.subFontId;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95004, (short) 8);
        if (redirector != null) {
            return (String) redirector.redirect((short) 8, (Object) this);
        }
        return "VASMsgFont{fontId=" + this.fontId + ",subFontId=" + this.subFontId + ",diyFontCfgUpdateTime=" + this.diyFontCfgUpdateTime + ",diyFontImageId=" + this.diyFontImageId + ",magicFontType=" + this.magicFontType + ",}";
    }

    public VASMsgFont(Integer num, Long l2, Integer num2, Integer num3, Integer num4) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95004, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, num, l2, num2, num3, num4);
            return;
        }
        this.fontId = num;
        this.subFontId = l2;
        this.diyFontCfgUpdateTime = num2;
        this.diyFontImageId = num3;
        this.magicFontType = num4;
    }
}
