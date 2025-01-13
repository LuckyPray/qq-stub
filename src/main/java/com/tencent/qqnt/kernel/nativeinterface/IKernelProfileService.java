package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelProfileService.class */
public interface IKernelProfileService {

    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelProfileService$CppProxy.class */
    final class CppProxy implements IKernelProfileService {
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

        private native long native_addKernelProfileListener(long j, IKernelProfileListener iKernelProfileListener);

        private native long native_addKernelProfileListenerForUICache(long j, IKernelProfileListener iKernelProfileListener);

        private native ArrayList<String> native_enumAreaOptions(long j, String str, String str2, String str3);

        private native ArrayList<String> native_enumCityOptions(long j, String str, String str2);

        private native ArrayList<String> native_enumCountryOptions(long j);

        private native ArrayList<String> native_enumProvinceOptions(long j, String str);

        private native void native_fetchUserDetailInfo(long j, String str, ArrayList<String> arrayList, Source source, ArrayList<ProfileBizType> arrayList2, IDetailInfoCallback iDetailInfoCallback);

        private native HashMap<String, UserSimpleInfo> native_getCoreAndBaseInfo(long j, String str, ArrayList<String> arrayList);

        private native HashMap<String, CoreInfo> native_getCoreInfo(long j, String str, ArrayList<String> arrayList);

        private native HashMap<String, Intimate> native_getIntimate(long j, String str, ArrayList<String> arrayList);

        private native void native_getLocalStrangerRemark(long j);

        private native HashMap<String, OtherFlag> native_getOtherFlag(long j, String str, ArrayList<String> arrayList);

        private native void native_getProfileQzonePicInfo(long j, String str, int i, boolean z, IGetProfileQzonePicInfoCallback iGetProfileQzonePicInfoCallback);

        private native HashMap<String, RelationFlag> native_getRelationFlag(long j, String str, ArrayList<String> arrayList);

        private native void native_getSelfStatus(long j, IOperateCallback iOperateCallback);

        private native void native_getStatus(long j, String str, IOperateCallback iOperateCallback);

        private native HashMap<String, StatusInfo> native_getStatusInfo(long j, String str, ArrayList<String> arrayList);

        private native HashMap<String, StockLocalData> native_getStockLocalData(long j, String str, ArrayList<String> arrayList);

        private native HashMap<Long, String> native_getUidByUin(long j, String str, ArrayList<Long> arrayList);

        private native HashMap<String, Long> native_getUinByUid(long j, String str, ArrayList<String> arrayList);

        private native void native_getUserDetailInfo(long j, String str, IOperateCallback iOperateCallback);

        private native void native_getUserDetailInfoByUin(long j, long j2, IDetailInfoByUinCallback iDetailInfoByUinCallback);

        private native void native_getUserDetailInfoWithBizInfo(long j, String str, ArrayList<BizKey> arrayList, IOperateCallback iOperateCallback);

        private native void native_getUserSimpleInfo(long j, boolean z, ArrayList<String> arrayList, IOperateCallback iOperateCallback);

        private native HashMap<String, VasInfo> native_getVasInfo(long j, String str, ArrayList<String> arrayList);

        private native void native_getZplanAvatarInfos(long j, ArrayList<String> arrayList, IZplanAvatarInfoCallback iZplanAvatarInfoCallback);

        private native void native_modifyDesktopMiniProfile(long j, DesktopQQMiniProfile desktopQQMiniProfile, IOperateCallback iOperateCallback);

        private native void native_modifySelfProfile(long j, UserSimpleInfo userSimpleInfo, IOperateCallback iOperateCallback);

        private native void native_prepareRegionConfig(long j, IOperateCallback iOperateCallback);

        private native void native_removeKernelProfileListener(long j, long j2);

        private native void native_setBirthday(long j, int i, int i2, int i3, IOperateCallback iOperateCallback);

        private native void native_setGander(long j, int i, IOperateCallback iOperateCallback);

        private native void native_setHeader(long j, String str, IOperateCallback iOperateCallback);

        private native void native_setLongNick(long j, String str, IOperateCallback iOperateCallback);

        private native void native_setNickName(long j, String str, IOperateCallback iOperateCallback);

        private native void native_setRecommendImgFlag(long j, int i, IOperateCallback iOperateCallback);

        private native void native_setdisableEmojiShortCuts(long j, int i, IOperateCallback iOperateCallback);

        private native void native_startStatusPolling(long j, boolean z);

        private native void native_updateProfileData(long j, String str, byte[] bArr, IOperateCallback iOperateCallback);

