package cn.ghostcloud.ghrapql.common;

import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.servlet.GraphQLErrorHandler;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 异常处理
 *
 * @author yanluwei
 * @date 2020/7/17
 */
@Component
public class AppExceptionHandler implements GraphQLErrorHandler {
    @Override
    public List<GraphQLError> processErrors(List<GraphQLError> list) {
        return list.stream().map(this::getNested).collect(Collectors.toList());
    }

    private GraphQLError getNested(GraphQLError error) {
        if (error instanceof ExceptionWhileDataFetching) {
            ExceptionWhileDataFetching exceptionError = (ExceptionWhileDataFetching) error;
            if (exceptionError.getException() instanceof GraphQLError) {
                return (GraphQLError) exceptionError.getException();
            } else {
                return new AppException("系统异常，请稍后重试", 500);
            }
        }
        return error;
    }
}
