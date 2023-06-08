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
public final class BuddyReq implements IKernelModel, Serializable {
    int commFriendNum;
    Integer curFriendMax;
    String extWords;
    int flag;
    String friendAvatarUrl;
    String friendNick;
    String friendUid;
    Long groupCode;
    boolean isAgreed;
    Boolean isBuddy;
    boolean isDecide;
    boolean isDoubt;
    boolean isInitiator;
    boolean isShowCard;
    boolean isUnread;
    String nameMore;
    int preGroupingId;
    int relation;
    Integer reqSubType;
    long reqTime;
    int reqType;
    long serialVersionUID;
    int sourceId;

    public BuddyReq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.serialVersionUID = 1L;
        this.friendUid = "";
        this.friendNick = "";
        this.friendAvatarUrl = "";
    }

    public int getCommFriendNum() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 12);
        return redirector != null ? ((Integer) redirector.redirect((short) 12, (Object) this)).intValue() : this.commFriendNum;
    }

    public Integer getCurFriendMax() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 13);
        return redirector != null ? (Integer) redirector.redirect((short) 13, (Object) this) : this.curFriendMax;
    }

    public String getExtWords() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, (Object) this) : this.extWords;
    }

    public int getFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 10);
        return redirector != null ? ((Integer) redirector.redirect((short) 10, (Object) this)).intValue() : this.flag;
    }

    public String getFriendAvatarUrl() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 19);
        return redirector != null ? (String) redirector.redirect((short) 19, (Object) this) : this.friendAvatarUrl;
    }

    public String getFriendNick() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 18);
        return redirector != null ? (String) redirector.redirect((short) 18, (Object) this) : this.friendNick;
    }

    public String getFriendUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, (Object) this) : this.friendUid;
    }

    public Long getGroupCode() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 21);
        return redirector != null ? (Long) redirector.redirect((short) 21, (Object) this) : this.groupCode;
    }

    public boolean getIsAgreed() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 23);
        return redirector != null ? ((Boolean) redirector.redirect((short) 23, (Object) this)).booleanValue() : this.isAgreed;
    }

    public Boolean getIsBuddy() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 22);
        return redirector != null ? (Boolean) redirector.redirect((short) 22, (Object) this) : this.isBuddy;
    }

    public boolean getIsDecide() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 3);
        return redirector != null ? ((Boolean) redirector.redirect((short) 3, (Object) this)).booleanValue() : this.isDecide;
    }

    public boolean getIsDoubt() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 16);
        return redirector != null ? ((Boolean) redirector.redirect((short) 16, (Object) this)).booleanValue() : this.isDoubt;
    }

    public boolean getIsInitiator() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 4);
        return redirector != null ? ((Boolean) redirector.redirect((short) 4, (Object) this)).booleanValue() : this.isInitiator;
    }

    public boolean getIsShowCard() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 14);
        return redirector != null ? ((Boolean) redirector.redirect((short) 14, (Object) this)).booleanValue() : this.isShowCard;
    }

    public boolean getIsUnread() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 15);
        return redirector != null ? ((Boolean) redirector.redirect((short) 15, (Object) this)).booleanValue() : this.isUnread;
    }

    public String getNameMore() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 17);
        return redirector != null ? (String) redirector.redirect((short) 17, (Object) this) : this.nameMore;
    }

    public int getPreGroupingId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 11);
        return redirector != null ? ((Integer) redirector.redirect((short) 11, (Object) this)).intValue() : this.preGroupingId;
    }

    public int getRelation() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 24);
        return redirector != null ? ((Integer) redirector.redirect((short) 24, (Object) this)).intValue() : this.relation;
    }

    public Integer getReqSubType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 7);
        return redirector != null ? (Integer) redirector.redirect((short) 7, (Object) this) : this.reqSubType;
    }

    public long getReqTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 8);
        return redirector != null ? ((Long) redirector.redirect((short) 8, (Object) this)).longValue() : this.reqTime;
    }

    public int getReqType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, (Object) this)).intValue() : this.reqType;
    }

    public int getSourceId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 20);
        return redirector != null ? ((Integer) redirector.redirect((short) 20, (Object) this)).intValue() : this.sourceId;
    }

    public void setCommFriendNum(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 34);
        if (redirector != null) {
            redirector.redirect((short) 34, (Object) this, i2);
        } else {
            this.commFriendNum = i2;
        }
    }

    public void setCurFriendMax(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 35);
        if (redirector != null) {
            redirector.redirect((short) 35, (Object) this, (Object) num);
        } else {
            this.curFriendMax = num;
        }
    }

    public void setExtWords(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 31);
        if (redirector != null) {
            redirector.redirect((short) 31, (Object) this, (Object) str);
        } else {
            this.extWords = str;
        }
    }

    public void setFlag(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 32);
        if (redirector != null) {
            redirector.redirect((short) 32, (Object) this, i2);
        } else {
            this.flag = i2;
        }
    }

    public void setFriendAvatarUrl(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 41);
        if (redirector != null) {
            redirector.redirect((short) 41, (Object) this, (Object) str);
        } else {
            this.friendAvatarUrl = str;
        }
    }

    public void setFriendNick(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 40);
        if (redirector != null) {
            redirector.redirect((short) 40, (Object) this, (Object) str);
        } else {
            this.friendNick = str;
        }
    }

    public void setFriendUid(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 27);
        if (redirector != null) {
            redirector.redirect((short) 27, (Object) this, (Object) str);
        } else {
            this.friendUid = str;
        }
    }

    public void setGroupCode(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 43);
        if (redirector != null) {
            redirector.redirect((short) 43, (Object) this, (Object) l2);
        } else {
            this.groupCode = l2;
        }
    }

    public void setIsAgreed(boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 45);
        if (redirector != null) {
            redirector.redirect((short) 45, (Object) this, z);
        } else {
            this.isAgreed = z;
        }
    }

    public void setIsBuddy(Boolean bool) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 44);
        if (redirector != null) {
            redirector.redirect((short) 44, (Object) this, (Object) bool);
        } else {
            this.isBuddy = bool;
        }
    }

    public void setIsDecide(boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 25);
        if (redirector != null) {
            redirector.redirect((short) 25, (Object) this, z);
        } else {
            this.isDecide = z;
        }
    }

    public void setIsDoubt(boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 38);
        if (redirector != null) {
            redirector.redirect((short) 38, (Object) this, z);
        } else {
            this.isDoubt = z;
        }
    }

    public void setIsInitiator(boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 26);
        if (redirector != null) {
            redirector.redirect((short) 26, (Object) this, z);
        } else {
            this.isInitiator = z;
        }
    }

    public void setIsShowCard(boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 36);
        if (redirector != null) {
            redirector.redirect((short) 36, (Object) this, z);
        } else {
            this.isShowCard = z;
        }
    }

    public void setIsUnread(boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 37);
        if (redirector != null) {
            redirector.redirect((short) 37, (Object) this, z);
        } else {
            this.isUnread = z;
        }
    }

    public void setNameMore(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 39);
        if (redirector != null) {
            redirector.redirect((short) 39, (Object) this, (Object) str);
        } else {
            this.nameMore = str;
        }
    }

    public void setPreGroupingId(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 33);
        if (redirector != null) {
            redirector.redirect((short) 33, (Object) this, i2);
        } else {
            this.preGroupingId = i2;
        }
    }

    public void setRelation(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 46);
        if (redirector != null) {
            redirector.redirect((short) 46, (Object) this, i2);
        } else {
            this.relation = i2;
        }
    }

    public void setReqSubType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 29);
        if (redirector != null) {
            redirector.redirect((short) 29, (Object) this, (Object) num);
        } else {
            this.reqSubType = num;
        }
    }

    public void setReqTime(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 30);
        if (redirector != null) {
            redirector.redirect((short) 30, (Object) this, j2);
        } else {
            this.reqTime = j2;
        }
    }

    public void setReqType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 28);
        if (redirector != null) {
            redirector.redirect((short) 28, (Object) this, i2);
        } else {
            this.reqType = i2;
        }
    }

    public void setSourceId(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 42);
        if (redirector != null) {
            redirector.redirect((short) 42, (Object) this, i2);
        } else {
            this.sourceId = i2;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 47);
        if (redirector != null) {
            return (String) redirector.redirect((short) 47, (Object) this);
        }
        return "BuddyReq{isDecide=" + this.isDecide + ",isInitiator=" + this.isInitiator + ",friendUid=" + this.friendUid + ",reqType=" + this.reqType + ",reqSubType=" + this.reqSubType + ",reqTime=" + this.reqTime + ",extWords=" + this.extWords + ",flag=" + this.flag + ",preGroupingId=" + this.preGroupingId + ",commFriendNum=" + this.commFriendNum + ",curFriendMax=" + this.curFriendMax + ",isShowCard=" + this.isShowCard + ",isUnread=" + this.isUnread + ",isDoubt=" + this.isDoubt + ",nameMore=" + this.nameMore + ",friendNick=" + this.friendNick + ",friendAvatarUrl=" + this.friendAvatarUrl + ",sourceId=" + this.sourceId + ",groupCode=" + this.groupCode + ",isBuddy=" + this.isBuddy + ",isAgreed=" + this.isAgreed + ",relation=" + this.relation + ",}";
    }

    public BuddyReq(boolean z, boolean z2, String str, int i2, Integer num, long j2, String str2, int i3, int i4, int i5, Integer num2, boolean z3, boolean z4, boolean z5, String str3, String str4, String str5, int i6, Long l2, Boolean bool, boolean z6, int i7) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79770, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Boolean.valueOf(z), Boolean.valueOf(z2), str, Integer.valueOf(i2), num, Long.valueOf(j2), str2, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), num2, Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), str3, str4, str5, Integer.valueOf(i6), l2, bool, Boolean.valueOf(z6), Integer.valueOf(i7));
            return;
        }
        this.serialVersionUID = 1L;
        this.friendUid = "";
        this.friendNick = "";
        this.friendAvatarUrl = "";
        this.isDecide = z;
        this.isInitiator = z2;
        this.friendUid = str;
        this.reqType = i2;
        this.reqSubType = num;
        this.reqTime = j2;
        this.extWords = str2;
        this.flag = i3;
        this.preGroupingId = i4;
        this.commFriendNum = i5;
        this.curFriendMax = num2;
        this.isShowCard = z3;
        this.isUnread = z4;
        this.isDoubt = z5;
        this.nameMore = str3;
        this.friendNick = str4;
        this.friendAvatarUrl = str5;
        this.sourceId = i6;
        this.groupCode = l2;
        this.isBuddy = bool;
        this.isAgreed = z6;
        this.relation = i7;
    }
}
