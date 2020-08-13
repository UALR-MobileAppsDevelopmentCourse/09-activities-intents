package com.ualr.activities;

/**
 * Created by irconde on 2019-10-03.
 */
// TODO 01. We can share complex objects between activities. The class must implement the Parcelable interface
public class Person {

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

    // TODO 02. We have to implement the describeContents and writeToParcel methods of the Parcelable interface

    // TODO 04. We have to define a constructor that has a Parcel object as input parameter

}
