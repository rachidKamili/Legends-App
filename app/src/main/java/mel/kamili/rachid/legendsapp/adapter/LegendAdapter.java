package mel.kamili.rachid.legendsapp.adapter;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.List;

import mel.kamili.rachid.legendsapp.R;
import mel.kamili.rachid.legendsapp.helper.ItemTouchHelperAdapter;
import mel.kamili.rachid.legendsapp.helper.ItemTouchHelperViewHolder;
import mel.kamili.rachid.legendsapp.model.Legend;

public class LegendAdapter extends RecyclerView.Adapter<LegendAdapter.ViewHolder> implements ItemTouchHelperAdapter {

    private static final int GOD_TIER = 0;
    private static final int STRONG_TIER = 1;
    private static final int AVERAGE_TIER = 2;
    private List<Legend> mDataset;

    public LegendAdapter(List<Legend> dataset) {
        mDataset = dataset;
    }

    @NonNull
    @Override
    public LegendAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = null;
        switch (viewType) {
            case GOD_TIER:
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.god_tier_legend_layout, parent, false);
                return new GodViewHolder(v);
            case STRONG_TIER:
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.strong_tier_legend_layout, parent, false);
                break;
            case AVERAGE_TIER:
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.average_tier_legend_layout, parent, false);
                break;
        }

        return new ViewHolder(v);
    }

    @Override
    public int getItemViewType(int position) {
        return mDataset.get(position).getTier();
    }

    @Override
    public void onBindViewHolder(@NonNull final LegendAdapter.ViewHolder holder, int position) {

        holder.mLegendName.setText(mDataset.get(position).getName());
        holder.mLegendSlogan.setText(mDataset.get(position).getSlogan());
        Picasso.get().load(mDataset.get(position).getLogo()).into(holder.mLogo);

        switch (holder.getItemViewType()) {
            case GOD_TIER:
                ((GodViewHolder) holder).mLegendDescription.setText(mDataset.get(position).getDescription());
                ((GodViewHolder) holder).mShowDescBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if ( ((GodViewHolder) holder).mLegendDescription.getVisibility() == View.VISIBLE )
                            ((GodViewHolder) holder).mLegendDescription.setVisibility(View.GONE);
                        else
                            ((GodViewHolder) holder).mLegendDescription.setVisibility(View.VISIBLE);
                    }
                });
                break;
            case STRONG_TIER:
                System.out.println("Strong");
                break;
            case AVERAGE_TIER:
                System.out.println("Average");
                break;
        }

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    @Override
    public void onItemMove(int fromPosition, int toPosition) {
        Legend prev = mDataset.remove(fromPosition);
        mDataset.add(toPosition > fromPosition ? toPosition - 1 : toPosition, prev);
        notifyItemMoved(fromPosition, toPosition);
    }

    @Override
    public void onItemDismiss(int position) {
        mDataset.remove(position);
        notifyItemRemoved(position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder  implements
            ItemTouchHelperViewHolder {
        TextView mLegendName;
        TextView mLegendSlogan;
        ImageView mLogo;

        public ViewHolder(View itemView) {
            super(itemView);
            mLegendName = itemView.findViewById(R.id.legendName);
            mLegendSlogan = itemView.findViewById(R.id.legendSlogan);
            mLogo = itemView.findViewById(R.id.legendLogo);

        }

        @Override
        public void onItemSelected() {
            itemView.setScaleX(1.15f);
            itemView.setScaleY(1.15f);
            //itemView.setBackgroundColor(Color.LTGRAY);
        }

        @Override
        public void onItemClear() {
            itemView.setScaleX(1.f);
            itemView.setScaleY(1.f);
            //itemView.setBackgroundColor(0);
        }
    }

    public static class GodViewHolder extends ViewHolder {

        TextView mLegendDescription;
        Button mShowDescBtn;

        public GodViewHolder(View itemView) {
            super(itemView);
            mLegendDescription = itemView.findViewById(R.id.legendDescription);
            mShowDescBtn = itemView.findViewById(R.id.showDescBtn);
        }
    }


}
