package QQService;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class SvcReqDelLoginInfo extends JceStruct implements Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static ArrayList<DeviceItemDes> cache_vecDeviceItemDes;
    static byte[] cache_vecGuid;
    public long iAppId;
    public long iDelMe;
    public long iDelType;
    public String strAppName;
    public ArrayList<DeviceItemDes> vecDeviceItemDes;
    public byte[] vecGuid;

    public SvcReqDelLoginInfo() {
        throw new RuntimeException("stub");
    }

    public String className() {
        throw new RuntimeException("stub");
    }

    public Object clone() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void display(StringBuilder sb, int i2) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(StringBuilder sb, int i2) {
        throw new RuntimeException("stub");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("stub");
    }

    public String fullClassName() {
        throw new RuntimeException("stub");
    }

    public long getIAppId() {
        throw new RuntimeException("stub");
    }

    public long getIDelMe() {
        throw new RuntimeException("stub");
    }

    public long getIDelType() {
        throw new RuntimeException("stub");
    }

    public String getStrAppName() {
        throw new RuntimeException("stub");
    }

    public ArrayList<DeviceItemDes> getVecDeviceItemDes() {
        throw new RuntimeException("stub");
    }

    public byte[] getVecGuid() {
        throw new RuntimeException("stub");
    }

    public int hashCode() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    public void setIAppId(long j2) {
        throw new RuntimeException("stub");
    }

    public void setIDelMe(long j2) {
        throw new RuntimeException("stub");
    }

    public void setIDelType(long j2) {
        throw new RuntimeException("stub");
    }

    public void setStrAppName(String str) {
        throw new RuntimeException("stub");
    }

    public void setVecDeviceItemDes(ArrayList<DeviceItemDes> arrayList) {
        throw new RuntimeException("stub");
    }

    public void setVecGuid(byte[] bArr) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        throw new RuntimeException("stub");
    }

    public SvcReqDelLoginInfo(byte[] bArr, String str, ArrayList<DeviceItemDes> arrayList, long j2, long j3, long j4) {
        throw new RuntimeException("stub");
    }
}
