package com.example.tests_states;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StateAdapter extends ArrayAdapter<State> {

    private LayoutInflater inflater;
    private int layout;
    private List<State> states;




    public StateAdapter(Context context, int list_item, List<State> states) {
        super(context, list_item, states);
        this.states = states;
        this.layout=list_item;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView==null){
            convertView = inflater.inflate(this.layout, parent,false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        State state = states.get(position);

        viewHolder.imageView.setImageResource(state.getFlagResource());
        viewHolder.nameView.setText(state.getName());
        viewHolder.capitalView.setText(state.getCapital());

        return convertView;
    }
    private class ViewHolder {
        final ImageView imageView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            imageView = (ImageView)view.findViewById(R.id.flag);
            nameView = (TextView) view.findViewById(R.id.name);
            capitalView = (TextView) view.findViewById(R.id.capital);
        }
    }
}
