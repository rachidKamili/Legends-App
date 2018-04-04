package mel.kamili.rachid.legendsapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import mel.kamili.rachid.legendsapp.adapter.LegendGroupAdapter;
import mel.kamili.rachid.legendsapp.data.LegendsFactory;
import mel.kamili.rachid.legendsapp.model.LegendGroup;

public class LegendGroupActivity extends AppCompatActivity {


    private ListView mListViewLegendGroup;
    private LegendGroupAdapter mAdapter;
    private List<LegendGroup> mListGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend_group);

        bindListView();
    }

    private void bindListView() {
        mListViewLegendGroup = findViewById(R.id.listViewLegendGroup);
        mListGroup = new ArrayList<>(LegendsFactory.createLegends().keySet());
        mAdapter = new LegendGroupAdapter(this, R.layout.legend_group_item_left, mListGroup);
        mListViewLegendGroup.setAdapter(mAdapter);
        final Context context = this;
        mListViewLegendGroup.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String groupName = mListGroup.get(position).getName();
                Log.d("TEST", "onCreate: "+groupName);
                Intent intent = new Intent(getApplicationContext(), LegendActivity.class);
                Bundle b = new Bundle();
                b.putString("GROUP_NAME", groupName);
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }

        });
    }
}
