package in.suriya.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import in.suriya.screens.adapters.MyAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewOne;
    ArrayList<String> myArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewOne = findViewById(R.id.recyclerViewOne);
        recyclerViewOne.setHasFixedSize(true);
        recyclerViewOne.setLayoutManager(new LinearLayoutManager(this));

        myArrayList.add("Uday");
        myArrayList.add("Lokesh");
        myArrayList.add("Suri babu");
        myArrayList.add("Venki");
        myArrayList.add("Srujana");
        myArrayList.add("Tinnava ");
        myArrayList.add("Venki Fucks Srujana");
        myArrayList.add("Uday");
        myArrayList.add("Lokesh");
        myArrayList.add("Suri babu");
        myArrayList.add("Venki");
        myArrayList.add("Srujana");
        myArrayList.add("Uday");
        myArrayList.add("Venki Fucks Srujana");

        MyAdapter myAdapter = new MyAdapter(this, myArrayList);
        recyclerViewOne.setAdapter(myAdapter);
    }
}
