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
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes2.dex */
public final class MsgRecord {
    AnonymousExtInfo anonymousExtInfo;
    int atType;
    int avatarFlag;
    String avatarMeta;
    String avatarPendant;
    int categoryManage;
    String channelId;
    String channelName;
    int chatType;
    GProClientIdentity clientIdentityInfo;
    long clientSeq;
    long cntSeq;
    long commentCnt;
    int directMsgFlag;
    ArrayList<DirectMsgMember> directMsgMembers;
    boolean editable;
    ArrayList<MsgElement> elements;
    ArrayList<MsgEmojiLikes> emojiLikesList;
    byte[] extInfoForUI;
    String feedId;
    Integer fileGroupSize;
    FoldingInfo foldingInfo;
    FreqLimitInfo freqLimitInfo;
    long fromAppid;
    FromRoleInfo fromChannelRoleInfo;
    FromRoleInfo fromGuildRoleInfo;
    long fromUid;
    byte[] generalFlags;
    long guildCode;
    String guildId;
    String guildName;
    boolean isImportMsg;
    boolean isOnlineMsg;
    FromRoleInfo levelRoleInfo;
    HashMap<Integer, MsgAttributeInfo> msgAttrs;
    long msgId;
    byte[] msgMeta;
    long msgRandom;
    long msgSeq;
    long msgTime;
    int msgType;
    int nameType;
    String peerName;
    String peerUid;
    long peerUin;
    GProMedal personalMedal;
    long recallTime;
    ArrayList<MsgRecord> records;
    long roleId;
    int roleType;
    String sendMemberName;
    String sendNickName;
    String sendRemarkName;
    int sendStatus;
    int sendType;
    String senderUid;
    long senderUin;
    int subMsgType;
    long timeStamp;

