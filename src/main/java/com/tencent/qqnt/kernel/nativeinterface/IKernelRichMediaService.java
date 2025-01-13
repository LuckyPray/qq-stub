package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelRichMediaService.class */
public interface IKernelRichMediaService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelRichMediaService$CppProxy.class */
    final class CppProxy implements IKernelRichMediaService {
        static final boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native boolean isExtraLargePic(long j, long j2, long j3);

        public static native boolean isFileExpired(int i);

        private native void nativeDestroy(long j);

        private native void native_batchGetGroupFileCount(long j, ArrayList<Long> arrayList, IBatchGroupFileCountCallback iBatchGroupFileCountCallback);

        private native void native_beaconReportRMData(long j, RMBeaconReportInfo rMBeaconReportInfo);

        private native void native_cancelSearcheGroupFile(long j, int i, int i2, String str);

        private native void native_cancelTransferTask(long j, Contact contact, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, IOperateTransferInfoCallback iOperateTransferInfoCallback);

        private native void native_cancelUrlDownload(long j, ArrayList<Long> arrayList);

        private native void native_createGroupFolder(long j, long j2, String str, IGroupItemCallback iGroupItemCallback);

        private native void native_deleteGroupFile(long j, long j2, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, IDeleteGroupFileCallback iDeleteGroupFileCallback);

        private native void native_deleteGroupFolder(long j, long j2, String str, IGroupFileCommonResultCallback iGroupFileCommonResultCallback);

        private native void native_deleteTransferInfo(long j, Contact contact, ArrayList<Long> arrayList, IOperateTransferInfoCallback iOperateTransferInfoCallback);

        private native void native_downloadFile(long j, CommonFileInfo commonFileInfo, int i, int i2, String str);

        private native void native_downloadFileByUrlList(long j, UrlFileDownloadType urlFileDownloadType, ArrayList<String> arrayList, IOperateReturnU64ListCallback iOperateReturnU64ListCallback);

        private native void native_downloadFileForFileInfo(long j, ArrayList<CommonFileInfo> arrayList, String str);

        private native void native_downloadFileForFileUuid(long j, Contact contact, String str, ArrayList<DownloadGroupFileParams> arrayList);

        private native void native_downloadFileForModelId(long j, Contact contact, ArrayList<Long> arrayList, String str, IDownloadFileCallback iDownloadFileCallback);

        private native void native_downloadGroupFolder(long j, long j2, String str, String str2, IOperateCallback iOperateCallback);

        private native void native_downloadRichMediaInVisit(long j, RichDownLoadReq richDownLoadReq);

        private native void native_getGroupFileInfo(long j, long j2, String str, IGroupFileInfoCallback iGroupFileInfoCallback);

        private native int native_getGroupFileList(long j, long j2, GroupFileListForm groupFileListForm);

        private native void native_getGroupSpace(long j, long j2, IGroupSpaceCallback iGroupSpaceCallback);

        private native int native_getGroupTransferList(long j, long j2, GroupFileListForm groupFileListForm);

        private native RMCodecInfo native_getRichMediaCodecInfo(long j, RMBizTypeEnum rMBizTypeEnum);

        private native String native_getRichMediaFileDir(long j, int i, int i2, boolean z);

        private native void native_getScreenOCR(long j, String str, IWindowsOcrCallback iWindowsOcrCallback);

        private native void native_getVideoPlayUrl(long j, Contact contact, long j2, long j3, VideoCodecFormatType videoCodecFormatType, VideoRequestWay videoRequestWay, IVideoPlayUrlCallback iVideoPlayUrlCallback);

        private native void native_getVideoPlayUrlInVisit(long j, RichDownLoadReq richDownLoadReq, IVideoPlayUrlCallback iVideoPlayUrlCallback);

        private native void native_getVideoPlayUrlV2(long j, Contact contact, long j2, long j3, VideoCodecFormatType videoCodecFormatType, RMReqExParams rMReqExParams, IVideoPlayUrlCallback iVideoPlayUrlCallback);

        private native void native_moveGroupFile(long j, long j2, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, String str, String str2, IMoveGroupFileCallback iMoveGroupFileCallback);

        private native void native_onlyDownloadFile(long j, Contact contact, String str, ArrayList<DownloadGroupFileParams> arrayList);

        private native void native_onlyUploadFile(long j, Contact contact, ArrayList<UploadGroupFileParams> arrayList);

        private native PicDownParams native_queryPicDownloadSize(long j, PicReqParams picReqParams);

        private native void native_renameGroupFile(long j, long j2, int i, String str, String str2, String str3, IRenameGroupFileCallback iRenameGroupFileCallback);

        private native void native_renameGroupFolder(long j, long j2, String str, String str2, IGroupItemCallback iGroupItemCallback);

        private native int native_searchGroupFile(long j, ArrayList<String> arrayList, SearchGroupFileParams searchGroupFileParams, IOperateCallback iOperateCallback);

        private native void native_searchGroupFileByWord(long j, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, String str, String str2, int i, ISearchGroupFileCallback iSearchGroupFileCallback);

        private native void native_searchMoreGroupFile(long j, int i);

        private native void native_transGroupFile(long j, long j2, String str, ITransGroupFileCallback iTransGroupFileCallback);

        private native void native_translateEnWordToZn(long j, ArrayList<String> arrayList, ITranslateWordsCallback iTranslateWordsCallback);

        private native void native_updateOnlineVideoElemStatus(long j, UploadStatusParams uploadStatusParams);

        private native void native_uploadRMFileWithoutMsg(long j, UploadFileWithoutMsgParams uploadFileWithoutMsgParams);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void batchGetGroupFileCount(ArrayList<Long> arrayList, IBatchGroupFileCountCallback iBatchGroupFileCountCallback) {
            native_batchGetGroupFileCount(this.nativeRef, arrayList, iBatchGroupFileCountCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void beaconReportRMData(RMBeaconReportInfo rMBeaconReportInfo) {
            native_beaconReportRMData(this.nativeRef, rMBeaconReportInfo);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void cancelSearcheGroupFile(int i, int i2, String str) {
            native_cancelSearcheGroupFile(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void cancelTransferTask(Contact contact, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, IOperateTransferInfoCallback iOperateTransferInfoCallback) {
            native_cancelTransferTask(this.nativeRef, contact, arrayList, arrayList2, iOperateTransferInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void cancelUrlDownload(ArrayList<Long> arrayList) {
            native_cancelUrlDownload(this.nativeRef, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void createGroupFolder(long j, String str, IGroupItemCallback iGroupItemCallback) {
            native_createGroupFolder(this.nativeRef, j, str, iGroupItemCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void deleteGroupFile(long j, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, IDeleteGroupFileCallback iDeleteGroupFileCallback) {
            native_deleteGroupFile(this.nativeRef, j, arrayList, arrayList2, iDeleteGroupFileCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void deleteGroupFolder(long j, String str, IGroupFileCommonResultCallback iGroupFileCommonResultCallback) {
            native_deleteGroupFolder(this.nativeRef, j, str, iGroupFileCommonResultCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void deleteTransferInfo(Contact contact, ArrayList<Long> arrayList, IOperateTransferInfoCallback iOperateTransferInfoCallback) {
            native_deleteTransferInfo(this.nativeRef, contact, arrayList, iOperateTransferInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void downloadFile(CommonFileInfo commonFileInfo, int i, int i2, String str) {
            native_downloadFile(this.nativeRef, commonFileInfo, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void downloadFileByUrlList(UrlFileDownloadType urlFileDownloadType, ArrayList<String> arrayList, IOperateReturnU64ListCallback iOperateReturnU64ListCallback) {
            native_downloadFileByUrlList(this.nativeRef, urlFileDownloadType, arrayList, iOperateReturnU64ListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void downloadFileForFileInfo(ArrayList<CommonFileInfo> arrayList, String str) {
            native_downloadFileForFileInfo(this.nativeRef, arrayList, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void downloadFileForFileUuid(Contact contact, String str, ArrayList<DownloadGroupFileParams> arrayList) {
            native_downloadFileForFileUuid(this.nativeRef, contact, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void downloadFileForModelId(Contact contact, ArrayList<Long> arrayList, String str, IDownloadFileCallback iDownloadFileCallback) {
            native_downloadFileForModelId(this.nativeRef, contact, arrayList, str, iDownloadFileCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void downloadGroupFolder(long j, String str, String str2, IOperateCallback iOperateCallback) {
            native_downloadGroupFolder(this.nativeRef, j, str, str2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void downloadRichMediaInVisit(RichDownLoadReq richDownLoadReq) {
            native_downloadRichMediaInVisit(this.nativeRef, richDownLoadReq);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void getGroupFileInfo(long j, String str, IGroupFileInfoCallback iGroupFileInfoCallback) {
            native_getGroupFileInfo(this.nativeRef, j, str, iGroupFileInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public int getGroupFileList(long j, GroupFileListForm groupFileListForm) {
            return native_getGroupFileList(this.nativeRef, j, groupFileListForm);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void getGroupSpace(long j, IGroupSpaceCallback iGroupSpaceCallback) {
            native_getGroupSpace(this.nativeRef, j, iGroupSpaceCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public int getGroupTransferList(long j, GroupFileListForm groupFileListForm) {
            return native_getGroupTransferList(this.nativeRef, j, groupFileListForm);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public RMCodecInfo getRichMediaCodecInfo(RMBizTypeEnum rMBizTypeEnum) {
            return native_getRichMediaCodecInfo(this.nativeRef, rMBizTypeEnum);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public String getRichMediaFileDir(int i, int i2, boolean z) {
            return native_getRichMediaFileDir(this.nativeRef, i, i2, z);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void getScreenOCR(String str, IWindowsOcrCallback iWindowsOcrCallback) {
            native_getScreenOCR(this.nativeRef, str, iWindowsOcrCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void getVideoPlayUrl(Contact contact, long j, long j2, VideoCodecFormatType videoCodecFormatType, VideoRequestWay videoRequestWay, IVideoPlayUrlCallback iVideoPlayUrlCallback) {
            native_getVideoPlayUrl(this.nativeRef, contact, j, j2, videoCodecFormatType, videoRequestWay, iVideoPlayUrlCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void getVideoPlayUrlInVisit(RichDownLoadReq richDownLoadReq, IVideoPlayUrlCallback iVideoPlayUrlCallback) {
            native_getVideoPlayUrlInVisit(this.nativeRef, richDownLoadReq, iVideoPlayUrlCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void getVideoPlayUrlV2(Contact contact, long j, long j2, VideoCodecFormatType videoCodecFormatType, RMReqExParams rMReqExParams, IVideoPlayUrlCallback iVideoPlayUrlCallback) {
            native_getVideoPlayUrlV2(this.nativeRef, contact, j, j2, videoCodecFormatType, rMReqExParams, iVideoPlayUrlCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void moveGroupFile(long j, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, String str, String str2, IMoveGroupFileCallback iMoveGroupFileCallback) {
            native_moveGroupFile(this.nativeRef, j, arrayList, arrayList2, str, str2, iMoveGroupFileCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void onlyDownloadFile(Contact contact, String str, ArrayList<DownloadGroupFileParams> arrayList) {
            native_onlyDownloadFile(this.nativeRef, contact, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void onlyUploadFile(Contact contact, ArrayList<UploadGroupFileParams> arrayList) {
            native_onlyUploadFile(this.nativeRef, contact, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public PicDownParams queryPicDownloadSize(PicReqParams picReqParams) {
            return native_queryPicDownloadSize(this.nativeRef, picReqParams);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void renameGroupFile(long j, int i, String str, String str2, String str3, IRenameGroupFileCallback iRenameGroupFileCallback) {
            native_renameGroupFile(this.nativeRef, j, i, str, str2, str3, iRenameGroupFileCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void renameGroupFolder(long j, String str, String str2, IGroupItemCallback iGroupItemCallback) {
            native_renameGroupFolder(this.nativeRef, j, str, str2, iGroupItemCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public int searchGroupFile(ArrayList<String> arrayList, SearchGroupFileParams searchGroupFileParams, IOperateCallback iOperateCallback) {
            return native_searchGroupFile(this.nativeRef, arrayList, searchGroupFileParams, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void searchGroupFileByWord(ArrayList<Long> arrayList, ArrayList<Long> arrayList2, String str, String str2, int i, ISearchGroupFileCallback iSearchGroupFileCallback) {
            native_searchGroupFileByWord(this.nativeRef, arrayList, arrayList2, str, str2, i, iSearchGroupFileCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void searchMoreGroupFile(int i) {
            native_searchMoreGroupFile(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void transGroupFile(long j, String str, ITransGroupFileCallback iTransGroupFileCallback) {
            native_transGroupFile(this.nativeRef, j, str, iTransGroupFileCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void translateEnWordToZn(ArrayList<String> arrayList, ITranslateWordsCallback iTranslateWordsCallback) {
            native_translateEnWordToZn(this.nativeRef, arrayList, iTranslateWordsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void updateOnlineVideoElemStatus(UploadStatusParams uploadStatusParams) {
            native_updateOnlineVideoElemStatus(this.nativeRef, uploadStatusParams);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService
        public void uploadRMFileWithoutMsg(UploadFileWithoutMsgParams uploadFileWithoutMsgParams) {
            native_uploadRMFileWithoutMsg(this.nativeRef, uploadFileWithoutMsgParams);
        }
    }

    void batchGetGroupFileCount(ArrayList<Long> arrayList, IBatchGroupFileCountCallback iBatchGroupFileCountCallback);

    void beaconReportRMData(RMBeaconReportInfo rMBeaconReportInfo);

    void cancelSearcheGroupFile(int i, int i2, String str);

    void cancelTransferTask(Contact contact, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, IOperateTransferInfoCallback iOperateTransferInfoCallback);

    void cancelUrlDownload(ArrayList<Long> arrayList);

    void createGroupFolder(long j, String str, IGroupItemCallback iGroupItemCallback);

    void deleteGroupFile(long j, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, IDeleteGroupFileCallback iDeleteGroupFileCallback);

    void deleteGroupFolder(long j, String str, IGroupFileCommonResultCallback iGroupFileCommonResultCallback);

    void deleteTransferInfo(Contact contact, ArrayList<Long> arrayList, IOperateTransferInfoCallback iOperateTransferInfoCallback);

    void downloadFile(CommonFileInfo commonFileInfo, int i, int i2, String str);

    void downloadFileByUrlList(UrlFileDownloadType urlFileDownloadType, ArrayList<String> arrayList, IOperateReturnU64ListCallback iOperateReturnU64ListCallback);

    void downloadFileForFileInfo(ArrayList<CommonFileInfo> arrayList, String str);

    void downloadFileForFileUuid(Contact contact, String str, ArrayList<DownloadGroupFileParams> arrayList);

    void downloadFileForModelId(Contact contact, ArrayList<Long> arrayList, String str, IDownloadFileCallback iDownloadFileCallback);

    void downloadGroupFolder(long j, String str, String str2, IOperateCallback iOperateCallback);

    void downloadRichMediaInVisit(RichDownLoadReq richDownLoadReq);

    void getGroupFileInfo(long j, String str, IGroupFileInfoCallback iGroupFileInfoCallback);

    int getGroupFileList(long j, GroupFileListForm groupFileListForm);

    void getGroupSpace(long j, IGroupSpaceCallback iGroupSpaceCallback);

    int getGroupTransferList(long j, GroupFileListForm groupFileListForm);

    RMCodecInfo getRichMediaCodecInfo(RMBizTypeEnum rMBizTypeEnum);

    String getRichMediaFileDir(int i, int i2, boolean z);

    void getScreenOCR(String str, IWindowsOcrCallback iWindowsOcrCallback);

    void getVideoPlayUrl(Contact contact, long j, long j2, VideoCodecFormatType videoCodecFormatType, VideoRequestWay videoRequestWay, IVideoPlayUrlCallback iVideoPlayUrlCallback);

    void getVideoPlayUrlInVisit(RichDownLoadReq richDownLoadReq, IVideoPlayUrlCallback iVideoPlayUrlCallback);

    void getVideoPlayUrlV2(Contact contact, long j, long j2, VideoCodecFormatType videoCodecFormatType, RMReqExParams rMReqExParams, IVideoPlayUrlCallback iVideoPlayUrlCallback);

    void moveGroupFile(long j, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, String str, String str2, IMoveGroupFileCallback iMoveGroupFileCallback);

    void onlyDownloadFile(Contact contact, String str, ArrayList<DownloadGroupFileParams> arrayList);

    void onlyUploadFile(Contact contact, ArrayList<UploadGroupFileParams> arrayList);

    PicDownParams queryPicDownloadSize(PicReqParams picReqParams);

    void renameGroupFile(long j, int i, String str, String str2, String str3, IRenameGroupFileCallback iRenameGroupFileCallback);

    void renameGroupFolder(long j, String str, String str2, IGroupItemCallback iGroupItemCallback);

    int searchGroupFile(ArrayList<String> arrayList, SearchGroupFileParams searchGroupFileParams, IOperateCallback iOperateCallback);

    void searchGroupFileByWord(ArrayList<Long> arrayList, ArrayList<Long> arrayList2, String str, String str2, int i, ISearchGroupFileCallback iSearchGroupFileCallback);

    void searchMoreGroupFile(int i);

    void transGroupFile(long j, String str, ITransGroupFileCallback iTransGroupFileCallback);

    void translateEnWordToZn(ArrayList<String> arrayList, ITranslateWordsCallback iTranslateWordsCallback);

    void updateOnlineVideoElemStatus(UploadStatusParams uploadStatusParams);

    void uploadRMFileWithoutMsg(UploadFileWithoutMsgParams uploadFileWithoutMsgParams);
}
