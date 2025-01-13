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
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes2.dex */
public final class ReplyElement implements IKernelModel, Serializable {
    String anonymousNickName;
    Integer originalMsgState;
    long replayMsgId;
    Long replayMsgRootCommentCnt;
    Long replayMsgRootMsgId;
    Long replayMsgRootSeq;
    Long replayMsgSeq;
    Long replyMsgClientSeq;
    int replyMsgRevokeType;
    Long replyMsgTime;
    Long senderUid;
    String senderUidStr;
    long serialVersionUID;
    boolean sourceMsgExpired;
    Long sourceMsgIdInRecords;
    boolean sourceMsgIsIncPic;
    String sourceMsgText;
    ArrayList<ReplyAbsElement> sourceMsgTextElems;

    public ReplyElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.sourceMsgTextElems = new ArrayList<>();
    }

    public String getAnonymousNickName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 18);
        return redirector != null ? (String) redirector.redirect((short) 18, this) : this.anonymousNickName;
    }

    public Integer getOriginalMsgState() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 19);
        return redirector != null ? (Integer) redirector.redirect((short) 19, this) : this.originalMsgState;
    }

    public long getReplayMsgId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, this)).longValue() : this.replayMsgId;
    }

    public Long getReplayMsgRootCommentCnt() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 7);
        return redirector != null ? (Long) redirector.redirect((short) 7, this) : this.replayMsgRootCommentCnt;
    }

    public Long getReplayMsgRootMsgId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 6);
        return redirector != null ? (Long) redirector.redirect((short) 6, this) : this.replayMsgRootMsgId;
    }

    public Long getReplayMsgRootSeq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 5);
        return redirector != null ? (Long) redirector.redirect((short) 5, this) : this.replayMsgRootSeq;
    }

    public Long getReplayMsgSeq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 4);
        return redirector != null ? (Long) redirector.redirect((short) 4, this) : this.replayMsgSeq;
    }

    public Long getReplyMsgClientSeq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 13);
        return redirector != null ? (Long) redirector.redirect((short) 13, this) : this.replyMsgClientSeq;
    }

    public int getReplyMsgRevokeType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 15);
        return redirector != null ? ((Integer) redirector.redirect((short) 15, this)).intValue() : this.replyMsgRevokeType;
    }

    public Long getReplyMsgTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 14);
        return redirector != null ? (Long) redirector.redirect((short) 14, this) : this.replyMsgTime;
    }

    public Long getSenderUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 11);
        return redirector != null ? (Long) redirector.redirect((short) 11, this) : this.senderUid;
    }

    public String getSenderUidStr() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 12);
        return redirector != null ? (String) redirector.redirect((short) 12, this) : this.senderUidStr;
    }

    public boolean getSourceMsgExpired() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 17);
        return redirector != null ? ((Boolean) redirector.redirect((short) 17, this)).booleanValue() : this.sourceMsgExpired;
    }

    public Long getSourceMsgIdInRecords() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 8);
        return redirector != null ? (Long) redirector.redirect((short) 8, this) : this.sourceMsgIdInRecords;
    }

    public boolean getSourceMsgIsIncPic() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 16);
        return redirector != null ? ((Boolean) redirector.redirect((short) 16, this)).booleanValue() : this.sourceMsgIsIncPic;
    }

    public String getSourceMsgText() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, this) : this.sourceMsgText;
    }

    public ArrayList<ReplyAbsElement> getSourceMsgTextElems() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 10);
        return redirector != null ? (ArrayList) redirector.redirect((short) 10, this) : this.sourceMsgTextElems;
    }

    public void setAnonymousNickName(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 35);
        if (redirector != null) {
            redirector.redirect((short) 35, this, str);
        } else {
            this.anonymousNickName = str;
        }
    }

    public void setOriginalMsgState(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 36);
        if (redirector != null) {
            redirector.redirect((short) 36, this, num);
        } else {
            this.originalMsgState = num;
        }
    }

    public void setReplayMsgId(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 20);
        if (redirector != null) {
            redirector.redirect((short) 20, this, j2);
        } else {
            this.replayMsgId = j2;
        }
    }

    public void setReplayMsgRootCommentCnt(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 24);
        if (redirector != null) {
            redirector.redirect((short) 24, this, l2);
        } else {
            this.replayMsgRootCommentCnt = l2;
        }
    }

    public void setReplayMsgRootMsgId(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 23);
        if (redirector != null) {
            redirector.redirect((short) 23, this, l2);
        } else {
            this.replayMsgRootMsgId = l2;
        }
    }

    public void setReplayMsgRootSeq(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 22);
        if (redirector != null) {
            redirector.redirect((short) 22, this, l2);
        } else {
            this.replayMsgRootSeq = l2;
        }
    }

    public void setReplayMsgSeq(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 21);
        if (redirector != null) {
            redirector.redirect((short) 21, this, l2);
        } else {
            this.replayMsgSeq = l2;
        }
    }

    public void setReplyMsgClientSeq(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 30);
        if (redirector != null) {
            redirector.redirect((short) 30, this, l2);
        } else {
            this.replyMsgClientSeq = l2;
        }
    }

    public void setReplyMsgRevokeType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 32);
        if (redirector != null) {
            redirector.redirect((short) 32, this, i2);
        } else {
            this.replyMsgRevokeType = i2;
        }
    }

    public void setReplyMsgTime(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 31);
        if (redirector != null) {
            redirector.redirect((short) 31, this, l2);
        } else {
            this.replyMsgTime = l2;
        }
    }

    public void setSenderUid(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 28);
        if (redirector != null) {
            redirector.redirect((short) 28, this, l2);
        } else {
            this.senderUid = l2;
        }
    }

    public void setSenderUidStr(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 29);
        if (redirector != null) {
            redirector.redirect((short) 29, this, str);
        } else {
            this.senderUidStr = str;
        }
    }

    public void setSourceMsgExpired(boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 34);
        if (redirector != null) {
            redirector.redirect((short) 34, this, z);
        } else {
            this.sourceMsgExpired = z;
        }
    }

    public void setSourceMsgIdInRecords(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 25);
        if (redirector != null) {
            redirector.redirect((short) 25, this, l2);
        } else {
            this.sourceMsgIdInRecords = l2;
        }
    }

    public void setSourceMsgIsIncPic(boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 33);
        if (redirector != null) {
            redirector.redirect((short) 33, this, z);
        } else {
            this.sourceMsgIsIncPic = z;
        }
    }

    public void setSourceMsgText(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 26);
        if (redirector != null) {
            redirector.redirect((short) 26, this, str);
        } else {
            this.sourceMsgText = str;
        }
    }

    public void setSourceMsgTextElems(ArrayList<ReplyAbsElement> arrayList) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 27);
        if (redirector != null) {
            redirector.redirect((short) 27, this, arrayList);
        } else {
            this.sourceMsgTextElems = arrayList;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 37);
        if (redirector != null) {
            return (String) redirector.redirect((short) 37, this);
        }
        return "ReplyElement{replayMsgId=" + this.replayMsgId + ",replayMsgSeq=" + this.replayMsgSeq + ",replayMsgRootSeq=" + this.replayMsgRootSeq + ",replayMsgRootMsgId=" + this.replayMsgRootMsgId + ",replayMsgRootCommentCnt=" + this.replayMsgRootCommentCnt + ",sourceMsgIdInRecords=" + this.sourceMsgIdInRecords + ",sourceMsgText=" + this.sourceMsgText + ",sourceMsgTextElems=" + this.sourceMsgTextElems + ",senderUid=" + this.senderUid + ",senderUidStr=" + this.senderUidStr + ",replyMsgClientSeq=" + this.replyMsgClientSeq + ",replyMsgTime=" + this.replyMsgTime + ",replyMsgRevokeType=" + this.replyMsgRevokeType + ",sourceMsgIsIncPic=" + this.sourceMsgIsIncPic + ",sourceMsgExpired=" + this.sourceMsgExpired + ",anonymousNickName=" + this.anonymousNickName + ",originalMsgState=" + this.originalMsgState + ",}";
    }

    public ReplyElement(long j2, Long l2, Long l3, Long l4, Long l5, Long l6, String str, ArrayList<ReplyAbsElement> arrayList, Long l7, String str2, Long l8, Long l9, int i2, boolean z, boolean z2, String str3, Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94264, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), l2, l3, l4, l5, l6, str, arrayList, l7, str2, l8, l9, Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2), str3, num);
            return;
        }
        this.serialVersionUID = 1L;
        this.sourceMsgTextElems = new ArrayList<>();
        this.replayMsgId = j2;
        this.replayMsgSeq = l2;
        this.replayMsgRootSeq = l3;
        this.replayMsgRootMsgId = l4;
        this.replayMsgRootCommentCnt = l5;
        this.sourceMsgIdInRecords = l6;
        this.sourceMsgText = str;
        this.sourceMsgTextElems = arrayList;
        this.senderUid = l7;
        this.senderUidStr = str2;
        this.replyMsgClientSeq = l8;
        this.replyMsgTime = l9;
        this.replyMsgRevokeType = i2;
        this.sourceMsgIsIncPic = z;
        this.sourceMsgExpired = z2;
        this.anonymousNickName = str3;
        this.originalMsgState = num;
    }
}
