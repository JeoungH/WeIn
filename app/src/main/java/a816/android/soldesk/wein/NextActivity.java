package a816.android.soldesk.wein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NextActivity extends AppCompatActivity {

    String[] contents = {"손병희", "이승훈 ", "한용운", "권동진 ", "권병덕 ", "길선주 ", "김병조 ", "김완규 ", "김창준",
            "나용환 ", "나인협 ", "박동완 ", "백용성 ", "박준승 ", "신석구 ", "신홍식 ", "양전백 ", "양한묵 ", "오세창 ", "오화영", "유여대 ",
            "이명룡 ", "이종일 ", "이종훈 ", "이필주 ", "임예환", "최성모 ", "홍기조 ",
            "홍병기 ", "이갑성 ", "박희도 ", "최린 ", "정춘수"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        String data = getIntent().getStringExtra("data");
        int position = getIntent().getIntExtra("position",-1);



    }
}
