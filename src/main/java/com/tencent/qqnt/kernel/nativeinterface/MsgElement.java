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
public final class MsgElement implements IKernelModel, Serializable {
    ArkElement arkElement;
    AVRecordElement avRecordElement;
    CalendarElement calendarElement;
    long elementId;
    int elementType;
    byte[] extBufForUI;
    FaceBubbleElement faceBubbleElement;
    FaceElement faceElement;
    FileElement fileElement;
    GiphyElement giphyElement;
    GrayTipElement grayTipElement;
    InlineKeyboardElement inlineKeyboardElement;
    LiveGiftElement liveGiftElement;
    MarkdownElement markdownElement;
    MarketFaceElement marketFaceElement;
    MultiForwardMsgElement multiForwardMsgElement;
    PicElement picElement;
    PttElement pttElement;
    ReplyElement replyElement;
    long serialVersionUID;
    ShareLocationElement shareLocationElement;
    StructLongMsgElement structLongMsgElement;
    StructMsgElement structMsgElement;
    TextElement textElement;
    TextGiftElement textGiftElement;
    TofuRecordElement tofuRecordElement;
    VideoElement videoElement;
    WalletElement walletElement;
    YoloGameResultElement yoloGameResultElement;

    public MsgElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
        }
    }

    public ArkElement getArkElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 14);
        return redirector != null ? (ArkElement) redirector.redirect((short) 14, this) : this.arkElement;
    }

    public AVRecordElement getAvRecordElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 26);
        return redirector != null ? (AVRecordElement) redirector.redirect((short) 26, this) : this.avRecordElement;
    }

    public CalendarElement getCalendarElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 24);
        return redirector != null ? (CalendarElement) redirector.redirect((short) 24, this) : this.calendarElement;
    }

    public long getElementId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, this)).longValue() : this.elementId;
    }

    public int getElementType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, this)).intValue() : this.elementType;
    }

    public byte[] getExtBufForUI() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 5);
        return redirector != null ? (byte[]) redirector.redirect((short) 5, this) : this.extBufForUI;
    }

    public FaceBubbleElement getFaceBubbleElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 28);
        return redirector != null ? (FaceBubbleElement) redirector.redirect((short) 28, this) : this.faceBubbleElement;
    }

    public FaceElement getFaceElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 7);
        return redirector != null ? (FaceElement) redirector.redirect((short) 7, this) : this.faceElement;
    }

    public FileElement getFileElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 15);
        return redirector != null ? (FileElement) redirector.redirect((short) 15, this) : this.fileElement;
    }

    public GiphyElement getGiphyElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 20);
        return redirector != null ? (GiphyElement) redirector.redirect((short) 20, this) : this.giphyElement;
    }

    public GrayTipElement getGrayTipElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 13);
        return redirector != null ? (GrayTipElement) redirector.redirect((short) 13, this) : this.grayTipElement;
    }

    public InlineKeyboardElement getInlineKeyboardElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 22);
        return redirector != null ? (InlineKeyboardElement) redirector.redirect((short) 22, this) : this.inlineKeyboardElement;
    }

    public LiveGiftElement getLiveGiftElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 16);
        return redirector != null ? (LiveGiftElement) redirector.redirect((short) 16, this) : this.liveGiftElement;
    }

    public MarkdownElement getMarkdownElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 17);
        return redirector != null ? (MarkdownElement) redirector.redirect((short) 17, this) : this.markdownElement;
    }

    public MarketFaceElement getMarketFaceElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 8);
        return redirector != null ? (MarketFaceElement) redirector.redirect((short) 8, this) : this.marketFaceElement;
    }

    public MultiForwardMsgElement getMultiForwardMsgElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 19);
        return redirector != null ? (MultiForwardMsgElement) redirector.redirect((short) 19, this) : this.multiForwardMsgElement;
    }

    public PicElement getPicElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 10);
        return redirector != null ? (PicElement) redirector.redirect((short) 10, this) : this.picElement;
    }

    public PttElement getPttElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 11);
        return redirector != null ? (PttElement) redirector.redirect((short) 11, this) : this.pttElement;
    }

    public ReplyElement getReplyElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 9);
        return redirector != null ? (ReplyElement) redirector.redirect((short) 9, this) : this.replyElement;
    }

    public ShareLocationElement getShareLocationElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 29);
        return redirector != null ? (ShareLocationElement) redirector.redirect((short) 29, this) : this.shareLocationElement;
    }

    public StructLongMsgElement getStructLongMsgElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 18);
        return redirector != null ? (StructLongMsgElement) redirector.redirect((short) 18, this) : this.structLongMsgElement;
    }

    public StructMsgElement getStructMsgElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 27);
        return redirector != null ? (StructMsgElement) redirector.redirect((short) 27, this) : this.structMsgElement;
    }

    public TextElement getTextElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 6);
        return redirector != null ? (TextElement) redirector.redirect((short) 6, this) : this.textElement;
    }

    public TextGiftElement getTextGiftElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 23);
        return redirector != null ? (TextGiftElement) redirector.redirect((short) 23, this) : this.textGiftElement;
    }

    public TofuRecordElement getTofuRecordElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 30);
        return redirector != null ? (TofuRecordElement) redirector.redirect((short) 30, this) : this.tofuRecordElement;
    }

    public VideoElement getVideoElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 12);
        return redirector != null ? (VideoElement) redirector.redirect((short) 12, this) : this.videoElement;
    }

    public WalletElement getWalletElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 21);
        return redirector != null ? (WalletElement) redirector.redirect((short) 21, this) : this.walletElement;
    }

    public YoloGameResultElement getYoloGameResultElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 25);
        return redirector != null ? (YoloGameResultElement) redirector.redirect((short) 25, this) : this.yoloGameResultElement;
    }

    public void setArkElement(ArkElement arkElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 42);
        if (redirector != null) {
            redirector.redirect((short) 42, this, arkElement);
        } else {
            this.arkElement = arkElement;
        }
    }

    public void setAvRecordElement(AVRecordElement aVRecordElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 54);
        if (redirector != null) {
            redirector.redirect((short) 54, this, aVRecordElement);
        } else {
            this.avRecordElement = aVRecordElement;
        }
    }

    public void setCalendarElement(CalendarElement calendarElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 52);
        if (redirector != null) {
            redirector.redirect((short) 52, this, calendarElement);
        } else {
            this.calendarElement = calendarElement;
        }
    }

    public void setElementId(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 32);
        if (redirector != null) {
            redirector.redirect((short) 32, this, j2);
        } else {
            this.elementId = j2;
        }
    }

    public void setElementType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 31);
        if (redirector != null) {
            redirector.redirect((short) 31, this, i2);
        } else {
            this.elementType = i2;
        }
    }

    public void setExtBufForUI(byte[] bArr) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 33);
        if (redirector != null) {
            redirector.redirect((short) 33, this, bArr);
        } else {
            this.extBufForUI = bArr;
        }
    }

    public void setFaceBubbleElement(FaceBubbleElement faceBubbleElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 56);
        if (redirector != null) {
            redirector.redirect((short) 56, this, faceBubbleElement);
        } else {
            this.faceBubbleElement = faceBubbleElement;
        }
    }

    public void setFaceElement(FaceElement faceElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 35);
        if (redirector != null) {
            redirector.redirect((short) 35, this, faceElement);
        } else {
            this.faceElement = faceElement;
        }
    }

    public void setFileElement(FileElement fileElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 43);
        if (redirector != null) {
            redirector.redirect((short) 43, this, fileElement);
        } else {
            this.fileElement = fileElement;
        }
    }

    public void setGiphyElement(GiphyElement giphyElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 48);
        if (redirector != null) {
            redirector.redirect((short) 48, this, giphyElement);
        } else {
            this.giphyElement = giphyElement;
        }
    }

    public void setGrayTipElement(GrayTipElement grayTipElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 41);
        if (redirector != null) {
            redirector.redirect((short) 41, this, grayTipElement);
        } else {
            this.grayTipElement = grayTipElement;
        }
    }

    public void setInlineKeyboardElement(InlineKeyboardElement inlineKeyboardElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 50);
        if (redirector != null) {
            redirector.redirect((short) 50, this, inlineKeyboardElement);
        } else {
            this.inlineKeyboardElement = inlineKeyboardElement;
        }
    }

    public void setLiveGiftElement(LiveGiftElement liveGiftElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 44);
        if (redirector != null) {
            redirector.redirect((short) 44, this, liveGiftElement);
        } else {
            this.liveGiftElement = liveGiftElement;
        }
    }

    public void setMarkdownElement(MarkdownElement markdownElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 45);
        if (redirector != null) {
            redirector.redirect((short) 45, this, markdownElement);
        } else {
            this.markdownElement = markdownElement;
        }
    }

    public void setMarketFaceElement(MarketFaceElement marketFaceElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 36);
        if (redirector != null) {
            redirector.redirect((short) 36, this, marketFaceElement);
        } else {
            this.marketFaceElement = marketFaceElement;
        }
    }

    public void setMultiForwardMsgElement(MultiForwardMsgElement multiForwardMsgElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 47);
        if (redirector != null) {
            redirector.redirect((short) 47, this, multiForwardMsgElement);
        } else {
            this.multiForwardMsgElement = multiForwardMsgElement;
        }
    }

    public void setPicElement(PicElement picElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 38);
        if (redirector != null) {
            redirector.redirect((short) 38, this, picElement);
        } else {
            this.picElement = picElement;
        }
    }

    public void setPttElement(PttElement pttElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 39);
        if (redirector != null) {
            redirector.redirect((short) 39, this, pttElement);
        } else {
            this.pttElement = pttElement;
        }
    }

    public void setReplyElement(ReplyElement replyElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 37);
        if (redirector != null) {
            redirector.redirect((short) 37, this, replyElement);
        } else {
            this.replyElement = replyElement;
        }
    }

    public void setShareLocationElement(ShareLocationElement shareLocationElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 57);
        if (redirector != null) {
            redirector.redirect((short) 57, this, shareLocationElement);
        } else {
            this.shareLocationElement = shareLocationElement;
        }
    }

    public void setStructLongMsgElement(StructLongMsgElement structLongMsgElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 46);
        if (redirector != null) {
            redirector.redirect((short) 46, this, structLongMsgElement);
        } else {
            this.structLongMsgElement = structLongMsgElement;
        }
    }

    public void setStructMsgElement(StructMsgElement structMsgElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 55);
        if (redirector != null) {
            redirector.redirect((short) 55, this, structMsgElement);
        } else {
            this.structMsgElement = structMsgElement;
        }
    }

    public void setTextElement(TextElement textElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 34);
        if (redirector != null) {
            redirector.redirect((short) 34, this, textElement);
        } else {
            this.textElement = textElement;
        }
    }

    public void setTextGiftElement(TextGiftElement textGiftElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 51);
        if (redirector != null) {
            redirector.redirect((short) 51, this, textGiftElement);
        } else {
            this.textGiftElement = textGiftElement;
        }
    }

    public void setTofuRecordElement(TofuRecordElement tofuRecordElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 58);
        if (redirector != null) {
            redirector.redirect((short) 58, this, tofuRecordElement);
        } else {
            this.tofuRecordElement = tofuRecordElement;
        }
    }

    public void setVideoElement(VideoElement videoElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 40);
        if (redirector != null) {
            redirector.redirect((short) 40, this, videoElement);
        } else {
            this.videoElement = videoElement;
        }
    }

    public void setWalletElement(WalletElement walletElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 49);
        if (redirector != null) {
            redirector.redirect((short) 49, this, walletElement);
        } else {
            this.walletElement = walletElement;
        }
    }

    public void setYoloGameResultElement(YoloGameResultElement yoloGameResultElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 53);
        if (redirector != null) {
            redirector.redirect((short) 53, this, yoloGameResultElement);
        } else {
            this.yoloGameResultElement = yoloGameResultElement;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 59);
        if (redirector != null) {
            return (String) redirector.redirect((short) 59, this);
        }
        return "MsgElement{elementType=" + this.elementType + ",elementId=" + this.elementId + ",extBufForUI=" + this.extBufForUI + ",textElement=" + this.textElement + ",faceElement=" + this.faceElement + ",marketFaceElement=" + this.marketFaceElement + ",replyElement=" + this.replyElement + ",picElement=" + this.picElement + ",pttElement=" + this.pttElement + ",videoElement=" + this.videoElement + ",grayTipElement=" + this.grayTipElement + ",arkElement=" + this.arkElement + ",fileElement=" + this.fileElement + ",liveGiftElement=" + this.liveGiftElement + ",markdownElement=" + this.markdownElement + ",structLongMsgElement=" + this.structLongMsgElement + ",multiForwardMsgElement=" + this.multiForwardMsgElement + ",giphyElement=" + this.giphyElement + ",walletElement=" + this.walletElement + ",inlineKeyboardElement=" + this.inlineKeyboardElement + ",textGiftElement=" + this.textGiftElement + ",calendarElement=" + this.calendarElement + ",yoloGameResultElement=" + this.yoloGameResultElement + ",avRecordElement=" + this.avRecordElement + ",structMsgElement=" + this.structMsgElement + ",faceBubbleElement=" + this.faceBubbleElement + ",shareLocationElement=" + this.shareLocationElement + ",tofuRecordElement=" + this.tofuRecordElement + ",}";
    }

    public MsgElement(int i2, long j2, byte[] bArr, TextElement textElement, FaceElement faceElement, MarketFaceElement marketFaceElement, ReplyElement replyElement, PicElement picElement, PttElement pttElement, VideoElement videoElement, GrayTipElement grayTipElement, ArkElement arkElement, FileElement fileElement, LiveGiftElement liveGiftElement, MarkdownElement markdownElement, StructLongMsgElement structLongMsgElement, MultiForwardMsgElement multiForwardMsgElement, GiphyElement giphyElement, WalletElement walletElement, InlineKeyboardElement inlineKeyboardElement, TextGiftElement textGiftElement, CalendarElement calendarElement, YoloGameResultElement yoloGameResultElement, AVRecordElement aVRecordElement, StructMsgElement structMsgElement, FaceBubbleElement faceBubbleElement, ShareLocationElement shareLocationElement, TofuRecordElement tofuRecordElement) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93575, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), Long.valueOf(j2), bArr, textElement, faceElement, marketFaceElement, replyElement, picElement, pttElement, videoElement, grayTipElement, arkElement, fileElement, liveGiftElement, markdownElement, structLongMsgElement, multiForwardMsgElement, giphyElement, walletElement, inlineKeyboardElement, textGiftElement, calendarElement, yoloGameResultElement, aVRecordElement, structMsgElement, faceBubbleElement, shareLocationElement, tofuRecordElement);
            return;
        }
        this.serialVersionUID = 1L;
        this.elementType = i2;
        this.elementId = j2;
        this.extBufForUI = bArr;
        this.textElement = textElement;
        this.faceElement = faceElement;
        this.marketFaceElement = marketFaceElement;
        this.replyElement = replyElement;
        this.picElement = picElement;
        this.pttElement = pttElement;
        this.videoElement = videoElement;
        this.grayTipElement = grayTipElement;
        this.arkElement = arkElement;
        this.fileElement = fileElement;
        this.liveGiftElement = liveGiftElement;
        this.markdownElement = markdownElement;
        this.structLongMsgElement = structLongMsgElement;
        this.multiForwardMsgElement = multiForwardMsgElement;
        this.giphyElement = giphyElement;
        this.walletElement = walletElement;
        this.inlineKeyboardElement = inlineKeyboardElement;
        this.textGiftElement = textGiftElement;
        this.calendarElement = calendarElement;
        this.yoloGameResultElement = yoloGameResultElement;
        this.avRecordElement = aVRecordElement;
        this.structMsgElement = structMsgElement;
        this.faceBubbleElement = faceBubbleElement;
        this.shareLocationElement = shareLocationElement;
        this.tofuRecordElement = tofuRecordElement;
    }
}
