package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFDLStComment.class */
public final class GProFDLStComment {
    static IPatchRedirector $redirector_;
    public String commentId;
    public GProFDLStLike like;

    public GProFDLStComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.commentId = "";
            this.like = new GProFDLStLike();
        }
    }

    public String getCommentId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.commentId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProFDLStLike getLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.like : (GProFDLStLike) iPatchRedirector.redirect((short) 4, this);
    }

    public void setCommentId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.commentId = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public void setLike(GProFDLStLike gProFDLStLike) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.like = gProFDLStLike;
        } else {
            iPatchRedirector.redirect((short) 6, this, gProFDLStLike);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProFDLStComment{commentId=" + this.commentId + ",like=" + this.like + ",}";
    }

    public GProFDLStComment(String str, GProFDLStLike gProFDLStLike) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, gProFDLStLike);
            return;
        }
        this.commentId = "";
        this.like = new GProFDLStLike();
        this.commentId = str;
        this.like = gProFDLStLike;
    }
}
