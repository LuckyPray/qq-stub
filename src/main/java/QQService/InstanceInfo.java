package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class InstanceInfo extends JceStruct {
    public byte[] appName;
    public byte cTablet;
    public byte[] deviceName;
    public byte[] encryptGuid;
    public int encryptGuidVersion;
    public int iAppId;
    public long iClientType;
    public long iPlatform;
    public long iProductType;
    public int loginSigAppId;

    public InstanceInfo() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        throw new RuntimeException("stub");
    }

    public InstanceInfo(int i2, byte b2, long j2, long j3, long j4, byte[] bArr, byte[] bArr2, int i3, int i4, byte[] bArr3) {
        throw new RuntimeException("stub");
    }
}
