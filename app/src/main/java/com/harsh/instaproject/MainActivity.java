package com.harsh.instaproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.harsh.instaproject.Adapters.InstaListAdapter;
import com.harsh.instaproject.Utils.Utils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<InstaModel> dataList = new ArrayList<>();
    RecyclerView rcvList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvList = findViewById(R.id.rcvList);

        for (int i = 0; i < Utils.image.length; i++) {
            InstaModel model = new InstaModel(Utils.dp[i],Utils.image[i], Utils.name[i], Utils.userName[i] );
            dataList.add(model);
        }

        rcvList.setLayoutManager(new LinearLayoutManager(this));
        rcvList.setAdapter(new InstaListAdapter(dataList));

    }
}