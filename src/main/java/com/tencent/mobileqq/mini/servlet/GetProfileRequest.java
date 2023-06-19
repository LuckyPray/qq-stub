package com.tencent.mobileqq.mini.servlet;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;

import NS_MINI_INTERFACE.INTERFACE$StGetProfileReq;
import NS_MINI_INTERFACE.INTERFACE$StGetProfileRsp;

/* loaded from: classes26.dex */
public class GetProfileRequest extends ProtoBufRequest {
    public static final String CMD_STRING = "LightAppSvc.mini_user_info.GetProfile";
    private static final String unikey = "GetProfile";
    private INTERFACE$StGetProfileReq req;

    public GetProfileRequest(String str, boolean z, String str2) {
        throw new RuntimeException("stub");
    }

    public static INTERFACE$StGetProfileRsp onResponse(byte[] bArr) {
        throw new RuntimeException("stub");
    }

    @Override // com.tencent.mobileqq.mini.servlet.ProtoBufRequest
    public byte[] getBusiBuf() {
        throw new RuntimeException("stub");
    }
}
