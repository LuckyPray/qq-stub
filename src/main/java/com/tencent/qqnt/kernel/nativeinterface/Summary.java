package com.tencent.qqnt.kernel.nativeinterface;

import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/Summary.class */
public final class Summary implements Serializable {
    public GuildGroupOptType oper;
    public byte[] senderNick;
    public byte[] senderRemark;
    long serialVersionUID;
    public byte[] text;

    public Summary() {
        this.serialVersionUID = 1L;
        this.text = new byte[0];
        this.senderNick = new byte[0];
        this.senderRemark = new byte[0];
        this.oper = GuildGroupOptType.values()[0];
    }

    public GuildGroupOptType getOper() {
        return this.oper;
    }

    public byte[] getSenderNick() {
        return this.senderNick;
    }

    public byte[] getSenderRemark() {
        return this.senderRemark;
    }

    public byte[] getText() {
        return this.text;
    }

    public void setOper(GuildGroupOptType guildGroupOptType) {
        this.oper = guildGroupOptType;
    }

    public void setSenderNick(byte[] bArr) {
        this.senderNick = bArr;
    }

    public void setSenderRemark(byte[] bArr) {
        this.senderRemark = bArr;
    }

    public void setText(byte[] bArr) {
        this.text = bArr;
    }

    public String toString() {
        return "Summary{text=" + this.text + ",senderNick=" + this.senderNick + ",senderRemark=" + this.senderRemark + ",oper=" + this.oper + ",}";
    }

    public Summary(byte[] bArr, byte[] bArr2, byte[] bArr3, GuildGroupOptType guildGroupOptType) {
        this.serialVersionUID = 1L;
        this.text = new byte[0];
        this.senderNick = new byte[0];
        this.senderRemark = new byte[0];
        this.oper = GuildGroupOptType.values()[0];
        this.text = bArr;
        this.senderNick = bArr2;
        this.senderRemark = bArr3;
        this.oper = guildGroupOptType;
    }
}
