package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStReply.class */
public final class GProStReply {
    static IPatchRedirector $redirector_;
    public ArrayList<String> atUinListList;
    public byte[] busiData;
    public String content;
    public long createTime;
    public long createTimeNs;
    public String idd;
    public ArrayList<GProStImage> images;
    public GProStLike likeInfo;
    public int modifyflag;
    public boolean needFold;
    public boolean needSink;
    public GProStUser postUser;
    public GProStRichText richContents;
    public int sourceType;
    public ArrayList<GProFeedEntry> storeExtInfoList;
    public String targetReplyID;
    public GProStUser targetUser;
    public String thirdId;
    public int typeFlag;
    public int typeFlag2;

    public GProStReply() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.idd = "";
        this.postUser = new GProStUser();
        this.content = "";
        this.targetUser = new GProStUser();
        this.busiData = new byte[0];
        this.likeInfo = new GProStLike();
        this.atUinListList = new ArrayList<>();
        this.storeExtInfoList = new ArrayList<>();
        this.thirdId = "";
        this.targetReplyID = "";
        this.richContents = new GProStRichText();
        this.images = new ArrayList<>();
    }

    public ArrayList<String> getAtUinListList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.atUinListList : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.content : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getCreateTimeNs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.createTimeNs : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public String getIdd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.idd : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProStImage> getImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 19, this);
    }

    public GProStLike getLikeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.likeInfo : (GProStLike) iPatchRedirector.redirect((short) 8, this);
    }

    public int getModifyflag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.modifyflag : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public boolean getNeedFold() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.needFold : ((Boolean) iPatchRedirector.redirect((short) 20, this)).booleanValue();
    }

    public boolean getNeedSink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.needSink : ((Boolean) iPatchRedirector.redirect((short) 21, this)).booleanValue();
    }

    public GProStUser getPostUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.postUser : (GProStUser) iPatchRedirector.redirect((short) 3, this);
    }

    public GProStRichText getRichContents() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.richContents : (GProStRichText) iPatchRedirector.redirect((short) 18, this);
    }

    public int getSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.sourceType : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public ArrayList<GProFeedEntry> getStoreExtInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.storeExtInfoList : (ArrayList) iPatchRedirector.redirect((short) 14, this);
    }

    public String getTargetReplyID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.targetReplyID : (String) iPatchRedirector.redirect((short) 16, this);
    }

    public GProStUser getTargetUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.targetUser : (GProStUser) iPatchRedirector.redirect((short) 6, this);
    }

    public String getThirdId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.thirdId : (String) iPatchRedirector.redirect((short) 15, this);
    }

    public int getTypeFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.typeFlag : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getTypeFlag2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.typeFlag2 : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 22)) {
            return (String) iPatchRedirector.redirect((short) 22, this);
        }
        return "GProStReply{idd=" + this.idd + ",postUser=" + this.postUser + ",createTime=" + this.createTime + ",content=" + this.content + ",targetUser=" + this.targetUser + ",busiData=" + this.busiData + ",likeInfo=" + this.likeInfo + ",typeFlag=" + this.typeFlag + ",modifyflag=" + this.modifyflag + ",atUinListList=" + this.atUinListList + ",typeFlag2=" + this.typeFlag2 + ",createTimeNs=" + this.createTimeNs + ",storeExtInfoList=" + this.storeExtInfoList + ",thirdId=" + this.thirdId + ",targetReplyID=" + this.targetReplyID + ",sourceType=" + this.sourceType + ",richContents=" + this.richContents + ",images=" + this.images + ",needFold=" + this.needFold + ",needSink=" + this.needSink + ",}";
    }
}
