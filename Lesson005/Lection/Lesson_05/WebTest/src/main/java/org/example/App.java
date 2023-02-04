package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

/**
 * Hello world!
 */
public class App {
    private static final WebClient webClient = new WebClient(BrowserVersion.CHROME);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
// define usage of firefox, chrome or Edge

        webClient.getCookieManager().setCookiesEnabled(true);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setTimeout(2000);
        webClient.getOptions().setUseInsecureSSL(true);
        // overcome problems in JavaScript
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setPrintContentOnFailingStatusCode(false);
        webClient.setCssErrorHandler(new SilentCssErrorHandler());
        try {
            final HtmlPage page = webClient
                    .getPage("https://www.e-disclosure.ru/portal/company.aspx?id=934");
            final HtmlTextInput searchField = htmlElementById(page,
                    "tr",
                    HtmlTextInput.class).get();
            // alternative to XPath: querySelector(".search-form__btn")
            final HtmlButton searchButton = htmlElementByXPath(page,
                    "//button[@class='search-form__btn' and @type='submit']",
                    HtmlButton.class).get();
            searchField.setValueAttribute("Scraping");

            final HtmlPage resultPage = searchButton.click();
            // in real life you may use LOGGER.debug()
            //  System.out.println("HTML source: " + resultPage.getWebResponse().getContentAsString());
            htmlElementsByCssClass(resultPage, ".search-result", HtmlAnchor.class).stream().forEach(System.out::println);
        } catch (FailingHttpStatusCodeException | IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> Optional<T> htmlElementByXPath(
            DomNode node,
            String xpath,
            Class<T> type) {
        return node.getByXPath(xpath).stream()
                .filter(o -> type.isAssignableFrom(o.getClass()))
                .map(type::cast).findFirst();
    }

    public static <T> List<T> htmlElementsByCssClass(
            DomNode node,
            String cssClass,
            Class<T> type) {
        return node.querySelectorAll(cssClass).stream()
                .filter(o -> type.isAssignableFrom(o.getClass()))
                .map(type::cast).collect(Collectors.toList());
    }

    public static <T> Optional<T> htmlElementById(
            HtmlPage node,
            String htmlTagId,
            Class<T> type) {
        return Optional.ofNullable(node.getElementById(htmlTagId)).map(type::cast);
    }

}
