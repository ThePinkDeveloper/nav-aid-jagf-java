package com.thepinkdev.navaidjagf.businessservices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import com.thepinkdev.navaidjagf.entities.Coord;
import com.thepinkdev.navaidjagf.enums.ErrorHandler;
import com.thepinkdev.navaidjagf.utils.UrlUtils;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherInfoServiceImpl implements WeatherInfoService {

    @Autowired UrlUtils urlUtils;

    @Override
    public String getWeatherInfoByCoord(Coord coord) {
        String url = urlUtils.contructURLForApiCallFromCoord(coord);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        String result;
        try {
            CloseableHttpResponse response1 = httpclient.execute(httpGet);
            HttpEntity entity1 = response1.getEntity();
            result = new BufferedReader(
                new InputStreamReader(entity1.getContent(), StandardCharsets.UTF_8))
                    .lines()
                    .collect(Collectors.joining("\n"));
            EntityUtils.consume(entity1);
            response1.close();
        } catch(Exception e) {
            e.printStackTrace();
            result = ErrorHandler.ERROR_GETTING_WEATHERINFO.getErrorCode();
        }
        return result;
    }
    
}
