package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class SvcDevLoginInfo extends JceStruct {
    static DeviceItemDes cache_stDeviceItemDes = new DeviceItemDes();
    static byte[] cache_vecGuid;
    public long iAppId;
    public long iCanBeKicked;
    public long iLoginPlatform;
    public long iLoginTime;
    public long iProductType;
    public long iTerType;
    public DeviceItemDes stDeviceItemDes;
    public String strDeviceName;
    public String strDeviceTypeInfo;
    public String strLoginLocation;
    public byte[] vecGuid;

    public SvcDevLoginInfo() {
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

    public SvcDevLoginInfo(long j2, byte[] bArr, long j3, long j4, String str, String str2, String str3, DeviceItemDes deviceItemDes, long j5, long j6, long j7) {
        throw new RuntimeException("stub");
    }
}
