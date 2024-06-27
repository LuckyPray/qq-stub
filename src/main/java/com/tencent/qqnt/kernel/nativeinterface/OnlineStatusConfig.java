package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OnlineStatusConfig.class */
public final class OnlineStatusConfig {
    public AvatarView avatarView;
    public ArrayList<DiyEmo> diyEmo;
    public ArrayList<OnlineStatus> onlineStatus;
    public ArrayList<SquareStatus> squareStatus;

    public OnlineStatusConfig() {
        this.avatarView = new AvatarView();
        this.onlineStatus = new ArrayList<>();
        this.diyEmo = new ArrayList<>();
        this.squareStatus = new ArrayList<>();
    }

    public AvatarView getAvatarView() {
        return this.avatarView;
    }

    public ArrayList<DiyEmo> getDiyEmo() {
        return this.diyEmo;
    }

    public ArrayList<OnlineStatus> getOnlineStatus() {
        return this.onlineStatus;
    }

    public ArrayList<SquareStatus> getSquareStatus() {
        return this.squareStatus;
    }

    public String toString() {
        return "OnlineStatusConfig{avatarView=" + this.avatarView + ",onlineStatus=" + this.onlineStatus + ",diyEmo=" + this.diyEmo + ",squareStatus=" + this.squareStatus + ",}";
    }

    public OnlineStatusConfig(AvatarView avatarView, ArrayList<OnlineStatus> arrayList, ArrayList<DiyEmo> arrayList2, ArrayList<SquareStatus> arrayList3) {
        this.avatarView = new AvatarView();
        this.onlineStatus = new ArrayList<>();
        this.diyEmo = new ArrayList<>();
        this.squareStatus = new ArrayList<>();
        this.avatarView = avatarView;
        this.onlineStatus = arrayList;
        this.diyEmo = arrayList2;
        this.squareStatus = arrayList3;
    }
}
