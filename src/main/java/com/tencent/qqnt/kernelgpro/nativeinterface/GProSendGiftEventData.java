package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSendGiftEventData.class */
public final class GProSendGiftEventData implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String eventId;
    public GProGiftInfo giftInfo;
    public long guildId;
    public GProUser receiverMember;
    public GProUser senderMember;
    long serialVersionUID;

    public GProSendGiftEventData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.eventId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.senderMember = new GProUser();
        this.receiverMember = new GProUser();
        this.giftInfo = new GProGiftInfo();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getEventId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.eventId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public GProGiftInfo getGiftInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.giftInfo : (GProGiftInfo) iPatchRedirector.redirect((short) 8, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public GProUser getReceiverMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.receiverMember : (GProUser) iPatchRedirector.redirect((short) 7, this);
    }

    public GProUser getSenderMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.senderMember : (GProUser) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProSendGiftEventData{guildId=" + this.guildId + ",channelId=" + this.channelId + ",eventId=" + this.eventId + ",senderMember=" + this.senderMember + ",receiverMember=" + this.receiverMember + ",giftInfo=" + this.giftInfo + ",}";
    }

    public GProSendGiftEventData(long j, long j2, String str, GProUser gProUser, GProUser gProUser2, GProGiftInfo gProGiftInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, gProUser, gProUser2, gProGiftInfo});
            return;
        }
        this.serialVersionUID = 1L;
        this.eventId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.senderMember = new GProUser();
        this.receiverMember = new GProUser();
        this.giftInfo = new GProGiftInfo();
        this.guildId = j;
        this.channelId = j2;
        this.eventId = str;
        this.senderMember = gProUser;
        this.receiverMember = gProUser2;
        this.giftInfo = gProGiftInfo;
    }
}
