package com.example.recyclebin;

import android.net.Uri;

public class ModelImagePicked {
    /*---Variables---*/
    String id = "";
    Uri imageUri = null;
    String imageUrl = null;
    Boolean fromInternet = false; //this model class will be used to show images (picked/taken from Gallery/Camera - false or from firebase - true) in AdCreateActivity.


    /*---Empty constructor require for firebase db-=-*/
    public ModelImagePicked() {

    }


    /*---Constructor with all params---*/
    public ModelImagePicked(String id, Uri imageUri, String imageUrl, Boolean fromInternet) {
        this.id = id;
        this.imageUri = imageUri;
        this.imageUrl = imageUrl;
        this.fromInternet = fromInternet;
    }

    /*---Getter & Setters---*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getFromInternet() {
        return fromInternet;
    }

    public void setFromInternet(Boolean fromInternet) {
        this.fromInternet = fromInternet;
    }
}