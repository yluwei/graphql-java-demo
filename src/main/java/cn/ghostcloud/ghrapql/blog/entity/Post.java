package cn.ghostcloud.ghrapql.blog.entity;

import lombok.Data;

/**
 * 博客
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Data
public class Post {
    private Integer id;
    private String title;
    private String text;
    private String category;
    private Integer authorId;
}
