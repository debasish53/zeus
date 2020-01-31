package com.restassured.tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.restAssured.employee.utill.APIMethods;
import com.restAssured.emplyoyee.base.BaseClass;

import io.restassured.response.Response;
/*
 * @Author: Debasish
 */
public class Test1 extends BaseClass 
{
 @Test
 public void getTest()
 {
	 Response res = APIMethods.executeRequest("getOneEmployee",REQ_PARA_FILE_PATH, REQ_PARA__SHEET);
	 System.out.println(res.prettyPrint());
 }
 @Test
 public void postTest() throws IOException
 {
	 //Response res = APIMethods.executeRequest("creatEmployee", REQ_PARA_FILE_PATH, REQ_PARA__SHEET);
 }
}
