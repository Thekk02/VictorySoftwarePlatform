package personal.kk.victorysoftwareplatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.kk.victorysoftwareplatform.entity.User;

import java.util.List;

/**
 * @author kk
 * @description user服务层
 * @date 2024-5-15 16:19:30
 */
public interface UserService extends IService<User>  {

    List<User> getAll();
}
