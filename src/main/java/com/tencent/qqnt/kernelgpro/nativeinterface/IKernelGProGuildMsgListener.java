package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IKernelGProGuildMsgListener.class */
public interface IKernelGProGuildMsgListener {
    IPatchRedirector $redirector_ = null;

    void onFeedEventUpdate(FirstViewDirectMsgNotifyInfo firstViewDirectMsgNotifyInfo);

    void onGuildAvChannelOpenUpdate(GProAvChannelStateMsg gProAvChannelStateMsg);

    void onGuildInteractiveUpdate(GuildInteractiveNotificationItem guildInteractiveNotificationItem);

    void onGuildNotificationAbstractUpdate(GuildNotificationAbstractInfo guildNotificationAbstractInfo);

    void onGuildScheduleNotify(GProScheduleNotifyInfo gProScheduleNotifyInfo);

    void onGuildTopFeedUpdate(GProGuildTopFeedMsg gProGuildTopFeedMsg);
}
