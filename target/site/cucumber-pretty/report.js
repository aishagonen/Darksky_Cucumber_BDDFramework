$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TodayPage.feature");
formatter.feature({
  "line": 3,
  "name": "Verify Temperature of Today Feature",
  "description": "",
  "id": "verify-temperature-of-today-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@today"
    }
  ]
});
formatter.before({
  "duration": 7573718768,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on Darksky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TodayPageSD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 1028077372,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify today\u0027s lowest and highest temperature",
  "description": "",
  "id": "verify-temperature-of-today-feature;verify-today\u0027s-lowest-and-highest-temperature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I click on today button field on home screen",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I get lowest temperature, verify displayed temperature and enter value on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I get highest temperature, verify displayed temperature and enter value on home screen",
  "keyword": "Then "
});
formatter.match({
  "location": "TodayPageSD.iClickOnTodayButtonFieldOnHomeScreen()"
});
formatter.result({
  "duration": 5113629478,
  "status": "passed"
});
formatter.match({
  "location": "TodayPageSD.iGetLowestTemperatureVerifyDisplayedTemperatureAndEnterValueOnHomeScreen()"
});
formatter.result({
  "duration": 3002358856,
  "error_message": "java.lang.NullPointerException\n\tat runnerTest.webPages.ElementUtil.compareValues(ElementUtil.java:182)\n\tat runnerTest.webPages.TodayPage.verifyLowTemp(TodayPage.java:24)\n\tat stepDefinition.TodayPageSD.iGetLowestTemperatureVerifyDisplayedTemperatureAndEnterValueOnHomeScreen(TodayPageSD.java:25)\n\tat ✽.And I get lowest temperature, verify displayed temperature and enter value on home screen(TodayPage.feature:11)\n",
  "status": "failed"
});
formatter.match({
  "location": "TodayPageSD.iGetHighestTemperatureVerifyDisplayedTemperatureAndEnterValueOnHomeScreen()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1443415747,
  "status": "passed"
});
});