package com.imooc.demo.service;

import com.imooc.demo.entity.Post;

import java.util.List;

/**
 * @Package: com.imooc.demo.service
 * @Description:
 * @Author: liyingxia
 * @CreateDate: 2021/11/11 11:24
 */

public interface PostService {

    /**
     * 获取帖子列表
     * @return
     */
    List<Post> getPostList();

    /**
     * 通过id获取帖子信息
     * @param postId
     * @return
     */
    Post getPostById(int postId);

    /**
     * 新增帖子信息
     * @param post
     * @return
     */
    boolean addPost(Post post);

    /**
     * 修改帖子信息
     * @param post
     * @return
     */
    boolean modifyPost(Post post);

    /**
     * 通过id删除帖子信息
     * @param postId
     * @return
     */
    boolean deletePost(int postId);

}
