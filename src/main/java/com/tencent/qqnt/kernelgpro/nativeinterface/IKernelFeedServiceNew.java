package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IKernelFeedServiceNew.class */
public interface IKernelFeedServiceNew {
    public static final IPatchRedirector $redirector_ = null;

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IKernelFeedServiceNew$CppProxy.class */
    public static final class CppProxy implements IKernelFeedServiceNew {
        static final boolean $assertionsDisabled;
        static IPatchRedirector $redirector_;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        static {
            IPatchRedirector redirector = PatchRedirectCenter.getRedirector(54217);
            $redirector_ = redirector;
            if (redirector == null || !redirector.hasPatch((short) 40)) {
                $assertionsDisabled = true;
            } else {
                redirector.redirect((short) 40);
            }
        }

        CppProxy(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
                iPatchRedirector.redirect((short) 1, this, j);
                return;
            }
            this.destroyed = new AtomicBoolean(false);
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native long native_addKernelFeedListener(long j, IKernelFeedListener iKernelFeedListener);

        private native void native_alterFeed(long j, GProStAlterFeedReq gProStAlterFeedReq, IGProAlterFeedCallback iGProAlterFeedCallback);

        private native void native_batchGetFeedDetail(long j, GProBatchGetFeedDetailReq gProBatchGetFeedDetailReq, IGProBatchGetFeedDetailCallback iGProBatchGetFeedDetailCallback);

        private native void native_batchManageOperate(long j, GProBatchManageOperateReq gProBatchManageOperateReq, IGProBatchManageOperateCallback iGProBatchManageOperateCallback);

        private native GProStFeed native_decodeStFeed(long j, byte[] bArr);

        private native void native_delFeed(long j, GProStDelFeedReq gProStDelFeedReq, IGProDelFeedCallback iGProDelFeedCallback);

        private native void native_doComment(long j, GProStDoCommentReq gProStDoCommentReq, IGProDoCommentCallback iGProDoCommentCallback);

        private native void native_doFeedPrefer(long j, GProDoFeedPreferReq gProDoFeedPreferReq, IGProDoFeedPreferCallback iGProDoFeedPreferCallback);

        private native void native_doLike(long j, GProStDoLikeReq gProStDoLikeReq, IGProDoLikeCallback iGProDoLikeCallback);

        private native void native_doReply(long j, GProStDoReplyReq gProStDoReplyReq, IGProDoReplyCallback iGProDoReplyCallback);

        private native void native_downloadFeedRichMedia(long j, FeedRichMediaDownloadReq feedRichMediaDownloadReq);

        private native byte[] native_encodeStFeed(long j, GProStFeed gProStFeed);

        private native void native_getChannelDraft(long j, String str, IGProGetChannelDraftCallback iGProGetChannelDraftCallback);

        private native void native_getChannelRecommendFeeds(long j, GProStGetChannelFeedsReq gProStGetChannelFeedsReq, IGProGetChannelTimelineFeedsCallback iGProGetChannelTimelineFeedsCallback);

        private native void native_getChannelTimelineFeeds(long j, GProStGetChannelFeedsReq gProStGetChannelFeedsReq, IGProGetChannelTimelineFeedsCallback iGProGetChannelTimelineFeedsCallback);

        private native void native_getDetailRecommendFeeds(long j, GProGetDetailRecommendFeedsReq gProGetDetailRecommendFeedsReq, IGProGetDetailRecommendFeedsCallback iGProGetDetailRecommendFeedsCallback);

        private native void native_getFeedComments(long j, GProStGetFeedCommentsReq gProStGetFeedCommentsReq, IGProGetFeedCommentsCallback iGProGetFeedCommentsCallback);

        private native void native_getFeedCount(long j, GProGetFeedCountReq gProGetFeedCountReq, IGProGetFeedCountCallback iGProGetFeedCountCallback);

        private native void native_getFeedDetail(long j, GProStGetFeedDetailReq gProStGetFeedDetailReq, IGProGetFeedDetailCallback iGProGetFeedDetailCallback);

        private native void native_getFeedDetailWithHotComments(long j, GProStGetFeedDetailReq gProStGetFeedDetailReq, IGProGetFeedDetailWithHotCommentsCallback iGProGetFeedDetailWithHotCommentsCallback);

