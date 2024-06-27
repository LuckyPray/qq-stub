package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QuerySubscribeMsgTemplateRsp.class */
public final class QuerySubscribeMsgTemplateRsp {
    public ArrayList<SubscribeMsgTemplateInfo> templateInfos = new ArrayList<>();
    public SubscribePanelInfo panelInfo = new SubscribePanelInfo();

    public SubscribePanelInfo getPanelInfo() {
        return this.panelInfo;
    }

    public ArrayList<SubscribeMsgTemplateInfo> getTemplateInfos() {
        return this.templateInfos;
    }

    public String toString() {
        return "QuerySubscribeMsgTemplateRsp{templateInfos=" + this.templateInfos + ",panelInfo=" + this.panelInfo + ",}";
    }
}
