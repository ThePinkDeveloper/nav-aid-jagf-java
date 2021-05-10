package com.thepinkdev.navaidjagf.businessservices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import com.thepinkdev.navaidjagf.entities.Coord;
import com.thepinkdev.navaidjagf.enums.ErrorHandler;
import com.thepinkdev.navaidjagf.utils.FileAccessUtils;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

@Service
public class WeatherInfoServiceImpl implements WeatherInfoService {

    @Override
    public String getWeatherInfoByCoord(Coord coord) {
        String url = contructURLForApiCallFromCoord(coord);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        String result;
        try {
            CloseableHttpResponse response1 = httpclient.execute(httpGet);
            System.out.println(response1.getStatusLine());
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

    private String contructURLForApiCallFromCoord(Coord coord) {
        
        StringBuilder sb = new StringBuilder();
        String apiKey = FileAccessUtils.readFile("./sensitive/.apikey");

        sb.append("http://api.openweathermap.org/data/2.5/weather?lat=");
        sb.append(coord.getLatitude());
        sb.append("&lon=");
        sb.append(coord.getLongitude());
        sb.append("&appid=");
        sb.append(apiKey);

        return sb.toString();

    }
    
}