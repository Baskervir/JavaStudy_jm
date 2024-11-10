package javaStudy;

public class BizException extends RuntimeException {
    public BizException(String msg) {
        super(msg);
    }

    public BizException(Exception ex) {
        super(ex);
    }
}

/**
 * Exception 객체에서는 생성자만 지정하면 된다.
 * **/