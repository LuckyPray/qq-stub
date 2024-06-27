package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import com.tencent.qqnt.kernelpublic.nativeinterface.JsonGrayElement;
import com.tencent.qqnt.kernelpublic.nativeinterface.LocalGrayTipElement;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: IKernelMsgService.java */
/* renamed from: com.tencent.qqnt.kernel.nativeinterface.ag */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ag.class */
public final /* synthetic */ class C0007ag {
    public static void $default$JoinDragonGroupEmoji(IKernelMsgService iKernelMsgService, JoinDragonGroupEmojiReq joinDragonGroupEmojiReq, IJoinDragonGroupCallback iJoinDragonGroupCallback) {
    }

    public static void $default$addFavEmoji(IKernelMsgService iKernelMsgService, AddFavEmojiReq addFavEmojiReq, IAddFavEmojiCallback iAddFavEmojiCallback) {
    }

    public static void $default$addLocalAVRecordMsg(IKernelMsgService iKernelMsgService, Contact contact, LocalAVRecordElement localAVRecordElement, IOperateCallback iOperateCallback) {
    }

    public static void $default$addLocalGrayTipMsg(IKernelMsgService iKernelMsgService, Contact contact, LocalGrayTipElement localGrayTipElement, boolean z, IOperateCallback iOperateCallback) {
    }

    public static void $default$addLocalJsonGrayTipMsg(IKernelMsgService iKernelMsgService, Contact contact, JsonGrayElement jsonGrayElement, boolean z, boolean z2, IAddJsonGrayTipMsgCallback iAddJsonGrayTipMsgCallback) {
    }

    public static void $default$addLocalJsonGrayTipMsgExt(IKernelMsgService iKernelMsgService, Contact contact, JsonGrayMsgInfo jsonGrayMsgInfo, JsonGrayElement jsonGrayElement, boolean z, boolean z2, IAddJsonGrayTipMsgCallback iAddJsonGrayTipMsgCallback) {
    }

    public static void $default$addLocalRecordMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, MsgElement msgElement, HashMap hashMap, boolean z, IOperateCallback iOperateCallback) {
    }

    public static void $default$addLocalRecordMsgWithExtInfos(IKernelMsgService iKernelMsgService, Contact contact, long j, AddLocalRecordMsgParams addLocalRecordMsgParams, IOperateCallback iOperateCallback) {
    }

    public static void $default$addLocalTofuRecordMsg(IKernelMsgService iKernelMsgService, Contact contact, TofuRecordElement tofuRecordElement, IOperateCallback iOperateCallback) {
    }

    public static void $default$addRecentUsedFace(IKernelMsgService iKernelMsgService, ArrayList arrayList) {
    }

    public static void $default$addSendMsg(IKernelMsgService iKernelMsgService, long j, Contact contact, ArrayList arrayList, HashMap hashMap) {
    }

    public static void $default$canImportOldDbMsg(IKernelMsgService iKernelMsgService, ICanImportCallback iCanImportCallback) {
    }

    public static void $default$canProcessDataMigration(IKernelMsgService iKernelMsgService, ICanImportCallback iCanImportCallback) {
    }

    public static void $default$cancelGetRichMediaElement(IKernelMsgService iKernelMsgService, RichMediaElementGetReq richMediaElementGetReq) {
    }

    public static void $default$cancelSendMsg(IKernelMsgService iKernelMsgService, Contact contact, long j) {
    }

    public static void $default$checkMsgWithUrl(IKernelMsgService iKernelMsgService, CheckUrlInfo checkUrlInfo, ICheckMsgWithUrlCallback iCheckMsgWithUrlCallback) {
    }

    public static void $default$checkTabListStatus(IKernelMsgService iKernelMsgService, IOperateCallback iOperateCallback) {
    }

    public static void $default$clearMsgRecords(IKernelMsgService iKernelMsgService, Contact contact, IClearMsgRecordsCallback iClearMsgRecordsCallback) {
    }

    public static void $default$clickInlineKeyboardButton(IKernelMsgService iKernelMsgService, InlineKeyboardClickInfo inlineKeyboardClickInfo, IClickInlineKeyboardButtonCallback iClickInlineKeyboardButtonCallback) {
    }

    public static void $default$dataMigrationGetDataAvaiableContactList(IKernelMsgService iKernelMsgService, IDataMigrationGetAvailableContactListCallback iDataMigrationGetAvailableContactListCallback) {
    }

    public static void $default$dataMigrationSetIOSPathPrefix(IKernelMsgService iKernelMsgService, String str) {
    }

    public static void $default$dataMigrationStopOperation(IKernelMsgService iKernelMsgService, long j) {
    }

    public static void $default$delRecentHiddenSession(IKernelMsgService iKernelMsgService, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$deleteAllRoamMsgs(IKernelMsgService iKernelMsgService, int i, String str, IOperateCallback iOperateCallback) {
    }

    public static void $default$deleteDraft(IKernelMsgService iKernelMsgService, Contact contact, IOperateCallback iOperateCallback) {
    }

    public static void $default$deleteFavEmoji(IKernelMsgService iKernelMsgService, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$deleteMsg(IKernelMsgService iKernelMsgService, Contact contact, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$deleteReplyDraft(IKernelMsgService iKernelMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$downloadEmojiPic(IKernelMsgService iKernelMsgService, int i, ArrayList arrayList, int i2, HashMap hashMap) {
    }

    public static void $default$downloadOnlineStatusBigIconByUrl(IKernelMsgService iKernelMsgService, int i, String str) {
    }

    public static void $default$downloadOnlineStatusCommonByUrl(IKernelMsgService iKernelMsgService, String str, String str2, IDownloadCommonStatusCallback iDownloadCommonStatusCallback) {
    }

    public static void $default$downloadOnlineStatusSmallIconByUrl(IKernelMsgService iKernelMsgService, int i, String str) {
    }

    public static void $default$downloadRichMedia(IKernelMsgService iKernelMsgService, RichMediaElementGetReq richMediaElementGetReq) {
    }

    public static void $default$enterOrExitAio(IKernelMsgService iKernelMsgService, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$feedBackReportForMsg(IKernelMsgService iKernelMsgService, Contact contact, FeedBackMsgInfo feedBackMsgInfo, FeedBackDataForMsg feedBackDataForMsg, IOperateCallback iOperateCallback) {
    }

    public static void $default$fetchFavEmojiList(IKernelMsgService iKernelMsgService, String str, int i, boolean z, boolean z2, IFetchFavEmojiListCallback iFetchFavEmojiListCallback) {
    }

    public static void $default$fetchGetHitEmotionsByWord(IKernelMsgService iKernelMsgService, RelatedEmotionWordsInfo relatedEmotionWordsInfo, IFetchGetHitEmotionsByWordCallback iFetchGetHitEmotionsByWordCallback) {
    }

    public static void $default$fetchLongMsg(IKernelMsgService iKernelMsgService, Contact contact, long j) {
    }

    public static void $default$fetchLongMsgWithCb(IKernelMsgService iKernelMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$fetchMarketEmoticonAioImage(IKernelMsgService iKernelMsgService, MarketEmoticonAioImageReq marketEmoticonAioImageReq, IOperateCallback iOperateCallback) {
    }

    public static void $default$fetchMarketEmoticonAuthDetail(IKernelMsgService iKernelMsgService, MarketEmoticonAuthDetailReq marketEmoticonAuthDetailReq, IOperateCallback iOperateCallback) {
    }

    public static void $default$fetchMarketEmoticonFaceImages(IKernelMsgService iKernelMsgService, ArrayList arrayList) {
    }

    public static void $default$fetchMarketEmoticonList(IKernelMsgService iKernelMsgService, int i, int i2, IFetchMarketEmoticonListCallback iFetchMarketEmoticonListCallback) {
    }

    public static void $default$fetchMarketEmoticonShowImage(IKernelMsgService iKernelMsgService, MarketEmoticonShowImageReq marketEmoticonShowImageReq, IOperateCallback iOperateCallback) {
    }

    public static void $default$fetchMarketEmotionJsonFile(IKernelMsgService iKernelMsgService, int i, IOperateCallback iOperateCallback) {
    }

    public static void $default$fetchStatusMgrInfo(IKernelMsgService iKernelMsgService, IGetStatusMsgCallback iGetStatusMsgCallback) {
    }

    public static void $default$fetchStatusUnitedConfigInfo(IKernelMsgService iKernelMsgService, IGetStatusMsgCallback iGetStatusMsgCallback) {
    }

    public static void $default$forwardFile(IKernelMsgService iKernelMsgService, TargetFileInfo targetFileInfo, Contact contact, IOperateCallback iOperateCallback) {
    }

    public static void $default$forwardMsg(IKernelMsgService iKernelMsgService, ArrayList arrayList, Contact contact, ArrayList arrayList2, HashMap hashMap, IForwardOperateCallback iForwardOperateCallback) {
    }

    public static void $default$forwardMsgWithComment(IKernelMsgService iKernelMsgService, ArrayList arrayList, Contact contact, ArrayList arrayList2, ArrayList arrayList3, HashMap hashMap, IForwardOperateCallback iForwardOperateCallback) {
    }

    public static void $default$forwardRichMsgInVist(IKernelMsgService iKernelMsgService, ArrayList arrayList, ArrayList arrayList2, IForwardOperateCallback iForwardOperateCallback) {
    }

    public static void $default$forwardSubMsgWithComment(IKernelMsgService iKernelMsgService, ArrayList arrayList, ArrayList arrayList2, Contact contact, ArrayList arrayList3, ArrayList arrayList4, HashMap hashMap, IForwardOperateCallback iForwardOperateCallback) {
    }

    public static void $default$getABatchOfContactMsgBoxInfo(IKernelMsgService iKernelMsgService, ArrayList arrayList, IGetMsgsBoxesCallback iGetMsgsBoxesCallback) {
    }

    public static void $default$getAioFirstViewLatestMsgs(IKernelMsgService iKernelMsgService, Contact contact, int i, IGetAioFirstViewLatestMsgCallback iGetAioFirstViewLatestMsgCallback) {
    }

    public static void $default$getAllOnlineFileMsgs(IKernelMsgService iKernelMsgService, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getAutoReplyTextList(IKernelMsgService iKernelMsgService, IGetAutoReplyTextListCallback iGetAutoReplyTextListCallback) {
    }

    public static void $default$getBookmarkData(IKernelMsgService iKernelMsgService, String str, IBookmarkStorageGetCallback iBookmarkStorageGetCallback) {
    }

    public static void $default$getContactUnreadCnt(IKernelMsgService iKernelMsgService, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$getCurHiddenSession(IKernelMsgService iKernelMsgService, IOperateHiddenSessionCallback iOperateHiddenSessionCallback) {
    }

    public static void $default$getDraft(IKernelMsgService iKernelMsgService, Contact contact, IGetDraftOperateCallback iGetDraftOperateCallback) {
    }

    public static void $default$getEmojiResourcePath(IKernelMsgService iKernelMsgService, int i, IGetEmojiResourcePathCallback iGetEmojiResourcePathCallback) {
    }

    public static void $default$getFavMarketEmoticonInfo(IKernelMsgService iKernelMsgService, int i, String str, IGetFavMarketEmoticonInfoCallback iGetFavMarketEmoticonInfoCallback) {
    }

    public static void $default$getFirstUnreadAtMsg(IKernelMsgService iKernelMsgService, Contact contact, IGetFirstUnreadAtMsgCallback iGetFirstUnreadAtMsgCallback) {
    }

    public static void $default$getFirstUnreadAtallMsg(IKernelMsgService iKernelMsgService, Contact contact, IFetchChannelLatestSeqCallback iFetchChannelLatestSeqCallback) {
    }

    public static void $default$getFirstUnreadAtmeMsg(IKernelMsgService iKernelMsgService, Contact contact, IFetchChannelLatestSeqCallback iFetchChannelLatestSeqCallback) {
    }

    public static void $default$getFirstUnreadMsgSeq(IKernelMsgService iKernelMsgService, Contact contact, IGetMsgSeqCallback iGetMsgSeqCallback) {
    }

    public static void $default$getHotPicHotWords(IKernelMsgService iKernelMsgService, EmojiHotPicGetHotWordsReqBody emojiHotPicGetHotWordsReqBody, IEmojiGetHotPicHotWordsResultCallback iEmojiGetHotPicHotWordsResultCallback) {
    }

    public static void $default$getHotPicInfoListSearchString(IKernelMsgService iKernelMsgService, String str, String str2, int i, int i2, boolean z, IGetHotPicInfoListCallback iGetHotPicInfoListCallback) {
    }

    public static void $default$getHotPicJumpInfo(IKernelMsgService iKernelMsgService, EmojiHotPicGetJumpInfoReqBody emojiHotPicGetJumpInfoReqBody, IEmojiHotPicGetJumpInfoResultCallback iEmojiHotPicGetJumpInfoResultCallback) {
    }

    public static void $default$getHotPicSearchResult(IKernelMsgService iKernelMsgService, EmojiHotPicSearchReqBody emojiHotPicSearchReqBody, IEmojiGetHotPicSearchResultCallback iEmojiGetHotPicSearchResultCallback) {
    }

    public static void $default$getKeyWordRelatedEmoji(IKernelMsgService iKernelMsgService, KeyWordRelatedEmojiInfo keyWordRelatedEmojiInfo, IOperateCallback iOperateCallback) {
    }

    public static void $default$getLastMessageList(IKernelMsgService iKernelMsgService, ArrayList arrayList, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getLatestDbMsgs(IKernelMsgService iKernelMsgService, Contact contact, int i, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getMarketEmoticonEncryptKeys(IKernelMsgService iKernelMsgService, int i, ArrayList arrayList, IGetMarketEmoticonEncryptKeysCallback iGetMarketEmoticonEncryptKeysCallback) {
    }

    public static void $default$getMarketEmoticonPath(IKernelMsgService iKernelMsgService, int i, ArrayList arrayList, MarketEmojiPathServiceType marketEmojiPathServiceType, IGetMarketEmoticonPathCallback iGetMarketEmoticonPathCallback) {
    }

    public static void $default$getMiscData(IKernelMsgService iKernelMsgService, String str, IGProMiscStorageGetCallback iGProMiscStorageGetCallback) {
    }

    public static void $default$getMqqDataImportTableNames(IKernelMsgService iKernelMsgService, IDataImportTableNamesCallback iDataImportTableNamesCallback) {
    }

    public static void $default$getMsgAbstract(IKernelMsgService iKernelMsgService, Contact contact, long j, IGetMsgAbstractsCallback iGetMsgAbstractsCallback) {
    }

    public static void $default$getMsgByClientSeqAndTime(IKernelMsgService iKernelMsgService, Contact contact, long j, long j2, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getMsgEmojiLikesList(IKernelMsgService iKernelMsgService, Contact contact, long j, String str, long j2, String str2, boolean z, int i, IGetMsgEmojiLikesListCallback iGetMsgEmojiLikesListCallback) {
    }

    public static void $default$getMsgEventFlow(IKernelMsgService iKernelMsgService, Contact contact) {
    }

    public static void $default$getMsgQRCode(IKernelMsgService iKernelMsgService, IGetMsgQRCodeCallback iGetMsgQRCodeCallback) {
    }

    public static void $default$getMsgSetting(IKernelMsgService iKernelMsgService, IOperateCallback iOperateCallback) {
    }

    public static void $default$getMsgWithAbstractByFilterParam(IKernelMsgService iKernelMsgService, Contact contact, long j, long j2, int i, MsgFilterParams msgFilterParams, IGetMsgWithAbstractCallback iGetMsgWithAbstractCallback) {
    }

    public static void $default$getMsgs(IKernelMsgService iKernelMsgService, Contact contact, long j, int i, boolean z, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getMsgsByMsgId(IKernelMsgService iKernelMsgService, Contact contact, ArrayList arrayList, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getMsgsBySeqAndCount(IKernelMsgService iKernelMsgService, Contact contact, long j, int i, boolean z, boolean z2, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getMsgsByTypeFilter(IKernelMsgService iKernelMsgService, Contact contact, long j, ArrayList arrayList, int i, boolean z, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getMsgsByTypeFilters(IKernelMsgService iKernelMsgService, Contact contact, long j, int i, boolean z, ArrayList arrayList, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getMsgsExt(IKernelMsgService iKernelMsgService, MsgsReq msgsReq, IMsgsRspOperateCallback iMsgsRspOperateCallback) {
    }

    public static void $default$getMsgsIncludeSelf(IKernelMsgService iKernelMsgService, Contact contact, long j, int i, boolean z, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getMsgsWithMsgTimeAndClientSeqForC2C(IKernelMsgService iKernelMsgService, Contact contact, long j, long j2, int i, boolean z, boolean z2, boolean z3, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getMsgsWithStatus(IKernelMsgService iKernelMsgService, GetMsgsAndStatusRecord getMsgsAndStatusRecord, IGetMsgWithStatusCallback iGetMsgWithStatusCallback) {
    }

    public static void $default$getMultiMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, long j2, IGetMultiMsgCallback iGetMultiMsgCallback) {
    }

    public static void $default$getOnLineDev(IKernelMsgService iKernelMsgService, IOperateCallback iOperateCallback) {
    }

    public static void $default$getOnlineFileMsgs(IKernelMsgService iKernelMsgService, Contact contact, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getOnlineStatusBigIconBasePath(IKernelMsgService iKernelMsgService, IGetStatusMsgCallback iGetStatusMsgCallback) {
    }

    public static void $default$getOnlineStatusCommonFileNameByUrl(IKernelMsgService iKernelMsgService, String str, IGetStatusMsgCallback iGetStatusMsgCallback) {
    }

    public static void $default$getOnlineStatusCommonPath(IKernelMsgService iKernelMsgService, String str, IGetStatusMsgCallback iGetStatusMsgCallback) {
    }

    public static void $default$getOnlineStatusSmallIconBasePath(IKernelMsgService iKernelMsgService, IGetStatusMsgCallback iGetStatusMsgCallback) {
    }

    public static void $default$getOnlineStatusSmallIconFileNameByUrl(IKernelMsgService iKernelMsgService, String str, IGetStatusMsgCallback iGetStatusMsgCallback) {
    }

    public static void $default$getRecallMsgsByMsgId(IKernelMsgService iKernelMsgService, Contact contact, ArrayList arrayList, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getRecentEmojiList(IKernelMsgService iKernelMsgService, int i, IGetRecentUseEmojiListCallback iGetRecentUseEmojiListCallback) {
    }

    public static void $default$getRecentHiddenSesionList(IKernelMsgService iKernelMsgService, IOperateHiddenSessionCallback iOperateHiddenSessionCallback) {
    }

    public static void $default$getRecentUseEmojiList(IKernelMsgService iKernelMsgService, IGetRecentUseEmojiListCallback iGetRecentUseEmojiListCallback) {
    }

    public static void $default$getRecentUsedFaceList(IKernelMsgService iKernelMsgService, int i, IGetRecentUsedFaceListCallback iGetRecentUsedFaceListCallback) {
    }

    public static void $default$getReplyDraft(IKernelMsgService iKernelMsgService, Contact contact, long j, IGetDraftOperateCallback iGetDraftOperateCallback) {
    }

    public static void $default$getRichMediaElement(IKernelMsgService iKernelMsgService, RichMediaElementGetReq richMediaElementGetReq) {
    }

    public static void $default$getServiceAssistantSwitch(IKernelMsgService iKernelMsgService, GetServiceAssistantSwitchReq getServiceAssistantSwitchReq, IGetServiceAssistantSwitchCallback iGetServiceAssistantSwitchCallback) {
    }

    public static void $default$getSingleMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getSourceOfReplyMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, long j2, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getSourceOfReplyMsgByClientSeqAndTime(IKernelMsgService iKernelMsgService, Contact contact, long j, long j2, long j3, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getSourceOfReplyMsgV2(IKernelMsgService iKernelMsgService, Contact contact, long j, long j2, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getTempChatInfo(IKernelMsgService iKernelMsgService, int i, String str, IGetTempChatInfoCallback iGetTempChatInfoCallback) {
    }

    public static void $default$grabRedBag(IKernelMsgService iKernelMsgService, GrabRedBagReq grabRedBagReq, IGrabRedBagCallback iGrabRedBagCallback) {
    }

    public static void $default$importDataLineMsg(IKernelMsgService iKernelMsgService) {
    }

    public static void $default$importOldDbMsg(IKernelMsgService iKernelMsgService, IOperateCallback iOperateCallback) {
    }

    public static void $default$insertMsgToMsgBox(IKernelMsgService iKernelMsgService, Contact contact, long j, int i, IOperateCallback iOperateCallback) {
    }

    public static void $default$isHitEmojiKeyword(IKernelMsgService iKernelMsgService, RelatedEmotionWordsInfo relatedEmotionWordsInfo, IOperateCallback iOperateCallback) {
    }

    public static void $default$isMqqDataImportFinished(IKernelMsgService iKernelMsgService, IOperateCallback iOperateCallback) {
    }

    public static void $default$isMsgMatched(IKernelMsgService iKernelMsgService, MatchKey matchKey, IMatchedOperateCallback iMatchedOperateCallback) {
    }

    public static void $default$kickOffLine(IKernelMsgService iKernelMsgService, DevInfo devInfo, IOperateCallback iOperateCallback) {
    }

    public static void $default$likeOrDislikeReportForMsg(IKernelMsgService iKernelMsgService, Contact contact, FeedBackMsgInfo feedBackMsgInfo, FeedBackDataForMsg feedBackDataForMsg, IOperateCallback iOperateCallback) {
    }

    public static void $default$modifyFavEmojiDesc(IKernelMsgService iKernelMsgService, ArrayList arrayList, IModifyFavEmojiDescCallback iModifyFavEmojiDescCallback) {
    }

    public static void $default$multiForwardMsg(IKernelMsgService iKernelMsgService, ArrayList arrayList, Contact contact, Contact contact2, IOperateCallback iOperateCallback) {
    }

    public static void $default$multiForwardMsgWithComment(IKernelMsgService iKernelMsgService, ArrayList arrayList, Contact contact, Contact contact2, ArrayList arrayList2, HashMap hashMap, IOperateCallback iOperateCallback) {
    }

    public static void $default$packRedBag(IKernelMsgService iKernelMsgService, PackRedBagReq packRedBagReq, IPackRedBagCallback iPackRedBagCallback) {
    }

    public static void $default$prepareTempChat(IKernelMsgService iKernelMsgService, TempChatPrepareInfo tempChatPrepareInfo, IOperateCallback iOperateCallback) {
    }

    public static void $default$pullDetail(IKernelMsgService iKernelMsgService, PullDetailReq pullDetailReq, IPullDetailCallback iPullDetailCallback) {
    }

    public static void $default$pullRedBagPasswordList(IKernelMsgService iKernelMsgService, IPullRedBagPasswordListCallback iPullRedBagPasswordListCallback) {
    }

    public static void $default$queryArkInfo(IKernelMsgService iKernelMsgService, QueryArkInfoReq queryArkInfoReq, IKernelQueryArkInfoCallback iKernelQueryArkInfoCallback) {
    }

    public static void $default$queryCalendar(IKernelMsgService iKernelMsgService, Contact contact, long j, IQueryCalendarCallback iQueryCalendarCallback) {
    }

    public static void $default$queryEmoticonMsgs(IKernelMsgService iKernelMsgService, long j, long j2, long j3, QueryMsgsParams queryMsgsParams, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$queryFavEmojiByDesc(IKernelMsgService iKernelMsgService, String str, IFetchFavEmojiListCallback iFetchFavEmojiListCallback) {
    }

    public static void $default$queryFileMsgsDesktop(IKernelMsgService iKernelMsgService, long j, long j2, long j3, QueryMsgsParams queryMsgsParams, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$queryFirstMsgSeq(IKernelMsgService iKernelMsgService, Contact contact, long j, IQueryFirstMsgSeqCallback iQueryFirstMsgSeqCallback) {
    }

    public static void $default$queryFirstRoamMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, IQueryFirstRoamMsgCallback iQueryFirstRoamMsgCallback) {
    }

    public static void $default$queryMsgsAndAbstractsWithFilter(IKernelMsgService iKernelMsgService, long j, long j2, long j3, QueryMsgsParams queryMsgsParams, IQueryMsgsAndAbstractsWithFilterCallback iQueryMsgsAndAbstractsWithFilterCallback) {
    }

    public static void $default$queryMsgsWithFilter(IKernelMsgService iKernelMsgService, long j, long j2, QueryMsgsParams queryMsgsParams, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$queryMsgsWithFilterEx(IKernelMsgService iKernelMsgService, long j, long j2, long j3, QueryMsgsParams queryMsgsParams, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$queryMsgsWithFilterVer2(IKernelMsgService iKernelMsgService, long j, long j2, QueryMsgsParams queryMsgsParams, IQueryMsgsWithFilterVer2Callback iQueryMsgsWithFilterVer2Callback) {
    }

    public static void $default$queryPicOrVideoMsgs(IKernelMsgService iKernelMsgService, long j, long j2, long j3, QueryMsgsParams queryMsgsParams, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$queryPicOrVideoMsgsDesktop(IKernelMsgService iKernelMsgService, ChatInfo chatInfo, MsgIdInfo msgIdInfo, int i, boolean z, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$queryRoamCalendar(IKernelMsgService iKernelMsgService, Contact contact, long j, IQueryCalendarCallback iQueryCalendarCallback) {
    }

    public static void $default$queryTroopEmoticonMsgs(IKernelMsgService iKernelMsgService, long j, long j2, long j3, QueryMsgsParams queryMsgsParams, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$queryUserSecQuality(IKernelMsgService iKernelMsgService, IQueryUserSecQualityCallback iQueryUserSecQualityCallback) {
    }

    public static void $default$recallMsg(IKernelMsgService iKernelMsgService, Contact contact, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$recordEmoji(IKernelMsgService iKernelMsgService, RecordType recordType, ArrayList arrayList) {
    }

    public static void $default$reeditRecallMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$refuseGetRichMediaElement(IKernelMsgService iKernelMsgService, RichMediaElementGetReq richMediaElementGetReq) {
    }

    public static void $default$refuseReceiveOnlineFileMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$regenerateMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$registerSysMsgNotification(IKernelMsgService iKernelMsgService, int i, long j, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$removeKernelMsgListener(IKernelMsgService iKernelMsgService, long j) {
    }

    public static void $default$removeKernelTempChatSigListener(IKernelMsgService iKernelMsgService, long j) {
    }

    public static void $default$renameAnonyChatNick(IKernelMsgService iKernelMsgService, String str, IRenameAnonymousChatNickCallback iRenameAnonymousChatNickCallback) {
    }

    public static void $default$reqToOfflineSendMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$requestTianshuAdv(IKernelMsgService iKernelMsgService, ArrayList arrayList, ITianShuGetAdvCallback iTianShuGetAdvCallback) {
    }

    public static void $default$resendMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$selectPasswordRedBag(IKernelMsgService iKernelMsgService, GrabRedBagReq grabRedBagReq) {
    }

    public static void $default$sendMsg(IKernelMsgService iKernelMsgService, long j, Contact contact, ArrayList arrayList, HashMap hashMap, IOperateCallback iOperateCallback) {
    }

    public static void $default$sendShowInputStatusReq(IKernelMsgService iKernelMsgService, int i, int i2, String str, IOperateCallback iOperateCallback) {
    }

    public static void $default$setAllC2CAndGroupMsgRead(IKernelMsgService iKernelMsgService, IOperateCallback iOperateCallback) {
    }

    public static void $default$setAutoReplyTextList(IKernelMsgService iKernelMsgService, ArrayList arrayList, int i, IOperateCallback iOperateCallback) {
    }

    public static void $default$setBookmarkData(IKernelMsgService iKernelMsgService, String str, String str2, IGProSimpleCallback iGProSimpleCallback) {
    }

    public static void $default$setContactLocalTop(IKernelMsgService iKernelMsgService, Contact contact, boolean z, IOperateCallback iOperateCallback) {
    }

    public static void $default$setCurHiddenSession(IKernelMsgService iKernelMsgService, RecentHiddenSesionInfo recentHiddenSesionInfo, IOperateCallback iOperateCallback) {
    }

    public static void $default$setCurOnScreenMsgForMsgEvent(IKernelMsgService iKernelMsgService, Contact contact, HashMap hashMap) {
    }

    public static void $default$setDraft(IKernelMsgService iKernelMsgService, Contact contact, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$setFocusOnBase(IKernelMsgService iKernelMsgService, Contact contact) {
    }

    public static void $default$setIKernelPublicAccountAdapter(IKernelMsgService iKernelMsgService, IKernelPublicAccountAdapter iKernelPublicAccountAdapter) {
    }

    public static void $default$setIsStopKernelFetchLongMsg(IKernelMsgService iKernelMsgService, boolean z, IOperateCallback iOperateCallback) {
    }

    public static void $default$setLocalMsgRead(IKernelMsgService iKernelMsgService, Contact contact, IOperateCallback iOperateCallback) {
    }

    public static void $default$setMarkUnreadFlag(IKernelMsgService iKernelMsgService, Contact contact, boolean z) {
    }

    public static void $default$setMiscData(IKernelMsgService iKernelMsgService, String str, String str2, IGProSimpleCallback iGProSimpleCallback) {
    }

    public static void $default$setMsgEmojiLikes(IKernelMsgService iKernelMsgService, Contact contact, long j, String str, long j2, boolean z, ISetMsgEmojiLikesCallback iSetMsgEmojiLikesCallback) {
    }

    public static void $default$setMsgEmojiLikesForRole(IKernelMsgService iKernelMsgService, Contact contact, long j, String str, long j2, long j3, long j4, boolean z, boolean z2, ISetMsgEmojiLikesForRoleCallback iSetMsgEmojiLikesForRoleCallback) {
    }

    public static void $default$setMsgRead(IKernelMsgService iKernelMsgService, Contact contact, IOperateCallback iOperateCallback) {
    }

    public static void $default$setMsgReadAndReport(IKernelMsgService iKernelMsgService, Contact contact, MsgRecord msgRecord, IOperateCallback iOperateCallback) {
    }

    public static void $default$setMsgReadByChatType(IKernelMsgService iKernelMsgService, int i, IOperateCallback iOperateCallback) {
    }

    public static void $default$setMsgRichInfoFlag(IKernelMsgService iKernelMsgService, boolean z) {
    }

    public static void $default$setMsgSetting(IKernelMsgService iKernelMsgService, MsgSetting msgSetting, IOperateCallback iOperateCallback) {
    }

    public static void $default$setPowerStatus(IKernelMsgService iKernelMsgService, boolean z) {
    }

    public static void $default$setPttPlayedState(IKernelMsgService iKernelMsgService, long j, Contact contact, long j2, IOperateCallback iOperateCallback) {
    }

    public static void $default$setRecentHiddenSession(IKernelMsgService iKernelMsgService, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$setReplyDraft(IKernelMsgService iKernelMsgService, Contact contact, long j, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$setServiceAssistantSwitch(IKernelMsgService iKernelMsgService, SetServiceAssistantSwitchReq setServiceAssistantSwitchReq, IOperateCallback iOperateCallback) {
    }

    public static void $default$setSpecificMsgReadAndReport(IKernelMsgService iKernelMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$setStatus(IKernelMsgService iKernelMsgService, StatusReq statusReq, IOperateCallback iOperateCallback) {
    }

    public static void $default$setSubscribeFolderUsingSmallRedPoint(IKernelMsgService iKernelMsgService, boolean z) {
    }

    public static void $default$setToken(IKernelMsgService iKernelMsgService, TokenInfo tokenInfo, IOperateCallback iOperateCallback) {
    }

    public static void $default$setTokenForMqq(IKernelMsgService iKernelMsgService, byte[] bArr, IOperateCallback iOperateCallback) {
    }

    public static void $default$startMsgSync(IKernelMsgService iKernelMsgService) {
    }

    public static void $default$stopGenerateMsg(IKernelMsgService iKernelMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$stopImportOldDbMsgAndroid(IKernelMsgService iKernelMsgService) {
    }

    public static void $default$switchAnonymousChat(IKernelMsgService iKernelMsgService, String str, boolean z, ISwitchAnonymousChatCallback iSwitchAnonymousChatCallback) {
    }

    public static void $default$switchBackGround(IKernelMsgService iKernelMsgService, BackGroundInfo backGroundInfo, IOperateCallback iOperateCallback) {
    }

    public static void $default$switchBackGroundForMqq(IKernelMsgService iKernelMsgService, byte[] bArr, IOperateCallback iOperateCallback) {
    }

    public static void $default$switchForeGround(IKernelMsgService iKernelMsgService, IOperateCallback iOperateCallback) {
    }

    public static void $default$switchForeGroundForMqq(IKernelMsgService iKernelMsgService, byte[] bArr, IOperateCallback iOperateCallback) {
    }

    public static void $default$switchToOfflineGetRichMediaElement(IKernelMsgService iKernelMsgService, RichMediaElementGetReq richMediaElementGetReq) {
    }

    public static void $default$switchToOfflineSendMsg(IKernelMsgService iKernelMsgService, Contact contact, long j) {
    }

    public static void $default$tianshuMultiReport(IKernelMsgService iKernelMsgService, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$tianshuReport(IKernelMsgService iKernelMsgService, TianShuReportData tianShuReportData, IOperateCallback iOperateCallback) {
    }

    public static void $default$translatePtt2Text(IKernelMsgService iKernelMsgService, long j, Contact contact, MsgElement msgElement, IOperateCallback iOperateCallback) {
    }

    public static void $default$unregisterSysMsgNotification(IKernelMsgService iKernelMsgService, int i, long j, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$updateAnonymousInfo(IKernelMsgService iKernelMsgService, String str, GroupAnonymousInfo groupAnonymousInfo) {
    }

    public static void $default$updateElementExtBufForUI(IKernelMsgService iKernelMsgService, Contact contact, long j, long j2, byte[] bArr, IOperateCallback iOperateCallback) {
    }

    public static void $default$updateMsgRecordExtPbBufForUI(IKernelMsgService iKernelMsgService, Contact contact, long j, byte[] bArr, IOperateCallback iOperateCallback) {
    }
}
