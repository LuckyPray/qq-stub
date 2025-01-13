package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/GrayTipElement.class */
public final class GrayTipElement implements Serializable {
    static IPatchRedirector $redirector_;
    public AioOperateGrayTipElement aioOpGrayTipElement;
    public BlockGrayTipElement blockGrayTipElement;
    public BuddyGrayElement buddyElement;
    public EmojiReplyElement emojiReplyElement;
    public EssenceElement essenceElement;
    public FeedMsgElement feedMsgElement;
    public FileReceiptElement fileReceiptElement;
    public GroupGrayElement groupElement;
    public JsonGrayElement jsonGrayTipElement;
    public LocalGrayTipElement localGrayTipElement;
    public ProclamationElement proclamationElement;
    public RevokeElement revokeElement;
    long serialVersionUID;
    public int subElementType;
    public WalletGrayTipElement walletGrayTipElement;
    public XmlElement xmlElement;

    public GrayTipElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public AioOperateGrayTipElement getAioOpGrayTipElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.aioOpGrayTipElement : (AioOperateGrayTipElement) iPatchRedirector.redirect((short) 15, this);
    }

    public BlockGrayTipElement getBlockGrayTipElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.blockGrayTipElement : (BlockGrayTipElement) iPatchRedirector.redirect((short) 14, this);
    }

    public BuddyGrayElement getBuddyElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.buddyElement : (BuddyGrayElement) iPatchRedirector.redirect((short) 8, this);
    }

    public EmojiReplyElement getEmojiReplyElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.emojiReplyElement : (EmojiReplyElement) iPatchRedirector.redirect((short) 6, this);
    }

    public EssenceElement getEssenceElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.essenceElement : (EssenceElement) iPatchRedirector.redirect((short) 10, this);
    }

    public FeedMsgElement getFeedMsgElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.feedMsgElement : (FeedMsgElement) iPatchRedirector.redirect((short) 9, this);
    }

    public FileReceiptElement getFileReceiptElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.fileReceiptElement : (FileReceiptElement) iPatchRedirector.redirect((short) 12, this);
    }

    public GroupGrayElement getGroupElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.groupElement : (GroupGrayElement) iPatchRedirector.redirect((short) 7, this);
    }

    public JsonGrayElement getJsonGrayTipElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.jsonGrayTipElement : (JsonGrayElement) iPatchRedirector.redirect((short) 16, this);
    }

    public LocalGrayTipElement getLocalGrayTipElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.localGrayTipElement : (LocalGrayTipElement) iPatchRedirector.redirect((short) 13, this);
    }

    public ProclamationElement getProclamationElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.proclamationElement : (ProclamationElement) iPatchRedirector.redirect((short) 5, this);
    }

    public RevokeElement getRevokeElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.revokeElement : (RevokeElement) iPatchRedirector.redirect((short) 4, this);
    }

    public int getSubElementType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.subElementType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public WalletGrayTipElement getWalletGrayTipElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.walletGrayTipElement : (WalletGrayTipElement) iPatchRedirector.redirect((short) 17, this);
    }

    public XmlElement getXmlElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.xmlElement : (XmlElement) iPatchRedirector.redirect((short) 11, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GrayTipElement{subElementType=" + this.subElementType + ",revokeElement=" + this.revokeElement + ",proclamationElement=" + this.proclamationElement + ",emojiReplyElement=" + this.emojiReplyElement + ",groupElement=" + this.groupElement + ",buddyElement=" + this.buddyElement + ",feedMsgElement=" + this.feedMsgElement + ",essenceElement=" + this.essenceElement + ",xmlElement=" + this.xmlElement + ",fileReceiptElement=" + this.fileReceiptElement + ",localGrayTipElement=" + this.localGrayTipElement + ",blockGrayTipElement=" + this.blockGrayTipElement + ",aioOpGrayTipElement=" + this.aioOpGrayTipElement + ",jsonGrayTipElement=" + this.jsonGrayTipElement + ",walletGrayTipElement=" + this.walletGrayTipElement + ",}";
    }

    public GrayTipElement(int i, RevokeElement revokeElement, ProclamationElement proclamationElement, EmojiReplyElement emojiReplyElement, GroupGrayElement groupGrayElement, BuddyGrayElement buddyGrayElement, FeedMsgElement feedMsgElement, EssenceElement essenceElement, XmlElement xmlElement, FileReceiptElement fileReceiptElement, LocalGrayTipElement localGrayTipElement, BlockGrayTipElement blockGrayTipElement, AioOperateGrayTipElement aioOperateGrayTipElement, JsonGrayElement jsonGrayElement, WalletGrayTipElement walletGrayTipElement) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), revokeElement, proclamationElement, emojiReplyElement, groupGrayElement, buddyGrayElement, feedMsgElement, essenceElement, xmlElement, fileReceiptElement, localGrayTipElement, blockGrayTipElement, aioOperateGrayTipElement, jsonGrayElement, walletGrayTipElement);
            return;
        }
        this.serialVersionUID = 1L;
        this.subElementType = i;
        this.revokeElement = revokeElement;
        this.proclamationElement = proclamationElement;
        this.emojiReplyElement = emojiReplyElement;
        this.groupElement = groupGrayElement;
        this.buddyElement = buddyGrayElement;
        this.feedMsgElement = feedMsgElement;
        this.essenceElement = essenceElement;
        this.xmlElement = xmlElement;
        this.fileReceiptElement = fileReceiptElement;
        this.localGrayTipElement = localGrayTipElement;
        this.blockGrayTipElement = blockGrayTipElement;
        this.aioOpGrayTipElement = aioOperateGrayTipElement;
        this.jsonGrayTipElement = jsonGrayElement;
        this.walletGrayTipElement = walletGrayTipElement;
    }
}
