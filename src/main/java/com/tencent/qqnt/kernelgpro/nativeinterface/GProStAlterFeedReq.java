package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStAlterFeedReq.class */
public final class GProStAlterFeedReq {
    static IPatchRedirector $redirector_;
    public ArrayList<GProFeedEntry> alterFeedExtInfoList;
    public byte[] busiReqData;
    public GProStClientContent clientContent;
    public GProStCommonExt extInfo;
    public GProStFeed feed;
    public int from;
    public String jsonFeed;
    public long mBitmap;
    public int src;

    public GProStAlterFeedReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.feed = new GProStFeed();
        this.busiReqData = new byte[0];
        this.alterFeedExtInfoList = new ArrayList<>();
        this.jsonFeed = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientContent = new GProStClientContent();
    }

    public ArrayList<GProFeedEntry> getAlterFeedExtInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.alterFeedExtInfoList : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public byte[] getBusiReqData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.busiReqData : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public GProStClientContent getClientContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.clientContent : (GProStClientContent) iPatchRedirector.redirect((short) 10, this);
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
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getJsonFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.jsonFeed : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public long getMBitmap() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.mBitmap : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public int getSrc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.src : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProStAlterFeedReq{extInfo=" + this.extInfo + ",feed=" + this.feed + ",busiReqData=" + this.busiReqData + ",mBitmap=" + this.mBitmap + ",from=" + this.from + ",src=" + this.src + ",alterFeedExtInfoList=" + this.alterFeedExtInfoList + ",jsonFeed=" + this.jsonFeed + ",clientContent=" + this.clientContent + ",}";
    }
}
