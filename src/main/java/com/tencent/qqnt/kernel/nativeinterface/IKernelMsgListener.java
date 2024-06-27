package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelMsgListener.class */
public interface IKernelMsgListener {
    void onAddSendMsg(MsgRecord msgRecord);

    void onContactUnreadCntUpdate(HashMap<Integer, HashMap<String, UnreadCntInfo>> hashMap);

    void onCustomWithdrawConfigUpdate(CustomWithdrawConfig customWithdrawConfig);

    void onDraftUpdate(Contact contact, ArrayList<MsgElement> arrayList, long j);

    void onEmojiDownloadComplete(EmojiNotifyInfo emojiNotifyInfo);

    void onEmojiResourceUpdate(EmojiResourceInfo emojiResourceInfo);

    void onFileMsgCome(ArrayList<MsgRecord> arrayList);

    void onGrabPasswordRedBag(int i, String str, int i2, RecvdOrder recvdOrder, MsgRecord msgRecord);

    void onGroupFileInfoAdd(GroupItem groupItem);

    void onGroupFileInfoUpdate(GroupFileListResult groupFileListResult);

    void onGroupTransferInfoAdd(GroupItem groupItem);

    void onGroupTransferInfoUpdate(GroupFileListResult groupFileListResult);

    void onHitCsRelatedEmojiResult(DownloadRelateEmojiResultInfo downloadRelateEmojiResultInfo);

    void onHitEmojiKeywordResult(HitRelatedEmojiWordsResult hitRelatedEmojiWordsResult);

    void onHitRelatedEmojiResult(RelatedWordEmojiInfo relatedWordEmojiInfo);

    void onImportOldDbProgressUpdate(ImportOldDbMsgNotifyInfo importOldDbMsgNotifyInfo);

    void onInputStatusPush(InputStatusInfo inputStatusInfo);

    void onKickedOffLine(KickedInfo kickedInfo);

    void onLineDev(ArrayList<DevInfo> arrayList);

    void onLogLevelChanged(long j);

    void onMsgBoxChanged(ArrayList<ContactMsgBoxInfo> arrayList);

    void onMsgDelete(Contact contact, ArrayList<Long> arrayList);

    void onMsgInfoListAdd(ArrayList<MsgRecord> arrayList);

    void onMsgInfoListUpdate(ArrayList<MsgRecord> arrayList);

    void onMsgQRCodeStatusChanged(int i);

    void onMsgRecall(int i, String str, long j);

    void onMsgSecurityNotify(MsgRecord msgRecord);

    void onMsgSettingUpdate(MsgSetting msgSetting);

    void onMsgWithRichLinkInfoUpdate(ArrayList<MsgRecord> arrayList);

    void onNtFirstViewMsgSyncEnd();

    void onNtMsgSyncEnd();

    void onNtMsgSyncStart();

    void onRecvMsg(ArrayList<MsgRecord> arrayList);

    void onRecvMsgSvrRspTransInfo(long j, Contact contact, int i, int i2, String str, byte[] bArr);

    void onRecvOnlineFileMsg(ArrayList<MsgRecord> arrayList);

    void onRecvSysMsg(ArrayList<Byte> arrayList);

    void onRedTouchChanged();

    void onRichMediaDownloadComplete(FileTransNotifyInfo fileTransNotifyInfo);

    void onRichMediaProgerssUpdate(FileTransNotifyInfo fileTransNotifyInfo);

    void onRichMediaUploadComplete(FileTransNotifyInfo fileTransNotifyInfo);

    void onSearchGroupFileInfoUpdate(SearchGroupFileResult searchGroupFileResult);

    void onSendMsgError(long j, Contact contact, int i, String str);

    void onSysMsgNotification(int i, long j, long j2, boolean z, ArrayList<Byte> arrayList);

    void onTempChatInfoUpdate(TempChatInfo tempChatInfo);

    void onUserChannelTabStatusChanged(boolean z);

    void onUserOnlineStatusChanged(boolean z);

    void onUserSecQualityChanged(QueryUserSecQualityRsp queryUserSecQualityRsp);

    void onUserTabStatusChanged(ArrayList<TabStatusInfo> arrayList);

    void onlineStatusBigIconDownloadPush(int i, long j, String str);

    void onlineStatusSmallIconDownloadPush(int i, long j, String str);
}
