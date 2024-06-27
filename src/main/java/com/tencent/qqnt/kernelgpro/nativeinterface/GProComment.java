package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProComment.class */
public final class GProComment {
    static IPatchRedirector $redirector_;
    public long commentCnt;
    public long msgSeq;
    public long parentSeq;
    public long referSeq;
    public long rootSeq;

    public GProComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getCommentCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.commentCnt : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.msgSeq : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public long getParentSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.parentSeq : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getReferSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.referSeq : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getRootSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.rootSeq : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProComment{msgSeq=" + this.msgSeq + ",rootSeq=" + this.rootSeq + ",parentSeq=" + this.parentSeq + ",referSeq=" + this.referSeq + ",commentCnt=" + this.commentCnt + ",}";
    }
}
