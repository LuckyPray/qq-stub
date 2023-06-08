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
public final class TempChatGameSession {
    long gameAppId;
    String nickname;
    String peerOpenId;
    String peerRoleId;
    long peerTinyId;
    Integer pushWindowFlag;
    Integer redPointSwitch;
    Integer sayHiType;
    String selfOpenId;
    String selfRoleId;
    long selfTinyId;

    public TempChatGameSession() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.nickname = "";
        this.selfRoleId = "";
        this.selfOpenId = "";
        this.peerRoleId = "";
        this.peerOpenId = "";
    }

    public long getGameAppId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, (Object) this)).longValue() : this.gameAppId;
    }

    public String getNickname() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.nickname;
    }

    public String getPeerOpenId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 10);
        return redirector != null ? (String) redirector.redirect((short) 10, (Object) this) : this.peerOpenId;
    }

    public String getPeerRoleId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, (Object) this) : this.peerRoleId;
    }

    public long getPeerTinyId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 8);
        return redirector != null ? ((Long) redirector.redirect((short) 8, (Object) this)).longValue() : this.peerTinyId;
    }

    public Integer getPushWindowFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 11);
        return redirector != null ? (Integer) redirector.redirect((short) 11, (Object) this) : this.pushWindowFlag;
    }

    public Integer getRedPointSwitch() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 13);
        return redirector != null ? (Integer) redirector.redirect((short) 13, (Object) this) : this.redPointSwitch;
    }

    public Integer getSayHiType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 12);
        return redirector != null ? (Integer) redirector.redirect((short) 12, (Object) this) : this.sayHiType;
    }

    public String getSelfOpenId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, (Object) this) : this.selfOpenId;
    }

    public String getSelfRoleId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, (Object) this) : this.selfRoleId;
    }

    public long getSelfTinyId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 5);
        return redirector != null ? ((Long) redirector.redirect((short) 5, (Object) this)).longValue() : this.selfTinyId;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 14);
        if (redirector != null) {
            return (String) redirector.redirect((short) 14, (Object) this);
        }
        return "TempChatGameSession{gameAppId=" + this.gameAppId + ",nickname=" + this.nickname + ",selfTinyId=" + this.selfTinyId + ",selfRoleId=" + this.selfRoleId + ",selfOpenId=" + this.selfOpenId + ",peerTinyId=" + this.peerTinyId + ",peerRoleId=" + this.peerRoleId + ",peerOpenId=" + this.peerOpenId + ",pushWindowFlag=" + this.pushWindowFlag + ",sayHiType=" + this.sayHiType + ",redPointSwitch=" + this.redPointSwitch + ",}";
    }

    public TempChatGameSession(long j2, String str, long j3, String str2, String str3, long j4, String str4, String str5, Integer num, Integer num2, Integer num3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94719, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), str, Long.valueOf(j3), str2, str3, Long.valueOf(j4), str4, str5, num, num2, num3);
            return;
        }
        this.nickname = "";
        this.selfRoleId = "";
        this.selfOpenId = "";
        this.peerRoleId = "";
        this.peerOpenId = "";
        this.gameAppId = j2;
        this.nickname = str;
        this.selfTinyId = j3;
        this.selfRoleId = str2;
        this.selfOpenId = str3;
        this.peerTinyId = j4;
        this.peerRoleId = str4;
        this.peerOpenId = str5;
        this.pushWindowFlag = num;
        this.sayHiType = num2;
        this.redPointSwitch = num3;
    }
}
