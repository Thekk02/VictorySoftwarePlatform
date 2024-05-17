package personal.kk.victorysoftwareplatform.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import personal.kk.victorysoftwareplatform.entity.InitialDrawing;
import personal.kk.victorysoftwareplatform.service.InitialDrawingService;
import personal.kk.victorysoftwareplatform.service.impl.InitialDrawingServiceImpl;

import java.util.List;

/**
 * @author kk
 * @description 期初图纸资料控制层
 * @date 2024-5-16 13:37:55
 */
@RestController
@RequestMapping("/initialdrawing")
public class InitialDrawingController {
    @Autowired
    private InitialDrawingService initialDrawingService;


    @GetMapping("/getall")
    @ResponseBody
    public List<InitialDrawing> getAll(){
        return initialDrawingService.getAll();
    }
}

