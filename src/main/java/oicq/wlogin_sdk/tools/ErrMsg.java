package oicq.wlogin_sdk.tools;

import android.os.Parcel;
import android.os.Parcelable;

import oicq.wlogin_sdk.tools.InternationMsg.MSG_TYPE;

public class ErrMsg implements Parcelable, Cloneable {
    public static final Creator<ErrMsg> CREATOR = new Creator<ErrMsg>() {
        public ErrMsg createFromParcel(Parcel parcel) {
            return new ErrMsg(parcel/*, null*/);
        }

        public ErrMsg[] newArray(int i) {
            return new ErrMsg[i];
        }
    };
    private String message;
    private String otherinfo;
    private String title;
    private int type;

//    /* synthetic */ ErrMsg(Parcel parcel, AnonymousClass1 anonymousClass1) {
//        this(parcel);
//    }

    public ErrMsg() {
        this.type = 0;
        this.title = InternationMsg.a(MSG_TYPE.MSG_0);
        this.message = InternationMsg.a(MSG_TYPE.MSG_1);
        this.otherinfo = "";
    }

    public ErrMsg(int i, String str, String str2, String str3) {
        this.type = i;
        this.title = str;
        this.message = str2;
        this.otherinfo = str3;
    }

    public String toString() {
        return ("(" + (this.type < 0 ? Integer.valueOf(this.type) : Integer.toString(this.type)) + ")[") + this.title + "]" + this.message + "[" + this.otherinfo + "]";
    }

    public void setType(int i) {
        this.type = i;
    }

    public int getType() {
        return this.type;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setOtherinfo(String str) {
        this.otherinfo = str;
    }

    public String getOtherinfo() {
        return this.otherinfo;
    }

//    public Object clone() {
//        return super.clone();
//    }

    private ErrMsg(Parcel parcel) {
        readFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.otherinfo);
    }

    public void readFromParcel(Parcel parcel) {
        this.type = parcel.readInt();
        this.title = parcel.readString();
        this.message = parcel.readString();
        this.otherinfo = parcel.readString();
    }
}
