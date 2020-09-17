package com.acep.fqa.website.controller;


public abstract  class BaseController {
	
	public static String THEME = "user";
	
	
	public String render(String viewName) {
        return THEME + "/" + viewName;
    }
}
