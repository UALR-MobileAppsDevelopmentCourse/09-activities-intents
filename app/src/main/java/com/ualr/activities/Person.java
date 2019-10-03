package com.ualr.activities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by irconde on 2019-10-03.
 */
// TODO 01. We can share complex objects between activities. The class must implement the Parcelable interface
public class Person implements Parcelable {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // TODO 03. Classes implementing the Parcelable interface must also have a non-null static field
    //  called CREATOR of a type that implements the Parcelable.Creator interface
    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    // TODO 02. We have to implement the describeContents and writeToParcel methods of the Parcelable interface
    @Override
    public int describeContents() {
        return 0;
    }

    // TODO 05. Note that we have to follow the same order both when we put and get data in and from the parcel
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.age);
    }

    // TODO 04. We have to define a constructor that has a Parcel object as input parameter
    protected Person(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
    }

}
