package com.example.aiub.listviewcustomadapterexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    int []pImages;
    String []playerNames;
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] playerNames, int[] pImages) {
        this.context=context;
        this.playerNames=playerNames;
        this.pImages=pImages;
    }


    @Override
    public int getCount() {
        return playerNames.length ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=  inflater.inflate(R.layout.player_list_layout,parent,false);

            ImageView imageView=convertView.findViewById(R.id.imageViesId);
            TextView textView=convertView.findViewById(R.id.playerTextViewId);
            imageView.setImageResource(pImages[position]);
            textView.setText(playerNames[position]);

        }
        return convertView;
    }
}
