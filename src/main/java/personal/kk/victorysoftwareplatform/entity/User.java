package personal.kk.victorysoftwareplatform.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;
import personal.kk.victorysoftwareplatform.enums.UserRole;

/**
 * @author kk
 * @description 用户实体类(Mysql)
 * @date 2024-5-15 10:04:07
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Alias("User")
public class User {
    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private String pwd;

    private boolean gender;

    private UserRole role;

    private int department_id;
}
