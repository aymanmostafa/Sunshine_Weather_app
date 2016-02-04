package com.example.ayman.sunshine3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ayman on 03-Dec-15.
 */
public class Custom_adapter_implement extends BaseAdapter {



    Context myCon;
    ArrayList<String> con,cap;
    LayoutInflater inf;

    public Custom_adapter_implement(Context myCon,ArrayList<String> con,ArrayList<String> cap){
        this.cap=cap;
        this.con=con;
        this.myCon=myCon;
        inf= (LayoutInflater) myCon.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return cap.size();
    }

    @Override
    public Object getItem(int position) {
        return con.get(position)+" , "+cap.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View myView=convertView; // بعمل كده عشان موضوع انه مش بيعمل فيو جديد كل مرة ولكن احيانا بيغير الداتا اللي فيه
        // فهو بيشوف الفيو بناااال ولا لأ عشان لو بنااااال يبقى هعمل فيو م الاول لكن لو موجود قبل كده يبقى هعدل عليه بس

        if (myView==null)
            myView=inf.inflate(R.layout.item_row,null);

        TextView contv=(TextView) myView.findViewById(R.id.textView_country);
        TextView coptv=(TextView) myView.findViewById(R.id.textView_capital);

        contv.setText(con.get(position));
        coptv.setText(cap.get(position));



        return myView;
    }
}
