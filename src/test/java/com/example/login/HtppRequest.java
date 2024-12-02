package com.example.login;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

//given()--content type,set cookies,add auth,add param,set headers


//when()-pot,get,post,delete
//then()-status code,extract response,extract headers cookie, and response body;

public class HtppRequest {
    static int id;
    @Test(priority = 1)
    public static void Test(){
        RestAssured rest=new RestAssured();
       given();

        when().get("https://reqres.in/api/users?page=2").then()
               .statusCode(200).body("page",equalTo(2)).log().all();


    }
    @Test(priority = 1)
    public static void Post(){
        HashMap map=new HashMap();
        map.put("name","sairam");
        map.put("job","Automation Tester");

       id= given()
               .contentType("application/json")
               .body(map)
               .when()
               .post("https://reqres.in/api/users").jsonPath().get("id");

    }
//    @Test(priority = 2)
//    public static void put(){
//        HashMap maps=new HashMap();
//        maps.put("name","sairamBavathu");
//        maps.put("job","NormalTester");
//
//
//        given().contentType("application/json").body(maps)
//                .when().put("https://reqres.in/api/users"+id).then()
//                .statusCode(201)
//                .log().all();


    }



