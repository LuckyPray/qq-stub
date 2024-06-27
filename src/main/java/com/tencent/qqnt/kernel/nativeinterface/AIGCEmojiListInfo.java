package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AIGCEmojiListInfo.class */
public final class AIGCEmojiListInfo {
    public ArrayList<AIGCEmoji> emojis = new ArrayList<>();
    public byte[] pageSession = new byte[0];
    public int source;
    public long timestamp;

    public ArrayList<AIGCEmoji> getEmojis() {
        return this.emojis;
    }

    public byte[] getPageSession() {
        return this.pageSession;
    }

    public int getSource() {
        return this.source;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String toString() {
        return "AIGCEmojiListInfo{emojis=" + this.emojis + ",pageSession=" + this.pageSession + ",timestamp=" + this.timestamp + ",source=" + this.source + ",}";
    }
}
