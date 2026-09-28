package controller;

import http.HttpRequest;
import http.HttpResponse;

public interface controller {
    void service(HttpRequest request, HttpResponse response);
}
