package mel.kamili.rachid.legendsapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;

import mel.kamili.rachid.legendsapp.R;
import mel.kamili.rachid.legendsapp.model.LegendGroup;

public class LegendGroupAdapter extends ArrayAdapter<LegendGroup> {
    private final int ITEM_ON_LEFT = 0;
    private final int ITEM_ON_RIGHT = 1;
    private final List<LegendGroup> legendGroup;

    public LegendGroupAdapter(@NonNull Context context, int resource, @NonNull List<LegendGroup> objects) {
        super(context, resource, objects);
        this.legendGroup = objects;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ? ITEM_ON_LEFT : ITEM_ON_RIGHT;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LegendGroup group = getItem(position);
        int type = getItemViewType(position);
        if (convertView == null) {
            if (type == ITEM_ON_LEFT)
                convertView = LayoutInflater.from(getContext())
                        .inflate(R.layout.legend_group_item_left, null);
            else //if (type == ITEM_ON_RIGHT)
                convertView = LayoutInflater.from(getContext())
                        .inflate(R.layout.legend_group_item_right, null);

            //Bind views
            ImageView ivGoupBackground = convertView.findViewById(R.id.ivGoupBackground);
            final ImageView ivGroupLogo = convertView.findViewById(R.id.ivGroupLogo);
            TextView groupName = convertView.findViewById(R.id.groupName);
            TextView groupSlogo = convertView.findViewById(R.id.groupSlogo);

            //set data
            Picasso.get().setLoggingEnabled(true);
            Picasso.get().load(group.getLogo()).into(ivGroupLogo);
            Picasso.get().load(group.getImage()).into(ivGoupBackground);
            groupName.setText(group.getName().toUpperCase());
            groupSlogo.setText(group.getSlogan().toUpperCase());
        }

        return convertView;
    }
}
