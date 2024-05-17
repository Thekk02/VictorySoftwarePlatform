package personal.kk.victorysoftwareplatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import personal.kk.victorysoftwareplatform.entity.InitialDrawing;
import personal.kk.victorysoftwareplatform.entity.Order;

import java.util.List;

/**
 * @author kk
 * @description 期初图纸资料service层
 * @date 2024-5-16 13:29:42
 */
public interface InitialDrawingService extends IService<InitialDrawing> {
    List<InitialDrawing> getAll();
}
