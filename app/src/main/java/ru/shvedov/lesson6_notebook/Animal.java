package ru.shvedov.lesson6_notebook;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {

     private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected Animal(Parcel in) {
        name = in.readString();
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
