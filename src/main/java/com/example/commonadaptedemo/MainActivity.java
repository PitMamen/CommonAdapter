package com.example.commonadaptedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.commonadaptedemo.common.Bean;
import com.example.commonadaptedemo.common.CommonAdapte;
import com.example.commonadaptedemo.common.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListViewm;
    private List<Bean> mListm =  new ArrayList<>();
    private String url1  = "http://mmbiz.qpic.cn/mmbiz/PwIlO51l7wuFyoFwAXfqPNETWCibjNACIt6ydN7vw8LeIwT7IjyG3eeribmK4rhibecvNKiaT2qeJRIWXLuKYPiaqtQ/0";
    private String url2  = "http://img4q.duitang.com/uploads/item/201408/14/20140814211503_fruNR.thumb.700_0.jpeg";
    private String url3  = "http://img4q.duitang.com/uploads/item/201408/26/20140826221336_KiAAV.jpeg";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListm.add(new Bean(url1,"刘嘻嘻","男"));
        mListm.add(new Bean(url2,"孙哈哈","女"));
        mListm.add(new Bean(url3,"刘大脑袋","男"));


        mListViewm = (ListView) findViewById(R.id.lv_content);
        mListViewm.setAdapter(new CommonAdapte(this,R.layout.item_listview,mListm) {
            @Override
            protected void convert(ViewHolder viewHolder, Object item, final int position) {
                 Bean bean = ((Bean) item);
                viewHolder.setText(R.id.tv_1, bean.getName())
                        .setImageUrl(R.id.iv_ima, bean.getImageView(), MainActivity.this, new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.e("DEMO", "onClick: "+"点击了第"+position+"个" );
                            }
                        })
                        .setText(R.id.tv_2, bean.getSex());

                mListViewm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Log.e("COMMON", "onItemClick: "+ "点击了第"+position+"个");
                    }
                });

            }
        });
    }
}
