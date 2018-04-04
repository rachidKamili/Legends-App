package mel.kamili.rachid.legendsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.List;

import mel.kamili.rachid.legendsapp.adapter.LegendAdapter;
import mel.kamili.rachid.legendsapp.data.LegendsFactory;
import mel.kamili.rachid.legendsapp.helper.ItemTouchHelperAdapter;
import mel.kamili.rachid.legendsapp.helper.SimpleItemTouchHelperCallback;
import mel.kamili.rachid.legendsapp.model.Legend;

public class LegendActivity extends AppCompatActivity {

    private List<Legend> mLegends;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ItemTouchHelper mItemTouchHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend);

        mLegends = LegendsFactory.getLegendsByGroupName( getIntent().getExtras().getString("GROUP_NAME") );

        bindViews();

    }

    private void bindViews() {
        mRecyclerView = findViewById(R.id.rvLegends);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new LegendAdapter(mLegends);
        mRecyclerView.setAdapter(mAdapter);

        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback((ItemTouchHelperAdapter) mAdapter);
        mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(mRecyclerView);

    }
}
