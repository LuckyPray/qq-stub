package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelAlbumService.class */
public interface IKernelAlbumService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelAlbumService$CppProxy.class */
    public static final class CppProxy implements IKernelAlbumService {
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

        private native void nativeDestroy(long j);

        private native void native_addAlbum(long j, int i, AlbumInfo albumInfo, IAlbumServiceAddAlbumCallback iAlbumServiceAddAlbumCallback);

        private native void native_deleteAlbum(long j, int i, String str, String str2, IAlbumServiceDeleteAlbumCallback iAlbumServiceDeleteAlbumCallback);

        private native void native_deleteMedias(long j, int i, String str, String str2, ArrayList<String> arrayList, ArrayList<String> arrayList2, IAlbumServiceDeleteMediasCallback iAlbumServiceDeleteMediasCallback);

        private native void native_deleteQunFeed(long j, NTDeleteQunFeedReq nTDeleteQunFeedReq, IAlbumServiceDeleteQunFeedCallback iAlbumServiceDeleteQunFeedCallback);

        private native void native_doQunComment(long j, int i, StCommonExt stCommonExt, String str, int i2, StFeed stFeed, StComment stComment, IAlbumServiceDoQunCommentCallback iAlbumServiceDoQunCommentCallback);

        private native void native_doQunLike(long j, int i, StCommonExt stCommonExt, int i2, StLike stLike, StFeed stFeed, IAlbumServiceDoQunLikeCallback iAlbumServiceDoQunLikeCallback);

        private native void native_doQunReply(long j, int i, StCommonExt stCommonExt, String str, int i2, StFeed stFeed, StComment stComment, StReply stReply, IAlbumServiceDoQunReplyCallback iAlbumServiceDoQunReplyCallback);

        private native void native_getAlbumInfo(long j, NTGetAlbumInfoReq nTGetAlbumInfoReq, IAlbumServiceGetAlbumInfoCallback iAlbumServiceGetAlbumInfoCallback);

        private native void native_getAlbumList(long j, NTGetAlbumListReq nTGetAlbumListReq, IAlbumServiceGetAlbumListCallback iAlbumServiceGetAlbumListCallback);

        private native void native_getAllAlbumList(long j, NTGetAllAlbumListReq nTGetAllAlbumListReq, IAlbumServiceGetAllAlbumListCallback iAlbumServiceGetAllAlbumListCallback);

        private native void native_getFeedById(long j, NTGetFeedByIdReq nTGetFeedByIdReq, IAlbumServiceGetFeedByIdCallback iAlbumServiceGetFeedByIdCallback);

        private native void native_getMainPage(long j, int i, String str, IAlbumServiceGetMainPageCallback iAlbumServiceGetMainPageCallback);

        private native void native_getMediaList(long j, NTGetMediaListReq nTGetMediaListReq, IAlbumServiceGetMediaListCallback iAlbumServiceGetMediaListCallback);

        private native void native_getMediaListTailTab(long j, NTGetMediaListTailTabReq nTGetMediaListTailTabReq, IAlbumServiceGetMediaListTailTabCallback iAlbumServiceGetMediaListTailTabCallback);

        private native void native_getQunComment(long j, NTGetQunCommentReq nTGetQunCommentReq, IAlbumServiceGetQunCommentCallback iAlbumServiceGetQunCommentCallback);

        private native void native_getQunFeedDetail(long j, NTGetQunFeedDetailReq nTGetQunFeedDetailReq, IAlbumServiceGetQunFeedDetailCallback iAlbumServiceGetQunFeedDetailCallback);

        private native void native_getQunFeeds(long j, NTGetQunFeedsReq nTGetQunFeedsReq, IAlbumServiceGetQunFeedsCallback iAlbumServiceGetQunFeedsCallback);

        private native void native_getQunLikes(long j, int i, StCommonExt stCommonExt, String str, String str2, IAlbumServiceGetQunLikesCallback iAlbumServiceGetQunLikesCallback);

        private native void native_getQunNoticeList(long j, int i, StCommonExt stCommonExt, String str, String str2, IAlbumServiceGetQunNoticeListCallback iAlbumServiceGetQunNoticeListCallback);

        private native void native_getQunRight(long j, NTGetQunRightReq nTGetQunRightReq, IAlbumServiceGetQunRightCallback iAlbumServiceGetQunRightCallback);

        private native void native_getRedPoints(long j, long j2, SceneType sceneType, String str, IReddotReaderServiceGetRedPointsCallback iReddotReaderServiceGetRedPointsCallback);

        private native void native_modifyAlbum(long j, int i, AlbumInfo albumInfo, ArrayList<AlbumModifyMask> arrayList, IAlbumServiceModifyAlbumCallback iAlbumServiceModifyAlbumCallback);

        private native void native_queryQuoteToQunAlbumStatus(long j, NTQueryQuoteToQunAlbumStatusReq nTQueryQuoteToQunAlbumStatusReq, IAlbumServiceQueryQuoteToQunAlbumStatusCallback iAlbumServiceQueryQuoteToQunAlbumStatusCallback);

        private native void native_quoteToQunAlbum(long j, NTQuoteToQunAlbumReq nTQuoteToQunAlbumReq, IAlbumServiceQuoteToQunAlbumCallback iAlbumServiceQuoteToQunAlbumCallback);

        private native void native_quoteToQzone(long j, NTQuoteToQzoneReq nTQuoteToQzoneReq, IAlbumServiceQuoteToQzoneCallback iAlbumServiceQuoteToQzoneCallback);

        private native void native_reportViewQunFeed(long j, NTReportViewQunFeedReq nTReportViewQunFeedReq, IAlbumServiceReportViewQunFeedCallback iAlbumServiceReportViewQunFeedCallback);

        private native void native_setAlbumServiceInfo(long j, String str, String str2, String str3);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void addAlbum(int i, AlbumInfo albumInfo, IAlbumServiceAddAlbumCallback iAlbumServiceAddAlbumCallback) {
            native_addAlbum(this.nativeRef, i, albumInfo, iAlbumServiceAddAlbumCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void deleteAlbum(int i, String str, String str2, IAlbumServiceDeleteAlbumCallback iAlbumServiceDeleteAlbumCallback) {
            native_deleteAlbum(this.nativeRef, i, str, str2, iAlbumServiceDeleteAlbumCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void deleteMedias(int i, String str, String str2, ArrayList<String> arrayList, ArrayList<String> arrayList2, IAlbumServiceDeleteMediasCallback iAlbumServiceDeleteMediasCallback) {
            native_deleteMedias(this.nativeRef, i, str, str2, arrayList, arrayList2, iAlbumServiceDeleteMediasCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void deleteQunFeed(NTDeleteQunFeedReq nTDeleteQunFeedReq, IAlbumServiceDeleteQunFeedCallback iAlbumServiceDeleteQunFeedCallback) {
            native_deleteQunFeed(this.nativeRef, nTDeleteQunFeedReq, iAlbumServiceDeleteQunFeedCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void doQunComment(int i, StCommonExt stCommonExt, String str, int i2, StFeed stFeed, StComment stComment, IAlbumServiceDoQunCommentCallback iAlbumServiceDoQunCommentCallback) {
            native_doQunComment(this.nativeRef, i, stCommonExt, str, i2, stFeed, stComment, iAlbumServiceDoQunCommentCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void doQunLike(int i, StCommonExt stCommonExt, int i2, StLike stLike, StFeed stFeed, IAlbumServiceDoQunLikeCallback iAlbumServiceDoQunLikeCallback) {
            native_doQunLike(this.nativeRef, i, stCommonExt, i2, stLike, stFeed, iAlbumServiceDoQunLikeCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void doQunReply(int i, StCommonExt stCommonExt, String str, int i2, StFeed stFeed, StComment stComment, StReply stReply, IAlbumServiceDoQunReplyCallback iAlbumServiceDoQunReplyCallback) {
            native_doQunReply(this.nativeRef, i, stCommonExt, str, i2, stFeed, stComment, stReply, iAlbumServiceDoQunReplyCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getAlbumInfo(NTGetAlbumInfoReq nTGetAlbumInfoReq, IAlbumServiceGetAlbumInfoCallback iAlbumServiceGetAlbumInfoCallback) {
            native_getAlbumInfo(this.nativeRef, nTGetAlbumInfoReq, iAlbumServiceGetAlbumInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getAlbumList(NTGetAlbumListReq nTGetAlbumListReq, IAlbumServiceGetAlbumListCallback iAlbumServiceGetAlbumListCallback) {
            native_getAlbumList(this.nativeRef, nTGetAlbumListReq, iAlbumServiceGetAlbumListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getAllAlbumList(NTGetAllAlbumListReq nTGetAllAlbumListReq, IAlbumServiceGetAllAlbumListCallback iAlbumServiceGetAllAlbumListCallback) {
            native_getAllAlbumList(this.nativeRef, nTGetAllAlbumListReq, iAlbumServiceGetAllAlbumListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getFeedById(NTGetFeedByIdReq nTGetFeedByIdReq, IAlbumServiceGetFeedByIdCallback iAlbumServiceGetFeedByIdCallback) {
            native_getFeedById(this.nativeRef, nTGetFeedByIdReq, iAlbumServiceGetFeedByIdCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getMainPage(int i, String str, IAlbumServiceGetMainPageCallback iAlbumServiceGetMainPageCallback) {
            native_getMainPage(this.nativeRef, i, str, iAlbumServiceGetMainPageCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getMediaList(NTGetMediaListReq nTGetMediaListReq, IAlbumServiceGetMediaListCallback iAlbumServiceGetMediaListCallback) {
            native_getMediaList(this.nativeRef, nTGetMediaListReq, iAlbumServiceGetMediaListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getMediaListTailTab(NTGetMediaListTailTabReq nTGetMediaListTailTabReq, IAlbumServiceGetMediaListTailTabCallback iAlbumServiceGetMediaListTailTabCallback) {
            native_getMediaListTailTab(this.nativeRef, nTGetMediaListTailTabReq, iAlbumServiceGetMediaListTailTabCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getQunComment(NTGetQunCommentReq nTGetQunCommentReq, IAlbumServiceGetQunCommentCallback iAlbumServiceGetQunCommentCallback) {
            native_getQunComment(this.nativeRef, nTGetQunCommentReq, iAlbumServiceGetQunCommentCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getQunFeedDetail(NTGetQunFeedDetailReq nTGetQunFeedDetailReq, IAlbumServiceGetQunFeedDetailCallback iAlbumServiceGetQunFeedDetailCallback) {
            native_getQunFeedDetail(this.nativeRef, nTGetQunFeedDetailReq, iAlbumServiceGetQunFeedDetailCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getQunFeeds(NTGetQunFeedsReq nTGetQunFeedsReq, IAlbumServiceGetQunFeedsCallback iAlbumServiceGetQunFeedsCallback) {
            native_getQunFeeds(this.nativeRef, nTGetQunFeedsReq, iAlbumServiceGetQunFeedsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getQunLikes(int i, StCommonExt stCommonExt, String str, String str2, IAlbumServiceGetQunLikesCallback iAlbumServiceGetQunLikesCallback) {
            native_getQunLikes(this.nativeRef, i, stCommonExt, str, str2, iAlbumServiceGetQunLikesCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getQunNoticeList(int i, StCommonExt stCommonExt, String str, String str2, IAlbumServiceGetQunNoticeListCallback iAlbumServiceGetQunNoticeListCallback) {
            native_getQunNoticeList(this.nativeRef, i, stCommonExt, str, str2, iAlbumServiceGetQunNoticeListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getQunRight(NTGetQunRightReq nTGetQunRightReq, IAlbumServiceGetQunRightCallback iAlbumServiceGetQunRightCallback) {
            native_getQunRight(this.nativeRef, nTGetQunRightReq, iAlbumServiceGetQunRightCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void getRedPoints(long j, SceneType sceneType, String str, IReddotReaderServiceGetRedPointsCallback iReddotReaderServiceGetRedPointsCallback) {
            native_getRedPoints(this.nativeRef, j, sceneType, str, iReddotReaderServiceGetRedPointsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void modifyAlbum(int i, AlbumInfo albumInfo, ArrayList<AlbumModifyMask> arrayList, IAlbumServiceModifyAlbumCallback iAlbumServiceModifyAlbumCallback) {
            native_modifyAlbum(this.nativeRef, i, albumInfo, arrayList, iAlbumServiceModifyAlbumCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void queryQuoteToQunAlbumStatus(NTQueryQuoteToQunAlbumStatusReq nTQueryQuoteToQunAlbumStatusReq, IAlbumServiceQueryQuoteToQunAlbumStatusCallback iAlbumServiceQueryQuoteToQunAlbumStatusCallback) {
            native_queryQuoteToQunAlbumStatus(this.nativeRef, nTQueryQuoteToQunAlbumStatusReq, iAlbumServiceQueryQuoteToQunAlbumStatusCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void quoteToQunAlbum(NTQuoteToQunAlbumReq nTQuoteToQunAlbumReq, IAlbumServiceQuoteToQunAlbumCallback iAlbumServiceQuoteToQunAlbumCallback) {
            native_quoteToQunAlbum(this.nativeRef, nTQuoteToQunAlbumReq, iAlbumServiceQuoteToQunAlbumCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void quoteToQzone(NTQuoteToQzoneReq nTQuoteToQzoneReq, IAlbumServiceQuoteToQzoneCallback iAlbumServiceQuoteToQzoneCallback) {
            native_quoteToQzone(this.nativeRef, nTQuoteToQzoneReq, iAlbumServiceQuoteToQzoneCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void reportViewQunFeed(NTReportViewQunFeedReq nTReportViewQunFeedReq, IAlbumServiceReportViewQunFeedCallback iAlbumServiceReportViewQunFeedCallback) {
            native_reportViewQunFeed(this.nativeRef, nTReportViewQunFeedReq, iAlbumServiceReportViewQunFeedCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAlbumService
        public void setAlbumServiceInfo(String str, String str2, String str3) {
            native_setAlbumServiceInfo(this.nativeRef, str, str2, str3);
        }
    }

    void addAlbum(int i, AlbumInfo albumInfo, IAlbumServiceAddAlbumCallback iAlbumServiceAddAlbumCallback);

    void deleteAlbum(int i, String str, String str2, IAlbumServiceDeleteAlbumCallback iAlbumServiceDeleteAlbumCallback);

    void deleteMedias(int i, String str, String str2, ArrayList<String> arrayList, ArrayList<String> arrayList2, IAlbumServiceDeleteMediasCallback iAlbumServiceDeleteMediasCallback);

    void deleteQunFeed(NTDeleteQunFeedReq nTDeleteQunFeedReq, IAlbumServiceDeleteQunFeedCallback iAlbumServiceDeleteQunFeedCallback);

    void doQunComment(int i, StCommonExt stCommonExt, String str, int i2, StFeed stFeed, StComment stComment, IAlbumServiceDoQunCommentCallback iAlbumServiceDoQunCommentCallback);

    void doQunLike(int i, StCommonExt stCommonExt, int i2, StLike stLike, StFeed stFeed, IAlbumServiceDoQunLikeCallback iAlbumServiceDoQunLikeCallback);

    void doQunReply(int i, StCommonExt stCommonExt, String str, int i2, StFeed stFeed, StComment stComment, StReply stReply, IAlbumServiceDoQunReplyCallback iAlbumServiceDoQunReplyCallback);

    void getAlbumInfo(NTGetAlbumInfoReq nTGetAlbumInfoReq, IAlbumServiceGetAlbumInfoCallback iAlbumServiceGetAlbumInfoCallback);

    void getAlbumList(NTGetAlbumListReq nTGetAlbumListReq, IAlbumServiceGetAlbumListCallback iAlbumServiceGetAlbumListCallback);

    void getAllAlbumList(NTGetAllAlbumListReq nTGetAllAlbumListReq, IAlbumServiceGetAllAlbumListCallback iAlbumServiceGetAllAlbumListCallback);

    void getFeedById(NTGetFeedByIdReq nTGetFeedByIdReq, IAlbumServiceGetFeedByIdCallback iAlbumServiceGetFeedByIdCallback);

    void getMainPage(int i, String str, IAlbumServiceGetMainPageCallback iAlbumServiceGetMainPageCallback);

    void getMediaList(NTGetMediaListReq nTGetMediaListReq, IAlbumServiceGetMediaListCallback iAlbumServiceGetMediaListCallback);

    void getMediaListTailTab(NTGetMediaListTailTabReq nTGetMediaListTailTabReq, IAlbumServiceGetMediaListTailTabCallback iAlbumServiceGetMediaListTailTabCallback);

    void getQunComment(NTGetQunCommentReq nTGetQunCommentReq, IAlbumServiceGetQunCommentCallback iAlbumServiceGetQunCommentCallback);

    void getQunFeedDetail(NTGetQunFeedDetailReq nTGetQunFeedDetailReq, IAlbumServiceGetQunFeedDetailCallback iAlbumServiceGetQunFeedDetailCallback);

    void getQunFeeds(NTGetQunFeedsReq nTGetQunFeedsReq, IAlbumServiceGetQunFeedsCallback iAlbumServiceGetQunFeedsCallback);

    void getQunLikes(int i, StCommonExt stCommonExt, String str, String str2, IAlbumServiceGetQunLikesCallback iAlbumServiceGetQunLikesCallback);

    void getQunNoticeList(int i, StCommonExt stCommonExt, String str, String str2, IAlbumServiceGetQunNoticeListCallback iAlbumServiceGetQunNoticeListCallback);

    void getQunRight(NTGetQunRightReq nTGetQunRightReq, IAlbumServiceGetQunRightCallback iAlbumServiceGetQunRightCallback);

    void getRedPoints(long j, SceneType sceneType, String str, IReddotReaderServiceGetRedPointsCallback iReddotReaderServiceGetRedPointsCallback);

    void modifyAlbum(int i, AlbumInfo albumInfo, ArrayList<AlbumModifyMask> arrayList, IAlbumServiceModifyAlbumCallback iAlbumServiceModifyAlbumCallback);

    void queryQuoteToQunAlbumStatus(NTQueryQuoteToQunAlbumStatusReq nTQueryQuoteToQunAlbumStatusReq, IAlbumServiceQueryQuoteToQunAlbumStatusCallback iAlbumServiceQueryQuoteToQunAlbumStatusCallback);

    void quoteToQunAlbum(NTQuoteToQunAlbumReq nTQuoteToQunAlbumReq, IAlbumServiceQuoteToQunAlbumCallback iAlbumServiceQuoteToQunAlbumCallback);

    void quoteToQzone(NTQuoteToQzoneReq nTQuoteToQzoneReq, IAlbumServiceQuoteToQzoneCallback iAlbumServiceQuoteToQzoneCallback);

    void reportViewQunFeed(NTReportViewQunFeedReq nTReportViewQunFeedReq, IAlbumServiceReportViewQunFeedCallback iAlbumServiceReportViewQunFeedCallback);

    void setAlbumServiceInfo(String str, String str2, String str3);
}
