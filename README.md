
gradle clean test aggregate -Dserenity.properties=test-properties/chrome.properties -Dcucumber.options="--tags @smoke"

1. Create a file called **serenity.properties** in **root project directory**.
2. Add the below content to the **serenity.properties** file

    ```
    webdriver.timeouts.implicitlywait = 5000
    webdriver.driver=chrome
    webdriver.base.url=http://www.google.com
    serenity.project.name = UI Project using Serenity and Cucumber
    serenity.use.unique.browser = true
    chrome.switches=--no-sandbox,--disable-plugins,--disable-extensions
    #serenity.take.screenshots=AFTER_EACH_STEP
    serenity.take.screenshots=FOR_FAILURES
    webdriver.wait.for.timeout=20000
    #webdriver.applicationCacheEnabled=true
    ```


## Built With

* [Serenity BDD](http://www.thucydides.info/#/) - An open source library that aims to make the idea of living documentation a reality.

For a better understanding of the tests read [cucumber](https://cucumber.io/)'s docs.

Cucumber understands [Gherkin](https://github.com/cucumber/cucumber/wiki/Gherkin) i.e given, when and then format.
