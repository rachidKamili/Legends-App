package mel.kamili.rachid.legendsapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.IOException;

import mel.kamili.rachid.legendsapp.data.ProxyFactory;
import mel.kamili.rachid.legendsapp.model.Legend;

public class LegendDetailsActivity extends AppCompatActivity {

    private Legend mLegend;
    private ImageView ivLogo;
    private ImageView ivPicture;
    private TextView tvName;
    private TextView tvDesc;
    private TextView tvSlogan;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend_details);

        mLegend = (Legend) getIntent().getExtras().getSerializable("LEGEND_OBJECT");

        bindViews();
        initiateViews();

    }

    private void bindViews() {
        ivLogo = findViewById(R.id.ivLogo);
        ivPicture = findViewById(R.id.ivPicture);
        tvName = findViewById(R.id.tvName);
        tvDesc = findViewById(R.id.tvDesc);
        tvSlogan = findViewById(R.id.tvSlogan);
        mMediaPlayer = new MediaPlayer();
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

    }

    private void initiateViews() {
        tvName.setText(mLegend.getName());
        tvDesc.setText(mLegend.getDescription());
        tvSlogan.setText(mLegend.getSlogan());
        Picasso.get().load(mLegend.getLogo()).into(ivLogo);
        Picasso.get().load(mLegend.getImage()).into(ivPicture);
        String proxyUrl = ProxyFactory.getProxy(this).getProxyUrl(mLegend.getSound());
        try {
            mMediaPlayer.setDataSource(proxyUrl);
            mMediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void play(View view) {
        playLegendSound();
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    private void playLegendSound() {
        if(mMediaPlayer != null){
            mMediaPlayer.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        releaseMediaPlayer();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        releaseMediaPlayer();
    }
}
