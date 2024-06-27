package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MsfRspInfo.class */
public final class MsfRspInfo {
    public String errorMsg;
    public byte[] pbBuffer;
    public HashMap<String, byte[]> rpcMap;
    public int ssoRetCode;
    public int trpcFuncCode;
    public int trpcRetCode;

    public MsfRspInfo() {
        this.errorMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.pbBuffer = new byte[0];
        this.rpcMap = new HashMap<>();
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public byte[] getPbBuffer() {
        return this.pbBuffer;
    }

    public HashMap<String, byte[]> getRpcMap() {
        return this.rpcMap;
    }

    public int getSsoRetCode() {
        return this.ssoRetCode;
    }

    public int getTrpcFuncCode() {
        return this.trpcFuncCode;
    }

    public int getTrpcRetCode() {
        return this.trpcRetCode;
    }

    public String toString() {
        return "MsfRspInfo{ssoRetCode=" + this.ssoRetCode + ",trpcRetCode=" + this.trpcRetCode + ",trpcFuncCode=" + this.trpcFuncCode + ",errorMsg=" + this.errorMsg + ",pbBuffer=" + this.pbBuffer + ",rpcMap=" + this.rpcMap + ",}";
    }

    public MsfRspInfo(int i, int i2, int i3, String str, byte[] bArr, HashMap<String, byte[]> hashMap) {
        this.errorMsg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.pbBuffer = new byte[0];
        this.rpcMap = new HashMap<>();
        this.ssoRetCode = i;
        this.trpcRetCode = i2;
        this.trpcFuncCode = i3;
        this.errorMsg = str;
        this.pbBuffer = bArr;
        this.rpcMap = hashMap;
    }
}
