package personal.kk.victorysoftwareplatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kk
 * @description 登录传输实体类
 * @date 2024-5-21 02:39:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
    private String username;
    private String password;
}
