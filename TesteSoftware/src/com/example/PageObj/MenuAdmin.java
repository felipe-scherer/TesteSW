package com.example.PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.driver.Driver;

public class MenuAdmin {
	
	private WebElement botaoIdiomas;
	private WebElement botaoIdiomaIngles;
	

	public MenuAdmin() {
		
		botaoIdiomas = Driver.getDriver().findElement(By.linkText("Idiomas"));
		botaoIdiomaIngles = Driver.getDriver().findElement(By.xpath("//div[@id='cssmenu']/ul/li/ul/li[2]/a/span/span"));
		
	}


	public WebElement getBotaoIdiomas() {
		return botaoIdiomas;
	}


	public void setBotaoIdiomas(WebElement botaoIdiomas) {
		this.botaoIdiomas = botaoIdiomas;
	}


	public WebElement getBotaoIdiomaIngles() {
		return botaoIdiomaIngles;
	}


	public void setBotaoIdiomaIngles(WebElement botaoIdiomaIngles) {
		this.botaoIdiomaIngles = botaoIdiomaIngles;
	}
	
	
	
	
	

}
