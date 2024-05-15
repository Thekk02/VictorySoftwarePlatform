package personal.kk.victorysoftwareplatform.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;

/**
 * @author kk
 * @description 部门表(Mysql)
 * @date 2024-5-15 10:24:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Alias("Deapartment")
public class Department {
    private static final long serialVersionUID = 1L;

    private int id;

    private String name ;

}
