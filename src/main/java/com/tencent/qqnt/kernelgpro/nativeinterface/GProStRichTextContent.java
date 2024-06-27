package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStRichTextContent.class */
public final class GProStRichTextContent {
    static IPatchRedirector $redirector_;
    public GProStRichTextAtContent atContent;
    public GProStRichTextChannelContent channelContent;
    public GProStRichTextEmojiContent emojiContent;
    public GProStRichTextGroupContent groupContent;
    public GProStRichTextGuildContent guildContent;
    public GProStRichTextIconContent iconContent;
    public String patternId;
    public GProStRichTextTextContent textContent;
    public GProStRichTextTopicContent topicContent;
    public int type;
    public GProStRichTextURLContent urlContent;

    public GProStRichTextContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.patternId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.textContent = new GProStRichTextTextContent();
        this.atContent = new GProStRichTextAtContent();
        this.urlContent = new GProStRichTextURLContent();
        this.emojiContent = new GProStRichTextEmojiContent();
        this.channelContent = new GProStRichTextChannelContent();
        this.guildContent = new GProStRichTextGuildContent();
        this.iconContent = new GProStRichTextIconContent();
        this.topicContent = new GProStRichTextTopicContent();
        this.groupContent = new GProStRichTextGroupContent();
    }

    public GProStRichTextAtContent getAtContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.atContent : (GProStRichTextAtContent) iPatchRedirector.redirect((short) 5, this);
    }

    public GProStRichTextChannelContent getChannelContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelContent : (GProStRichTextChannelContent) iPatchRedirector.redirect((short) 8, this);
    }

    public GProStRichTextEmojiContent getEmojiContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.emojiContent : (GProStRichTextEmojiContent) iPatchRedirector.redirect((short) 7, this);
    }

    public GProStRichTextGroupContent getGroupContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.groupContent : (GProStRichTextGroupContent) iPatchRedirector.redirect((short) 12, this);
    }

    public GProStRichTextGuildContent getGuildContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildContent : (GProStRichTextGuildContent) iPatchRedirector.redirect((short) 9, this);
    }

    public GProStRichTextIconContent getIconContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.iconContent : (GProStRichTextIconContent) iPatchRedirector.redirect((short) 10, this);
    }

    public String getPatternId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.patternId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProStRichTextTextContent getTextContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.textContent : (GProStRichTextTextContent) iPatchRedirector.redirect((short) 4, this);
    }

    public GProStRichTextTopicContent getTopicContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.topicContent : (GProStRichTextTopicContent) iPatchRedirector.redirect((short) 11, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public GProStRichTextURLContent getUrlContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.urlContent : (GProStRichTextURLContent) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProStRichTextContent{type=" + this.type + ",patternId=" + this.patternId + ",textContent=" + this.textContent + ",atContent=" + this.atContent + ",urlContent=" + this.urlContent + ",emojiContent=" + this.emojiContent + ",channelContent=" + this.channelContent + ",guildContent=" + this.guildContent + ",iconContent=" + this.iconContent + ",topicContent=" + this.topicContent + ",groupContent=" + this.groupContent + ",}";
    }
}
