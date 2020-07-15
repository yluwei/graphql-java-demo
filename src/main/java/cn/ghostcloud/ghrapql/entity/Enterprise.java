package cn.ghostcloud.ghrapql.entity;

import lombok.Data;

/**
 * 企业
 *
 * @author yanluwei
 * @date 2020/7/15
 */
@Data
public class Enterprise extends User {
    private String creditCode;
    private Integer employees;
}
