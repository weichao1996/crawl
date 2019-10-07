package com.etoak.crawl.link;

//可以起过滤作用
public interface LinkFilter {
    public boolean accept(String url);
}
