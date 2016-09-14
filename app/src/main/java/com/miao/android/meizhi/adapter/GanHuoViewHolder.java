package com.miao.android.meizhi.adapter;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.miao.android.meizhi.R;
import com.miao.android.meizhi.model.GanHuo;
import com.miao.android.meizhi.util.TimeUtil;

/**
 * Created by Administrator on 2016/9/11.
 */
public class GanHuoViewHolder extends BaseViewHolder<GanHuo.Result> {

    private TextView title;
    private TextView type;
    private TextView who;
    private TextView time;

    public GanHuoViewHolder(ViewGroup parent) {
        super(parent, R.layout.ganhuo_item);
        title = $(R.id.title);
        type = $(R.id.type);
        who = $(R.id.who);
        time = $(R.id.time);
    }

    @Override
    public void setData(GanHuo.Result data) {
        super.setData(data);

        title.setText(data.getDesc());
        type.setText(data.getType());

        if (data.getType().equals("Android")) {
            setDrawableLeft(R.drawable.ic_action_name);
        }else {
            setDrawableLeft(R.drawable.ic_action_ios);
        }
        //干货贡献者
        who.setText(data.getWho());
        //干货提交时间
        time.setText(TimeUtil.getFormatTime(data.getPublishedAt()));
    }

    private void setDrawableLeft(int imgId) {
        Drawable drawable = getContext().getResources().getDrawable(imgId);
        drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        type.setCompoundDrawables(drawable,null,null,null);
    }
}
