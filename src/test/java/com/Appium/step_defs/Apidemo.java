package com.Appium.step_defs;

import com.Appium.pages.View;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

public class Apidemo {

    View view = new View();

    @Given("click preference button")
    public void click_preference_button() throws InterruptedException {

        Thread.sleep(3000);
        view.preference.click();
    }

    @Given("click preferenceDependencies button")
    public void click_preferenceDependencies_button() {
      view.predepen.click();
    }


    @Given("select checkbox")
    public void select_checkbox() {
    view.checkBox.click();
    }


    @Given("click wifiSetting button")
    public void click_wifiSetting_button() {
     view.wifiSetting.click();
    }



    @Given("Enter {string} into ipnput box")
    public void enter_into_ipnput_box(String text) throws InterruptedException {
        Thread.sleep(2000);
     view.inputBox.sendKeys(text);
    }



    @Then("click ok button")
    public void click_ok_button() {
     view.okButton.click();
    }


}
