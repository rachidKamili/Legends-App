package mel.kamili.rachid.legendsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mel.kamili.rachid.legendsapp.model.Legend;

public class LegendDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend_details);

        Legend legend = (Legend) getIntent().getExtras().getSerializable("LEGEND_OBJECT");

        System.out.println(legend.getName() + " - " + legend.getSlogan());
    }
}
