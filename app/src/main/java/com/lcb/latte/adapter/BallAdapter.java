package com.lcb.latte.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.lcb.latte.R;
import com.lcb.latte.entity.BallEntity;

import org.jetbrains.annotations.NotNull;

import static com.lcb.latte.entity.BallEntity.TYPE_BLUE;
import static com.lcb.latte.entity.BallEntity.TYPE_RED;

/**
 * @author lcb
 * @date 2020-11-11 16:54
 */
public class BallAdapter extends BaseMultiItemQuickAdapter<BallEntity, BaseViewHolder> {

    public BallAdapter() {
        super(null);
        //有多少种布局就添加多少个
        addItemType(TYPE_RED, R.layout.adapter_ball_red);
        addItemType(TYPE_BLUE, R.layout.adapter_ball_blue);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder helper, BallEntity item) {
        helper.setText(R.id.tv_ball, item.getValue());
    }

}