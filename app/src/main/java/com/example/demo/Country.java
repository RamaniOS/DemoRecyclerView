package com.example.demo;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

public class Country implements Parcelable {

    private String title;
    private int flag;

    public Country() {}

    public  Country(String title, int flag) {
        this.title = title;
        this.flag = flag;
    }

    protected Country(Parcel in) {
        title = in.readString();
        flag = in.readInt();
    }

    public static final Creator<Country> CREATOR = new Creator<Country>() {
        @Override
        public Country createFromParcel(Parcel in) {
            return new Country(in);
        }

        @Override
        public Country[] newArray(int size) {
            return new Country[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeInt(flag);
    }
}
