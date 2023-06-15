package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

public interface IKernelMsgService {

    void sendMsg(long j2, Contact contact, ArrayList<MsgElement> arrayList, HashMap<Integer, MsgAttributeInfo> hashMap, IOperateCallback iOperateCallback);

    long getMsgUniqueId(long j2);

    void getMsgsByMsgId(Contact contact, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback);

    void getMsgsBySeqList(Contact contact, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback);

    void getMsgsBySeqRange(Contact contact, long j2, long j3, IMsgOperateCallback iMsgOperateCallback);

    void getMsgs(Contact contact, long j2, int i2, boolean z, IMsgOperateCallback iMsgOperateCallback);

    void addLocalJsonGrayTipMsg(Contact contact, JsonGrayElement jsonGrayElement, boolean z, boolean z2, IAddJsonGrayTipMsgCallback iAddJsonGrayTipMsgCallback);

}
