package com.mufidjamaluddin.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by mufidjamaluddin on 21/03/2018.
 */

public class AdapterTempatWisata extends ArrayAdapter
{
    public Activity context;
    public int textViewResourceId;

    static class ViewHolder
    {
        public TextView title;
        public TextView description;
    }

    public AdapterTempatWisata(Activity context, int textViewResourceId)
    {
        super(context,textViewResourceId);
        this.context = context;
        this.textViewResourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = null;
        if(convertView==null)
        {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            view = layoutInflater.inflate(textViewResourceId, null);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.title = view.findViewById(R.id.title);
            viewHolder.description = view.findViewById(R.id.description);

            view.setTag(viewHolder);
        }
        else
            view = convertView;

        ViewHolder viewHolder = (ViewHolder) view.getTag();
        TempatWisata tempatWisata = (TempatWisata) getItem(position);
        viewHolder.title.setText(tempatWisata.getTitle());
        viewHolder.description.setText(tempatWisata.getDescription());

        return view;
    }
}
