package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendH5GameChannel.class */
public final class GProRecommendH5GameChannel {
    static IPatchRedirector $redirector_;
    public GProRecommendCoverInfo cover;
    public GProRecommendH5Game data;

    public GProRecommendH5GameChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.data = new GProRecommendH5Game();
            this.cover = new GProRecommendCoverInfo();
        }
    }

    public GProRecommendCoverInfo getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cover : (GProRecommendCoverInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProRecommendH5Game getData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.data : (GProRecommendH5Game) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRecommendH5GameChannel{data=" + this.data + ",cover=" + this.cover + ",}";
    }

    public GProRecommendH5GameChannel(GProRecommendH5Game gProRecommendH5Game, GProRecommendCoverInfo gProRecommendCoverInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProRecommendH5Game, gProRecommendCoverInfo);
            return;
        }
        this.data = new GProRecommendH5Game();
        this.cover = new GProRecommendCoverInfo();
        this.data = gProRecommendH5Game;
        this.cover = gProRecommendCoverInfo;
    }
}
