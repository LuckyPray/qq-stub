package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelBuddyService.class */
public interface IKernelBuddyService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelBuddyService$CppProxy.class */
    public static final class CppProxy implements IKernelBuddyService {
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

        private native void native_SetSpecialCare(long j, String str, SpecialCareSetting specialCareSetting, IOperateCallback iOperateCallback);

        private native void native_addCategory(long j, String str, IOperateCallback iOperateCallback);

        private native long native_addKernelBuddyListener(long j, IKernelBuddyListener iKernelBuddyListener);

        private native void native_approvalDoubtBuddyReq(long j, String str, Long l, String str2, IOperateCallback iOperateCallback);

        private native void native_approvalFriendRequest(long j, ApprovalBuddyRequest approvalBuddyRequest, IOperateCallback iOperateCallback);

        private native void native_clearBuddyReqUnreadCnt(long j, IOperateCallback iOperateCallback);

        private native void native_delAllDoubtBuddyReq(long j, IOperateCallback iOperateCallback);

        private native void native_delBatchBuddy(long j, ArrayList<DelBuddyInfo> arrayList, IOperateCallback iOperateCallback);

        private native void native_delBuddy(long j, DelBuddyInfo delBuddyInfo, IOperateCallback iOperateCallback);

        private native void native_delBuddyReq(long j, DelBuddyReqInfo delBuddyReqInfo, IOperateCallback iOperateCallback);

        private native void native_delCategory(long j, int i, IOperateCallback iOperateCallback);

        private native void native_delDoubtBuddyReq(long j, String str, IOperateCallback iOperateCallback);

        private native void native_getAddMeSetting(long j, IOperateCallback iOperateCallback);

        private native int native_getAllBuddyCount(long j);

        private native void native_getBuddyList(long j, boolean z, IOperateCallback iOperateCallback);

        private native ArrayList<BuddyListCategory> native_getBuddyListFromCache(long j, BuddyListReqType buddyListReqType);

        private native void native_getBuddyListV2(long j, boolean z, BuddyListReqType buddyListReqType, IBuddyListCallback iBuddyListCallback);

        private native HashMap<String, String> native_getBuddyNick(long j, ArrayList<String> arrayList);

        private native void native_getBuddyRecommendContactArkJson(long j, long j2, String str, IGetBuddyRecommendContactArkJsonCallback iGetBuddyRecommendContactArkJsonCallback);

        private native HashMap<String, String> native_getBuddyRemark(long j, ArrayList<String> arrayList);

        private native void native_getBuddyReq(long j, IOperateCallback iOperateCallback);

        private native void native_getBuddyReqUnreadCnt(long j, IOperateCallback iOperateCallback);

        private native BuddyListCategory native_getCategoryById(long j, int i);

        private native String native_getCategoryNameWithUid(long j, String str);

        private native void native_getDoubtBuddyReq(long j, String str, int i, String str2, IOperateCallback iOperateCallback);

        private native void native_getDoubtBuddyUnreadNum(long j, IOperateCallback iOperateCallback);

        private native void native_getSmartInfos(long j, String str, IOperateCallback iOperateCallback);

        private native void native_getTargetBuddySetting(long j, String str, IOperateCallback iOperateCallback);

        private native void native_getTargetBuddySettingByType(long j, long j2, String str, ReqBuddySettingType reqBuddySettingType, IOperateCallback iOperateCallback);

        private native boolean native_hasBuddyList(long j);

        private native boolean native_isBlocked(long j, String str);

        private native boolean native_isBuddy(long j, String str);

        private native boolean native_isNewBuddylistVersion(long j);

        private native void native_modifyAddMeSetting(long j, int i, HashMap<String, String> hashMap, IOperateCallback iOperateCallback);

        private native void native_pullCategory(long j, IOperateCallback iOperateCallback);

        private native void native_removeKernelBuddyListener(long j, long j2);

        private native void native_renameCategory(long j, int i, String str, IOperateCallback iOperateCallback);

        private native void native_reportDoubtBuddyReqUnread(long j, IOperateCallback iOperateCallback);

        private native void native_reqToAddFriends(long j, ReqToFriend reqToFriend, IOperateCallback iOperateCallback);

        private native void native_resortCategory(long j, ArrayList<BuddyCategorySortInfo> arrayList, IOperateCallback iOperateCallback);

        private native void native_setBatchBuddyCategory(long j, ArrayList<String> arrayList, int i, IOperateCallback iOperateCallback);

        private native void native_setBlock(long j, String str, boolean z, IOperateCallback iOperateCallback);

        private native void native_setBuddyCategory(long j, String str, int i, IOperateCallback iOperateCallback);

        private native void native_setBuddyRemark(long j, RemarkParams remarkParams, IOperateCallback iOperateCallback);

        private native void native_setMsgNotify(long j, String str, boolean z, IOperateCallback iOperateCallback);

        private native void native_setSpacePermission(long j, SetSpacePermissionReq setSpacePermissionReq, IOperateCallback iOperateCallback);

        private native void native_setTop(long j, String str, boolean z, IOperateCallback iOperateCallback);

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void SetSpecialCare(String str, SpecialCareSetting specialCareSetting, IOperateCallback iOperateCallback) {
            native_SetSpecialCare(this.nativeRef, str, specialCareSetting, iOperateCallback);
        }

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void addCategory(String str, IOperateCallback iOperateCallback) {
            native_addCategory(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public long addKernelBuddyListener(IKernelBuddyListener iKernelBuddyListener) {
            return native_addKernelBuddyListener(this.nativeRef, iKernelBuddyListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void approvalDoubtBuddyReq(String str, Long l, String str2, IOperateCallback iOperateCallback) {
            native_approvalDoubtBuddyReq(this.nativeRef, str, l, str2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void approvalFriendRequest(ApprovalBuddyRequest approvalBuddyRequest, IOperateCallback iOperateCallback) {
            native_approvalFriendRequest(this.nativeRef, approvalBuddyRequest, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void clearBuddyReqUnreadCnt(IOperateCallback iOperateCallback) {
            native_clearBuddyReqUnreadCnt(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void delAllDoubtBuddyReq(IOperateCallback iOperateCallback) {
            native_delAllDoubtBuddyReq(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void delBatchBuddy(ArrayList<DelBuddyInfo> arrayList, IOperateCallback iOperateCallback) {
            native_delBatchBuddy(this.nativeRef, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void delBuddy(DelBuddyInfo delBuddyInfo, IOperateCallback iOperateCallback) {
            native_delBuddy(this.nativeRef, delBuddyInfo, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void delBuddyReq(DelBuddyReqInfo delBuddyReqInfo, IOperateCallback iOperateCallback) {
            native_delBuddyReq(this.nativeRef, delBuddyReqInfo, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void delCategory(int i, IOperateCallback iOperateCallback) {
            native_delCategory(this.nativeRef, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void delDoubtBuddyReq(String str, IOperateCallback iOperateCallback) {
            native_delDoubtBuddyReq(this.nativeRef, str, iOperateCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getAddMeSetting(IOperateCallback iOperateCallback) {
            native_getAddMeSetting(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public int getAllBuddyCount() {
            return native_getAllBuddyCount(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getBuddyList(boolean z, IOperateCallback iOperateCallback) {
            native_getBuddyList(this.nativeRef, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public ArrayList<BuddyListCategory> getBuddyListFromCache(BuddyListReqType buddyListReqType) {
            return native_getBuddyListFromCache(this.nativeRef, buddyListReqType);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getBuddyListV2(boolean z, BuddyListReqType buddyListReqType, IBuddyListCallback iBuddyListCallback) {
            native_getBuddyListV2(this.nativeRef, z, buddyListReqType, iBuddyListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public HashMap<String, String> getBuddyNick(ArrayList<String> arrayList) {
            return native_getBuddyNick(this.nativeRef, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getBuddyRecommendContactArkJson(long j, String str, IGetBuddyRecommendContactArkJsonCallback iGetBuddyRecommendContactArkJsonCallback) {
            native_getBuddyRecommendContactArkJson(this.nativeRef, j, str, iGetBuddyRecommendContactArkJsonCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public HashMap<String, String> getBuddyRemark(ArrayList<String> arrayList) {
            return native_getBuddyRemark(this.nativeRef, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getBuddyReq(IOperateCallback iOperateCallback) {
            native_getBuddyReq(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getBuddyReqUnreadCnt(IOperateCallback iOperateCallback) {
            native_getBuddyReqUnreadCnt(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public BuddyListCategory getCategoryById(int i) {
            return native_getCategoryById(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public String getCategoryNameWithUid(String str) {
            return native_getCategoryNameWithUid(this.nativeRef, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getDoubtBuddyReq(String str, int i, String str2, IOperateCallback iOperateCallback) {
            native_getDoubtBuddyReq(this.nativeRef, str, i, str2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getDoubtBuddyUnreadNum(IOperateCallback iOperateCallback) {
            native_getDoubtBuddyUnreadNum(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getSmartInfos(String str, IOperateCallback iOperateCallback) {
            native_getSmartInfos(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getTargetBuddySetting(String str, IOperateCallback iOperateCallback) {
            native_getTargetBuddySetting(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void getTargetBuddySettingByType(long j, String str, ReqBuddySettingType reqBuddySettingType, IOperateCallback iOperateCallback) {
            native_getTargetBuddySettingByType(this.nativeRef, j, str, reqBuddySettingType, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public boolean hasBuddyList() {
            return native_hasBuddyList(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public boolean isBlocked(String str) {
            return native_isBlocked(this.nativeRef, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public boolean isBuddy(String str) {
            return native_isBuddy(this.nativeRef, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public boolean isNewBuddylistVersion() {
            return native_isNewBuddylistVersion(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void modifyAddMeSetting(int i, HashMap<String, String> hashMap, IOperateCallback iOperateCallback) {
            native_modifyAddMeSetting(this.nativeRef, i, hashMap, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void pullCategory(IOperateCallback iOperateCallback) {
            native_pullCategory(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void removeKernelBuddyListener(long j) {
            native_removeKernelBuddyListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void renameCategory(int i, String str, IOperateCallback iOperateCallback) {
            native_renameCategory(this.nativeRef, i, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void reportDoubtBuddyReqUnread(IOperateCallback iOperateCallback) {
            native_reportDoubtBuddyReqUnread(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void reqToAddFriends(ReqToFriend reqToFriend, IOperateCallback iOperateCallback) {
            native_reqToAddFriends(this.nativeRef, reqToFriend, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void resortCategory(ArrayList<BuddyCategorySortInfo> arrayList, IOperateCallback iOperateCallback) {
            native_resortCategory(this.nativeRef, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void setBatchBuddyCategory(ArrayList<String> arrayList, int i, IOperateCallback iOperateCallback) {
            native_setBatchBuddyCategory(this.nativeRef, arrayList, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void setBlock(String str, boolean z, IOperateCallback iOperateCallback) {
            native_setBlock(this.nativeRef, str, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void setBuddyCategory(String str, int i, IOperateCallback iOperateCallback) {
            native_setBuddyCategory(this.nativeRef, str, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void setBuddyRemark(RemarkParams remarkParams, IOperateCallback iOperateCallback) {
            native_setBuddyRemark(this.nativeRef, remarkParams, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void setMsgNotify(String str, boolean z, IOperateCallback iOperateCallback) {
            native_setMsgNotify(this.nativeRef, str, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void setSpacePermission(SetSpacePermissionReq setSpacePermissionReq, IOperateCallback iOperateCallback) {
            native_setSpacePermission(this.nativeRef, setSpacePermissionReq, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBuddyService
        public void setTop(String str, boolean z, IOperateCallback iOperateCallback) {
            native_setTop(this.nativeRef, str, z, iOperateCallback);
        }
    }

    void SetSpecialCare(String str, SpecialCareSetting specialCareSetting, IOperateCallback iOperateCallback);

    void addCategory(String str, IOperateCallback iOperateCallback);

    long addKernelBuddyListener(IKernelBuddyListener iKernelBuddyListener);

    void approvalDoubtBuddyReq(String str, Long l, String str2, IOperateCallback iOperateCallback);

    void approvalFriendRequest(ApprovalBuddyRequest approvalBuddyRequest, IOperateCallback iOperateCallback);

    void clearBuddyReqUnreadCnt(IOperateCallback iOperateCallback);

    void delAllDoubtBuddyReq(IOperateCallback iOperateCallback);

    void delBatchBuddy(ArrayList<DelBuddyInfo> arrayList, IOperateCallback iOperateCallback);

    void delBuddy(DelBuddyInfo delBuddyInfo, IOperateCallback iOperateCallback);

    void delBuddyReq(DelBuddyReqInfo delBuddyReqInfo, IOperateCallback iOperateCallback);

    void delCategory(int i, IOperateCallback iOperateCallback);

    void delDoubtBuddyReq(String str, IOperateCallback iOperateCallback);

    void getAddMeSetting(IOperateCallback iOperateCallback);

    int getAllBuddyCount();

    void getBuddyList(boolean z, IOperateCallback iOperateCallback);

    ArrayList<BuddyListCategory> getBuddyListFromCache(BuddyListReqType buddyListReqType);

    void getBuddyListV2(boolean z, BuddyListReqType buddyListReqType, IBuddyListCallback iBuddyListCallback);

    HashMap<String, String> getBuddyNick(ArrayList<String> arrayList);

    void getBuddyRecommendContactArkJson(long j, String str, IGetBuddyRecommendContactArkJsonCallback iGetBuddyRecommendContactArkJsonCallback);

    HashMap<String, String> getBuddyRemark(ArrayList<String> arrayList);

    void getBuddyReq(IOperateCallback iOperateCallback);

    void getBuddyReqUnreadCnt(IOperateCallback iOperateCallback);

    BuddyListCategory getCategoryById(int i);

    String getCategoryNameWithUid(String str);

    void getDoubtBuddyReq(String str, int i, String str2, IOperateCallback iOperateCallback);

    void getDoubtBuddyUnreadNum(IOperateCallback iOperateCallback);

    void getSmartInfos(String str, IOperateCallback iOperateCallback);

    void getTargetBuddySetting(String str, IOperateCallback iOperateCallback);

    void getTargetBuddySettingByType(long j, String str, ReqBuddySettingType reqBuddySettingType, IOperateCallback iOperateCallback);

    boolean hasBuddyList();

    boolean isBlocked(String str);

    boolean isBuddy(String str);

    boolean isNewBuddylistVersion();

    void modifyAddMeSetting(int i, HashMap<String, String> hashMap, IOperateCallback iOperateCallback);

    void pullCategory(IOperateCallback iOperateCallback);

    void removeKernelBuddyListener(long j);

    void renameCategory(int i, String str, IOperateCallback iOperateCallback);

    void reportDoubtBuddyReqUnread(IOperateCallback iOperateCallback);

    void reqToAddFriends(ReqToFriend reqToFriend, IOperateCallback iOperateCallback);

    void resortCategory(ArrayList<BuddyCategorySortInfo> arrayList, IOperateCallback iOperateCallback);

    void setBatchBuddyCategory(ArrayList<String> arrayList, int i, IOperateCallback iOperateCallback);

    void setBlock(String str, boolean z, IOperateCallback iOperateCallback);

    void setBuddyCategory(String str, int i, IOperateCallback iOperateCallback);

    void setBuddyRemark(RemarkParams remarkParams, IOperateCallback iOperateCallback);

    void setMsgNotify(String str, boolean z, IOperateCallback iOperateCallback);

    void setSpacePermission(SetSpacePermissionReq setSpacePermissionReq, IOperateCallback iOperateCallback);

    void setTop(String str, boolean z, IOperateCallback iOperateCallback);
}
