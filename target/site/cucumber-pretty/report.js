$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Home page feature",
  "description": "",
  "id": "home-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@homePage"
    }
  ]
});
formatter.before({
  "duration": 8642086091,
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
  "name": "I am on the Darksky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSD.iAmOnTheDarkskyHomePage()"
});
formatter.result({
  "duration": 851715640,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "home-page-feature;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@time"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I enter \"Mason, OH\" into search text field on home screen",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I verify city’s time zone",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Mason, OH",
      "offset": 9
    }
  ],
  "location": "HomePageSD.iEnterIntoSearchTextFieldOnHomeScreen(String)"
});
formatter.result({
  "duration": 723399567,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.iVerifyCitySTimeZone()"
});
formatter.result({
  "duration": 9550588,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.iVerifyTimelineIsDisplayedWithTwoHoursIncremented()"
});
formatter.result({
  "duration": 4071514122,
  "status": "passed"
});
formatter.after({
  "duration": 246510336,
  "status": "passed"
});
});