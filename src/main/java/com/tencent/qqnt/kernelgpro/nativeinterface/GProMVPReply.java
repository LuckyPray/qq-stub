package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPReply.class */
public final class GProMVPReply {
    static IPatchRedirector $redirector_;
    public GProMVPRichText content;
    public long createTime;

    /* renamed from: id */
    public String f67id;
    public ArrayList<GProMVPImage> images;
    public boolean isSecBeat;
    public GProMVPLike like;
    public byte[] oldRichText;
    public GProMVPUser poster;
    public GProMVPUser targetUser;

    public GProMVPReply() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.f67id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.poster = new GProMVPUser();
        this.content = new GProMVPRichText();
        this.images = new ArrayList<>();
        this.like = new GProMVPLike();
        this.targetUser = new GProMVPUser();
        this.oldRichText = new byte[0];
    }

    public GProMVPRichText getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.content : (GProMVPRichText) iPatchRedirector.redirect((short) 5, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.f67id : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProMVPImage> getImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public boolean getIsSecBeat() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.isSecBeat : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public GProMVPLike getLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.like : (GProMVPLike) iPatchRedirector.redirect((short) 7, this);
    }

    public byte[] getOldRichText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.oldRichText : (byte[]) iPatchRedirector.redirect((short) 10, this);
    }

    public GProMVPUser getPoster() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.poster : (GProMVPUser) iPatchRedirector.redirect((short) 3, this);
    }

    public GProMVPUser getTargetUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.targetUser : (GProMVPUser) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProMVPReply{id=" + this.f67id + ",poster=" + this.poster + ",createTime=" + this.createTime + ",content=" + this.content + ",images=" + this.images + ",like=" + this.like + ",targetUser=" + this.targetUser + ",isSecBeat=" + this.isSecBeat + ",oldRichText=" + this.oldRichText + ",}";
    }
}
