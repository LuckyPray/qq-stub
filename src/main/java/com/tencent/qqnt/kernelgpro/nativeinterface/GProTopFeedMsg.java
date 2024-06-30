package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopFeedMsg.class */
public final class GProTopFeedMsg {
    static IPatchRedirector $redirector_;
    public long createTime;
    public String feedId;
    public int labelColor;
    public int labelId;
    public String labelText;
    public boolean needNotify;
    public long operatorTinyid;
    public ArrayList<Long> roleIds;
    public String summaryText;

    public GProTopFeedMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedId = "";
        this.labelText = "";
        this.summaryText = "";
        this.roleIds = new ArrayList<>();
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getLabelColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.labelColor : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getLabelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.labelId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getLabelText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.labelText : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getNeedNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.needNotify : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public long getOperatorTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.operatorTinyid : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public ArrayList<Long> getRoleIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.roleIds : (ArrayList) iPatchRedirector.redirect((short) 10, this);
    }

    public String getSummaryText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.summaryText : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProTopFeedMsg{feedId=" + this.feedId + ",labelId=" + this.labelId + ",labelText=" + this.labelText + ",labelColor=" + this.labelColor + ",summaryText=" + this.summaryText + ",needNotify=" + this.needNotify + ",createTime=" + this.createTime + ",operatorTinyid=" + this.operatorTinyid + ",roleIds=" + this.roleIds + ",}";
    }
}
