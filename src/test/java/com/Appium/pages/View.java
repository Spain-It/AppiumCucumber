package com.Appium.pages;


import com.Appium.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;


public class View {

    public View()  {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement predepen;

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement checkBox;

    @AndroidFindBy(xpath = "//*[@text='WiFi settings']")
    public WebElement wifiSetting;

    @AndroidFindBy(id = "android:id/edit")
    public WebElement inputBox;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;

}
