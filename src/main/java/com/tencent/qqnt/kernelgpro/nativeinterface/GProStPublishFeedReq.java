package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStPublishFeedReq.class */
public final class GProStPublishFeedReq {
    static IPatchRedirector $redirector_;
    public byte[] busiReqData;
    public GProStClientContent clientContent;
    public GProStCommonExt extInfo;
    public GProStFeed feed;
    public int from;
    public String jsonFeed;
    public boolean needSyncGroup;
    public int src;
    public ArrayList<GProFeedEntry> storeFeedExtInfoList;

    public GProStPublishFeedReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.feed = new GProStFeed();
        this.busiReqData = new byte[0];
        this.storeFeedExtInfoList = new ArrayList<>();
        this.jsonFeed = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientContent = new GProStClientContent();
    }

    public byte[] getBusiReqData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.busiReqData : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public GProStClientContent getClientContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.clientContent : (GProStClientContent) iPatchRedirector.redirect((short) 9, this);
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public GProStFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feed : (GProStFeed) iPatchRedirector.redirect((short) 3, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getJsonFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.jsonFeed : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public boolean getNeedSyncGroup() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.needSyncGroup : ((Boolean) iPatchRedirector.redirect((short) 10, this)).booleanValue();
    }

    public int getSrc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.src : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public ArrayList<GProFeedEntry> getStoreFeedExtInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.storeFeedExtInfoList : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProStPublishFeedReq{extInfo=" + this.extInfo + ",feed=" + this.feed + ",busiReqData=" + this.busiReqData + ",from=" + this.from + ",src=" + this.src + ",storeFeedExtInfoList=" + this.storeFeedExtInfoList + ",jsonFeed=" + this.jsonFeed + ",clientContent=" + this.clientContent + ",needSyncGroup=" + this.needSyncGroup + ",}";
    }
}
