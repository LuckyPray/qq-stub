package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* compiled from: IKernelFeedServiceNew.java */
/* renamed from: com.tencent.qqnt.kernelgpro.nativeinterface.b */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/b.class */
public final /* synthetic */ class C0080b {
    public static void $default$alterFeed(IKernelFeedServiceNew iKernelFeedServiceNew, GProStAlterFeedReq gProStAlterFeedReq, IGProAlterFeedCallback iGProAlterFeedCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            return;
        }
        iPatchRedirector.redirect((short) 14, iKernelFeedServiceNew, gProStAlterFeedReq, iGProAlterFeedCallback);
    }

    public static void $default$batchGetFeedDetail(IKernelFeedServiceNew iKernelFeedServiceNew, GProBatchGetFeedDetailReq gProBatchGetFeedDetailReq, IGProBatchGetFeedDetailCallback iGProBatchGetFeedDetailCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) {
            return;
        }
        iPatchRedirector.redirect((short) 21, iKernelFeedServiceNew, gProBatchGetFeedDetailReq, iGProBatchGetFeedDetailCallback);
    }

    public static void $default$batchManageOperate(IKernelFeedServiceNew iKernelFeedServiceNew, GProBatchManageOperateReq gProBatchManageOperateReq, IGProBatchManageOperateCallback iGProBatchManageOperateCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            return;
        }
        iPatchRedirector.redirect((short) 7, iKernelFeedServiceNew, gProBatchManageOperateReq, iGProBatchManageOperateCallback);
    }

    public static void $default$delFeed(IKernelFeedServiceNew iKernelFeedServiceNew, GProStDelFeedReq gProStDelFeedReq, IGProDelFeedCallback iGProDelFeedCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            return;
        }
        iPatchRedirector.redirect((short) 4, iKernelFeedServiceNew, gProStDelFeedReq, iGProDelFeedCallback);
    }

    public static void $default$doComment(IKernelFeedServiceNew iKernelFeedServiceNew, GProStDoCommentReq gProStDoCommentReq, IGProDoCommentCallback iGProDoCommentCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            return;
        }
        iPatchRedirector.redirect((short) 16, iKernelFeedServiceNew, gProStDoCommentReq, iGProDoCommentCallback);
    }

    public static void $default$doFeedPrefer(IKernelFeedServiceNew iKernelFeedServiceNew, GProDoFeedPreferReq gProDoFeedPreferReq, IGProDoFeedPreferCallback iGProDoFeedPreferCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) {
            return;
        }
        iPatchRedirector.redirect((short) 20, iKernelFeedServiceNew, gProDoFeedPreferReq, iGProDoFeedPreferCallback);
    }

    public static void $default$doLike(IKernelFeedServiceNew iKernelFeedServiceNew, GProStDoLikeReq gProStDoLikeReq, IGProDoLikeCallback iGProDoLikeCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            return;
        }
        iPatchRedirector.redirect((short) 15, iKernelFeedServiceNew, gProStDoLikeReq, iGProDoLikeCallback);
    }

    public static void $default$doReply(IKernelFeedServiceNew iKernelFeedServiceNew, GProStDoReplyReq gProStDoReplyReq, IGProDoReplyCallback iGProDoReplyCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            return;
        }
        iPatchRedirector.redirect((short) 17, iKernelFeedServiceNew, gProStDoReplyReq, iGProDoReplyCallback);
    }

    public static void $default$downloadFeedRichMedia(IKernelFeedServiceNew iKernelFeedServiceNew, FeedRichMediaDownloadReq feedRichMediaDownloadReq) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) {
            return;
        }
        iPatchRedirector.redirect((short) 2, iKernelFeedServiceNew, feedRichMediaDownloadReq);
    }

    public static void $default$getChannelDraft(IKernelFeedServiceNew iKernelFeedServiceNew, String str, IGProGetChannelDraftCallback iGProGetChannelDraftCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) {
            return;
        }
        iPatchRedirector.redirect((short) 25, iKernelFeedServiceNew, str, iGProGetChannelDraftCallback);
    }

    public static void $default$getChannelRecommendFeeds(IKernelFeedServiceNew iKernelFeedServiceNew, GProStGetChannelFeedsReq gProStGetChannelFeedsReq, IGProGetChannelTimelineFeedsCallback iGProGetChannelTimelineFeedsCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            return;
        }
        iPatchRedirector.redirect((short) 9, iKernelFeedServiceNew, gProStGetChannelFeedsReq, iGProGetChannelTimelineFeedsCallback);
    }

    public static void $default$getChannelTimelineFeeds(IKernelFeedServiceNew iKernelFeedServiceNew, GProStGetChannelFeedsReq gProStGetChannelFeedsReq, IGProGetChannelTimelineFeedsCallback iGProGetChannelTimelineFeedsCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            return;
        }
        iPatchRedirector.redirect((short) 8, iKernelFeedServiceNew, gProStGetChannelFeedsReq, iGProGetChannelTimelineFeedsCallback);
    }

    public static void $default$getDetailRecommendFeeds(IKernelFeedServiceNew iKernelFeedServiceNew, GProGetDetailRecommendFeedsReq gProGetDetailRecommendFeedsReq, IGProGetDetailRecommendFeedsCallback iGProGetDetailRecommendFeedsCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) {
            return;
        }
        iPatchRedirector.redirect((short) 30, iKernelFeedServiceNew, gProGetDetailRecommendFeedsReq, iGProGetDetailRecommendFeedsCallback);
    }

    public static void $default$getFeedComments(IKernelFeedServiceNew iKernelFeedServiceNew, GProStGetFeedCommentsReq gProStGetFeedCommentsReq, IGProGetFeedCommentsCallback iGProGetFeedCommentsCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            return;
        }
        iPatchRedirector.redirect((short) 12, iKernelFeedServiceNew, gProStGetFeedCommentsReq, iGProGetFeedCommentsCallback);
    }

    public static void $default$getFeedCount(IKernelFeedServiceNew iKernelFeedServiceNew, GProGetFeedCountReq gProGetFeedCountReq, IGProGetFeedCountCallback iGProGetFeedCountCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) {
            return;
        }
        iPatchRedirector.redirect((short) 3, iKernelFeedServiceNew, gProGetFeedCountReq, iGProGetFeedCountCallback);
    }

    public static void $default$getFeedDetail(IKernelFeedServiceNew iKernelFeedServiceNew, GProStGetFeedDetailReq gProStGetFeedDetailReq, IGProGetFeedDetailCallback iGProGetFeedDetailCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            return;
        }
        iPatchRedirector.redirect((short) 11, iKernelFeedServiceNew, gProStGetFeedDetailReq, iGProGetFeedDetailCallback);
    }

    public static void $default$getFeedDetailWithHotComments(IKernelFeedServiceNew iKernelFeedServiceNew, GProStGetFeedDetailReq gProStGetFeedDetailReq, IGProGetFeedDetailWithHotCommentsCallback iGProGetFeedDetailWithHotCommentsCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            return;
        }
        iPatchRedirector.redirect((short) 13, iKernelFeedServiceNew, gProStGetFeedDetailReq, iGProGetFeedDetailWithHotCommentsCallback);
    }

    public static void $default$getFeeds(IKernelFeedServiceNew iKernelFeedServiceNew, GProGetFeedsReq gProGetFeedsReq, IGProgetFeedsCallback iGProgetFeedsCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) {
            return;
        }
        iPatchRedirector.redirect((short) 23, iKernelFeedServiceNew, gProGetFeedsReq, iGProgetFeedsCallback);
    }

    public static void $default$getFeedsByIndex(IKernelFeedServiceNew iKernelFeedServiceNew, GProGetFeedsByIndexReq gProGetFeedsByIndexReq, IGProGetFeedsByIndexCallback iGProGetFeedsByIndexCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) {
            return;
        }
        iPatchRedirector.redirect((short) 24, iKernelFeedServiceNew, gProGetFeedsByIndexReq, iGProGetFeedsByIndexCallback);
    }

    public static void $default$getGuildFeeds(IKernelFeedServiceNew iKernelFeedServiceNew, GProGetGuildFeedsReq gProGetGuildFeedsReq, IGProGetGuildFeedsCallback iGProGetGuildFeedsCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) {
            return;
        }
        iPatchRedirector.redirect((short) 27, iKernelFeedServiceNew, gProGetGuildFeedsReq, iGProGetGuildFeedsCallback);
    }

    public static void $default$getNextPageReplies(IKernelFeedServiceNew iKernelFeedServiceNew, GProGetNextPageRepliesReq gProGetNextPageRepliesReq, IGProgetNextPageRepliesCallback iGProgetNextPageRepliesCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) {
            return;
        }
        iPatchRedirector.redirect((short) 22, iKernelFeedServiceNew, gProGetNextPageRepliesReq, iGProgetNextPageRepliesCallback);
    }

    public static void $default$getTopFeedConfig(IKernelFeedServiceNew iKernelFeedServiceNew, GProGetTopFeedConfigReq gProGetTopFeedConfigReq, IGProGetTopFeedConfigCallback iGProGetTopFeedConfigCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) {
            return;
        }
        iPatchRedirector.redirect((short) 28, iKernelFeedServiceNew, gProGetTopFeedConfigReq, iGProGetTopFeedConfigCallback);
    }

    public static void $default$getTopFeeds(IKernelFeedServiceNew iKernelFeedServiceNew, GProGetTopFeedsReq gProGetTopFeedsReq, IGProGetTopFeedsCallback iGProGetTopFeedsCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) {
            return;
        }
        iPatchRedirector.redirect((short) 29, iKernelFeedServiceNew, gProGetTopFeedsReq, iGProGetTopFeedsCallback);
    }

    public static void $default$getTopicFeeds(IKernelFeedServiceNew iKernelFeedServiceNew, GProGetTopicFeedsReq gProGetTopicFeedsReq, IGProGetTopicFeedsCallback iGProGetTopicFeedsCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) {
            return;
        }
        iPatchRedirector.redirect((short) 31, iKernelFeedServiceNew, gProGetTopicFeedsReq, iGProGetTopicFeedsCallback);
    }

    public static void $default$impeach(IKernelFeedServiceNew iKernelFeedServiceNew, GProImpeachReq gProImpeachReq, IGProImpeachCallback iGProImpeachCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            return;
        }
        iPatchRedirector.redirect((short) 18, iKernelFeedServiceNew, gProImpeachReq, iGProImpeachCallback);
    }

    public static void $default$moveFeed(IKernelFeedServiceNew iKernelFeedServiceNew, GProMoveFeedReq gProMoveFeedReq, IGProMoveFeedCallback iGProMoveFeedCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            return;
        }
        iPatchRedirector.redirect((short) 6, iKernelFeedServiceNew, gProMoveFeedReq, iGProMoveFeedCallback);
    }

    public static void $default$publishFeed(IKernelFeedServiceNew iKernelFeedServiceNew, GProStPublishFeedReq gProStPublishFeedReq, IGPropublishFeedCallback iGPropublishFeedCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            return;
        }
        iPatchRedirector.redirect((short) 10, iKernelFeedServiceNew, gProStPublishFeedReq, iGPropublishFeedCallback);
    }

    public static void $default$removeKernelFeedListener(IKernelFeedServiceNew iKernelFeedServiceNew, long j) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, iKernelFeedServiceNew, j);
    }

    public static void $default$searchTopic(IKernelFeedServiceNew iKernelFeedServiceNew, GProSearchTopicReq gProSearchTopicReq, IGProSearchTopicCallback iGProSearchTopicCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) {
            return;
        }
        iPatchRedirector.redirect((short) 32, iKernelFeedServiceNew, gProSearchTopicReq, iGProSearchTopicCallback);
    }

    public static void $default$setChannelDraft(IKernelFeedServiceNew iKernelFeedServiceNew, String str, String str2, IGproFeedOperateCallback iGproFeedOperateCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) {
            return;
        }
        iPatchRedirector.redirect((short) 26, iKernelFeedServiceNew, str, str2, iGproFeedOperateCallback);
    }

    public static void $default$topFeedAction(IKernelFeedServiceNew iKernelFeedServiceNew, GProTopFeedActionReq gProTopFeedActionReq, IGProTopFeedActionCallback iGProTopFeedActionCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            return;
        }
        iPatchRedirector.redirect((short) 5, iKernelFeedServiceNew, gProTopFeedActionReq, iGProTopFeedActionCallback);
    }

    public static void $default$unDoDelFeed(IKernelFeedServiceNew iKernelFeedServiceNew, GProUnDoDelFeedReq gProUnDoDelFeedReq, IGProUnDoDelFeedCallback iGProUnDoDelFeedCallback) {
        IPatchRedirector iPatchRedirector = IKernelFeedServiceNew.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) {
            return;
        }
        iPatchRedirector.redirect((short) 19, iKernelFeedServiceNew, gProUnDoDelFeedReq, iGProUnDoDelFeedCallback);
    }
}
