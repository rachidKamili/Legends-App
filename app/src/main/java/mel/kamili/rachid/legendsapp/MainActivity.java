package mel.kamili.rachid.legendsapp;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.danikula.videocache.HttpProxyCacheServer;

import java.io.IOException;

import mel.kamili.rachid.legendsapp.data.ProxyFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToGroupLegendActivity(View view) {
        Intent intent = new Intent(this,LegendGroupActivity.class);
        startActivity(intent);
    }
}
