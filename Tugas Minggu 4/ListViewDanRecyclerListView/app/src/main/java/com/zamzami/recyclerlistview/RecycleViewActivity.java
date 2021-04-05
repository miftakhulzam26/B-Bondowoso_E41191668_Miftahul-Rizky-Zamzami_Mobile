package com.zamzami.recyclerlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecycleViewActivity extends AppCompatActivity {

    private RecyclerView rvMahasiswa;
    private MahasiswaAdapter adapterMahasiswa;
    private ArrayList<Mahasiswa> mDataMahasiswa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        adapterMahasiswa = new MahasiswaAdapter(mDataMahasiswa);

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(adapterMahasiswa);
    }

    private void addData() {
        mDataMahasiswa = new ArrayList<>();
        mDataMahasiswa.add(new Mahasiswa("Miftahul Rizky Zamzami", "E41191668", "08990857566"));
        mDataMahasiswa.add(new Mahasiswa("Sulton Mubarok", "E4110213", "1231842141"));
        mDataMahasiswa.add(new Mahasiswa("Aziz", "E41191668", "08990857566"));
        mDataMahasiswa.add(new Mahasiswa("Ragil", "E41191668", "08990857566"));
        mDataMahasiswa.add(new Mahasiswa("Ivon", "E41191668", "08990857566"));
    }
}