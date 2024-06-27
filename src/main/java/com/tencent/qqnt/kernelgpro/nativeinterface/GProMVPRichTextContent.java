package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPRichTextContent.class */
public final class GProMVPRichTextContent implements Serializable {
    static IPatchRedirector $redirector_;
    public GProMVPAtContent atContent;
    public GProMVPChannelContent channelContent;
    public GProMVPEmojiContent emojiContent;
    public GProMVPGroupContent groupContent;
    long serialVersionUID;
    public GProMVPTextContent textContent;
    public GProMVPTopicContent topicContent;
    public int type;
    public GProMVPURLContent urlContent;

    public GProMVPRichTextContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.textContent = new GProMVPTextContent();
        this.atContent = new GProMVPAtContent();
        this.urlContent = new GProMVPURLContent();
        this.emojiContent = new GProMVPEmojiContent();
        this.channelContent = new GProMVPChannelContent();
        this.topicContent = new GProMVPTopicContent();
        this.groupContent = new GProMVPGroupContent();
    }

    public GProMVPAtContent getAtContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.atContent : (GProMVPAtContent) iPatchRedirector.redirect((short) 5, this);
    }

    public GProMVPChannelContent getChannelContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelContent : (GProMVPChannelContent) iPatchRedirector.redirect((short) 8, this);
    }

    public GProMVPEmojiContent getEmojiContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.emojiContent : (GProMVPEmojiContent) iPatchRedirector.redirect((short) 7, this);
    }

    public GProMVPGroupContent getGroupContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.groupContent : (GProMVPGroupContent) iPatchRedirector.redirect((short) 10, this);
    }

    public GProMVPTextContent getTextContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.textContent : (GProMVPTextContent) iPatchRedirector.redirect((short) 4, this);
    }

    public GProMVPTopicContent getTopicContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.topicContent : (GProMVPTopicContent) iPatchRedirector.redirect((short) 9, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProMVPURLContent getUrlContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.urlContent : (GProMVPURLContent) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProMVPRichTextContent{type=" + this.type + ",textContent=" + this.textContent + ",atContent=" + this.atContent + ",urlContent=" + this.urlContent + ",emojiContent=" + this.emojiContent + ",channelContent=" + this.channelContent + ",topicContent=" + this.topicContent + ",groupContent=" + this.groupContent + ",}";
    }

    public GProMVPRichTextContent(int i, GProMVPTextContent gProMVPTextContent, GProMVPAtContent gProMVPAtContent, GProMVPURLContent gProMVPURLContent, GProMVPEmojiContent gProMVPEmojiContent, GProMVPChannelContent gProMVPChannelContent) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), gProMVPTextContent, gProMVPAtContent, gProMVPURLContent, gProMVPEmojiContent, gProMVPChannelContent});
            return;
        }
        this.serialVersionUID = 1L;
        this.textContent = new GProMVPTextContent();
        this.atContent = new GProMVPAtContent();
        this.urlContent = new GProMVPURLContent();
        this.emojiContent = new GProMVPEmojiContent();
        this.channelContent = new GProMVPChannelContent();
        this.topicContent = new GProMVPTopicContent();
        this.groupContent = new GProMVPGroupContent();
        this.type = i;
        this.textContent = gProMVPTextContent;
        this.atContent = gProMVPAtContent;
        this.urlContent = gProMVPURLContent;
        this.emojiContent = gProMVPEmojiContent;
        this.channelContent = gProMVPChannelContent;
    }
}
