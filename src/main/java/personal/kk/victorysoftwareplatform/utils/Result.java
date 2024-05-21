package personal.kk.victorysoftwareplatform.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import personal.kk.victorysoftwareplatform.enums.ResultCode;

import java.io.Serializable;

/**
 * @author kk
 * @description 结果工具类
 * @date 2024-5-20 08:10:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result<T> implements Serializable {
    //状态码
    private Integer code;

    //数据
    private T data;

    //操作信息
    private String msg;
    private boolean ShowMsg = false;

    public static <T> Result<T> ok(T data){return build(data,ResultCode.SUCCESS);}

    public static <T> Result<T> ok() {
        return ok(null);
    }



    public static <T> Result<T> build(T data, ResultCode resultCode){
        Result<T> result = new Result<>();
        result.setData(data);
        result.setMsg(result.getMsg());
        result.setCode(resultCode.getCode());
        return result;
    }


    public static <T> Result<T> build(T data,Integer code,String message){
        Result<T> result = new Result<>();
        result.setData(data);
        result.setMsg(message);
        result.setCode(code);
        return result;
    }






}
