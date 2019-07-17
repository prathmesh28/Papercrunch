package com.papercrunch.appit.SHARE;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.papercrunch.appit.R;

public class Share extends AppCompatActivity {
    CardView sharelink,shareapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        sharelink=(CardView)findViewById(R.id.SharepLinkCard);



        sharelink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent share=new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT,"Insert subject here");
                String app_url="Visit: http://www.papercrunchgoa.com/";
                share.putExtra(Intent.EXTRA_TEXT,app_url);
                startActivity(Intent.createChooser(share,"Shear via"));

            }
        });

    }
}
