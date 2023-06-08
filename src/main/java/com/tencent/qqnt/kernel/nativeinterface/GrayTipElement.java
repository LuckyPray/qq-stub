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
public final class GrayTipElement implements Serializable {
    AioOperateGrayTipElement aioOpGrayTipElement;
    BlockGrayTipElement blockGrayTipElement;
    BuddyGrayElement buddyElement;
    BuddyReq buddyNotifyElement;
    EmojiReplyElement emojiReplyElement;
    EssenceElement essenceElement;
    FeedMsgElement feedMsgElement;
    FileReceiptElement fileReceiptElement;
    GroupGrayElement groupElement;
    GroupNotifyMsg groupNotifyElement;
    JsonGrayElement jsonGrayTipElement;
    LocalGrayTipElement localGrayTipElement;
    ProclamationElement proclamationElement;
    RevokeElement revokeElement;
    long serialVersionUID;
    int subElementType;
    WalletGrayTipElement walletGrayTipElement;
    XmlElement xmlElement;

    public GrayTipElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
        } else {
            this.serialVersionUID = 1L;
        }
    }

    public AioOperateGrayTipElement getAioOpGrayTipElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 17);
        return redirector != null ? (AioOperateGrayTipElement) redirector.redirect((short) 17, (Object) this) : this.aioOpGrayTipElement;
    }

    public BlockGrayTipElement getBlockGrayTipElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 16);
        return redirector != null ? (BlockGrayTipElement) redirector.redirect((short) 16, (Object) this) : this.blockGrayTipElement;
    }

    public BuddyGrayElement getBuddyElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 8);
        return redirector != null ? (BuddyGrayElement) redirector.redirect((short) 8, (Object) this) : this.buddyElement;
    }

    public BuddyReq getBuddyNotifyElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 12);
        return redirector != null ? (BuddyReq) redirector.redirect((short) 12, (Object) this) : this.buddyNotifyElement;
    }

    public EmojiReplyElement getEmojiReplyElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 6);
        return redirector != null ? (EmojiReplyElement) redirector.redirect((short) 6, (Object) this) : this.emojiReplyElement;
    }

    public EssenceElement getEssenceElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 10);
        return redirector != null ? (EssenceElement) redirector.redirect((short) 10, (Object) this) : this.essenceElement;
    }

    public FeedMsgElement getFeedMsgElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 9);
        return redirector != null ? (FeedMsgElement) redirector.redirect((short) 9, (Object) this) : this.feedMsgElement;
    }

    public FileReceiptElement getFileReceiptElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 14);
        return redirector != null ? (FileReceiptElement) redirector.redirect((short) 14, (Object) this) : this.fileReceiptElement;
    }

    public GroupGrayElement getGroupElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 7);
        return redirector != null ? (GroupGrayElement) redirector.redirect((short) 7, (Object) this) : this.groupElement;
    }

    public GroupNotifyMsg getGroupNotifyElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 11);
        return redirector != null ? (GroupNotifyMsg) redirector.redirect((short) 11, (Object) this) : this.groupNotifyElement;
    }

    public JsonGrayElement getJsonGrayTipElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 18);
        return redirector != null ? (JsonGrayElement) redirector.redirect((short) 18, (Object) this) : this.jsonGrayTipElement;
    }

    public LocalGrayTipElement getLocalGrayTipElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 15);
        return redirector != null ? (LocalGrayTipElement) redirector.redirect((short) 15, (Object) this) : this.localGrayTipElement;
    }

    public ProclamationElement getProclamationElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 5);
        return redirector != null ? (ProclamationElement) redirector.redirect((short) 5, (Object) this) : this.proclamationElement;
    }

    public RevokeElement getRevokeElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 4);
        return redirector != null ? (RevokeElement) redirector.redirect((short) 4, (Object) this) : this.revokeElement;
    }

    public int getSubElementType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, (Object) this)).intValue() : this.subElementType;
    }

    public WalletGrayTipElement getWalletGrayTipElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 19);
        return redirector != null ? (WalletGrayTipElement) redirector.redirect((short) 19, (Object) this) : this.walletGrayTipElement;
    }

    public XmlElement getXmlElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 13);
        return redirector != null ? (XmlElement) redirector.redirect((short) 13, (Object) this) : this.xmlElement;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 20);
        if (redirector != null) {
            return (String) redirector.redirect((short) 20, (Object) this);
        }
        return "GrayTipElement{subElementType=" + this.subElementType + ",revokeElement=" + this.revokeElement + ",proclamationElement=" + this.proclamationElement + ",emojiReplyElement=" + this.emojiReplyElement + ",groupElement=" + this.groupElement + ",buddyElement=" + this.buddyElement + ",feedMsgElement=" + this.feedMsgElement + ",essenceElement=" + this.essenceElement + ",groupNotifyElement=" + this.groupNotifyElement + ",buddyNotifyElement=" + this.buddyNotifyElement + ",xmlElement=" + this.xmlElement + ",fileReceiptElement=" + this.fileReceiptElement + ",localGrayTipElement=" + this.localGrayTipElement + ",blockGrayTipElement=" + this.blockGrayTipElement + ",aioOpGrayTipElement=" + this.aioOpGrayTipElement + ",jsonGrayTipElement=" + this.jsonGrayTipElement + ",walletGrayTipElement=" + this.walletGrayTipElement + ",}";
    }

    public GrayTipElement(int i2, RevokeElement revokeElement, ProclamationElement proclamationElement, EmojiReplyElement emojiReplyElement, GroupGrayElement groupGrayElement, BuddyGrayElement buddyGrayElement, FeedMsgElement feedMsgElement, EssenceElement essenceElement, GroupNotifyMsg groupNotifyMsg, BuddyReq buddyReq, XmlElement xmlElement, FileReceiptElement fileReceiptElement, LocalGrayTipElement localGrayTipElement, BlockGrayTipElement blockGrayTipElement, AioOperateGrayTipElement aioOperateGrayTipElement, JsonGrayElement jsonGrayElement, WalletGrayTipElement walletGrayTipElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88081, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), revokeElement, proclamationElement, emojiReplyElement, groupGrayElement, buddyGrayElement, feedMsgElement, essenceElement, groupNotifyMsg, buddyReq, xmlElement, fileReceiptElement, localGrayTipElement, blockGrayTipElement, aioOperateGrayTipElement, jsonGrayElement, walletGrayTipElement);
            return;
        }
        this.serialVersionUID = 1L;
        this.subElementType = i2;
        this.revokeElement = revokeElement;
        this.proclamationElement = proclamationElement;
        this.emojiReplyElement = emojiReplyElement;
        this.groupElement = groupGrayElement;
        this.buddyElement = buddyGrayElement;
        this.feedMsgElement = feedMsgElement;
        this.essenceElement = essenceElement;
        this.groupNotifyElement = groupNotifyMsg;
        this.buddyNotifyElement = buddyReq;
        this.xmlElement = xmlElement;
        this.fileReceiptElement = fileReceiptElement;
        this.localGrayTipElement = localGrayTipElement;
        this.blockGrayTipElement = blockGrayTipElement;
        this.aioOpGrayTipElement = aioOperateGrayTipElement;
        this.jsonGrayTipElement = jsonGrayElement;
        this.walletGrayTipElement = walletGrayTipElement;
    }
}