        private native String native_getFeedRichMediaFilePath(long j, int i, String str, String str2, int i2, boolean z);

        private native void native_getFeeds(long j, GProGetFeedsReq gProGetFeedsReq, IGProgetFeedsCallback iGProgetFeedsCallback);

        private native void native_getFeedsByIndex(long j, GProGetFeedsByIndexReq gProGetFeedsByIndexReq, IGProGetFeedsByIndexCallback iGProGetFeedsByIndexCallback);

        private native void native_getGuildFeeds(long j, GProGetGuildFeedsReq gProGetGuildFeedsReq, IGProGetGuildFeedsCallback iGProGetGuildFeedsCallback);

        private native void native_getNextPageReplies(long j, GProGetNextPageRepliesReq gProGetNextPageRepliesReq, IGProgetNextPageRepliesCallback iGProgetNextPageRepliesCallback);

        private native void native_getTopFeedConfig(long j, GProGetTopFeedConfigReq gProGetTopFeedConfigReq, IGProGetTopFeedConfigCallback iGProGetTopFeedConfigCallback);

        private native void native_getTopFeeds(long j, GProGetTopFeedsReq gProGetTopFeedsReq, IGProGetTopFeedsCallback iGProGetTopFeedsCallback);

        private native void native_getTopicFeeds(long j, GProGetTopicFeedsReq gProGetTopicFeedsReq, IGProGetTopicFeedsCallback iGProGetTopicFeedsCallback);

        private native void native_impeach(long j, GProImpeachReq gProImpeachReq, IGProImpeachCallback iGProImpeachCallback);

        private native void native_moveFeed(long j, GProMoveFeedReq gProMoveFeedReq, IGProMoveFeedCallback iGProMoveFeedCallback);

        private native void native_publishFeed(long j, GProStPublishFeedReq gProStPublishFeedReq, IGPropublishFeedCallback iGPropublishFeedCallback);

        private native void native_removeKernelFeedListener(long j, long j2);

        private native void native_searchTopic(long j, GProSearchTopicReq gProSearchTopicReq, IGProSearchTopicCallback iGProSearchTopicCallback);

        private native void native_setChannelDraft(long j, String str, String str2, IGproFeedOperateCallback iGproFeedOperateCallback);

        private native void native_topFeedAction(long j, GProTopFeedActionReq gProTopFeedActionReq, IGProTopFeedActionCallback iGProTopFeedActionCallback);

        private native void native_unDoDelFeed(long j, GProUnDoDelFeedReq gProUnDoDelFeedReq, IGProUnDoDelFeedCallback iGProUnDoDelFeedCallback);

