package com.zein.cardviewgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardSedih,cardCry,cardDevil, cardLaugth,cardBusy,cardLove,cardMad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardBusy = findViewById(R.id.cardBusy);
        cardCry = findViewById(R.id.cardCry);
        cardDevil = findViewById(R.id.cardDevil);
        cardLaugth = findViewById(R.id.cardLaught);
        cardLove = findViewById(R.id.cardLove);
        cardMad = findViewById(R.id.cardMad);

        cardBusy.setOnClickListener(this);
        cardCry.setOnClickListener(this);
        cardDevil.setOnClickListener(this);
        cardLaugth.setOnClickListener(this);
        cardLove.setOnClickListener(this);
        cardMad.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cardBusy:
                Toast.makeText(getApplicationContext(),"CardBusy",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cardCry:
                Toast.makeText(getApplicationContext(),"CardCry",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cardDevil:
                Toast.makeText(getApplicationContext(),"CardDevil",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cardLaught:
                Toast.makeText(getApplicationContext(),"CardLaught",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cardLove:
                Toast.makeText(getApplicationContext(),"CardLove",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cardMad:
                Toast.makeText(getApplicationContext(),"CardMad",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
