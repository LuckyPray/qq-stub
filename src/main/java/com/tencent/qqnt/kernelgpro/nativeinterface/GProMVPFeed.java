package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPFeed.class */
public final class GProMVPFeed {
    static IPatchRedirector $redirector_;
    public GProMVPChannelInfo channelInfo;
    public GProMVPFeedContent content;
    public long createTime;
    public GProMVPFeedFeature feature;
    public ArrayList<Integer> functionList;
    public GProMVPComments hotComments;

    /* renamed from: id */
    public String f66id;
    public long lastModifiedTime;
    public byte[] oldProtoStfeed;
    public GProMVPUser poster;
    public GProMVPFeedStat stat;
    public GProMVPFeedStatus status;
    public String title;
    public int type;

    public GProMVPFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.f66id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.poster = new GProMVPUser();
        this.content = new GProMVPFeedContent();
        this.hotComments = new GProMVPComments();
        this.stat = new GProMVPFeedStat();
        this.channelInfo = new GProMVPChannelInfo();
        this.status = new GProMVPFeedStatus();
        this.feature = new GProMVPFeedFeature();
        this.functionList = new ArrayList<>();
        this.oldProtoStfeed = new byte[0];
    }

    public GProMVPChannelInfo getChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.channelInfo : (GProMVPChannelInfo) iPatchRedirector.redirect((short) 11, this);
    }

    public GProMVPFeedContent getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.content : (GProMVPFeedContent) iPatchRedirector.redirect((short) 8, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public GProMVPFeedFeature getFeature() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.feature : (GProMVPFeedFeature) iPatchRedirector.redirect((short) 13, this);
    }

    public ArrayList<Integer> getFunctionList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.functionList : (ArrayList) iPatchRedirector.redirect((short) 14, this);
    }

    public GProMVPComments getHotComments() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.hotComments : (GProMVPComments) iPatchRedirector.redirect((short) 9, this);
    }

    public String getId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.f66id : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public long getLastModifiedTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.lastModifiedTime : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public byte[] getOldProtoStfeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.oldProtoStfeed : (byte[]) iPatchRedirector.redirect((short) 15, this);
    }

    public GProMVPUser getPoster() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.poster : (GProMVPUser) iPatchRedirector.redirect((short) 4, this);
    }

    public GProMVPFeedStat getStat() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.stat : (GProMVPFeedStat) iPatchRedirector.redirect((short) 10, this);
    }

    public GProMVPFeedStatus getStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.status : (GProMVPFeedStatus) iPatchRedirector.redirect((short) 12, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
            return (String) iPatchRedirector.redirect((short) 16, this);
        }
        return "GProMVPFeed{id=" + this.f66id + ",title=" + this.title + ",poster=" + this.poster + ",createTime=" + this.createTime + ",lastModifiedTime=" + this.lastModifiedTime + ",type=" + this.type + ",content=" + this.content + ",hotComments=" + this.hotComments + ",stat=" + this.stat + ",channelInfo=" + this.channelInfo + ",status=" + this.status + ",feature=" + this.feature + ",functionList=" + this.functionList + ",oldProtoStfeed=" + this.oldProtoStfeed + ",}";
    }
}
