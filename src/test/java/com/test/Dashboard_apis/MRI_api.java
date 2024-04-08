package com.test.Dashboard_apis;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MRI_api {
	
	@Test(priority=1)
	public void MRI()
	{
        Response response1 = RestAssured.get("https://apollo2.humanbrain.in/dashboard/dashboardMRI");
        int statusCode1 = response1.getStatusCode();
        
        Assert.assertEquals(statusCode1, 200, "API request to the MRI failed. Status code: " + statusCode1);
        
        System.out.println("API request to the MRI passed. Status code: " + statusCode1);
	}
@Test(priority=2)
    public void api_MRI_()
           {
           Response response1 = RestAssured
                   .given()
                   .auth()
                   .basic("admin", "admin")
                   .when()
                   .get("https://apollo2.humanbrain.in/dashboard/querySkullStrip/1");

           int statusCode1 = response1.getStatusCode();
           if (statusCode1 == 200) {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard MRI_Skull_Stripping_MRI_Upload passed. Status code: " + statusCode1);
               System.out.println("_________________________******_______________________");
           } else {
           	System.out.println("_________________________******_______________________");
               System.out.println("API request to the Dashboard MRI_Skull_Stripping_MRI_Upload. Status code: " + statusCode1);
           }
           Assert.assertEquals(statusCode1, 200, "API request to the Dashboard API request to the Dashboard MRI_Skull_Stripping__MRI_Upload failed");
           
       }
	@Test(priority=3)
	public void api_Automatic() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/querySkullStrip/2");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard MRI_Skull_Stripping_Automatic Passed:"+ statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard MRI_Skull_Stripping_Automatic failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard API request to the Dashboard MRI_Skull_Stripping_Automatic failed");
         
     }
	@Test(priority=4)
	public void api_ManualCorrect() {
		 Response response1 = RestAssured
                .given()
                .auth()
                .basic("admin", "admin")
                .when()
                .get("https://apollo2.humanbrain.in/dashboard/querySkullStrip/3");

        int statusCode2 = response1.getStatusCode();
        if (statusCode2 == 200) {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard MRI_Skull_Stripping_Manual_Correct passed. Status code: " + statusCode2);
            System.out.println("_________________________******_______________________");
        } else {
        	System.out.println("_________________________******_______________________");
            System.out.println("API request to the Dashboard MRI_Skull_Stripping_Manual_Correct   failed. Status code: " + statusCode2);
        }
        Assert.assertEquals(statusCode2, 200, "API request to the Dashboard MRI_Skull_Stripping_Manual_Correct  failed");
        
    }
		
	@Test(priority=5)
	public void api_QC() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/querySkullStrip/4");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard MRI_Skull_Stripping_QC passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard MRI_Skull_Stripping_QC  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard MRI_Skull_Stripping_QC failed");
         
     }
	@Test(priority=6)
	public void api_Redo() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/querySkullStrip/5");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard MRI_Skull_Stripping_Redo passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard MRI_Skull_Stripping_Redo  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard MRI_Skull_Stripping_Redo failed");
         
     }
	@Test(priority=7)
	public void api_Cryo_Out() {
		 Response response1 = RestAssured
                 .given()
                 .auth()
                 .basic("admin", "admin")
                 .when()
                 .get("https://apollo2.humanbrain.in/dashboard/querySkullStrip/6");

         int statusCode2 = response1.getStatusCode();
         if (statusCode2 == 200) {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard MRI_Skull_Stripping_Out passed. Status code: " + statusCode2);
             System.out.println("_________________________******_______________________");
         } else {
         	System.out.println("_________________________******_______________________");
             System.out.println("API request to the Dashboard MRI_Skull_Stripping_Out  failed. Status code: " + statusCode2);
         }
         Assert.assertEquals(statusCode2, 200, "API request to the Dashboard MRI_Skull_Stripping_Out failed");
     }

}
