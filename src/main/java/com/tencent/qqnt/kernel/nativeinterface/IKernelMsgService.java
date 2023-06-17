package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

public interface IKernelMsgService {

    void sendMsg(long msgId, Contact peer, ArrayList<MsgElement> msgElements, HashMap<Integer, MsgAttributeInfo> msgAttrs, IOperateCallback callback);

    long getMsgUniqueId(long serverTimeMillis);

    void getMsgsByMsgId(Contact peer, ArrayList<Long> msgIds, IMsgOperateCallback callback);

    void getMsgsBySeqList(Contact peer, ArrayList<Long> seqList, IMsgOperateCallback callback);

    void getMsgsBySeqRange(Contact peer, long beginSeq, long endSeq, IMsgOperateCallback callback);

    void getMsgs(Contact peer, long msgId, int cnt, boolean queryOrder, IMsgOperateCallback callback);

    void getSingleMsg(Contact peer, long msgSeq, IMsgOperateCallback callback);

    void addLocalJsonGrayTipMsg(Contact peer, JsonGrayElement jsonGrayElement, boolean needStore, boolean needRecentContact, IAddJsonGrayTipMsgCallback callback);

}
