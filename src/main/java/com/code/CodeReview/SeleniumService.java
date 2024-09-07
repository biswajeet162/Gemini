// package com.code.CodeReview;

// import org.openqa.selenium.By;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.springframework.stereotype.Service;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.concurrent.TimeUnit;

// @Service
// public class SeleniumService {


    




// //     // Provide your ChromeDriver path here
// //     private static final String CHROME_DRIVER_PATH = "C:/Driver/chromedriver-win64/chromedriver.exe";

// //     public String getChatGPTFeedback(String code) throws InterruptedException {
// //         // Set up Selenium WebDriver for Chrome
// //         System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);

// //         ChromeOptions options = new ChromeOptions();
// //         options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");

// //         Map<String, Object> prefs = new HashMap<>();
// //         prefs.put("profile.default_content_settings.popups", 0);
// //         prefs.put("download.prompt_for_download", "false");

// //         options.setExperimentalOption("prefs", prefs);
// //         WebDriver driver = new ChromeDriver(options);

// //         try {
            
// //             // Open ChatGPT webpage
// //             driver.get("https://copilot.microsoft.com/?showntbk=1");
// //             // driver.get("https://www.google.co.in/");

// //                 // Locate the element by its ID
// //             WebElement actionBar = driver.findElement(By.tagName("textarea"));

// //             // Analyze the element
// //             // WebElement actionBar1 =  actionBar.findElement(By.className("gLFyf"));

// //             System.out.println("Product Type: " + actionBar.getTagName());
// //             System.out.println("Product Type: " + actionBar.getClass());
// //             // System.out.println("Product Typeeeeeeeeeeeeeee: " + actionBar.getShadowRoot());

            


// //             return "actionBar.getTagName()";

// //         } finally {
// //             // Close the browser
// //             driver.quit();
// //         }
// //     }
// // }
// }