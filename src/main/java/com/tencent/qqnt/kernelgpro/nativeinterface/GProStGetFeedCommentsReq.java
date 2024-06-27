package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStGetFeedCommentsReq.class */
public final class GProStGetFeedCommentsReq {
    static IPatchRedirector $redirector_;
    public String attchInfo;
    public GProStChannelSign channelSign;
    public String entrySchema;
    public GProStCommonExt extInfo;
    public String feedId;
    public int from;
    public int listNum;
    public String needInsertCommentID;
    public String needInsertReplyID;
    public int rankingType;
    public int replyListNum;
    public String userId;

    public GProStGetFeedCommentsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.userId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.attchInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.entrySchema = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.needInsertCommentID = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.needInsertReplyID = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelSign = new GProStChannelSign();
    }

    public String getAttchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.attchInfo : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public GProStChannelSign getChannelSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.channelSign : (GProStChannelSign) iPatchRedirector.redirect((short) 11, this);
    }

    public String getEntrySchema() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.entrySchema : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feedId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getListNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.listNum : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getNeedInsertCommentID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.needInsertCommentID : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getNeedInsertReplyID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.needInsertReplyID : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getRankingType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.rankingType : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public int getReplyListNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.replyListNum : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public String getUserId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.userId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "GProStGetFeedCommentsReq{extInfo=" + this.extInfo + ",userId=" + this.userId + ",feedId=" + this.feedId + ",listNum=" + this.listNum + ",from=" + this.from + ",attchInfo=" + this.attchInfo + ",entrySchema=" + this.entrySchema + ",needInsertCommentID=" + this.needInsertCommentID + ",needInsertReplyID=" + this.needInsertReplyID + ",channelSign=" + this.channelSign + ",rankingType=" + this.rankingType + ",replyListNum=" + this.replyListNum + ",}";
    }
}