    public MsgRecord() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.senderUid = "";
        this.peerUid = "";
        this.channelId = "";
        this.guildId = "";
        this.msgMeta = new byte[0];
        this.sendRemarkName = "";
        this.sendMemberName = "";
        this.sendNickName = "";
        this.guildName = "";
        this.channelName = "";
        this.elements = new ArrayList<>();
        this.records = new ArrayList<>();
        this.emojiLikesList = new ArrayList<>();
        this.directMsgMembers = new ArrayList<>();
        this.peerName = "";
        this.avatarMeta = "";
        this.avatarPendant = "";
        this.feedId = "";
        this.fromChannelRoleInfo = new FromRoleInfo();
        this.fromGuildRoleInfo = new FromRoleInfo();
        this.levelRoleInfo = new FromRoleInfo();
        this.generalFlags = new byte[0];
        this.msgAttrs = new HashMap<>();
    }

    public AnonymousExtInfo getAnonymousExtInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 56);
        return redirector != null ? (AnonymousExtInfo) redirector.redirect((short) 56, this) : this.anonymousExtInfo;
    }

    public int getAtType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 42);
        return redirector != null ? ((Integer) redirector.redirect((short) 42, this)).intValue() : this.atType;
    }

    public int getAvatarFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 58);
        return redirector != null ? ((Integer) redirector.redirect((short) 58, this)).intValue() : this.avatarFlag;
    }

    public String getAvatarMeta() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 35);
        return redirector != null ? (String) redirector.redirect((short) 35, this) : this.avatarMeta;
    }

    public String getAvatarPendant() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 36);
        return redirector != null ? (String) redirector.redirect((short) 36, this) : this.avatarPendant;
    }

    public int getCategoryManage() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 61);
        return redirector != null ? ((Integer) redirector.redirect((short) 61, this)).intValue() : this.categoryManage;
    }

    public String getChannelId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 13);
        return redirector != null ? (String) redirector.redirect((short) 13, this) : this.channelId;
    }

    public String getChannelName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 25);
        return redirector != null ? (String) redirector.redirect((short) 25, this) : this.channelName;
    }

    public int getChatType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 7);
        return redirector != null ? ((Integer) redirector.redirect((short) 7, this)).intValue() : this.chatType;
    }

    public GProClientIdentity getClientIdentityInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 40);
        return redirector != null ? (GProClientIdentity) redirector.redirect((short) 40, this) : this.clientIdentityInfo;
    }

    public long getClientSeq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 50);
        return redirector != null ? ((Long) redirector.redirect((short) 50, this)).longValue() : this.clientSeq;
    }

    public long getCntSeq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 6);
        return redirector != null ? ((Long) redirector.redirect((short) 6, this)).longValue() : this.cntSeq;
    }

    public long getCommentCnt() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 29);
        return redirector != null ? ((Long) redirector.redirect((short) 29, this)).longValue() : this.commentCnt;
    }

    public int getDirectMsgFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 30);
        return redirector != null ? ((Integer) redirector.redirect((short) 30, this)).intValue() : this.directMsgFlag;
    }

    public ArrayList<DirectMsgMember> getDirectMsgMembers() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 31);
        return redirector != null ? (ArrayList) redirector.redirect((short) 31, this) : this.directMsgMembers;
    }

    public boolean getEditable() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 34);
        return redirector != null ? ((Boolean) redirector.redirect((short) 34, this)).booleanValue() : this.editable;
    }

    public ArrayList<MsgElement> getElements() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 26);
        return redirector != null ? (ArrayList) redirector.redirect((short) 26, this) : this.elements;
    }

    public ArrayList<MsgEmojiLikes> getEmojiLikesList() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 28);
        return redirector != null ? (ArrayList) redirector.redirect((short) 28, this) : this.emojiLikesList;
    }

    public byte[] getExtInfoForUI() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 59);
        return redirector != null ? (byte[]) redirector.redirect((short) 59, this) : this.extInfoForUI;
    }

    public String getFeedId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 37);
        return redirector != null ? (String) redirector.redirect((short) 37, this) : this.feedId;
    }

    public Integer getFileGroupSize() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 51);
        return redirector != null ? (Integer) redirector.redirect((short) 51, this) : this.fileGroupSize;
    }

    public FoldingInfo getFoldingInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 52);
        return redirector != null ? (FoldingInfo) redirector.redirect((short) 52, this) : this.foldingInfo;
    }

    public FreqLimitInfo getFreqLimitInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 33);
        return redirector != null ? (FreqLimitInfo) redirector.redirect((short) 33, this) : this.freqLimitInfo;
    }

    public long getFromAppid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 17);
        return redirector != null ? ((Long) redirector.redirect((short) 17, this)).longValue() : this.fromAppid;
    }

    public FromRoleInfo getFromChannelRoleInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 44);
        return redirector != null ? (FromRoleInfo) redirector.redirect((short) 44, this) : this.fromChannelRoleInfo;
    }

    public FromRoleInfo getFromGuildRoleInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 45);
        return redirector != null ? (FromRoleInfo) redirector.redirect((short) 45, this) : this.fromGuildRoleInfo;
    }

    public long getFromUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 16);
        return redirector != null ? ((Long) redirector.redirect((short) 16, this)).longValue() : this.fromUid;
    }

    public byte[] getGeneralFlags() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 49);
        return redirector != null ? (byte[]) redirector.redirect((short) 49, this) : this.generalFlags;
    }

    public long getGuildCode() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 15);
        return redirector != null ? ((Long) redirector.redirect((short) 15, this)).longValue() : this.guildCode;
    }

    public String getGuildId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 14);
        return redirector != null ? (String) redirector.redirect((short) 14, this) : this.guildId;
    }

    public String getGuildName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 24);
        return redirector != null ? (String) redirector.redirect((short) 24, this) : this.guildName;
    }

    public boolean getIsImportMsg() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 41);
        return redirector != null ? ((Boolean) redirector.redirect((short) 41, this)).booleanValue() : this.isImportMsg;
    }

    public boolean getIsOnlineMsg() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 48);
        return redirector != null ? ((Boolean) redirector.redirect((short) 48, this)).booleanValue() : this.isOnlineMsg;
    }

    public FromRoleInfo getLevelRoleInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 46);
        return redirector != null ? (FromRoleInfo) redirector.redirect((short) 46, this) : this.levelRoleInfo;
    }

    public HashMap<Integer, MsgAttributeInfo> getMsgAttrs() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 55);
        return redirector != null ? (HashMap) redirector.redirect((short) 55, this) : this.msgAttrs;
    }

    public long getMsgId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, this)).longValue() : this.msgId;
    }

    public byte[] getMsgMeta() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 19);
        return redirector != null ? (byte[]) redirector.redirect((short) 19, this) : this.msgMeta;
    }

    public long getMsgRandom() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, this)).longValue() : this.msgRandom;
    }

    public long getMsgSeq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 5);
        return redirector != null ? ((Long) redirector.redirect((short) 5, this)).longValue() : this.msgSeq;
    }

    public long getMsgTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 18);
        return redirector != null ? ((Long) redirector.redirect((short) 18, this)).longValue() : this.msgTime;
    }

    public int getMsgType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 8);
        return redirector != null ? ((Integer) redirector.redirect((short) 8, this)).intValue() : this.msgType;
    }

    public int getNameType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 57);
        return redirector != null ? ((Integer) redirector.redirect((short) 57, this)).intValue() : this.nameType;
    }

    public String getPeerName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 32);
        return redirector != null ? (String) redirector.redirect((short) 32, this) : this.peerName;
    }

    public String getPeerUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 12);
        return redirector != null ? (String) redirector.redirect((short) 12, this) : this.peerUid;
    }

    public long getPeerUin() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 54);
        return redirector != null ? ((Long) redirector.redirect((short) 54, this)).longValue() : this.peerUin;
    }

    public GProMedal getPersonalMedal() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 60);
        return redirector != null ? (GProMedal) redirector.redirect((short) 60, this) : this.personalMedal;
    }

    public long getRecallTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 47);
        return redirector != null ? ((Long) redirector.redirect((short) 47, this)).longValue() : this.recallTime;
    }

    public ArrayList<MsgRecord> getRecords() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 27);
        return redirector != null ? (ArrayList) redirector.redirect((short) 27, this) : this.records;
    }

    public long getRoleId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 38);
        return redirector != null ? ((Long) redirector.redirect((short) 38, this)).longValue() : this.roleId;
    }

    public int getRoleType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 43);
        return redirector != null ? ((Integer) redirector.redirect((short) 43, this)).intValue() : this.roleType;
    }

    public String getSendMemberName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 22);
        return redirector != null ? (String) redirector.redirect((short) 22, this) : this.sendMemberName;
    }

    public String getSendNickName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 23);
        return redirector != null ? (String) redirector.redirect((short) 23, this) : this.sendNickName;
    }

    public String getSendRemarkName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 21);
        return redirector != null ? (String) redirector.redirect((short) 21, this) : this.sendRemarkName;
    }

    public int getSendStatus() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 20);
        return redirector != null ? ((Integer) redirector.redirect((short) 20, this)).intValue() : this.sendStatus;
    }

    public int getSendType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 10);
        return redirector != null ? ((Integer) redirector.redirect((short) 10, this)).intValue() : this.sendType;
    }

    public String getSenderUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 11);
        return redirector != null ? (String) redirector.redirect((short) 11, this) : this.senderUid;
    }

    public long getSenderUin() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 53);
        return redirector != null ? ((Long) redirector.redirect((short) 53, this)).longValue() : this.senderUin;
    }

    public int getSubMsgType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 9);
        return redirector != null ? ((Integer) redirector.redirect((short) 9, this)).intValue() : this.subMsgType;
    }

    public long getTimeStamp() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 39);
        return redirector != null ? ((Long) redirector.redirect((short) 39, this)).longValue() : this.timeStamp;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 62);
        if (redirector != null) {
            return (String) redirector.redirect((short) 62, this);
        }
        return "MsgRecord{msgId=" + this.msgId + ",msgRandom=" + this.msgRandom + ",msgSeq=" + this.msgSeq + ",cntSeq=" + this.cntSeq + ",chatType=" + this.chatType + ",msgType=" + this.msgType + ",subMsgType=" + this.subMsgType + ",sendType=" + this.sendType + ",senderUid=" + this.senderUid + ",peerUid=" + this.peerUid + ",channelId=" + this.channelId + ",guildId=" + this.guildId + ",guildCode=" + this.guildCode + ",fromUid=" + this.fromUid + ",fromAppid=" + this.fromAppid + ",msgTime=" + this.msgTime + ",msgMeta=" + this.msgMeta + ",sendStatus=" + this.sendStatus + ",sendRemarkName=" + this.sendRemarkName + ",sendMemberName=" + this.sendMemberName + ",sendNickName=" + this.sendNickName + ",guildName=" + this.guildName + ",channelName=" + this.channelName + ",elements=" + this.elements + ",records=" + this.records + ",emojiLikesList=" + this.emojiLikesList + ",commentCnt=" + this.commentCnt + ",directMsgFlag=" + this.directMsgFlag + ",directMsgMembers=" + this.directMsgMembers + ",peerName=" + this.peerName + ",freqLimitInfo=" + this.freqLimitInfo + ",editable=" + this.editable + ",avatarMeta=" + this.avatarMeta + ",avatarPendant=" + this.avatarPendant + ",feedId=" + this.feedId + ",roleId=" + this.roleId + ",timeStamp=" + this.timeStamp + ",clientIdentityInfo=" + this.clientIdentityInfo + ",isImportMsg=" + this.isImportMsg + ",atType=" + this.atType + ",roleType=" + this.roleType + ",fromChannelRoleInfo=" + this.fromChannelRoleInfo + ",fromGuildRoleInfo=" + this.fromGuildRoleInfo + ",levelRoleInfo=" + this.levelRoleInfo + ",recallTime=" + this.recallTime + ",isOnlineMsg=" + this.isOnlineMsg + ",generalFlags=" + this.generalFlags + ",clientSeq=" + this.clientSeq + ",fileGroupSize=" + this.fileGroupSize + ",foldingInfo=" + this.foldingInfo + ",senderUin=" + this.senderUin + ",peerUin=" + this.peerUin + ",msgAttrs=" + this.msgAttrs + ",anonymousExtInfo=" + this.anonymousExtInfo + ",nameType=" + this.nameType + ",avatarFlag=" + this.avatarFlag + ",extInfoForUI=" + this.extInfoForUI + ",personalMedal=" + this.personalMedal + ",categoryManage=" + this.categoryManage + ",}";
    }

    public MsgRecord(long j2, long j3, long j4, long j5, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4, long j6, long j7, long j8, long j9, byte[] bArr, int i6, String str5, String str6, String str7, String str8, String str9, ArrayList<MsgElement> arrayList, ArrayList<MsgRecord> arrayList2, ArrayList<MsgEmojiLikes> arrayList3, long j10, int i7, ArrayList<DirectMsgMember> arrayList4, String str10, FreqLimitInfo freqLimitInfo, boolean z, String str11, String str12, String str13, long j11, long j12, GProClientIdentity gProClientIdentity, boolean z2, int i8, int i9, FromRoleInfo fromRoleInfo, FromRoleInfo fromRoleInfo2, FromRoleInfo fromRoleInfo3, long j13, boolean z3, byte[] bArr2, long j14, Integer num, FoldingInfo foldingInfo, long j15, long j16, HashMap<Integer, MsgAttributeInfo> hashMap, AnonymousExtInfo anonymousExtInfo, int i10, int i11, byte[] bArr3, GProMedal gProMedal, int i12) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93630, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str, str2, str3, str4, Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), bArr, Integer.valueOf(i6), str5, str6, str7, str8, str9, arrayList, arrayList2, arrayList3, Long.valueOf(j10), Integer.valueOf(i7), arrayList4, str10, freqLimitInfo, Boolean.valueOf(z), str11, str12, str13, Long.valueOf(j11), Long.valueOf(j12), gProClientIdentity, Boolean.valueOf(z2), Integer.valueOf(i8), Integer.valueOf(i9), fromRoleInfo, fromRoleInfo2, fromRoleInfo3, Long.valueOf(j13), Boolean.valueOf(z3), bArr2, Long.valueOf(j14), num, foldingInfo, Long.valueOf(j15), Long.valueOf(j16), hashMap, anonymousExtInfo, Integer.valueOf(i10), Integer.valueOf(i11), bArr3, gProMedal, Integer.valueOf(i12));
            return;
        }
        this.senderUid = "";
        this.peerUid = "";
        this.channelId = "";
        this.guildId = "";
        this.msgMeta = new byte[0];
        this.sendRemarkName = "";
        this.sendMemberName = "";
        this.sendNickName = "";
        this.guildName = "";
        this.channelName = "";
        this.elements = new ArrayList<>();
        this.records = new ArrayList<>();
        this.emojiLikesList = new ArrayList<>();
        this.directMsgMembers = new ArrayList<>();
        this.peerName = "";
        this.avatarMeta = "";
        this.avatarPendant = "";
        this.feedId = "";
        this.fromChannelRoleInfo = new FromRoleInfo();
        this.fromGuildRoleInfo = new FromRoleInfo();
        this.levelRoleInfo = new FromRoleInfo();
        this.generalFlags = new byte[0];
        this.msgAttrs = new HashMap<>();
        this.msgId = j2;
        this.msgRandom = j3;
        this.msgSeq = j4;
        this.cntSeq = j5;
        this.chatType = i2;
        this.msgType = i3;
        this.subMsgType = i4;
        this.sendType = i5;
        this.senderUid = str;
        this.peerUid = str2;
        this.channelId = str3;
        this.guildId = str4;
        this.guildCode = j6;
        this.fromUid = j7;
        this.fromAppid = j8;
        this.msgTime = j9;
        this.msgMeta = bArr;
        this.sendStatus = i6;
        this.sendRemarkName = str5;
        this.sendMemberName = str6;
        this.sendNickName = str7;
        this.guildName = str8;
        this.channelName = str9;
        this.elements = arrayList;
        this.records = arrayList2;
        this.emojiLikesList = arrayList3;
        this.commentCnt = j10;
        this.directMsgFlag = i7;
        this.directMsgMembers = arrayList4;
        this.peerName = str10;
        this.freqLimitInfo = freqLimitInfo;
        this.editable = z;
        this.avatarMeta = str11;
        this.avatarPendant = str12;
        this.feedId = str13;
        this.roleId = j11;
        this.timeStamp = j12;
        this.clientIdentityInfo = gProClientIdentity;
        this.isImportMsg = z2;
        this.atType = i8;
        this.roleType = i9;
        this.fromChannelRoleInfo = fromRoleInfo;
        this.fromGuildRoleInfo = fromRoleInfo2;
        this.levelRoleInfo = fromRoleInfo3;
        this.recallTime = j13;
        this.isOnlineMsg = z3;
        this.generalFlags = bArr2;
        this.clientSeq = j14;
        this.fileGroupSize = num;
        this.foldingInfo = foldingInfo;
        this.senderUin = j15;
        this.peerUin = j16;
        this.msgAttrs = hashMap;
        this.anonymousExtInfo = anonymousExtInfo;
        this.nameType = i10;
        this.avatarFlag = i11;
        this.extInfoForUI = bArr3;
        this.personalMedal = gProMedal;
        this.categoryManage = i12;
    }
}
