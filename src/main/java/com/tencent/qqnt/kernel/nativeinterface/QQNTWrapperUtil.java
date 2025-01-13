package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QQNTWrapperUtil.class */
public interface QQNTWrapperUtil {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QQNTWrapperUtil$CppProxy.class */
    final class CppProxy implements QQNTWrapperUtil {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native ArrayList<RecentContactInfo> DecoderRecentInfo(byte[] bArr);

        public static native HashMap<String, BaseEmojiPathInfo> GetBaseEmojiPathByIds(ArrayList<GetBaseEmojiPathReq> arrayList);

        public static native String GetMobileBaseEmojiPath();

        public static native String SetMobileBaseEmojiPath(String str, String str2);

        public static native ThumbResult calcThumbSize(int i, int i2, ThumbOpt thumbOpt);

        public static native void checkNewUserDataSaveDirAvailable(String str, IOperateCallback iOperateCallback);

        public static native boolean copyFile(String str, String str2);

        public static native void copyUserData(String str, String str2, IOperateCallback iOperateCallback);

        public static native UnregisterRes decodeOffLine(byte[] bArr);

        public static native void emptyWorkingSet(int i);

        public static native byte[] encodeOffLine(UnregisterInfo unregisterInfo);

        public static native boolean fileIsExist(String str);

        public static native String fullWordToHalfWord(String str);

        public static native ArrayList<byte[]> genFileCumulateSha1(String str);

        public static native byte[] genFileMd5Buf(String str);

        public static native String genFileMd5Hex(String str);

        public static native HashMap<Integer, String> genFileShaAndMd5Hex(String str, int i);

        public static native byte[] genFileShaBuf(String str);

        public static native String genFileShaHex(String str);

        public static native long getFileSize(String str);

        public static native String getNTUserDataInfoConfig();

        public static native OidbRspInfo getOidbRspInfo(byte[] bArr);

        public static native ArrayList<ArrayList<String>> getPinyin(String str, boolean z);

        public static native ArrayList<ArrayList<String>> getPinyinExt(String str, boolean z);

        public static native String getSoBuildInfo();

        public static native byte[] getSsoBufferOfOidbReq(int i, int i2, byte[] bArr);

        public static native String getSsoCmdOfOidbReq(int i, int i2);

        public static native boolean hasOtherRunningQQProcess();

        public static native boolean makeDirByPath(String str);

        public static native boolean matchInPinyin(ArrayList<ArrayList<String>> arrayList, String str);

        private native void nativeDestroy(long j);

        public static native PathPermission pathIsReadableAndWriteable(String str);

        public static native void quitAllRunningQQProcess(boolean z, IOperateCallback iOperateCallback);

        public static native boolean registerCountInstruments(String str, HashSet<String> hashSet, int i, int i2);

        public static native boolean registerValueInstruments(String str, HashSet<String> hashSet, int i, int i2);

        public static native boolean registerValueInstrumentsWithBoundary(String str, HashSet<String> hashSet, ArrayList<Double> arrayList, int i, int i2);

        public static native boolean reportCountIndicators(String str, HashMap<String, String> hashMap, String str2, double d, boolean z);

        public static native boolean reportValueIndicators(String str, HashMap<String, String> hashMap, String str2, double d, boolean z);

        public static native void resetUserDataSavePathToDocument();

        public static native int runProcess(String str, boolean z);

        public static native int runProcessArgs(String str, ArrayList<String> arrayList, boolean z);

        public static native boolean setTraceInfo(OpentelemetryTrace opentelemetryTrace);

        public static native void setUserDataSaveDirectory(String str, IOperateCallback iOperateCallback);

        public static native ISpan startTrace(String str);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();

        }
    }
}
