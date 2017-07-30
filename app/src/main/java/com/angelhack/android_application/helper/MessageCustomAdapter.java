package com.angelhack.android_application.helper;

/**
 * Created by matheuscatossi on 30/07/17.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.angelhack.android_application.R;
import com.angelhack.android_application.model.Message;

import java.util.ArrayList;


/**
 * Created by matheuscatossi on 07/07/17.
 */

public class MessageCustomAdapter extends ArrayAdapter<Message> implements View.OnClickListener {

    private ArrayList<Message> dataSet;
    private Context mContext;

    @Override
    public void onClick(View v) {

    }

    private static class ViewHolder {
        TextView tv_name;
        TextView tv_message;
        LinearLayout ll_line;
    }

    public MessageCustomAdapter(ArrayList<Message> data, Context context) {
        super(context, R.layout.row_item_message, data);

        this.dataSet = data;
        this.mContext = context;
    }

    private int lastPosition = -1;

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        final Message message = getItem(position);
        ViewHolder viewHolder;

        viewHolder = new ViewHolder();
        LayoutInflater inflater = LayoutInflater.from(getContext());

        if(message.getSender().equals("client")) {
            convertView = inflater.inflate(R.layout.row_item_message, parent, false);
        }


        viewHolder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
        viewHolder.tv_message = (TextView) convertView.findViewById(R.id.tv_message);
        viewHolder.ll_line = (LinearLayout) convertView.findViewById(R.id.ll_line);

        convertView.setTag(viewHolder);


        viewHolder.tv_name.setText(message.getName() + ", diz: ");
        viewHolder.tv_message.setText(message.getMessage());


        lastPosition = position;

        viewHolder.ll_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        return convertView;
    }
}