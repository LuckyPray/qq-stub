package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPComment.class */
public final class GProMVPComment {
    static IPatchRedirector $redirector_;
    public GProMVPRichText content;
    public long createTime;

    /* renamed from: id */
    public String f63id;
    public ArrayList<GProMVPImage> images;
    public boolean isSecBeat;
    public GProMVPLike like;
    public byte[] oldRichText;
    public GProMVPUser poster;
    public GProMVPReplys replys;
    public long sequence;

    public GProMVPComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.f63id = "";
        this.poster = new GProMVPUser();
        this.content = new GProMVPRichText();
        this.images = new ArrayList<>();
        this.like = new GProMVPLike();
        this.replys = new GProMVPReplys();
        this.oldRichText = new byte[0];
    }

    public GProMVPRichText getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.content : (GProMVPRichText) iPatchRedirector.redirect((short) 6, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.f63id : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProMVPImage> getImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public boolean getIsSecBeat() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.isSecBeat : ((Boolean) iPatchRedirector.redirect((short) 10, this)).booleanValue();
    }

    public GProMVPLike getLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.like : (GProMVPLike) iPatchRedirector.redirect((short) 8, this);
    }

    public byte[] getOldRichText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.oldRichText : (byte[]) iPatchRedirector.redirect((short) 11, this);
    }

    public GProMVPUser getPoster() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.poster : (GProMVPUser) iPatchRedirector.redirect((short) 3, this);
    }

    public GProMVPReplys getReplys() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.replys : (GProMVPReplys) iPatchRedirector.redirect((short) 9, this);
    }

    public long getSequence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.sequence : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProMVPComment{id=" + this.f63id + ",poster=" + this.poster + ",createTime=" + this.createTime + ",sequence=" + this.sequence + ",content=" + this.content + ",images=" + this.images + ",like=" + this.like + ",replys=" + this.replys + ",isSecBeat=" + this.isSecBeat + ",oldRichText=" + this.oldRichText + ",}";
    }
}
