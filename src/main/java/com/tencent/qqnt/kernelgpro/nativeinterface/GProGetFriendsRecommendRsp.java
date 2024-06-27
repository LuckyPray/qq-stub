package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetFriendsRecommendRsp.class */
public final class GProGetFriendsRecommendRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public GProMVPExtInfo extInfo;
    public int friendType;
    public boolean isEnd;
    public ArrayList<GProRecommendContentItem> recommendList;
    long serialVersionUID;

    public GProGetFriendsRecommendRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.recommendList = new ArrayList<>();
        this.extInfo = new GProMVPExtInfo();
    }

    public GProMVPExtInfo getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.extInfo : (GProMVPExtInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public int getFriendType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.friendType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public boolean getIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.isEnd : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public ArrayList<GProRecommendContentItem> getRecommendList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.recommendList : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetFriendsRecommendRsp{recommendList=" + this.recommendList + ",friendType=" + this.friendType + ",isEnd=" + this.isEnd + ",extInfo=" + this.extInfo + ",}";
    }
}
