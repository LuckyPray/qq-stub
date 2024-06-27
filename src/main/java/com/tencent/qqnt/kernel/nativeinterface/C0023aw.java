package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService;
import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import java.util.ArrayList;

/* compiled from: IKernelRichMediaService.java */
/* renamed from: com.tencent.qqnt.kernel.nativeinterface.aw */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/aw.class */
public final /* synthetic */ class C0023aw {
    public static void $default$batchGetGroupFileCount(IKernelRichMediaService iKernelRichMediaService, ArrayList arrayList, IBatchGroupFileCountCallback iBatchGroupFileCountCallback) {
    }

    public static void $default$beaconReportRMData(IKernelRichMediaService iKernelRichMediaService, RMBeaconReportInfo rMBeaconReportInfo) {
    }

    public static void $default$cancelSearcheGroupFile(IKernelRichMediaService iKernelRichMediaService, int i, int i2, String str) {
    }

    public static void $default$cancelTransferTask(IKernelRichMediaService iKernelRichMediaService, Contact contact, ArrayList arrayList, ArrayList arrayList2, IOperateTransferInfoCallback iOperateTransferInfoCallback) {
    }

    public static void $default$cancelUrlDownload(IKernelRichMediaService iKernelRichMediaService, ArrayList arrayList) {
    }

    public static void $default$createGroupFolder(IKernelRichMediaService iKernelRichMediaService, long j, String str, IGroupItemCallback iGroupItemCallback) {
    }

    public static void $default$deleteGroupFile(IKernelRichMediaService iKernelRichMediaService, long j, ArrayList arrayList, ArrayList arrayList2, IDeleteGroupFileCallback iDeleteGroupFileCallback) {
    }

    public static void $default$deleteGroupFolder(IKernelRichMediaService iKernelRichMediaService, long j, String str, IGroupFileCommonResultCallback iGroupFileCommonResultCallback) {
    }

    public static void $default$deleteTransferInfo(IKernelRichMediaService iKernelRichMediaService, Contact contact, ArrayList arrayList, IOperateTransferInfoCallback iOperateTransferInfoCallback) {
    }

    public static void $default$downloadFile(IKernelRichMediaService iKernelRichMediaService, CommonFileInfo commonFileInfo, int i, int i2, String str) {
    }

    public static void $default$downloadFileByUrlList(IKernelRichMediaService iKernelRichMediaService, UrlFileDownloadType urlFileDownloadType, ArrayList arrayList, IOperateReturnU64ListCallback iOperateReturnU64ListCallback) {
    }

    public static void $default$downloadFileForFileInfo(IKernelRichMediaService iKernelRichMediaService, ArrayList arrayList, String str) {
    }

    public static void $default$downloadFileForFileUuid(IKernelRichMediaService iKernelRichMediaService, Contact contact, String str, ArrayList arrayList) {
    }

    public static void $default$downloadFileForModelId(IKernelRichMediaService iKernelRichMediaService, Contact contact, ArrayList arrayList, String str, IDownloadFileCallback iDownloadFileCallback) {
    }

    public static void $default$downloadGroupFolder(IKernelRichMediaService iKernelRichMediaService, long j, String str, String str2, IOperateCallback iOperateCallback) {
    }

    public static void $default$downloadRichMediaInVisit(IKernelRichMediaService iKernelRichMediaService, RichDownLoadReq richDownLoadReq) {
    }

    public static void $default$getGroupFileInfo(IKernelRichMediaService iKernelRichMediaService, long j, String str, IGroupFileInfoCallback iGroupFileInfoCallback) {
    }

    public static void $default$getGroupSpace(IKernelRichMediaService iKernelRichMediaService, long j, IGroupSpaceCallback iGroupSpaceCallback) {
    }

    public static void $default$getScreenOCR(IKernelRichMediaService iKernelRichMediaService, String str, IWindowsOcrCallback iWindowsOcrCallback) {
    }

    public static void $default$getVideoPlayUrl(IKernelRichMediaService iKernelRichMediaService, Contact contact, long j, long j2, VideoCodecFormatType videoCodecFormatType, VideoRequestWay videoRequestWay, IVideoPlayUrlCallback iVideoPlayUrlCallback) {
    }

    public static void $default$getVideoPlayUrlInVisit(IKernelRichMediaService iKernelRichMediaService, RichDownLoadReq richDownLoadReq, IVideoPlayUrlCallback iVideoPlayUrlCallback) {
    }

    public static void $default$getVideoPlayUrlV2(IKernelRichMediaService iKernelRichMediaService, Contact contact, long j, long j2, VideoCodecFormatType videoCodecFormatType, RMReqExParams rMReqExParams, IVideoPlayUrlCallback iVideoPlayUrlCallback) {
    }

    public static void $default$moveGroupFile(IKernelRichMediaService iKernelRichMediaService, long j, ArrayList arrayList, ArrayList arrayList2, String str, String str2, IMoveGroupFileCallback iMoveGroupFileCallback) {
    }

    public static void $default$onlyDownloadFile(IKernelRichMediaService iKernelRichMediaService, Contact contact, String str, ArrayList arrayList) {
    }

    public static void $default$onlyUploadFile(IKernelRichMediaService iKernelRichMediaService, Contact contact, ArrayList arrayList) {
    }

    public static void $default$renameGroupFile(IKernelRichMediaService iKernelRichMediaService, long j, int i, String str, String str2, String str3, IRenameGroupFileCallback iRenameGroupFileCallback) {
    }

    public static void $default$renameGroupFolder(IKernelRichMediaService iKernelRichMediaService, long j, String str, String str2, IGroupItemCallback iGroupItemCallback) {
    }

    public static void $default$searchGroupFileByWord(IKernelRichMediaService iKernelRichMediaService, ArrayList arrayList, ArrayList arrayList2, String str, String str2, int i, ISearchGroupFileCallback iSearchGroupFileCallback) {
    }

    public static void $default$searchMoreGroupFile(IKernelRichMediaService iKernelRichMediaService, int i) {
    }

    public static void $default$transGroupFile(IKernelRichMediaService iKernelRichMediaService, long j, String str, ITransGroupFileCallback iTransGroupFileCallback) {
    }

    public static void $default$translateEnWordToZn(IKernelRichMediaService iKernelRichMediaService, ArrayList arrayList, ITranslateWordsCallback iTranslateWordsCallback) {
    }

    public static void $default$updateOnlineVideoElemStatus(IKernelRichMediaService iKernelRichMediaService, UploadStatusParams uploadStatusParams) {
    }

    public static void $default$uploadRMFileWithoutMsg(IKernelRichMediaService iKernelRichMediaService, UploadFileWithoutMsgParams uploadFileWithoutMsgParams) {
    }

    /* renamed from: a */
    public static boolean m0a(long j, long j2, long j3) {
        return IKernelRichMediaService.CppProxy.isExtraLargePic(j, j2, j3);
    }
}
