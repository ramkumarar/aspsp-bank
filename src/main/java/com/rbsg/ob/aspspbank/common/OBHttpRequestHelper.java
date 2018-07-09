package com.rbsg.ob.aspspbank.common;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;



public class OBHttpRequestHelper {

    public String getBaseUrl() {
        return baseUrl;
    }

    private String baseUrl;
    private String clientId;
    private String clientSecret;

    public OBHttpRequestHelper(String baseUrl,String clientId, String clientSecret){
       this.baseUrl=baseUrl;
       this.clientId=clientId;
       this.clientSecret=clientSecret;
    }


    public MultiValueMap<String, String>  setupOBRequestHeaders(){
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        headers.add("x-ibm-client-id",clientId);
        headers.add("x-ibm-client-secret",clientSecret);

        return headers;
    }
}
