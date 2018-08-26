package com.example.b40.coding2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class ItemActivity extends AppCompatActivity {

    private ImageView image;
    private TextView title,deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        image = findViewById(R.id.imageItem);
        title = findViewById(R.id.title);
        deskripsi = findViewById(R.id.sinopsis);


        String judul = getIntent().getStringExtra("title");
        String snps = getIntent().getStringExtra("sinopsis");
        int images = getIntent().getIntExtra("image", R.mipmap.ic_launcher);

        getSupportActionBar().setTitle(judul);

        image.setImageResource(images);
        title.setText(judul);
        deskripsi.setText(snps);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
