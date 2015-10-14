package upv.techfest.taller.ui.Adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import upv.techfest.taller.R;
import upv.techfest.taller.model.Utils.TechfestTypefaces;
import upv.techfest.taller.ui.Holders.BasicsAndroidHolder;


public class BasicsAndroidAdapter extends ArrayAdapter<String> {
    private Activity context;
    private int layout;
    private ArrayList<String> list;
    private Typeface roboto;

    public BasicsAndroidAdapter(Activity context, int resource, ArrayList<String> objects) {
        super(context, resource, objects);

        this.context = context;
        this.layout = resource;
        this.list = objects;

        try{
            roboto = TechfestTypefaces.getFont(context.getAssets(), 4);
        }catch (Exception e){
            System.err.print("Error to put typeface");
        }

    }

    @Override
    public int getCount(){
        return list.size();
    }

    @Override
    public String getItem(int position){
        return list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View item = convertView;

        BasicsAndroidHolder holder;

        if(item == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            item = inflater.inflate(layout, parent, false);
            holder = new BasicsAndroidHolder();

            holder.textView = (TextView)item.findViewById(R.id.lv_item_basic_tv);

            item.setTag(holder);

        }else{
            holder = (BasicsAndroidHolder)item.getTag();
        }

        if(roboto!=null)
            holder.textView.setTypeface(roboto);

        holder.textView.setText(list.get(position));

        return (item);
    }


}
