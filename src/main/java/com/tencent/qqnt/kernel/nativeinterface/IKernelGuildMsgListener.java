package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGuildMsgListener.class */
public interface IKernelGuildMsgListener {
    void onChannelFreqLimitInfoUpdate(Contact contact, boolean z, FreqLimitInfo freqLimitInfo);

    void onFirstViewGroupGuildMapping(ArrayList<FirstViewGroupGuildInfo> arrayList);

    void onGroupGuildUpdate(GroupGuildNotifyInfo groupGuildNotifyInfo);

    void onGuildMsgAbFlagChanged(GuildMsgAbFlag guildMsgAbFlag);

    void onMsgAbstractUpdate(ArrayList<MsgAbstract> arrayList);

    void onMsgEventListUpdate(HashMap<String, ArrayList<Long>> hashMap);

    void onRecvGroupGuildFlag(int i);

    void onRecvS2CMsg(ArrayList<Byte> arrayList);

    void onRecvUDCFlag(int i);

    void onUnreadCntAfterFirstView(HashMap<Integer, ArrayList<UnreadCntInfo>> hashMap);

    void onUnreadCntUpdate(HashMap<Integer, ArrayList<UnreadCntInfo>> hashMap);
}
