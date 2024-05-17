package personal.kk.victorysoftwareplatform.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.io.Serializable;

/**
 * @author kk
 * @description 用户实体类(Mysql)
 * @date 2024-5-15 10:04:07
 */

@Data
@TableName("user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String pwd;

    private boolean gender;

    private String role;

    @TableField(value = "department_id")
    private int departmentId;

    private String avator;
}
