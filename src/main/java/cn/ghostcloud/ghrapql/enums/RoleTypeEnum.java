package cn.ghostcloud.ghrapql.enums;

/**
 * 角色类型
 *
 * @author yanluwei
 * @date 2020/7/16
 */
public enum RoleTypeEnum {
    /**
     * 角色类型
     */
    FINANCING(1, "金融"),
    GOV(2, "政府"),
    THIRD(3, "合作企业");
    private Integer code;
    private String name;

    RoleTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }}
