package mel.kamili.rachid.legendsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;
import java.util.Objects;

import mel.kamili.rachid.legendsapp.adapter.LegendAdapter;
import mel.kamili.rachid.legendsapp.data.LegendsFactory;
import mel.kamili.rachid.legendsapp.model.Legend;

public class LegendActivity extends AppCompatActivity {

    private List<Legend> mLegends;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend);

        mLegends = LegendsFactory.getLegendsByGroupName( getIntent().getExtras().getString("GROUP_NAME") );

        mRecyclerView = findViewById(R.id.rvLegends);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new LegendAdapter(mLegends);
        mRecyclerView.setAdapter(mAdapter);


    }
}
