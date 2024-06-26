package personal.kk.victorysoftwareplatform.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personal.kk.victorysoftwareplatform.entity.User;
import personal.kk.victorysoftwareplatform.mapper.UserMapper;
import personal.kk.victorysoftwareplatform.service.UserService;

import java.util.List;

/**
 * @author kk
 * @description user服务实现类
 * @date 2024-5-15 16:26:20
 */
@Service
@DS("db1")
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService {


    @Override
    public List<User> getAll() {
        return this.list();
    }


}