        private native void native_updateStockLocalData(long j, String str, HashMap<String, StockLocalData> hashMap, IOperateCallback iOperateCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public long addKernelProfileListener(IKernelProfileListener iKernelProfileListener) {
            return native_addKernelProfileListener(this.nativeRef, iKernelProfileListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public long addKernelProfileListenerForUICache(IKernelProfileListener iKernelProfileListener) {
            return native_addKernelProfileListenerForUICache(this.nativeRef, iKernelProfileListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public ArrayList<String> enumAreaOptions(String str, String str2, String str3) {
            return native_enumAreaOptions(this.nativeRef, str, str2, str3);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public ArrayList<String> enumCityOptions(String str, String str2) {
            return native_enumCityOptions(this.nativeRef, str, str2);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public ArrayList<String> enumCountryOptions() {
            return native_enumCountryOptions(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public ArrayList<String> enumProvinceOptions(String str) {
            return native_enumProvinceOptions(this.nativeRef, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void fetchUserDetailInfo(String str, ArrayList<String> arrayList, Source source, ArrayList<ProfileBizType> arrayList2, IDetailInfoCallback iDetailInfoCallback) {
            native_fetchUserDetailInfo(this.nativeRef, str, arrayList, source, arrayList2, iDetailInfoCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public HashMap<String, UserSimpleInfo> getCoreAndBaseInfo(String str, ArrayList<String> arrayList) {
            return native_getCoreAndBaseInfo(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public HashMap<String, CoreInfo> getCoreInfo(String str, ArrayList<String> arrayList) {
            return native_getCoreInfo(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public HashMap<String, Intimate> getIntimate(String str, ArrayList<String> arrayList) {
            return native_getIntimate(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void getLocalStrangerRemark() {
            native_getLocalStrangerRemark(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public HashMap<String, OtherFlag> getOtherFlag(String str, ArrayList<String> arrayList) {
            return native_getOtherFlag(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void getProfileQzonePicInfo(String str, int i, boolean z, IGetProfileQzonePicInfoCallback iGetProfileQzonePicInfoCallback) {
            native_getProfileQzonePicInfo(this.nativeRef, str, i, z, iGetProfileQzonePicInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public HashMap<String, RelationFlag> getRelationFlag(String str, ArrayList<String> arrayList) {
            return native_getRelationFlag(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void getSelfStatus(IOperateCallback iOperateCallback) {
            native_getSelfStatus(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void getStatus(String str, IOperateCallback iOperateCallback) {
            native_getStatus(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public HashMap<String, StatusInfo> getStatusInfo(String str, ArrayList<String> arrayList) {
            return native_getStatusInfo(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public HashMap<String, StockLocalData> getStockLocalData(String str, ArrayList<String> arrayList) {
            return native_getStockLocalData(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public HashMap<Long, String> getUidByUin(String str, ArrayList<Long> arrayList) {
            return native_getUidByUin(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public HashMap<String, Long> getUinByUid(String str, ArrayList<String> arrayList) {
            return native_getUinByUid(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void getUserDetailInfo(String str, IOperateCallback iOperateCallback) {
            native_getUserDetailInfo(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void getUserDetailInfoByUin(long j, IDetailInfoByUinCallback iDetailInfoByUinCallback) {
            native_getUserDetailInfoByUin(this.nativeRef, j, iDetailInfoByUinCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void getUserDetailInfoWithBizInfo(String str, ArrayList<BizKey> arrayList, IOperateCallback iOperateCallback) {
            native_getUserDetailInfoWithBizInfo(this.nativeRef, str, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void getUserSimpleInfo(boolean z, ArrayList<String> arrayList, IOperateCallback iOperateCallback) {
            native_getUserSimpleInfo(this.nativeRef, z, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public HashMap<String, VasInfo> getVasInfo(String str, ArrayList<String> arrayList) {
            return native_getVasInfo(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void getZplanAvatarInfos(ArrayList<String> arrayList, IZplanAvatarInfoCallback iZplanAvatarInfoCallback) {
            native_getZplanAvatarInfos(this.nativeRef, arrayList, iZplanAvatarInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void modifyDesktopMiniProfile(DesktopQQMiniProfile desktopQQMiniProfile, IOperateCallback iOperateCallback) {
            native_modifyDesktopMiniProfile(this.nativeRef, desktopQQMiniProfile, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void modifySelfProfile(UserSimpleInfo userSimpleInfo, IOperateCallback iOperateCallback) {
            native_modifySelfProfile(this.nativeRef, userSimpleInfo, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void prepareRegionConfig(IOperateCallback iOperateCallback) {
            native_prepareRegionConfig(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void removeKernelProfileListener(long j) {
            native_removeKernelProfileListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void setBirthday(int i, int i2, int i3, IOperateCallback iOperateCallback) {
            native_setBirthday(this.nativeRef, i, i2, i3, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void setGander(int i, IOperateCallback iOperateCallback) {
            native_setGander(this.nativeRef, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void setHeader(String str, IOperateCallback iOperateCallback) {
            native_setHeader(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void setLongNick(String str, IOperateCallback iOperateCallback) {
            native_setLongNick(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void setNickName(String str, IOperateCallback iOperateCallback) {
            native_setNickName(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void setRecommendImgFlag(int i, IOperateCallback iOperateCallback) {
            native_setRecommendImgFlag(this.nativeRef, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void setdisableEmojiShortCuts(int i, IOperateCallback iOperateCallback) {
            native_setdisableEmojiShortCuts(this.nativeRef, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void startStatusPolling(boolean z) {
            native_startStatusPolling(this.nativeRef, z);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void updateProfileData(String str, byte[] bArr, IOperateCallback iOperateCallback) {
            native_updateProfileData(this.nativeRef, str, bArr, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelProfileService
        public void updateStockLocalData(String str, HashMap<String, StockLocalData> hashMap, IOperateCallback iOperateCallback) {
            native_updateStockLocalData(this.nativeRef, str, hashMap, iOperateCallback);
        }
    }

    long addKernelProfileListener(IKernelProfileListener iKernelProfileListener);

    long addKernelProfileListenerForUICache(IKernelProfileListener iKernelProfileListener);

    ArrayList<String> enumAreaOptions(String str, String str2, String str3);

    ArrayList<String> enumCityOptions(String str, String str2);

    ArrayList<String> enumCountryOptions();

    ArrayList<String> enumProvinceOptions(String str);

    void fetchUserDetailInfo(String str, ArrayList<String> arrayList, Source source, ArrayList<ProfileBizType> arrayList2, IDetailInfoCallback iDetailInfoCallback);

    HashMap<String, UserSimpleInfo> getCoreAndBaseInfo(String str, ArrayList<String> arrayList);

    HashMap<String, CoreInfo> getCoreInfo(String str, ArrayList<String> arrayList);

    HashMap<String, Intimate> getIntimate(String str, ArrayList<String> arrayList);

    void getLocalStrangerRemark();

    HashMap<String, OtherFlag> getOtherFlag(String str, ArrayList<String> arrayList);

    void getProfileQzonePicInfo(String str, int i, boolean z, IGetProfileQzonePicInfoCallback iGetProfileQzonePicInfoCallback);

    HashMap<String, RelationFlag> getRelationFlag(String str, ArrayList<String> arrayList);

    void getSelfStatus(IOperateCallback iOperateCallback);

    void getStatus(String str, IOperateCallback iOperateCallback);

    HashMap<String, StatusInfo> getStatusInfo(String str, ArrayList<String> arrayList);

    HashMap<String, StockLocalData> getStockLocalData(String str, ArrayList<String> arrayList);

    HashMap<Long, String> getUidByUin(String str, ArrayList<Long> arrayList);

    HashMap<String, Long> getUinByUid(String str, ArrayList<String> arrayList);

    void getUserDetailInfo(String str, IOperateCallback iOperateCallback);

    void getUserDetailInfoByUin(long j, IDetailInfoByUinCallback iDetailInfoByUinCallback);

    void getUserDetailInfoWithBizInfo(String str, ArrayList<BizKey> arrayList, IOperateCallback iOperateCallback);

    void getUserSimpleInfo(boolean z, ArrayList<String> arrayList, IOperateCallback iOperateCallback);

    HashMap<String, VasInfo> getVasInfo(String str, ArrayList<String> arrayList);

    void getZplanAvatarInfos(ArrayList<String> arrayList, IZplanAvatarInfoCallback iZplanAvatarInfoCallback);

    void modifyDesktopMiniProfile(DesktopQQMiniProfile desktopQQMiniProfile, IOperateCallback iOperateCallback);

    void modifySelfProfile(UserSimpleInfo userSimpleInfo, IOperateCallback iOperateCallback);

    void prepareRegionConfig(IOperateCallback iOperateCallback);

    void removeKernelProfileListener(long j);

    void setBirthday(int i, int i2, int i3, IOperateCallback iOperateCallback);

    void setGander(int i, IOperateCallback iOperateCallback);

    void setHeader(String str, IOperateCallback iOperateCallback);

    void setLongNick(String str, IOperateCallback iOperateCallback);

    void setNickName(String str, IOperateCallback iOperateCallback);

    void setRecommendImgFlag(int i, IOperateCallback iOperateCallback);

    void setdisableEmojiShortCuts(int i, IOperateCallback iOperateCallback);

    void startStatusPolling(boolean z);

    void updateProfileData(String str, byte[] bArr, IOperateCallback iOperateCallback);

    void updateStockLocalData(String str, HashMap<String, StockLocalData> hashMap, IOperateCallback iOperateCallback);
}
