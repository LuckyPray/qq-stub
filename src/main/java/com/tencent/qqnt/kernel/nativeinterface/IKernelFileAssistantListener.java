package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelFileAssistantListener.class */
public interface IKernelFileAssistantListener {
    void onFileListChanged(int i, ArrayList<FileAssistantModel> arrayList, boolean z);

    void onFileSearch(SearchFileAssistantFileResult searchFileAssistantFileResult);

    void onFileStatusChanged(UpdateStatus updateStatus);

    void onSessionChanged(ArrayList<FileAssistantSession> arrayList);

    void onSessionListChanged(FileSessionResult fileSessionResult);
}
