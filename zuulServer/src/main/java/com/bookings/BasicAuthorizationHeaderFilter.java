package com.bookings;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.codec.binary.Base64;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

/**
 * Created by RMPERERA on 9/27/2017.
 */
@Component
public class BasicAuthorizationHeaderFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
   public Object run() {

     /*   RequestContext ctx = RequestContext.getCurrentContext();
        String name=ctx.getRequest().getHeader("Authorization");
        System.out.println("Execute pre filter in zuul");
        //String name="Basic cmFuZGlrYToxMjM0"; randika : 1234

        System.out.println("Authorization header is: "+name);


        StringTokenizer stringTokenizer=new StringTokenizer(name);
        if(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
            String credentials = null;
            try {
                credentials = new String(Base64.decodeBase64(stringTokenizer.nextToken()), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            int split=credentials.indexOf(":");
            String userName=credentials.substring(0,split);
            String password=credentials.substring(split+1);
            System.out.println(userName+ "  and "+password);

            if(!userName.equals("randika")||!password.equals("1234")){
                // if(!userName.equals(properties.getProperty(userName))||!password.equals(properties.getProperty(password))){

                String error="Bad Credentials";
                System.out.println(error);
                //ctx.setSendZuulResponse(false);
                ctx.setResponseStatusCode(404);
                ctx.setResponseBody("{\"Error\":\"You have Entered the bad credentials\"}");

            }

        }*/

        return null;
    }
}