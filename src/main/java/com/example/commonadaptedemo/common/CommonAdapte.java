package com.example.commonadaptedemo.common;

import android.content.Context;

import java.util.List;

/**
 * Created by fszj on 2018-01-18.
 */

public abstract class CommonAdapte<T> extends MultiItemTypeAdapter<T> {
    public CommonAdapte(Context context,final  int layoutId, List<T> datas) {
        super(context, datas);

        addItemViewDelegate(new ItemViewDelegate<T>()
        {
            @Override
            public int getItemViewLayoutId()
            {
                return layoutId;
            }

            @Override
            public boolean isForViewType(T item, int position)
            {
                return true;
            }

            /**
             *
             * @param holder ViewHolder对象
             * @param t  item布局
             * @param position 当前位置
             */
            @Override
            public void convert(ViewHolder holder, T t, int position)
            {
                CommonAdapte.this.convert(holder, t, position);
            }
        });
    }

    protected abstract void convert(ViewHolder viewHolder, T item, int position);
}
