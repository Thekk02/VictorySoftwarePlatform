package personal.kk.victorysoftwareplatform.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import personal.kk.victorysoftwareplatform.entity.InitialDrawing;
import personal.kk.victorysoftwareplatform.mapper.InitialDrawingMapper;
import personal.kk.victorysoftwareplatform.service.InitialDrawingService;

import java.util.List;

/**
 * @author kk
 * @description 期初图纸资料service实现类
 * @date 2024-5-16 13:33:10
 */
@Service
@DS("db2")
public class InitialDrawingServiceImpl extends ServiceImpl<InitialDrawingMapper,InitialDrawing> implements InitialDrawingService {


    @Override
    public List<InitialDrawing> getAll() {
        return this.list();
    }
}
