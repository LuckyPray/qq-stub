package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStEmotionReactionInfo.class */
public final class GProStEmotionReactionInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProStEmojiReaction> emojiReactionList;
    public String idd;
    public long totalLikeCount;

    public GProStEmotionReactionInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.idd = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.emojiReactionList = new ArrayList<>();
        }
    }

    public ArrayList<GProStEmojiReaction> getEmojiReactionList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.emojiReactionList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getIdd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.idd : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public long getTotalLikeCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.totalLikeCount : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProStEmotionReactionInfo{idd=" + this.idd + ",emojiReactionList=" + this.emojiReactionList + ",totalLikeCount=" + this.totalLikeCount + ",}";
    }
}
