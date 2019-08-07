package com.starslee.blogcontent.dao;

import com.starslee.blogcontent.po.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface LoginDao {
    public User search();
}
