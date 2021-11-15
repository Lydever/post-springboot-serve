package com.liyingxia.post.dao;

import com.liyingxia.post.entity.Post;

import java.util.List;

/**
 * @Package: com.liyingxia.post.dao
 * @Description:
 * @Author: liyingxia
 * @CreateDate: 2021/11/15 9:52
 */


public interface PostDao {

    /**
     * 列出帖子列表
     * @return
     */
    List<Post> queryPost();

    /**
     * 根据id获取帖子
     * @param postId
     * @return
     */
    Post queryPostById(int postId);

    /**
     * 插入帖子信息
     * @param post
     * @return
     */
    int insertPost(Post post);

    /**
     * 更新帖子信息
     * @param post
     * @return
     */
    int updatePost(Post post);

    /**
     * 根据id 删除帖子信息
     * @param postId
     * @return
     */
    int deletePost(int postId);
}
