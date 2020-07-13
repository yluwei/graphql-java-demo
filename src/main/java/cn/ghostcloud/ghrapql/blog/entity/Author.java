package cn.ghostcloud.ghrapql.blog.entity;

import lombok.Data;

import java.util.List;

/**
 * 作者
 *
 * @author yanluwei
 * @date 2020/7/13
 */
@Data
public class Author {
    private Integer id;
    private String name;
    private String thumbnail;
    private List<Post> posts;
}
