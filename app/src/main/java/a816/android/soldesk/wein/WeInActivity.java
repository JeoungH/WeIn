package a816.android.soldesk.wein;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WeInActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we_in);

        final String[] wein_data = {"이승훈 [李昇薰, 1864.3.25 ~ 1930.5.9]  ", "한용운 [韓龍雲, 1879.8.29 ~ 1944.6.29] ", "권동진 [權東鎭, 1861.12.15 ~ 1947.3.9] ", "권병덕 [權秉悳, 1867.4.25 ~ 1944.9.15]  [權秉悳] ", "길선주 [吉善宙, 1869 ~ 1935.11]  ", "김병조 [金秉祚, 1877.1.10 ~ 1948.2.25]  ", "김완규 [金完圭, 1876.7.9 ~ 1949.6.20] ", "김창준 [金昌俊, 1889 ~ 1956]",
                "나용환 [羅龍煥, 1864.8.7 ~ 1936.8.19] ", "나인협 [羅仁協, 1872.10.8 ~ 1951.4] ", "박동완 [朴東完, 1885.12.27 ~ 1941]  ", "백용성 [白龍城, 1864.5.8 ~ 1940.2.24]", "박준승 [朴準承, 1865.11.24 ~ 1927.3.24]  ", "신석구 [申錫九, 1875.5.3 ~ 1950.10.10]  ", "신홍식 [申洪植, 1872.3.1 ~ 1939.3.18]  ", "양전백 [梁甸伯, 1869.3.10 ~ 1933.1.17]  ", "양한묵 [梁漢黙, 1862. 4. 29 ~ 1919. 5. 26]  ", "오세창 [吳世昌, 1864.7.15 ~ 1953.4.16] ", "오화영 [吳華英, 1880.4.5 ~ 1950]", "유여대 [劉如大, 1878.11.26 ~ 1937.1.13] ",
                "이명룡 [李明龍, 1872.8.2 ~ 1956.11.12]  ", "이종일[李鍾一, 1858.11.6 ~ 1925.8.31] ", "이종훈 [李鍾勳, 1856.3.2 ~ 1931.5.2]  ", "이필주 [李弼柱, 1869.12.22 ~ 1942.4.21]  ", "임예환 [林禮煥, 1865.7.17 ~ 1949.4]", "최성모 [崔聖模, 1874.1.9 ~ 1937.3.14]  ", "홍기조 [洪基兆, 1865.12.6 ~ 1938.7.6]  ",
                "홍병기 [洪秉箕, 1869.11.5 ~ 1949.1.26]  ", "이갑성 [李甲成, 1889.10.23 ~ 1981.3.25]  ", "박희도 [朴熙道, 1889 ~ 1951]  ", "최린 [崔麟, 1878 ~ 1958] ", "정춘수 [鄭春洙, 1875 ~ 1951] "};

        final WeInDTO[] weInList = {
                new WeInDTO("손병희 [孫秉熙, 1861.4.8 ~ 1922.5.19] ","http://terms.naver.com/entry.nhn?docId=1114426&cid=40942&categoryId=33384"),

        };
        listView = (ListView) findViewById(R.id.listView);

        final WeInListViewAdapter adapter = new WeInListViewAdapter(weInList);

        listView.setAdapter(adapter);

        // 이벤트 처리

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ld) {

                Log.i("MyTage1", wein_data[position]);
//                Intent intent = new Intent(WeInActivity.this,NextActivity.class);
//                intent.putExtra("data",data[position]);
//                intent.putExtra("position",position);
                String url = adapter.getWein(position).getUrl();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}