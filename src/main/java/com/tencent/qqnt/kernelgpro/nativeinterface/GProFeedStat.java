package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedStat.class */
public final class GProFeedStat implements Serializable {
    static IPatchRedirector $redirector_;
    public long pageView;
    public long preferCount;
    public int preferStatus;
    long serialVersionUID;
    public long shareCount;
    public long totalCommentCount;

    public GProFeedStat() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getPageView() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.pageView : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getPreferCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.preferCount : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public int getPreferStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.preferStatus : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getShareCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.shareCount : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getTotalCommentCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.totalCommentCount : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public void setPageView(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.pageView = j;
        } else {
            iPatchRedirector.redirect((short) 8, this, j);
        }
    }

    public void setPreferCount(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.preferCount = j;
        } else {
            iPatchRedirector.redirect((short) 11, this, j);
        }
    }

    public void setPreferStatus(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.preferStatus = i;
        } else {
            iPatchRedirector.redirect((short) 12, this, i);
        }
    }

    public void setShareCount(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.shareCount = j;
        } else {
            iPatchRedirector.redirect((short) 9, this, j);
        }
    }

    public void setTotalCommentCount(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.totalCommentCount = j;
        } else {
            iPatchRedirector.redirect((short) 10, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProFeedStat{pageView=" + this.pageView + ",shareCount=" + this.shareCount + ",totalCommentCount=" + this.totalCommentCount + ",preferCount=" + this.preferCount + ",preferStatus=" + this.preferStatus + ",}";
    }

    public GProFeedStat(long j, long j2, long j3, long j4, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i)});
            return;
        }
        this.serialVersionUID = 1L;
        this.pageView = j;
        this.shareCount = j2;
        this.totalCommentCount = j3;
        this.preferCount = j4;
        this.preferStatus = i;
    }
}
