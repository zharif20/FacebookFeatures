package com.mzharifhadimkhairuddin.facebookfeatures;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.facebook.FacebookSdk;
import com.facebook.share.widget.LikeView;

public class MainActivity extends AppCompatActivity {

    private LikeView likeView;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initialize the SDK before executing any other operations,
        FacebookSdk.sdkInitialize(getApplicationContext());
        setLikeView();

        dialog = new Dialog(this);

    }

    public void showPopup (View view) {
        TextView textViewClose;
        dialog.setContentView(R.layout.custom_popup);
        textViewClose = (TextView) dialog.findViewById(R.id.txtClose);
        textViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
//        setLikeView();
        dialog.show();
    }

    public void setLikeView() {
//        if (likeView == null) {
//           System.out.println("NULL================");
//        } else {
            likeView = (LikeView) findViewById(R.id.likeView);
            likeView.setObjectIdAndType("https://www.facebook.com/androidlift", LikeView.ObjectType.PAGE);
//        }
    }


}
//https://inthecheesefactory.com/blog/how-to-add-facebook-like-button-in-android-app/en
//https://developers.facebook.com/docs/android/like-button