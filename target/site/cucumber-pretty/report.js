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
      "name": "@todayPage"
    }
  ]
});
formatter.before({
  "duration": 11071749767,
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
  "duration": 872679633,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify lowest temperature for today",
  "description": "",
  "id": "verify-temperature-of-today;verify-lowest-temperature-for-today",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@today"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on today button on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify lowest and highest temperature for today",
  "keyword": "Then "
});
formatter.match({
  "location": "TodayPageSD.iClickOnOnTheHomePage()"
});
formatter.result({
  "duration": 174726884,
  "status": "passed"
});
formatter.match({
  "location": "TodayPageSD.iVerifyLowestAndHighestTemperatureForToday()"
});
formatter.result({
  "duration": 1110222902,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tNot verified! expected [88] but found [89],\n\tNot verified! expected [76] but found [75]\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\n\tat runnerTest.webPages.TodayPage.verifyLowHighTemp(TodayPage.java:57)\n\tat stepDefinition.TodayPageSD.iVerifyLowestAndHighestTemperatureForToday(TodayPageSD.java:24)\n\tat ✽.Then I verify lowest and highest temperature for today(TodayPage.feature:10)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2594804177,
  "status": "passed"
});
});