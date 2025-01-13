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

/* loaded from: classes2.dex */
public final class PublicAccountAttrs {
    Integer ack;
    Long bitmap;
    byte[] gdtCliData;
    byte[] gdtImpData;
    Integer op;
    Long pubMsgId;
    Integer report;
    Integer showTime;
    Long uniqueId;
    byte[] viewId;

    public PublicAccountAttrs() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        }
    }

    public Integer getAck() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 8);
        return redirector != null ? (Integer) redirector.redirect((short) 8, this) : this.ack;
    }

    public Long getBitmap() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 9);
        return redirector != null ? (Long) redirector.redirect((short) 9, this) : this.bitmap;
    }

    public byte[] getGdtCliData() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 11);
        return redirector != null ? (byte[]) redirector.redirect((short) 11, this) : this.gdtCliData;
    }

    public byte[] getGdtImpData() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 10);
        return redirector != null ? (byte[]) redirector.redirect((short) 10, this) : this.gdtImpData;
    }

    public Integer getOp() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 5);
        return redirector != null ? (Integer) redirector.redirect((short) 5, this) : this.op;
    }

    public Long getPubMsgId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 3);
        return redirector != null ? (Long) redirector.redirect((short) 3, this) : this.pubMsgId;
    }

    public Integer getReport() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 7);
        return redirector != null ? (Integer) redirector.redirect((short) 7, this) : this.report;
    }

    public Integer getShowTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 6);
        return redirector != null ? (Integer) redirector.redirect((short) 6, this) : this.showTime;
    }

    public Long getUniqueId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 4);
        return redirector != null ? (Long) redirector.redirect((short) 4, this) : this.uniqueId;
    }

    public byte[] getViewId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 12);
        return redirector != null ? (byte[]) redirector.redirect((short) 12, this) : this.viewId;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 13);
        if (redirector != null) {
            return (String) redirector.redirect((short) 13, this);
        }
        return "PublicAccountAttrs{pubMsgId=" + this.pubMsgId + ",uniqueId=" + this.uniqueId + ",op=" + this.op + ",showTime=" + this.showTime + ",report=" + this.report + ",ack=" + this.ack + ",bitmap=" + this.bitmap + ",gdtImpData=" + this.gdtImpData + ",gdtCliData=" + this.gdtCliData + ",viewId=" + this.viewId + ",}";
    }

    public PublicAccountAttrs(Long l2, Long l3, Integer num, Integer num2, Integer num3, Integer num4, Long l4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93974, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, l2, l3, num, num2, num3, num4, l4, bArr, bArr2, bArr3);
            return;
        }
        this.pubMsgId = l2;
        this.uniqueId = l3;
        this.op = num;
        this.showTime = num2;
        this.report = num3;
        this.ack = num4;
        this.bitmap = l4;
        this.gdtImpData = bArr;
        this.gdtCliData = bArr2;
        this.viewId = bArr3;
    }
}