        public void _djinni_private_destroy() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
                iPatchRedirector.redirect((short) 2, this);
            } else {
                if (this.destroyed.getAndSet(true)) {
                    return;
                }
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public long addKernelFeedListener(IKernelFeedListener iKernelFeedListener) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
                return ((Long) iPatchRedirector.redirect((short) 4, this, iKernelFeedListener)).longValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_addKernelFeedListener(this.nativeRef, iKernelFeedListener);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void alterFeed(GProStAlterFeedReq gProStAlterFeedReq, IGProAlterFeedCallback iGProAlterFeedCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 19)) {
                iPatchRedirector.redirect((short) 19, this, gProStAlterFeedReq, iGProAlterFeedCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_alterFeed(this.nativeRef, gProStAlterFeedReq, iGProAlterFeedCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void batchGetFeedDetail(GProBatchGetFeedDetailReq gProBatchGetFeedDetailReq, IGProBatchGetFeedDetailCallback iGProBatchGetFeedDetailCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 26)) {
                iPatchRedirector.redirect((short) 26, this, gProBatchGetFeedDetailReq, iGProBatchGetFeedDetailCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchGetFeedDetail(this.nativeRef, gProBatchGetFeedDetailReq, iGProBatchGetFeedDetailCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void batchManageOperate(GProBatchManageOperateReq gProBatchManageOperateReq, IGProBatchManageOperateCallback iGProBatchManageOperateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
                iPatchRedirector.redirect((short) 12, this, gProBatchManageOperateReq, iGProBatchManageOperateCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchManageOperate(this.nativeRef, gProBatchManageOperateReq, iGProBatchManageOperateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public GProStFeed decodeStFeed(byte[] bArr) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 30)) {
                return (GProStFeed) iPatchRedirector.redirect((short) 30, this, bArr);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_decodeStFeed(this.nativeRef, bArr);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void delFeed(GProStDelFeedReq gProStDelFeedReq, IGProDelFeedCallback iGProDelFeedCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
                iPatchRedirector.redirect((short) 9, this, gProStDelFeedReq, iGProDelFeedCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_delFeed(this.nativeRef, gProStDelFeedReq, iGProDelFeedCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void doComment(GProStDoCommentReq gProStDoCommentReq, IGProDoCommentCallback iGProDoCommentCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 21)) {
                iPatchRedirector.redirect((short) 21, this, gProStDoCommentReq, iGProDoCommentCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_doComment(this.nativeRef, gProStDoCommentReq, iGProDoCommentCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void doFeedPrefer(GProDoFeedPreferReq gProDoFeedPreferReq, IGProDoFeedPreferCallback iGProDoFeedPreferCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 25)) {
                iPatchRedirector.redirect((short) 25, this, gProDoFeedPreferReq, iGProDoFeedPreferCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_doFeedPrefer(this.nativeRef, gProDoFeedPreferReq, iGProDoFeedPreferCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void doLike(GProStDoLikeReq gProStDoLikeReq, IGProDoLikeCallback iGProDoLikeCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 20)) {
                iPatchRedirector.redirect((short) 20, this, gProStDoLikeReq, iGProDoLikeCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_doLike(this.nativeRef, gProStDoLikeReq, iGProDoLikeCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void doReply(GProStDoReplyReq gProStDoReplyReq, IGProDoReplyCallback iGProDoReplyCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 22)) {
                iPatchRedirector.redirect((short) 22, this, gProStDoReplyReq, iGProDoReplyCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_doReply(this.nativeRef, gProStDoReplyReq, iGProDoReplyCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void downloadFeedRichMedia(FeedRichMediaDownloadReq feedRichMediaDownloadReq) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
                iPatchRedirector.redirect((short) 6, this, feedRichMediaDownloadReq);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_downloadFeedRichMedia(this.nativeRef, feedRichMediaDownloadReq);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public byte[] encodeStFeed(GProStFeed gProStFeed) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 31)) {
                return (byte[]) iPatchRedirector.redirect((short) 31, this, gProStFeed);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_encodeStFeed(this.nativeRef, gProStFeed);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        protected void finalize() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
                iPatchRedirector.redirect((short) 3, this);
            } else {
                _djinni_private_destroy();
                super.finalize();
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getChannelDraft(String str, IGProGetChannelDraftCallback iGProGetChannelDraftCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 32)) {
                iPatchRedirector.redirect((short) 32, this, str, iGProGetChannelDraftCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getChannelDraft(this.nativeRef, str, iGProGetChannelDraftCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getChannelRecommendFeeds(GProStGetChannelFeedsReq gProStGetChannelFeedsReq, IGProGetChannelTimelineFeedsCallback iGProGetChannelTimelineFeedsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
                iPatchRedirector.redirect((short) 14, this, gProStGetChannelFeedsReq, iGProGetChannelTimelineFeedsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getChannelRecommendFeeds(this.nativeRef, gProStGetChannelFeedsReq, iGProGetChannelTimelineFeedsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getChannelTimelineFeeds(GProStGetChannelFeedsReq gProStGetChannelFeedsReq, IGProGetChannelTimelineFeedsCallback iGProGetChannelTimelineFeedsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
                iPatchRedirector.redirect((short) 13, this, gProStGetChannelFeedsReq, iGProGetChannelTimelineFeedsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getChannelTimelineFeeds(this.nativeRef, gProStGetChannelFeedsReq, iGProGetChannelTimelineFeedsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getDetailRecommendFeeds(GProGetDetailRecommendFeedsReq gProGetDetailRecommendFeedsReq, IGProGetDetailRecommendFeedsCallback iGProGetDetailRecommendFeedsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 37)) {
                iPatchRedirector.redirect((short) 37, this, gProGetDetailRecommendFeedsReq, iGProGetDetailRecommendFeedsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getDetailRecommendFeeds(this.nativeRef, gProGetDetailRecommendFeedsReq, iGProGetDetailRecommendFeedsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getFeedComments(GProStGetFeedCommentsReq gProStGetFeedCommentsReq, IGProGetFeedCommentsCallback iGProGetFeedCommentsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 17)) {
                iPatchRedirector.redirect((short) 17, this, gProStGetFeedCommentsReq, iGProGetFeedCommentsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getFeedComments(this.nativeRef, gProStGetFeedCommentsReq, iGProGetFeedCommentsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getFeedCount(GProGetFeedCountReq gProGetFeedCountReq, IGProGetFeedCountCallback iGProGetFeedCountCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
                iPatchRedirector.redirect((short) 8, this, gProGetFeedCountReq, iGProGetFeedCountCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getFeedCount(this.nativeRef, gProGetFeedCountReq, iGProGetFeedCountCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getFeedDetail(GProStGetFeedDetailReq gProStGetFeedDetailReq, IGProGetFeedDetailCallback iGProGetFeedDetailCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
                iPatchRedirector.redirect((short) 16, this, gProStGetFeedDetailReq, iGProGetFeedDetailCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getFeedDetail(this.nativeRef, gProStGetFeedDetailReq, iGProGetFeedDetailCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getFeedDetailWithHotComments(GProStGetFeedDetailReq gProStGetFeedDetailReq, IGProGetFeedDetailWithHotCommentsCallback iGProGetFeedDetailWithHotCommentsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
                iPatchRedirector.redirect((short) 18, this, gProStGetFeedDetailReq, iGProGetFeedDetailWithHotCommentsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getFeedDetailWithHotComments(this.nativeRef, gProStGetFeedDetailReq, iGProGetFeedDetailWithHotCommentsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public String getFeedRichMediaFilePath(int i, String str, String str2, int i2, boolean z) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
                return (String) iPatchRedirector.redirect((short) 7, new Object[]{this, Integer.valueOf(i), str, str2, Integer.valueOf(i2), Boolean.valueOf(z)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getFeedRichMediaFilePath(this.nativeRef, i, str, str2, i2, z);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getFeeds(GProGetFeedsReq gProGetFeedsReq, IGProgetFeedsCallback iGProgetFeedsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 28)) {
                iPatchRedirector.redirect((short) 28, this, gProGetFeedsReq, iGProgetFeedsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getFeeds(this.nativeRef, gProGetFeedsReq, iGProgetFeedsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getFeedsByIndex(GProGetFeedsByIndexReq gProGetFeedsByIndexReq, IGProGetFeedsByIndexCallback iGProGetFeedsByIndexCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 29)) {
                iPatchRedirector.redirect((short) 29, this, gProGetFeedsByIndexReq, iGProGetFeedsByIndexCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getFeedsByIndex(this.nativeRef, gProGetFeedsByIndexReq, iGProGetFeedsByIndexCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getGuildFeeds(GProGetGuildFeedsReq gProGetGuildFeedsReq, IGProGetGuildFeedsCallback iGProGetGuildFeedsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 34)) {
                iPatchRedirector.redirect((short) 34, this, gProGetGuildFeedsReq, iGProGetGuildFeedsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildFeeds(this.nativeRef, gProGetGuildFeedsReq, iGProGetGuildFeedsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getNextPageReplies(GProGetNextPageRepliesReq gProGetNextPageRepliesReq, IGProgetNextPageRepliesCallback iGProgetNextPageRepliesCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 27)) {
                iPatchRedirector.redirect((short) 27, this, gProGetNextPageRepliesReq, iGProgetNextPageRepliesCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getNextPageReplies(this.nativeRef, gProGetNextPageRepliesReq, iGProgetNextPageRepliesCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getTopFeedConfig(GProGetTopFeedConfigReq gProGetTopFeedConfigReq, IGProGetTopFeedConfigCallback iGProGetTopFeedConfigCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 35)) {
                iPatchRedirector.redirect((short) 35, this, gProGetTopFeedConfigReq, iGProGetTopFeedConfigCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getTopFeedConfig(this.nativeRef, gProGetTopFeedConfigReq, iGProGetTopFeedConfigCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getTopFeeds(GProGetTopFeedsReq gProGetTopFeedsReq, IGProGetTopFeedsCallback iGProGetTopFeedsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 36)) {
                iPatchRedirector.redirect((short) 36, this, gProGetTopFeedsReq, iGProGetTopFeedsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getTopFeeds(this.nativeRef, gProGetTopFeedsReq, iGProGetTopFeedsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void getTopicFeeds(GProGetTopicFeedsReq gProGetTopicFeedsReq, IGProGetTopicFeedsCallback iGProGetTopicFeedsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 38)) {
                iPatchRedirector.redirect((short) 38, this, gProGetTopicFeedsReq, iGProGetTopicFeedsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getTopicFeeds(this.nativeRef, gProGetTopicFeedsReq, iGProGetTopicFeedsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void impeach(GProImpeachReq gProImpeachReq, IGProImpeachCallback iGProImpeachCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 23)) {
                iPatchRedirector.redirect((short) 23, this, gProImpeachReq, iGProImpeachCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_impeach(this.nativeRef, gProImpeachReq, iGProImpeachCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void moveFeed(GProMoveFeedReq gProMoveFeedReq, IGProMoveFeedCallback iGProMoveFeedCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
                iPatchRedirector.redirect((short) 11, this, gProMoveFeedReq, iGProMoveFeedCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_moveFeed(this.nativeRef, gProMoveFeedReq, iGProMoveFeedCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void publishFeed(GProStPublishFeedReq gProStPublishFeedReq, IGPropublishFeedCallback iGPropublishFeedCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
                iPatchRedirector.redirect((short) 15, this, gProStPublishFeedReq, iGPropublishFeedCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_publishFeed(this.nativeRef, gProStPublishFeedReq, iGPropublishFeedCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void removeKernelFeedListener(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
                iPatchRedirector.redirect((short) 5, this, j);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_removeKernelFeedListener(this.nativeRef, j);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void searchTopic(GProSearchTopicReq gProSearchTopicReq, IGProSearchTopicCallback iGProSearchTopicCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 39)) {
                iPatchRedirector.redirect((short) 39, this, gProSearchTopicReq, iGProSearchTopicCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_searchTopic(this.nativeRef, gProSearchTopicReq, iGProSearchTopicCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void setChannelDraft(String str, String str2, IGproFeedOperateCallback iGproFeedOperateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 33)) {
                iPatchRedirector.redirect((short) 33, this, str, str2, iGproFeedOperateCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelDraft(this.nativeRef, str, str2, iGproFeedOperateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void topFeedAction(GProTopFeedActionReq gProTopFeedActionReq, IGProTopFeedActionCallback iGProTopFeedActionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
                iPatchRedirector.redirect((short) 10, this, gProTopFeedActionReq, iGProTopFeedActionCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_topFeedAction(this.nativeRef, gProTopFeedActionReq, iGProTopFeedActionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelFeedServiceNew
        public void unDoDelFeed(GProUnDoDelFeedReq gProUnDoDelFeedReq, IGProUnDoDelFeedCallback iGProUnDoDelFeedCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 24)) {
                iPatchRedirector.redirect((short) 24, this, gProUnDoDelFeedReq, iGProUnDoDelFeedCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_unDoDelFeed(this.nativeRef, gProUnDoDelFeedReq, iGProUnDoDelFeedCallback);
            }
        }
    }

    long addKernelFeedListener(IKernelFeedListener iKernelFeedListener);

    void alterFeed(GProStAlterFeedReq gProStAlterFeedReq, IGProAlterFeedCallback iGProAlterFeedCallback);

    void batchGetFeedDetail(GProBatchGetFeedDetailReq gProBatchGetFeedDetailReq, IGProBatchGetFeedDetailCallback iGProBatchGetFeedDetailCallback);

    void batchManageOperate(GProBatchManageOperateReq gProBatchManageOperateReq, IGProBatchManageOperateCallback iGProBatchManageOperateCallback);

    GProStFeed decodeStFeed(byte[] bArr);

    void delFeed(GProStDelFeedReq gProStDelFeedReq, IGProDelFeedCallback iGProDelFeedCallback);

    void doComment(GProStDoCommentReq gProStDoCommentReq, IGProDoCommentCallback iGProDoCommentCallback);

    void doFeedPrefer(GProDoFeedPreferReq gProDoFeedPreferReq, IGProDoFeedPreferCallback iGProDoFeedPreferCallback);

    void doLike(GProStDoLikeReq gProStDoLikeReq, IGProDoLikeCallback iGProDoLikeCallback);

    void doReply(GProStDoReplyReq gProStDoReplyReq, IGProDoReplyCallback iGProDoReplyCallback);

    void downloadFeedRichMedia(FeedRichMediaDownloadReq feedRichMediaDownloadReq);

    byte[] encodeStFeed(GProStFeed gProStFeed);

    void getChannelDraft(String str, IGProGetChannelDraftCallback iGProGetChannelDraftCallback);

    void getChannelRecommendFeeds(GProStGetChannelFeedsReq gProStGetChannelFeedsReq, IGProGetChannelTimelineFeedsCallback iGProGetChannelTimelineFeedsCallback);

    void getChannelTimelineFeeds(GProStGetChannelFeedsReq gProStGetChannelFeedsReq, IGProGetChannelTimelineFeedsCallback iGProGetChannelTimelineFeedsCallback);

    void getDetailRecommendFeeds(GProGetDetailRecommendFeedsReq gProGetDetailRecommendFeedsReq, IGProGetDetailRecommendFeedsCallback iGProGetDetailRecommendFeedsCallback);

    void getFeedComments(GProStGetFeedCommentsReq gProStGetFeedCommentsReq, IGProGetFeedCommentsCallback iGProGetFeedCommentsCallback);

    void getFeedCount(GProGetFeedCountReq gProGetFeedCountReq, IGProGetFeedCountCallback iGProGetFeedCountCallback);

    void getFeedDetail(GProStGetFeedDetailReq gProStGetFeedDetailReq, IGProGetFeedDetailCallback iGProGetFeedDetailCallback);

    void getFeedDetailWithHotComments(GProStGetFeedDetailReq gProStGetFeedDetailReq, IGProGetFeedDetailWithHotCommentsCallback iGProGetFeedDetailWithHotCommentsCallback);

    String getFeedRichMediaFilePath(int i, String str, String str2, int i2, boolean z);

    void getFeeds(GProGetFeedsReq gProGetFeedsReq, IGProgetFeedsCallback iGProgetFeedsCallback);

    void getFeedsByIndex(GProGetFeedsByIndexReq gProGetFeedsByIndexReq, IGProGetFeedsByIndexCallback iGProGetFeedsByIndexCallback);

    void getGuildFeeds(GProGetGuildFeedsReq gProGetGuildFeedsReq, IGProGetGuildFeedsCallback iGProGetGuildFeedsCallback);

    void getNextPageReplies(GProGetNextPageRepliesReq gProGetNextPageRepliesReq, IGProgetNextPageRepliesCallback iGProgetNextPageRepliesCallback);

    void getTopFeedConfig(GProGetTopFeedConfigReq gProGetTopFeedConfigReq, IGProGetTopFeedConfigCallback iGProGetTopFeedConfigCallback);

    void getTopFeeds(GProGetTopFeedsReq gProGetTopFeedsReq, IGProGetTopFeedsCallback iGProGetTopFeedsCallback);

    void getTopicFeeds(GProGetTopicFeedsReq gProGetTopicFeedsReq, IGProGetTopicFeedsCallback iGProGetTopicFeedsCallback);

    void impeach(GProImpeachReq gProImpeachReq, IGProImpeachCallback iGProImpeachCallback);

    void moveFeed(GProMoveFeedReq gProMoveFeedReq, IGProMoveFeedCallback iGProMoveFeedCallback);

    void publishFeed(GProStPublishFeedReq gProStPublishFeedReq, IGPropublishFeedCallback iGPropublishFeedCallback);

    void removeKernelFeedListener(long j);

    void searchTopic(GProSearchTopicReq gProSearchTopicReq, IGProSearchTopicCallback iGProSearchTopicCallback);

    void setChannelDraft(String str, String str2, IGproFeedOperateCallback iGproFeedOperateCallback);

    void topFeedAction(GProTopFeedActionReq gProTopFeedActionReq, IGProTopFeedActionCallback iGProTopFeedActionCallback);

    void unDoDelFeed(GProUnDoDelFeedReq gProUnDoDelFeedReq, IGProUnDoDelFeedCallback iGProUnDoDelFeedCallback);
}
