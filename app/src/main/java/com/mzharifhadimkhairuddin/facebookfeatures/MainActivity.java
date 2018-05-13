package com.mzharifhadimkhairuddin.facebookfeatures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.FacebookSdk;
import com.facebook.share.widget.LikeView;

public class MainActivity extends AppCompatActivity {

    private LikeView likeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initialize the SDK before executing any other operations,
        FacebookSdk.sdkInitialize(getApplicationContext());
        setLikeView();

    }

    private void setLikeView() {
        likeView = (LikeView) findViewById(R.id.likeView);
        likeView.setObjectIdAndType("https://www.facebook.com/androidlift", LikeView.ObjectType.PAGE);
    }


}
//https://inthecheesefactory.com/blog/how-to-add-facebook-like-button-in-android-app/en
//https://developers.facebook.com/docs/android/like-button