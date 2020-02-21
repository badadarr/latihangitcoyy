package com.example.myrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Gunung implements Parcelable {
    private String nama;
    private String detil;
    private int gambar;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetil() {
        return detil;
    }

    public void setDetil(String detil) {
        this.detil = detil;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.detil);
        dest.writeInt(this.gambar);
    }

    public Gunung() {
    }

    protected Gunung(Parcel in) {
        this.nama = in.readString();
        this.detil = in.readString();
        this.gambar = in.readInt();
    }

    public static final Parcelable.Creator<Gunung> CREATOR = new Parcelable.Creator<Gunung>() {
        @Override
        public Gunung createFromParcel(Parcel source) {
            return new Gunung(source);
        }

        @Override
        public Gunung[] newArray(int size) {
            return new Gunung[size];
        }
    };
}
