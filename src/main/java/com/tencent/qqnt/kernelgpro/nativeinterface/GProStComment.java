package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStComment.class */
public final class GProStComment {
    static IPatchRedirector $redirector_;
    public ArrayList<String> atUinListList;
    public String attachInfo;
    public byte[] busiData;
    public String content;
    public long createTime;
    public long createTimeNs;
    public String idd;
    public ArrayList<GProStImage> images;
    public GProStLike likeInfo;
    public boolean needFold;
    public boolean nextPageReply;
    public GProStUser postUser;
    public int replyCount;
    public GProStRichText richContents;
    public long sequence;
    public int sourceType;
    public ArrayList<GProFeedEntry> storeExtInfoList;
    public String thirdId;
    public int typeFlag;
    public int typeFlag2;
    public ArrayList<GProStReply> vecReplyList;

    public GProStComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.idd = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.postUser = new GProStUser();
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.vecReplyList = new ArrayList<>();
        this.busiData = new byte[0];
        this.likeInfo = new GProStLike();
        this.atUinListList = new ArrayList<>();
        this.storeExtInfoList = new ArrayList<>();
        this.thirdId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.richContents = new GProStRichText();
        this.images = new ArrayList<>();
        this.attachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public ArrayList<String> getAtUinListList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.atUinListList : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public String getAttachInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.attachInfo : (String) iPatchRedirector.redirect((short) 21, this);
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 8, this);
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
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 18, this);
    }

    public GProStLike getLikeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.likeInfo : (GProStLike) iPatchRedirector.redirect((short) 9, this);
    }

    public boolean getNeedFold() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.needFold : ((Boolean) iPatchRedirector.redirect((short) 22, this)).booleanValue();
    }

    public boolean getNextPageReply() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.nextPageReply : ((Boolean) iPatchRedirector.redirect((short) 20, this)).booleanValue();
    }

    public GProStUser getPostUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.postUser : (GProStUser) iPatchRedirector.redirect((short) 3, this);
    }

    public int getReplyCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.replyCount : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public GProStRichText getRichContents() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.richContents : (GProStRichText) iPatchRedirector.redirect((short) 17, this);
    }

    public long getSequence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.sequence : ((Long) iPatchRedirector.redirect((short) 19, this)).longValue();
    }

    public int getSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.sourceType : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public ArrayList<GProFeedEntry> getStoreExtInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.storeExtInfoList : (ArrayList) iPatchRedirector.redirect((short) 14, this);
    }

    public String getThirdId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.thirdId : (String) iPatchRedirector.redirect((short) 15, this);
    }

    public int getTypeFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.typeFlag : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public int getTypeFlag2() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.typeFlag2 : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public ArrayList<GProStReply> getVecReplyList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.vecReplyList : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 23)) {
            return (String) iPatchRedirector.redirect((short) 23, this);
        }
        return "GProStComment{idd=" + this.idd + ",postUser=" + this.postUser + ",createTime=" + this.createTime + ",content=" + this.content + ",replyCount=" + this.replyCount + ",vecReplyList=" + this.vecReplyList + ",busiData=" + this.busiData + ",likeInfo=" + this.likeInfo + ",typeFlag=" + this.typeFlag + ",atUinListList=" + this.atUinListList + ",typeFlag2=" + this.typeFlag2 + ",createTimeNs=" + this.createTimeNs + ",storeExtInfoList=" + this.storeExtInfoList + ",thirdId=" + this.thirdId + ",sourceType=" + this.sourceType + ",richContents=" + this.richContents + ",images=" + this.images + ",sequence=" + this.sequence + ",nextPageReply=" + this.nextPageReply + ",attachInfo=" + this.attachInfo + ",needFold=" + this.needFold + ",}";
    }
}
