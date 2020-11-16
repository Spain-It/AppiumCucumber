package com.Appium.pages;


import com.Appium.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;


public class View {

    public View() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;


}
