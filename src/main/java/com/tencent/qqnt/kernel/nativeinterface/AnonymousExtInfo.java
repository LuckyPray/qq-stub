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
public final class AnonymousExtInfo {
    int anonymousFlag;
    byte[] anonymousId;
    String anonymousNick;
    long bubbleId;
    long expireTime;
    long headPicIndex;
    String rankColor;

    public AnonymousExtInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79462, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.anonymousId = new byte[0];
        this.anonymousNick = "";
        this.rankColor = "";
    }

    public int getAnonymousFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79462, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, this)).intValue() : this.anonymousFlag;
    }

    public byte[] getAnonymousId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79462, (short) 4);
        return redirector != null ? (byte[]) redirector.redirect((short) 4, this) : this.anonymousId;
    }

    public String getAnonymousNick() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79462, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, this) : this.anonymousNick;
    }

    public long getBubbleId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79462, (short) 8);
        return redirector != null ? ((Long) redirector.redirect((short) 8, this)).longValue() : this.bubbleId;
    }

    public long getExpireTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79462, (short) 7);
        return redirector != null ? ((Long) redirector.redirect((short) 7, this)).longValue() : this.expireTime;
    }

    public long getHeadPicIndex() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79462, (short) 6);
        return redirector != null ? ((Long) redirector.redirect((short) 6, this)).longValue() : this.headPicIndex;
    }

    public String getRankColor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79462, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, this) : this.rankColor;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79462, (short) 10);
        if (redirector != null) {
            return (String) redirector.redirect((short) 10, this);
        }
        return "AnonymousExtInfo{anonymousFlag=" + this.anonymousFlag + ",anonymousId=" + this.anonymousId + ",anonymousNick=" + this.anonymousNick + ",headPicIndex=" + this.headPicIndex + ",expireTime=" + this.expireTime + ",bubbleId=" + this.bubbleId + ",rankColor=" + this.rankColor + ",}";
    }

    public AnonymousExtInfo(int i2, byte[] bArr, String str, long j2, long j3, long j4, String str2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79462, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), bArr, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), str2);
            return;
        }
        this.anonymousId = new byte[0];
        this.anonymousNick = "";
        this.rankColor = "";
        this.anonymousFlag = i2;
        this.anonymousId = bArr;
        this.anonymousNick = str;
        this.headPicIndex = j2;
        this.expireTime = j3;
        this.bubbleId = j4;
        this.rankColor = str2;
    }
}
