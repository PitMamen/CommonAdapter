package com.example.commonadaptedemo.common;

/**
 * Created by fszj on 2018-01-18.
 */

public interface ItemViewDelegate<T> {
    public abstract int getItemViewLayoutId();

    public abstract boolean isForViewType(T item, int position);

    public abstract void convert(ViewHolder holder, T t, int position);

}
