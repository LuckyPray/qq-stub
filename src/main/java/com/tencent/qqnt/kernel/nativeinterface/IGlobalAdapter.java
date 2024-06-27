package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IGlobalAdapter.class */
public interface IGlobalAdapter {
    AvifTranscodeResult avifTranscodeJpgAndGenAIOThumb(int i, AvifTranscodeInfo avifTranscodeInfo);

    Integer fixPicImgType(String str);

    Boolean generatePicAioThumb(String str, String str2);

    Boolean generateThumb(String str, String str2, int i, int i2);

    Integer getActiveIPStackType();

    AppSetting getAppSetting();

    DeviceCodecFormatInfo getDeviceCodecFormatInfo();

    DeviceInfo getDeviceInfo();

    Integer getMSFUsedIpProtocolType();

    RichMediaImgSize getRichMediaImgSize(String str, int i);

    IOperateResult onCompressVideo(String str, String str2);

    void onDataReport(String str, String str2, boolean z, HashMap<String, String> hashMap, boolean z2);

    OpentelemetryTracePlan onGetMqqOpentelemetryTraceReportPlan();

    void onGetOfflineMsg();

    Long onGetSrvCalTime();

    void onInstallFinished(boolean z);

    void onLog(int i, String str);

    MarkdownParseRsp onParseMarkdown(MarkdownParseReq markdownParseReq);

    void onRegisterCountInstruments(ArrayList<String> arrayList, int i, int i2);

    void onRegisterValueInstruments(ArrayList<String> arrayList, ArrayList<Double> arrayList2, int i, int i2);

    void onReportCountIndicators(HashMap<String, String> hashMap, String str, long j);

    void onReportValueIndicators(HashMap<String, String> hashMap, String str, double d);

    void onSendSSORequest(long j, String str, byte[] bArr, SendRequestParam sendRequestParam, String str2, HashMap<String, String> hashMap, int i);

    void onShowErrUITips(String str);

    void onUpdateGeneralFlag(int i);
}
