package cn.ghostcloud.ghrapql.common;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.GraphQLException;
import graphql.language.SourceLocation;

import java.util.List;

/**
 * 自定义异常
 *
 * @author yanluwei
 * @date 2020/7/17
 */
public class AppException extends GraphQLException implements GraphQLError {

    public AppException(String message) {
        super(message);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return null;
    }
}
