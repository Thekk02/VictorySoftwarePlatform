package personal.kk.victorysoftwareplatform.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;

/**
 * @author kk
 * @description plm期初图纸资料
 * @date 2024-5-16 13:14:41
 */
@Data
@TableName("\"InitialDrawing\"")
public class InitialDrawing {
    private static final long serialVersionUID = 1L;

    @TableField("图纸工艺名称")
    private String name;

    @TableField("类型")
    private String type ;


    private String location;
}
