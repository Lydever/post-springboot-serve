package com.liyingxia.post.service;

import com.liyingxia.post.entity.Post;

import java.util.List;

/**
 * @Package: com.liyingxia.post.service
 * @Description:
 * @Author: liyingxia
 * @CreateDate: 2021/11/15 9:55
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
