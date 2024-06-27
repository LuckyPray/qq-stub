package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetCategoryChannelInfoListV2Req.class */
public final class GProGetCategoryChannelInfoListV2Req {
    static IPatchRedirector $redirector_;
    public boolean filterFeedSquare;
    public boolean filterNormalCategoryChannel;
    public boolean filterTheAllBoard;
    public long guildId;
    public boolean isPinFeedSquareToTop;

    public GProGetCategoryChannelInfoListV2Req() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public boolean getFilterFeedSquare() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.filterFeedSquare : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public boolean getFilterNormalCategoryChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.filterNormalCategoryChannel : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public boolean getFilterTheAllBoard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.filterTheAllBoard : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public boolean getIsPinFeedSquareToTop() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.isPinFeedSquareToTop : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public void setFilterFeedSquare(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.filterFeedSquare = z;
        } else {
            iPatchRedirector.redirect((short) 9, this, z);
        }
    }

    public void setFilterNormalCategoryChannel(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.filterNormalCategoryChannel = z;
        } else {
            iPatchRedirector.redirect((short) 11, this, z);
        }
    }

    public void setFilterTheAllBoard(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.filterTheAllBoard = z;
        } else {
            iPatchRedirector.redirect((short) 10, this, z);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 8, this, j);
        }
    }

    public void setIsPinFeedSquareToTop(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.isPinFeedSquareToTop = z;
        } else {
            iPatchRedirector.redirect((short) 12, this, z);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProGetCategoryChannelInfoListV2Req{guildId=" + this.guildId + ",filterFeedSquare=" + this.filterFeedSquare + ",filterTheAllBoard=" + this.filterTheAllBoard + ",filterNormalCategoryChannel=" + this.filterNormalCategoryChannel + ",isPinFeedSquareToTop=" + this.isPinFeedSquareToTop + ",}";
    }

    public GProGetCategoryChannelInfoListV2Req(long j, boolean z, boolean z2, boolean z3, boolean z4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4)});
            return;
        }
        this.guildId = j;
        this.filterFeedSquare = z;
        this.filterTheAllBoard = z2;
        this.filterNormalCategoryChannel = z3;
        this.isPinFeedSquareToTop = z4;
    }
}
