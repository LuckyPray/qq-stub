package com.tencent.mobileqq.mini.servlet;

import NS_MINI_INTERFACE.INTERFACE$StGetCodeReq;
import NS_MINI_INTERFACE.INTERFACE$StGetCodeRsp;

/* compiled from: P */
/* loaded from: classes26.dex */
public class GetLoginCodeRequest extends ProtoBufRequest {
    public static final String CMD_STRING = "LightAppSvc.mini_program_auth.GetCode";
    public static final String TAG = "GetLoginCodeRequest";
    private final INTERFACE$StGetCodeReq req;

    public GetLoginCodeRequest(String str) {
        throw new RuntimeException("stub");
    }

    public static INTERFACE$StGetCodeRsp onResponse(byte[] bArr) {
        throw new RuntimeException("stub");
    }

    @Override // com.tencent.mobileqq.mini.servlet.ProtoBufRequest
    public byte[] getBusiBuf() {
        throw new RuntimeException("stub");
    }
}
