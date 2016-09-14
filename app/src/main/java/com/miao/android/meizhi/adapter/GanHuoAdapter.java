package com.miao.android.meizhi.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.miao.android.meizhi.model.GanHuo;

/**
 * Created by Administrator on 2016/9/11.
 */
public class GanHuoAdapter extends RecyclerArrayAdapter<GanHuo.Result> {

    public GanHuoAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new GanHuoViewHolder(parent);
    }
}
