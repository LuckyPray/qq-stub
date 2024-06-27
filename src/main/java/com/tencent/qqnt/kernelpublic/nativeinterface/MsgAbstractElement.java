package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/MsgAbstractElement.class */
public final class MsgAbstractElement implements Serializable {
    static IPatchRedirector $redirector_;
    public CalendarElement calendarElement;
    public ChannelStateElement channelStateElement;
    public String content;
    public String customContent;
    public Integer elementSubType;
    public int elementType;
    public Integer emojiId;
    public Integer emojiType;
    public String fileName;
    public GrayTipElement grayTiPElement;
    public Integer index;
    public Boolean isSetEssence;
    public Boolean isSetProclamation;
    public Integer localGrayTipType;
    public Long msgId;
    public Long msgSeq;
    public Integer onlineFileMsgCnt;
    public Integer operatorRole;
    public String operatorTinyId;
    long serialVersionUID;
    public TextGiftElement textGiftElement;
    public Long tinyId;

    public MsgAbstractElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public CalendarElement getCalendarElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.calendarElement : (CalendarElement) iPatchRedirector.redirect((short) 21, this);
    }

    public ChannelStateElement getChannelStateElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.channelStateElement : (ChannelStateElement) iPatchRedirector.redirect((short) 22, this);
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.content : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getCustomContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.customContent : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public Integer getElementSubType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.elementSubType : (Integer) iPatchRedirector.redirect((short) 4, this);
    }

    public int getElementType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.elementType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public Integer getEmojiId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.emojiId : (Integer) iPatchRedirector.redirect((short) 16, this);
    }

    public Integer getEmojiType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.emojiType : (Integer) iPatchRedirector.redirect((short) 17, this);
    }

    public String getFileName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.fileName : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public GrayTipElement getGrayTiPElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.grayTiPElement : (GrayTipElement) iPatchRedirector.redirect((short) 19, this);
    }

    public Integer getIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.index : (Integer) iPatchRedirector.redirect((short) 7, this);
    }

    public Boolean getIsSetEssence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.isSetEssence : (Boolean) iPatchRedirector.redirect((short) 9, this);
    }

    public Boolean getIsSetProclamation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.isSetProclamation : (Boolean) iPatchRedirector.redirect((short) 8, this);
    }

    public Integer getLocalGrayTipType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.localGrayTipType : (Integer) iPatchRedirector.redirect((short) 18, this);
    }

    public Long getMsgId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.msgId : (Long) iPatchRedirector.redirect((short) 15, this);
    }

    public Long getMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.msgSeq : (Long) iPatchRedirector.redirect((short) 14, this);
    }

    public Integer getOnlineFileMsgCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.onlineFileMsgCnt : (Integer) iPatchRedirector.redirect((short) 23, this);
    }

    public Integer getOperatorRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.operatorRole : (Integer) iPatchRedirector.redirect((short) 10, this);
    }

    public String getOperatorTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.operatorTinyId : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public TextGiftElement getTextGiftElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.textGiftElement : (TextGiftElement) iPatchRedirector.redirect((short) 20, this);
    }

    public Long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.tinyId : (Long) iPatchRedirector.redirect((short) 13, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 24)) {
            return (String) iPatchRedirector.redirect((short) 24, this);
        }
        return "MsgAbstractElement{elementType=" + this.elementType + ",elementSubType=" + this.elementSubType + ",content=" + this.content + ",customContent=" + this.customContent + ",index=" + this.index + ",isSetProclamation=" + this.isSetProclamation + ",isSetEssence=" + this.isSetEssence + ",operatorRole=" + this.operatorRole + ",operatorTinyId=" + this.operatorTinyId + ",fileName=" + this.fileName + ",tinyId=" + this.tinyId + ",msgSeq=" + this.msgSeq + ",msgId=" + this.msgId + ",emojiId=" + this.emojiId + ",emojiType=" + this.emojiType + ",localGrayTipType=" + this.localGrayTipType + ",grayTiPElement=" + this.grayTiPElement + ",textGiftElement=" + this.textGiftElement + ",calendarElement=" + this.calendarElement + ",channelStateElement=" + this.channelStateElement + ",onlineFileMsgCnt=" + this.onlineFileMsgCnt + ",}";
    }

    public MsgAbstractElement(int i, Integer num, String str, String str2, Integer num2, Boolean bool, Boolean bool2, Integer num3, String str3, String str4, Long l, Long l2, Long l3, Integer num4, Integer num5, Integer num6, GrayTipElement grayTipElement, TextGiftElement textGiftElement, CalendarElement calendarElement, ChannelStateElement channelStateElement, Integer num7) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), num, str, str2, num2, bool, bool2, num3, str3, str4, l, l2, l3, num4, num5, num6, grayTipElement, textGiftElement, calendarElement, channelStateElement, num7});
            return;
        }
        this.serialVersionUID = 1L;
        this.elementType = i;
        this.elementSubType = num;
        this.content = str;
        this.customContent = str2;
        this.index = num2;
        this.isSetProclamation = bool;
        this.isSetEssence = bool2;
        this.operatorRole = num3;
        this.operatorTinyId = str3;
        this.fileName = str4;
        this.tinyId = l;
        this.msgSeq = l2;
        this.msgId = l3;
        this.emojiId = num4;
        this.emojiType = num5;
        this.localGrayTipType = num6;
        this.grayTiPElement = grayTipElement;
        this.textGiftElement = textGiftElement;
        this.calendarElement = calendarElement;
        this.channelStateElement = channelStateElement;
        this.onlineFileMsgCnt = num7;
    }
}
