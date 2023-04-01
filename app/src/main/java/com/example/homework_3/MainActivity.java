package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView vidView = (VideoView)findViewById(R.id.myVideo);
        String vidAddress = "https://archive.org/download/2002-360p-1/%D0%9A%D0%BE%D1%80%D0%BE%D0%BB%D1%8C%20%D0%B8%20%D0%A8%D1%83%D1%82%20__%20%D0%9D%D0%90%D0%A8%D0%95%D0%A1%D0%A2%D0%92%D0%98%D0%95%202002%20__%20%D0%9D%D0%90%D0%A8%D0%95%20%28360p%29%20%281%29.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        vidView.setVideoURI(vidUri);
        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(vidView);
        vidView.setMediaController(vidControl);
        vidView.start();
    }
}