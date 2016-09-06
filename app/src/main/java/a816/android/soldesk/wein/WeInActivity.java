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

        final String[] data = {"손병희 [孫秉熙, 1861.4.8 ~ 1922.5.19] ", "이승훈 [李昇薰, 1864.3.25 ~ 1930.5.9]  ", "한용운 [韓龍雲, 1879.8.29 ~ 1944.6.29] ", "권동진 [權東鎭, 1861.12.15 ~ 1947.3.9] ", "권병덕 [權秉悳, 1867.4.25 ~ 1944.9.15]  [權秉悳] ", "길선주 [吉善宙, 1869 ~ 1935.11]  ", "김병조 [金秉祚, 1877.1.10 ~ 1948.2.25]  ", "김완규 [金完圭, 1876.7.9 ~ 1949.6.20] ", "김창준 [金昌俊, 1889 ~ 1956]",
                "나용환 [羅龍煥, 1864.8.7 ~ 1936.8.19] ", "나인협 [羅仁協, 1872.10.8 ~ 1951.4] ", "박동완 [朴東完, 1885.12.27 ~ 1941]  ", "백용성 [白龍城, 1864.5.8 ~ 1940.2.24]", "박준승 [朴準承, 1865.11.24 ~ 1927.3.24]  ", "신석구 [申錫九, 1875.5.3 ~ 1950.10.10]  ", "신홍식 [申洪植, 1872.3.1 ~ 1939.3.18]  ", "양전백 [梁甸伯, 1869.3.10 ~ 1933.1.17]  ", "양한묵 [梁漢黙, 1862. 4. 29 ~ 1919. 5. 26]  ", "오세창 [吳世昌, 1864.7.15 ~ 1953.4.16] ", "오화영 [吳華英, 1880.4.5 ~ 1950]", "유여대 [劉如大, 1878.11.26 ~ 1937.1.13] ",
                "이명룡 [李明龍, 1872.8.2 ~ 1956.11.12]  ", "이종일[李鍾一, 1858.11.6 ~ 1925.8.31] ", "이종훈 [李鍾勳, 1856.3.2 ~ 1931.5.2]  ", "이필주 [李弼柱, 1869.12.22 ~ 1942.4.21]  ", "임예환 [林禮煥, 1865.7.17 ~ 1949.4]", "최성모 [崔聖模, 1874.1.9 ~ 1937.3.14]  ", "홍기조 [洪基兆, 1865.12.6 ~ 1938.7.6]  ",
                "홍병기 [洪秉箕, 1869.11.5 ~ 1949.1.26]  ", "이갑성 [李甲成, 1889.10.23 ~ 1981.3.25]  ", "박희도 [朴熙道, 1889 ~ 1951]  ", "최린 [崔麟, 1878 ~ 1958] ", "정춘수 [鄭春洙, 1875 ~ 1951] "};

        listView = (ListView) findViewById(R.id.listView);

        WeInListViewAdapter adapter = new WeInListViewAdapter(data);

        listView.setAdapter(adapter);

        // 이벤트 처리

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ld) {

                Log.i("MyTage1", data[position]);
//                Intent intent = new Intent(WeInActivity.this,NextActivity.class);
//                intent.putExtra("data",data[position]);
//                intent.putExtra("position",position);

                String url = "http://terms.naver.com/entry.nhn?docId=1114426&cid=40942&categoryId=33384";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

                Log.i("MyTage2", data[position]); //이승훈
                String url1 = "http://navercast.naver.com/contents.nhn?rid=129&contents_id=4798";
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
                startActivity(intent1);

                Log.i("MyTage3", data[position]); //한용운
                String url2 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(url2));
                startActivity(intent2);

                Log.i("MyTage4", data[position]); //권동진
                String url3 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(url3));
                startActivity(intent3);

                Log.i("MyTage5", data[position]); //권병덕
                String url4 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(url4));
                startActivity(intent4);

                Log.i("MyTage6", data[position]); //길선주
                String url5 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse(url5));
                startActivity(intent5);

                Log.i("MyTage7", data[position]); //김병조
                String url6 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse(url6));
                startActivity(intent6);

                Log.i("MyTage8", data[position]); //김완규
                String url7 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse(url7));
                startActivity(intent7);

                Log.i("MyTage9", data[position]); //김창준
                String url8 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse(url8));
                startActivity(intent8);

                Log.i("MyTage10", data[position]); //나용환
                String url9 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse(url9));
                startActivity(intent9);

                Log.i("MyTage11", data[position]); //나인협
                String url10 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent10 = new Intent(Intent.ACTION_VIEW, Uri.parse(url10));
                startActivity(intent10);

                Log.i("MyTage12", data[position]); //박동완
                String url11 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent11 = new Intent(Intent.ACTION_VIEW, Uri.parse(url11));
                startActivity(intent11);

                Log.i("MyTage13", data[position]); //백용성
                String url12 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent12 = new Intent(Intent.ACTION_VIEW, Uri.parse(url12));
                startActivity(intent12);

                Log.i("MyTage14", data[position]); //박준승
                String url13 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent13 = new Intent(Intent.ACTION_VIEW, Uri.parse(url13));
                startActivity(intent13);

                Log.i("MyTage15", data[position]); //신석구
                String url14 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent14 = new Intent(Intent.ACTION_VIEW, Uri.parse(url14));
                startActivity(intent14);

                Log.i("MyTage16", data[position]); //신홍식
                String url15 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent15 = new Intent(Intent.ACTION_VIEW, Uri.parse(url15));
                startActivity(intent15);

                Log.i("MyTage17", data[position]);//양전백
                String url16 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent16 = new Intent(Intent.ACTION_VIEW, Uri.parse(url16));
                startActivity(intent16);

                Log.i("MyTage18", data[position]);//양한묵
                String url17 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent17 = new Intent(Intent.ACTION_VIEW, Uri.parse(url17));
                startActivity(intent17);

                Log.i("MyTage19", data[position]);//오세창
                String url18 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent18 = new Intent(Intent.ACTION_VIEW, Uri.parse(url18));
                startActivity(intent18);

                Log.i("MyTage20", data[position]);//오화영
                String url19 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent19 = new Intent(Intent.ACTION_VIEW, Uri.parse(url19));
                startActivity(intent19);

                Log.i("MyTage21", data[position]);//유여대
                String url20 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent20 = new Intent(Intent.ACTION_VIEW, Uri.parse(url20));
                startActivity(intent20);

                Log.i("MyTage22", data[position]);//이명룡
                String url21 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent21 = new Intent(Intent.ACTION_VIEW, Uri.parse(url21));
                startActivity(intent21);

                Log.i("MyTage23", data[position]);//이종일
                String url22 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent22 = new Intent(Intent.ACTION_VIEW, Uri.parse(url22));
                startActivity(intent22);

                Log.i("MyTage24", data[position]);//이종훈
                String url23 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent23 = new Intent(Intent.ACTION_VIEW, Uri.parse(url23));
                startActivity(intent23);

                Log.i("MyTage25", data[position]);//이필주
                String url24 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent24 = new Intent(Intent.ACTION_VIEW, Uri.parse(url24));
                startActivity(intent24);

                Log.i("MyTage26", data[position]); //임예환
                String url25 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent25 = new Intent(Intent.ACTION_VIEW, Uri.parse(url25));
                startActivity(intent25);

                Log.i("MyTage27", data[position]);//최성모
                String url26 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent26 = new Intent(Intent.ACTION_VIEW, Uri.parse(url26));
                startActivity(intent26);


                Log.i("MyTage28", data[position]);//홍기조
                String url27 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent27 = new Intent(Intent.ACTION_VIEW, Uri.parse(url27));
                startActivity(intent27);


                Log.i("MyTage29", data[position]);//홍병기
                String url28 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent28 = new Intent(Intent.ACTION_VIEW, Uri.parse(url28));
                startActivity(intent28);


                Log.i("MyTage30", data[position]);//이갑성
                String url29 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent29 = new Intent(Intent.ACTION_VIEW, Uri.parse(url29));
                startActivity(intent29);


                Log.i("MyTage31", data[position]);//박희도
                String url30 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent30 = new Intent(Intent.ACTION_VIEW, Uri.parse(url30));
                startActivity(intent30);


                Log.i("MyTage32", data[position]);//최린
                String url31 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent31 = new Intent(Intent.ACTION_VIEW, Uri.parse(url31));
                startActivity(intent31);

                Log.i("MyTage33", data[position]);//정춘수
                String url32 = "http://terms.naver.com/entry.nhn?docId=1141670&cid=40942&categoryId=33384";
                Intent intent32 = new Intent(Intent.ACTION_VIEW, Uri.parse(url32));
                startActivity(intent32);


            }
        });
    }
}