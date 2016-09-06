package a816.android.soldesk.wein;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by soldesk on 2016-09-05.
 */
public class WeInListViewAdapter extends BaseAdapter{
    private String[] data;

    public WeInListViewAdapter(String[] data){
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return data[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = ((LayoutInflater)viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                    .inflate(R.layout.litemlayout,null);
        }
        TextView tv_item = (TextView) view.findViewById(R.id.txtView01);
        tv_item.setText(data[i]);
        return view;
    }
}
