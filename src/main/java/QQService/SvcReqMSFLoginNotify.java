package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class SvcReqMSFLoginNotify extends JceStruct {
    static ArrayList<InstanceInfo> cache_vecInstanceList = new ArrayList<>();
    public byte cStatus;
    public byte cTablet;
    public long iAppId;
    public long iClientType;
    public long iPlatform;
    public long iProductType;
    public String strInfo;
    public String strTitle;
    public ArrayList<InstanceInfo> vecInstanceList;

    static {
        cache_vecInstanceList.add(new InstanceInfo());
    }

    public SvcReqMSFLoginNotify() {
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

    public SvcReqMSFLoginNotify(long j2, byte b2, byte b3, long j3, String str, String str2, long j4, long j5, ArrayList<InstanceInfo> arrayList) {
        throw new RuntimeException("stub");
    }
}
