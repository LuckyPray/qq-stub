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
public final class MsgEmojiLikes {
    String emojiId;
    long emojiType;
    boolean isClicked;
    long likesCnt;

    public MsgEmojiLikes() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93602, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        } else {
            this.emojiId = "";
        }
    }

    public String getEmojiId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93602, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, this) : this.emojiId;
    }

    public long getEmojiType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93602, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, this)).longValue() : this.emojiType;
    }

    public boolean getIsClicked() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93602, (short) 6);
        return redirector != null ? ((Boolean) redirector.redirect((short) 6, this)).booleanValue() : this.isClicked;
    }

    public long getLikesCnt() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93602, (short) 5);
        return redirector != null ? ((Long) redirector.redirect((short) 5, this)).longValue() : this.likesCnt;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93602, (short) 7);
        if (redirector != null) {
            return (String) redirector.redirect((short) 7, this);
        }
        return "MsgEmojiLikes{emojiId=" + this.emojiId + ",emojiType=" + this.emojiType + ",likesCnt=" + this.likesCnt + ",isClicked=" + this.isClicked + ",}";
    }

    public MsgEmojiLikes(String str, long j2, long j3, boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93602, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z));
            return;
        }
        this.emojiId = "";
        this.emojiId = str;
        this.emojiType = j2;
        this.likesCnt = j3;
        this.isClicked = z;
    }
}
