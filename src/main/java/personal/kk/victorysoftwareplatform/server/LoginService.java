package personal.kk.victorysoftwareplatform.server;

import personal.kk.victorysoftwareplatform.dto.LoginDto;

import java.util.Map;

/**
 * @author kk
 * @description 登录服务
 * @date 2024-5-21 10:44:55
 */
public interface LoginService {
    Map<String,Object> login (LoginDto logindto);
}
