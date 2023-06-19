package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* loaded from: classes.dex */
public final class PrivilegeInfo extends JceStruct {
    public int iFeeType;
    public int iFlag;
    public int iIsBig;
    public int iIsRemind;
    public int iLevel;
    public int iRemindTime;
    public int iSort;
    public int iTipsTimes;
    public int iType;
    public boolean isOpen;
    public String strDeluxeIconUrl;
    public String strIconUrl;
    public String strJumpUrl;
    public String strTipsIconUrl;

    public PrivilegeInfo() {
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

    public PrivilegeInfo(int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, int i7, int i8, int i9, String str4, int i10) {
        throw new RuntimeException("stub");
    }
}
