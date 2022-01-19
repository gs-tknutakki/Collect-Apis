package Tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Response;

import java.util.Optional;

public class GetData {
DevTools devTools;
public void capture(WebDriver driver,String brow){
    String res="";
    if(brow.equalsIgnoreCase("chrome")){
        devTools=((ChromeDriver)driver).getDevTools();
    }else{
        System.out.println("");
    }
    devTools.createSession();
    devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
    devTools.addListener(Network.requestWillBeSent(),entry -> {
        if(entry.getRequest().getUrl().contains("view")) {
            System.out.println("Req Url: " + entry.getRequest().getUrl());
            System.out.println("Req methode: " + entry.getRequest().getMethod());
            System.out.println("Data is there? :" + entry.getRequest().getHasPostData().isPresent());
            System.out.println("Data If Present :" + entry.getRequest().getPostData());
        }
    });
}

}
