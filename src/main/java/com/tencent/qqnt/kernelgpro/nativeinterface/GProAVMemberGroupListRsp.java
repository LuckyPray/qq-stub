package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVMemberGroupListRsp.class */
public final class GProAVMemberGroupListRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public GProChannelUserNum channelUserNum;
    public GProGroupTypeList groupTypeList;
    public long nextReadInterval;
    long serialVersionUID;

    public GProAVMemberGroupListRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.channelUserNum = new GProChannelUserNum();
        this.groupTypeList = new GProGroupTypeList();
    }

    public GProChannelUserNum getChannelUserNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelUserNum : (GProChannelUserNum) iPatchRedirector.redirect((short) 3, this);
    }

    public GProGroupTypeList getGroupTypeList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.groupTypeList : (GProGroupTypeList) iPatchRedirector.redirect((short) 4, this);
    }

    public long getNextReadInterval() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.nextReadInterval : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProAVMemberGroupListRsp{channelUserNum=" + this.channelUserNum + ",groupTypeList=" + this.groupTypeList + ",nextReadInterval=" + this.nextReadInterval + ",}";
    }

    public GProAVMemberGroupListRsp(GProChannelUserNum gProChannelUserNum, GProGroupTypeList gProGroupTypeList, long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProChannelUserNum, gProGroupTypeList, Long.valueOf(j)});
            return;
        }
        this.serialVersionUID = 1L;
        this.channelUserNum = new GProChannelUserNum();
        this.groupTypeList = new GProGroupTypeList();
        this.channelUserNum = gProChannelUserNum;
        this.groupTypeList = gProGroupTypeList;
        this.nextReadInterval = j;
    }
}
