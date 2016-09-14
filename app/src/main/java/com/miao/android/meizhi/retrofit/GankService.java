package com.miao.android.meizhi.retrofit;

import com.miao.android.meizhi.model.GanHuo;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Administrator on 2016/9/12.
 */
public interface GankService {
    @GET("api/data/{type}/{count}/{page}")
    Observable<GanHuo> getGanHuo(
            @Path("type") String type,
            @Path("count") int count,
            @Path("page") int page
    );
}
