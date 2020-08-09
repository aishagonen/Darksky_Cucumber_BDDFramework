$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TodayPage.feature");
formatter.feature({
  "line": 2,
  "name": "Verify temperature of today",
  "description": "",
  "id": "verify-temperature-of-today",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@today"
    }
  ]
});
formatter.before({
  "duration": 8097823169,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TodayPageSD.iAmOnHomePage()"
});
formatter.result({
  "duration": 684038079,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify lowest temperature for today",
  "description": "",
  "id": "verify-temperature-of-today;verify-lowest-temperature-for-today",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I click on today button on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify lowest and highest temperature for today",
  "keyword": "Then "
});
formatter.match({
  "location": "TodayPageSD.iClickOnOnTheHomePage()"
});
formatter.result({
  "duration": 87388248,
  "status": "passed"
});
formatter.match({
  "location": "TodayPageSD.iVerifyLowestAndHighestTemperatureForToday()"
});
formatter.result({
  "duration": 673603127,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tNot verified! expected [87] but found [86],\n\tNot verified! expected [77] but found [72]\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\n\tat runnerTest.webPages.TodayPage.verifyLowHighTemp(TodayPage.java:63)\n\tat stepDefinition.TodayPageSD.iVerifyLowestAndHighestTemperatureForToday(TodayPageSD.java:24)\n\tat ✽.Then I verify lowest and highest temperature for today(TodayPage.feature:9)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2044499392,
  "status": "passed"
});
});