package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDoLikeCommentForFeedReq.class */
public final class GProDoLikeCommentForFeedReq {
    static IPatchRedirector $redirector_;
    public String commentId;
    public GProFDLStCommonExt extInfo;
    public String feedId;
    public int likeType;

    public GProDoLikeCommentForFeedReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProFDLStCommonExt();
        this.commentId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getCommentId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.commentId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public GProFDLStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.extInfo : (GProFDLStCommonExt) iPatchRedirector.redirect((short) 3, this);
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.feedId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getLikeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.likeType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public void setCommentId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.commentId = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setExtInfo(GProFDLStCommonExt gProFDLStCommonExt) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.extInfo = gProFDLStCommonExt;
        } else {
            iPatchRedirector.redirect((short) 7, this, gProFDLStCommonExt);
        }
    }

    public void setFeedId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.feedId = str;
        } else {
            iPatchRedirector.redirect((short) 10, this, str);
        }
    }

    public void setLikeType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.likeType = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProDoLikeCommentForFeedReq{extInfo=" + this.extInfo + ",likeType=" + this.likeType + ",commentId=" + this.commentId + ",feedId=" + this.feedId + ",}";
    }

    public GProDoLikeCommentForFeedReq(GProFDLStCommonExt gProFDLStCommonExt, int i, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProFDLStCommonExt, Integer.valueOf(i), str, str2});
            return;
        }
        this.extInfo = new GProFDLStCommonExt();
        this.commentId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.extInfo = gProFDLStCommonExt;
        this.likeType = i;
        this.commentId = str;
        this.feedId = str2;
    }
}
