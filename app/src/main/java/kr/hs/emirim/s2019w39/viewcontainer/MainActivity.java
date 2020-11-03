package kr.hs.emirim.s2019w39.viewcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper);
        flipper = findViewById(R.id.flipper);
        Button btnPrev = findViewById(R.id.btn_prev);
        Button btnNext = findViewById(R.id.btn_next);
        btnPrev.setOnClickListener(btnListener);
        btnNext.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_prev:
                    flipper.setFlipInterval(1000);
                    flipper.startFlipping();
                    break;
                case R.id.btn_next:
                    flipper.stopFlipping();
                    break;
            }
        }
    };

    /*View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_prev:
                    flipper.showPrevious();
                    break;
                case R.id.btn_next:
                    flipper.showNext();
                    break;
            }
        }
    };*/
}