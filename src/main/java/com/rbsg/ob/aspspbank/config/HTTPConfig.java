package com.rbsg.ob.aspspbank.config;

import com.rbsg.ob.aspspbank.common.OBHttpRequestHelper;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

@Configuration
@ConfigurationProperties
public class HTTPConfig {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Bean
    RestTemplate restTemplate() {
        HttpClient httpClient =null;
        try {
            SSLContextBuilder builder = new SSLContextBuilder();
            builder.loadTrustMaterial(null, new TrustStrategy() {
                @Override
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            });
            SSLConnectionSocketFactory sslSF = new SSLConnectionSocketFactory(builder.build(),
                    SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

            httpClient = HttpClients.custom().setSSLSocketFactory(sslSF).build();

        }catch (Exception e) {
            logger.error("Http Client Intialization failed ", e.getMessage());
        }

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);

        return new RestTemplate(requestFactory);
    }



    @Bean OBHttpRequestHelper obHttpRequestHelper(@Value("${ibm.oburl}") String ibmOBBaseUrl,
                                                  @Value("${ibm.clientid}") String ibmOBClientId,
                                                  @Value("${ibm.clientsecret}") String ibmOBClientSecret){
        return new OBHttpRequestHelper(ibmOBBaseUrl,ibmOBClientId,ibmOBClientSecret);
    }
}
