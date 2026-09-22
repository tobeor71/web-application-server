package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.common.net.HttpHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import util.HttpRequestUtils;
import util.IOUtils;

public class HttpRequest {
    private static final Logger log = LoggerFactory.getLogger(HttpRequest.class);

    private RequestLine requestLine;

    private HttpHeaders headers;

    private RequestParams requestParams = new RequestParams();

    public HttpRequest(InputStream in) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            requestLine = new RequestLine(createRequestLine(br));
            requestParams.addBody(requestLine.get);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    private String createRequestLine(BufferedReader br) throws IOException {
        String line = br.readLine();
        if(line == null) {
            throw new IllegalStateException();
        }
        return line;
    }

    public String getMethod() {
        return requestLine.getMethod();
    }

    public String getPath() {
       return requestLine.getPath();
    }

    public String getHeader(String key) {
        return headers.get(key);
    }

    public String getParameter(String key) {
        return params.get(key);
    }
}

