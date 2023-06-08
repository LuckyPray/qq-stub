/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2023 QAuxiliary developers
 * https://github.com/cinit/QAuxiliary
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */

package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes2.dex */
public interface IKernelMsgService {

    /* compiled from: P */
    /* loaded from: classes2.dex */
    public static final class CppProxy implements IKernelMsgService {
        private native void native_sendMsg(long j2, long j3, Contact contact, ArrayList<MsgElement> arrayList, HashMap<Integer, MsgAttributeInfo> hashMap, IOperateCallback iOperateCallback);

        @Override
        public void sendMsg(long j2, Contact contact, ArrayList<MsgElement> arrayList, HashMap<Integer, MsgAttributeInfo> hashMap, IOperateCallback iOperateCallback) {
            native_sendMsg(j2, 0, contact, arrayList, hashMap, iOperateCallback);
        }

        @Override
        public long getMsgUniqueId(long j2) {
            return 0;
        }

        @Override
        public void getMsgsByMsgId(Contact contact, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback) {

        }

        @Override
        public void getMsgsBySeqList(Contact contact, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback) {

        }

        @Override
        public void getMsgsBySeqRange(Contact contact, long j2, long j3, IMsgOperateCallback iMsgOperateCallback) {

        }

        @Override
        public void getMsgs(Contact contact, long j2, int i2, boolean z, IMsgOperateCallback iMsgOperateCallback) {

        }
    }

    void sendMsg(long j2, Contact contact, ArrayList<MsgElement> arrayList, HashMap<Integer, MsgAttributeInfo> hashMap, IOperateCallback iOperateCallback);
    long getMsgUniqueId(long j2);
    void getMsgsByMsgId(Contact contact, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback);
    void getMsgsBySeqList(Contact contact, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback);

    void getMsgsBySeqRange(Contact contact, long j2, long j3, IMsgOperateCallback iMsgOperateCallback);
    void getMsgs(Contact contact, long j2, int i2, boolean z, IMsgOperateCallback iMsgOperateCallback);




}
