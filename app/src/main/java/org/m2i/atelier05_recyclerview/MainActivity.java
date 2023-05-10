package org.m2i.atelier05_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import org.m2i.atelier05_recyclerview.adapters.GoalAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView goalList ;

    // BD , API , Files, ..
    List<String> goals = List.of("Learn Java OOP", "Learn Android", "Learn IOS",
            "Learn Ionic", "Learn DevOps", "Learn Docker", "Learn Kubernetes");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        goalList = findViewById(R.id.goals_list);

        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        goalList.setLayoutManager(linearLayout);

        GoalAdapter adapter = new GoalAdapter(goals);
        goalList.setAdapter(adapter);
    }
}