package com.example.ththu6_2_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

        ListView lv;
        ListViewBaseAdapter adapter;
    ArrayList<product> arr_pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitys);
        lv = (ListView) findViewById(R.id.listview);
        arr_pro=new ArrayList<product>();
       arr_pro.add(new product(R.drawable.logo1, "Lê Việt Long", "1811505310124",R.drawable.ic_caidat1_foreground));
        arr_pro.add(new product(R.drawable.vietnam, "Vô Tình", "Lâm Hùng",R.drawable.ic_caidat1_foreground));
        arr_pro.add(new product(R.drawable.logo1, "Tìm Lại Bầu Trời", "Tuấn Hưng",R.drawable.ic_caidat1_foreground));
        arr_pro.add(new product(R.drawable.vietnam, "Hai Chữ Đã Từng", "Như Việt,ACV",R.drawable.ic_caidat1_foreground));
        arr_pro.add(new product(R.drawable.logo1, "This Way", "CARA",R.drawable.ic_caidat1_foreground));
        arr_pro.add(new product(R.drawable.vietnam, "Sai Lầm Của Anh", "Nguyễn Bảo Linh",R.drawable.ic_caidat1_foreground));
        arr_pro.add(new product(R.drawable.logo1, "Buồn Làm Chi Em Ơi", "Đinh Tùng Huy",R.drawable.ic_caidat1_foreground));
        arr_pro.add(new product(R.drawable.vietnam, "Điêu Toa", "Masew,Pháo",R.drawable.ic_caidat1_foreground));
        adapter=new ListViewBaseAdapter(arr_pro,this);
        lv.setAdapter(adapter);
    }
}