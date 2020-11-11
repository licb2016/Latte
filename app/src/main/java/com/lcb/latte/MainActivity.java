package com.lcb.latte;

import android.os.Bundle;
import android.view.View;

import com.lcb.latte.adapter.BallAdapter;
import com.lcb.latte.entity.BallEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.rv)
    RecyclerView mRecyclerView;
    private BallAdapter mBallAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        mBallAdapter = new BallAdapter();
        initData();
        mRecyclerView.setAdapter(mBallAdapter);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 5));
    }


    private void initData() {
        //数据的获取
        List<BallEntity> ballEntityList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int value = new Random().nextInt(35);
            ballEntityList.add(new BallEntity(Integer.toString(value)));
        }

        //设置数据,如果涉及到主线程和子线程的问题需要切换线程
        mBallAdapter.setList(ballEntityList);

        //开启动画

        //item的点击事件,具体的点击事件去convert里去设置


        //设置空数据页面,如果数据为空会显示的页面
        View emptyView = View.inflate(this, R.layout.layout_empty, null);
        mBallAdapter.setEmptyView(emptyView);
    }

}