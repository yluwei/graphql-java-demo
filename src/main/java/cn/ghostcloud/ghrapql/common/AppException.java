package cn.ghostcloud.ghrapql.common;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.GraphQLException;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 自定义异常
 *
 * @author yanluwei
 * @date 2020/7/17
 */
public class AppException extends GraphQLException implements GraphQLError {

    private Integer code;

    @Override
    public StackTraceElement[] getStackTrace() {
        return null;
    }

    public AppException(String message) {
        super(message);
        this.code = 400;
    }

    public AppException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        HashMap<String, Object> extensions = new HashMap<>(1);
        extensions.put("code", this.code);
        return extensions;
    }
}
