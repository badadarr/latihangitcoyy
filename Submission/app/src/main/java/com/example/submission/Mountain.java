package com.example.submission;

import android.os.Parcel;
import android.os.Parcelable;

public class Mountain implements Parcelable {
    private String name;
    private String details;
    private String photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.details);
        dest.writeString(this.photo);
    }

    public Mountain() {
    }

    protected Mountain(Parcel in) {
        this.name = in.readString();
        this.details = in.readString();
        this.photo = in.readString();
    }

    public static final Creator<Mountain> CREATOR = new Creator<Mountain>() {
        @Override
        public Mountain createFromParcel(Parcel source) {
            return new Mountain(source);
        }

        @Override
        public Mountain[] newArray(int size) {
            return new Mountain[size];
        }
    };
}