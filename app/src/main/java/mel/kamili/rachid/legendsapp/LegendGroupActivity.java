package mel.kamili.rachid.legendsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import mel.kamili.rachid.legendsapp.adapter.LegendGroupAdapter;
import mel.kamili.rachid.legendsapp.data.LegendsFactory;
import mel.kamili.rachid.legendsapp.model.LegendGroup;

public class LegendGroupActivity extends AppCompatActivity {


    private ListView mListViewLegendGroup;
    private LegendGroupAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend_group);

        bindListView();
    }

    private void bindListView() {
        mListViewLegendGroup = findViewById(R.id.listViewLegendGroup);
        List<LegendGroup> listGroup = new ArrayList<>(LegendsFactory.createLegends().keySet());
        mAdapter = new LegendGroupAdapter(this, R.layout.legend_group_item_left,listGroup);
        mListViewLegendGroup.setAdapter(mAdapter);

    }
}
