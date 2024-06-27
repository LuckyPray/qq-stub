package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStEmojiReaction.class */
public final class GProStEmojiReaction {
    static IPatchRedirector $redirector_;
    public long cnt;
    public String emojiId;
    public long emojiType;
    public boolean isClicked;
    public boolean isDefaultEmoji;

    public GProStEmojiReaction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.emojiId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cnt : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getEmojiId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.emojiId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public long getEmojiType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.emojiType : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public boolean getIsClicked() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isClicked : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public boolean getIsDefaultEmoji() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isDefaultEmoji : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProStEmojiReaction{emojiId=" + this.emojiId + ",emojiType=" + this.emojiType + ",cnt=" + this.cnt + ",isClicked=" + this.isClicked + ",isDefaultEmoji=" + this.isDefaultEmoji + ",}";
    }
}
