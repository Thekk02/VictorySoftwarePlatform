package personal.kk.victorysoftwareplatform.server.Impl;

import personal.kk.victorysoftwareplatform.dto.LoginDto;
import personal.kk.victorysoftwareplatform.server.LoginService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 登陆服务实现类
 * @date 2024-5-21 10:47:15
 */
public class LoginServiceImpl implements LoginService {
    @Override
    public Map<String, Object> login(LoginDto logindto) {
        Map<String,Object> map = new HashMap<>();
        map.put("user",1);
        return map;
    }
}
