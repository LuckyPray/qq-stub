package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: P */
/* loaded from: classes.dex */
public final class VipBaseInfo extends JceStruct implements Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static Map<Integer, VipOpenInfo> cache_mOpenInfo;
    public static boolean isEnableUtf8Bugfix;
    private static ArrayList sFeature_AutoGenClazzList_QAutoInjectTransform;
    public int iGrayNameplateFlag;
    public int iNameplateVipType;
    public Map<Integer, VipOpenInfo> mOpenInfo;
    public String strExtendNameplateId;

    /* compiled from: P */
    /* loaded from: classes.dex */
    public interface a {
        boolean isEnable();
    }

    public VipBaseInfo() {
        throw new RuntimeException("stub");
    }

    static void initQAutoInject() {
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

    public int getIGrayNameplateFlag() {
        throw new RuntimeException("stub");
    }

    public int getINameplateVipType() {
        throw new RuntimeException("stub");
    }

    public Map<Integer, VipOpenInfo> getMOpenInfo() {
        throw new RuntimeException("stub");
    }

    public int hashCode() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    public void setIGrayNameplateFlag(int i2) {
        throw new RuntimeException("stub");
    }

    public void setINameplateVipType(int i2) {
        throw new RuntimeException("stub");
    }

    public void setMOpenInfo(Map<Integer, VipOpenInfo> map) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        throw new RuntimeException("stub");
    }

    public VipBaseInfo(Map<Integer, VipOpenInfo> map, int i2, int i3, String str) {
        throw new RuntimeException("stub");
    }
}
