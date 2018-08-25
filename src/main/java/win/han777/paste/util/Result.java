package win.han777.paste.util;

public class Result<T> {

    private Integer code;
    private String message;
    private T data;

    public Result() {
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(1);
        result.setMessage("success");
        result.setData(data);
        return result;
    }

    public static <T> Result<T> success(T data, String msg) {
        Result<T> result = new Result<>();
        result.setCode(1);
        result.setMessage(msg);
        result.setData(data);
        return result;
    }

    public static <Integer> Result<Integer> error() {
        Result<Integer> result = new Result<Integer>();
        result.setCode(0);
        result.setMessage("不用慌，问题很大，慌也没用");
        result.setData(0);
        return result;
    }


    public static <Integer> Result<Integer> error(String err) {
        Result<Integer> result = new Result<Integer>();
        result.setCode(0);
        result.setMessage(err);
        result.setData(0);
        return result;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setData(Integer data) {
        this.data = (T) data;
    }


}
