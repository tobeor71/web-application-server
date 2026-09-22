package http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.HttpRequestUtils;

import java.util.HashMap;
import java.util.Map;

public class RequestParams {
    private static final  Logger logger = LoggerFactory.getLogger(RequestParams.class);

    private Map<String, String> params = new HashMap<>();

    public void addQueryString(String queryString) {
        putParam(queryString);
    }

    private void putParam(String data) {
        logger.debug("data: {}", data);

        if(data == null || data.isEmpty()) {
            return;
        }

        params.putAll(HttpRequestUtils.parseQueryString(data));
        logger.debug("params: {}", params);
    }

    public void addBody(String body) {
        putParam(body);
    }

    public String getParams(String name) {
        return params.get(name);
    }
}
