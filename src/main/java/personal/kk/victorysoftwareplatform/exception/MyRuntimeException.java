package personal.kk.victorysoftwareplatform.exception;

/**
 * @author kk
 * @description 自定义运行时错误
 * @date 2024-5-20 08:23:25
 */
public class MyRuntimeException extends RuntimeException{
    private String msg;
    private int code;

    public MyRuntimeException(String msg,int code){
        this.msg =msg;
        this.code = code;
    }
    public MyRuntimeException(String msg){
        this.msg = msg;
    }
}
