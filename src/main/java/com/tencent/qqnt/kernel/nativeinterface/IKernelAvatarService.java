package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelAvatarService.class */
public interface IKernelAvatarService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelAvatarService$CppProxy.class */
    final class CppProxy implements IKernelAvatarService {
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

        private native long native_addAvatarListener(long j, IKernelAvatarListener iKernelAvatarListener);

        private native void native_forceDownloadAvatar(long j, String str, AvatarSize avatarSize, IOperateCallback iOperateCallback);

        private native void native_forceDownloadAvatarByUin(long j, long j2, AvatarSize avatarSize, IOperateCallback iOperateCallback);

        private native void native_forceDownloadGroupAvatar(long j, long j2, AvatarSize avatarSize, IOperateCallback iOperateCallback);

        private native void native_forceDownloadGroupPortrait(long j, long j2, int i, AvatarSize avatarSize, IOperateCallback iOperateCallback);

        private native String native_getAvatarPath(long j, String str, AvatarSize avatarSize);

        private native String native_getAvatarPathByUin(long j, long j2, AvatarSize avatarSize);

        private native HashMap<String, String> native_getAvatarPaths(long j, ArrayList<String> arrayList, AvatarSize avatarSize);

        private native String native_getConfGroupAvatarPath(long j, long j2);

        private native HashMap<Long, String> native_getConfGroupAvatarPaths(long j, ArrayList<Long> arrayList);

        private native String native_getGroupAvatarPath(long j, long j2, AvatarSize avatarSize);

        private native HashMap<Long, String> native_getGroupAvatarPaths(long j, ArrayList<Long> arrayList, AvatarSize avatarSize);

        private native String native_getGroupPortraitPath(long j, long j2, int i, AvatarSize avatarSize);

        private native void native_removeAvatarListener(long j, long j2);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public long addAvatarListener(IKernelAvatarListener iKernelAvatarListener) {
            return native_addAvatarListener(this.nativeRef, iKernelAvatarListener);
        }

        protected void finalize() {
            _djinni_private_destroy();

        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public void forceDownloadAvatar(String str, AvatarSize avatarSize, IOperateCallback iOperateCallback) {
            native_forceDownloadAvatar(this.nativeRef, str, avatarSize, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public void forceDownloadAvatarByUin(long j, AvatarSize avatarSize, IOperateCallback iOperateCallback) {
            native_forceDownloadAvatarByUin(this.nativeRef, j, avatarSize, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public void forceDownloadGroupAvatar(long j, AvatarSize avatarSize, IOperateCallback iOperateCallback) {
            native_forceDownloadGroupAvatar(this.nativeRef, j, avatarSize, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public void forceDownloadGroupPortrait(long j, int i, AvatarSize avatarSize, IOperateCallback iOperateCallback) {
            native_forceDownloadGroupPortrait(this.nativeRef, j, i, avatarSize, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public String getAvatarPath(String str, AvatarSize avatarSize) {
            return native_getAvatarPath(this.nativeRef, str, avatarSize);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public String getAvatarPathByUin(long j, AvatarSize avatarSize) {
            return native_getAvatarPathByUin(this.nativeRef, j, avatarSize);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public HashMap<String, String> getAvatarPaths(ArrayList<String> arrayList, AvatarSize avatarSize) {
            return native_getAvatarPaths(this.nativeRef, arrayList, avatarSize);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public String getConfGroupAvatarPath(long j) {
            return native_getConfGroupAvatarPath(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public HashMap<Long, String> getConfGroupAvatarPaths(ArrayList<Long> arrayList) {
            return native_getConfGroupAvatarPaths(this.nativeRef, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public String getGroupAvatarPath(long j, AvatarSize avatarSize) {
            return native_getGroupAvatarPath(this.nativeRef, j, avatarSize);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public HashMap<Long, String> getGroupAvatarPaths(ArrayList<Long> arrayList, AvatarSize avatarSize) {
            return native_getGroupAvatarPaths(this.nativeRef, arrayList, avatarSize);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public String getGroupPortraitPath(long j, int i, AvatarSize avatarSize) {
            return native_getGroupPortraitPath(this.nativeRef, j, i, avatarSize);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAvatarService
        public void removeAvatarListener(long j) {
            native_removeAvatarListener(this.nativeRef, j);
        }
    }

    long addAvatarListener(IKernelAvatarListener iKernelAvatarListener);

    void forceDownloadAvatar(String str, AvatarSize avatarSize, IOperateCallback iOperateCallback);

    void forceDownloadAvatarByUin(long j, AvatarSize avatarSize, IOperateCallback iOperateCallback);

    void forceDownloadGroupAvatar(long j, AvatarSize avatarSize, IOperateCallback iOperateCallback);

    void forceDownloadGroupPortrait(long j, int i, AvatarSize avatarSize, IOperateCallback iOperateCallback);

    String getAvatarPath(String str, AvatarSize avatarSize);

    String getAvatarPathByUin(long j, AvatarSize avatarSize);

    HashMap<String, String> getAvatarPaths(ArrayList<String> arrayList, AvatarSize avatarSize);

    String getConfGroupAvatarPath(long j);

    HashMap<Long, String> getConfGroupAvatarPaths(ArrayList<Long> arrayList);

    String getGroupAvatarPath(long j, AvatarSize avatarSize);

    HashMap<Long, String> getGroupAvatarPaths(ArrayList<Long> arrayList, AvatarSize avatarSize);

    String getGroupPortraitPath(long j, int i, AvatarSize avatarSize);

    void removeAvatarListener(long j);
}
