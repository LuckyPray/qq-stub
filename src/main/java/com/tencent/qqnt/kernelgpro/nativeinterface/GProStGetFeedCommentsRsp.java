package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStGetFeedCommentsRsp.class */
public final class GProStGetFeedCommentsRsp {
    static IPatchRedirector $redirector_;
    public String attchInfo;
    public GProStCommonExt extInfo;
    public int isFinish;
    public int totalLikeCount;
    public int totalNum;
    public ArrayList<GProStComment> vecCommentList;

    public GProStGetFeedCommentsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.vecCommentList = new ArrayList<>();
        this.attchInfo = "";
    }

    public String getAttchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.attchInfo : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public int getIsFinish() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isFinish : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getTotalLikeCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.totalLikeCount : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getTotalNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.totalNum : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProStComment> getVecCommentList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.vecCommentList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProStGetFeedCommentsRsp{extInfo=" + this.extInfo + ",vecCommentList=" + this.vecCommentList + ",totalNum=" + this.totalNum + ",isFinish=" + this.isFinish + ",attchInfo=" + this.attchInfo + ",totalLikeCount=" + this.totalLikeCount + ",}";
    }
}
