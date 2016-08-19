package com.vngilev.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 1 on 19.08.2016.
 */
public class MyBrowser {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Введите URL:");
                String url = br.readLine();
                switch (readContent(url)) {
                    case 200: {
                        System.out.println("OK");
                        return;
                    }
                    case 302: {
                        System.out.println("Расположение запрашиваемого ресурса временно изменено.");
                        break;
                    }
                    default: {
                        System.out.println("Пробуем еще.");
                        continue;
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int readContent(String urlString) {
        int responseCode = 0;
        try {
            URL url = null;
            try {
                url = new URL(urlString);
            } catch (MalformedURLException e) {
                System.out.println("Неверный интернет-адрес. Введите адрес в формате: http://www.domain.com");
                e.printStackTrace();
                return responseCode;

            }
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");

            responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());

        }  catch (IOException e) {
            e.printStackTrace();
        } finally {
            return responseCode;
        }

    }
}
