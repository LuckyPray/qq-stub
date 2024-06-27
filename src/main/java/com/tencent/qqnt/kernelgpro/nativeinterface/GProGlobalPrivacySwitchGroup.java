package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGlobalPrivacySwitchGroup.class */
public final class GProGlobalPrivacySwitchGroup {
    static IPatchRedirector $redirector_;
    public int addFriendSwitch;
    public int allSwitch;
    public int joinedGuildShowSwitch;
    public int publishedFeedShowSwitch;
    public int qqProfileShowSwitch;
    public int roomStateShowSwitch;

    public GProGlobalPrivacySwitchGroup() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getAddFriendSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.addFriendSwitch : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getAllSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.allSwitch : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getJoinedGuildShowSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.joinedGuildShowSwitch : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getPublishedFeedShowSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.publishedFeedShowSwitch : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getQqProfileShowSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.qqProfileShowSwitch : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getRoomStateShowSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.roomStateShowSwitch : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGlobalPrivacySwitchGroup{addFriendSwitch=" + this.addFriendSwitch + ",allSwitch=" + this.allSwitch + ",qqProfileShowSwitch=" + this.qqProfileShowSwitch + ",roomStateShowSwitch=" + this.roomStateShowSwitch + ",joinedGuildShowSwitch=" + this.joinedGuildShowSwitch + ",publishedFeedShowSwitch=" + this.publishedFeedShowSwitch + ",}";
    }

    public GProGlobalPrivacySwitchGroup(int i, int i2, int i3, int i4, int i5, int i6) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)});
            return;
        }
        this.addFriendSwitch = i;
        this.allSwitch = i2;
        this.qqProfileShowSwitch = i3;
        this.roomStateShowSwitch = i4;
        this.joinedGuildShowSwitch = i5;
        this.publishedFeedShowSwitch = i6;
    }
}
