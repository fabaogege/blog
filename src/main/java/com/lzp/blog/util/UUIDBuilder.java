package com.lzp.blog.util;

import java.util.UUID;

/**
 * @description:
 * @author: lizhipeng
 * @create: 2019-12-31 14:33
 **/
public class UUIDBuilder {
    public String getUUID(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }
    public static void main(String[] args){
        UUIDBuilder uuidBuilder = new UUIDBuilder();
        System.out.println(uuidBuilder.getUUID());
    }
}

